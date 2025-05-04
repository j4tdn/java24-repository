package view;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;

import bean.Store;
import bean.StoreParamDto;
import exception.CalculationException;
import model.DataModel;

import static utils.LogUtils.*;
import static utils.NumberUtils.*;
import static utils.StreamUtils.*;

public class Ex02WhAllocationApp {

	public static void main(String[] args) {

		final Integer whAllocationAmount = 380;

		// Tìm các store được chọn để cấp phát hàng hóa
		final var selectedStores = filterToList(DataModel.getStores(), Store::isSelected);

		if (selectedStores == null || selectedStores.isEmpty()) {
			System.out.println(">> There is no selected store for allocation. Stop calculation ...");
			return;
		}

		try {
			doAllocation(selectedStores, whAllocationAmount);
		} catch (CalculationException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Do Allocation.
	 * 
	 * Key: storeId with Long type Value: storeAllocatedAmount after calculation
	 * with 4 steps
	 * 
	 * @return map of storeId, storeAllocatedAmount
	 */
	private static Map<Long, Integer> doAllocation(List<Store> stores, Integer whAllocationAmount)
			throws CalculationException {
		// Step 1: Filling in missing 'Expected Sales' values
		final var interpolatedExpectedSales = fillMissingExpectedSales(stores);
		logging("Step 1: Filling in missing 'Expected Sales' values", interpolatedExpectedSales);

		// Step 2: Calculation of 'Allocation Key'
		final var allocationKeys = calculateAllocationKey(interpolatedExpectedSales);
		logging("Step 2: Calculation of 'Allocation Key'", allocationKeys);

		final var stockPreviousDays = toMap(stores, Store::getStoreId, Store::getStockPreviousDay);
		final var stockPreviousDayParamDto = new StoreParamDto<>(stockPreviousDays, BigDecimal.ZERO, BigDecimal::add);

		// Step 3: Calculation of 'Amount Allocated'
		final var allocatedAmounts = calculateAllocatedAmount(whAllocationAmount, allocationKeys,
				stockPreviousDayParamDto, stores);
		logging("Step 3: Calculation of 'Amount Allocated'", allocatedAmounts);

		final var allocatedAmountParamDto = new StoreParamDto<>(allocatedAmounts, 0, Integer::sum);
		final var sumOfAllocatedAmounts = allocatedAmountParamDto.getSum();

		if (sumOfAllocatedAmounts.equals(whAllocationAmount)) {
			return allocatedAmounts;
		}

		// Step 4: Fix Rounding Issues
		final var fixAllocatedAmounts = fixRoundingIssue(interpolatedExpectedSales, stockPreviousDays,
				allocatedAmountParamDto, whAllocationAmount);
		logging("\n\nStep 4: Fix Rounding Issue'", fixAllocatedAmounts);
		
		return fixAllocatedAmounts;
	}

	private static Map<Long, Integer> fixRoundingIssue(Map<Long, BigDecimal> interpolatedExpectedSales,
			Map<Long, BigDecimal> stockPreviousDays, StoreParamDto<Integer> allocatedAmountParamDto,
			Integer whAllocationAmount) {

		final var storeDemands = calculateDemand(interpolatedExpectedSales, stockPreviousDays);
		final var fixAllocatedAmounts = new TreeMap<>(allocatedAmountParamDto.getStorePrams()); // output of step 3

		var sumOfAllocatedAmounts = allocatedAmountParamDto.getSum();

		if (sumOfAllocatedAmounts.compareTo(whAllocationAmount) > 0) {
			// Σ Amounts Allocated Store > Allocation Amount
			while (!sumOfAllocatedAmounts.equals(whAllocationAmount)) {
				// fix rounding - find store match requirement
				fixRoundingBiggest(fixAllocatedAmounts, storeDemands, interpolatedExpectedSales);
				
				// subtract one
				sumOfAllocatedAmounts -= 1;
			}

		} else {
			// Σ Amounts Allocated Store < Allocation Amount
			while (!sumOfAllocatedAmounts.equals(whAllocationAmount)) {
				// fix rounding - find store match requirement
				fixRoundingSmallest(fixAllocatedAmounts, storeDemands, interpolatedExpectedSales);
				
				// add one
				sumOfAllocatedAmounts += 1;
			}
		}

		return fixAllocatedAmounts;
	}
	
	private static void fixRoundingSmallest(final Map<Long, Integer> allocatedAmounts,
			final Map<Long, Integer> storeDemands, final Map<Long, BigDecimal> interpolatedExpectedSales) {
		// List<Entry<Long, Integer>>
		final var nonZeroAllocatedAmounts = filterToList(allocatedAmounts.entrySet(), e -> e.getValue() != 0);

		// Entry<Long, Integer>
		var selectedStore = nonZeroAllocatedAmounts.get(0);

		for (final var entry : nonZeroAllocatedAmounts) {
			final var storeId = entry.getKey();
			final var selectedStoreId = selectedStore.getKey();

			// find store which’s difference between Amount Allocated and Demand is smallest
			final var minDiff = selectedStore.getValue() - storeDemands.get(selectedStoreId);
			final var diff = entry.getValue() - storeDemands.get(storeId);

			if (diff < minDiff) {
				selectedStore = entry;
				continue;
			}

			// If two or more stores have the same difference: take the one with biggest Demand
			if (diff == minDiff) {
				final var maxDemand = storeDemands.get(selectedStoreId);
				final var demand = storeDemands.get(storeId);

				if (demand > maxDemand) {
					selectedStore = entry;
					continue;
				}

				// If two or more stores also have same Demand: take the one with biggest Expected Sales incl.reference/interpolated
				if (demand == maxDemand) {
					final var maxExpectedSales = interpolatedExpectedSales.get(selectedStoreId);
					final var expectedSales = interpolatedExpectedSales.get(storeId);

					if (expectedSales.compareTo(maxExpectedSales) > 0) {
						selectedStore = entry;
						continue;
					}

					// If two or more stores also have same Expected Sales incl.reference/interpolated: take the one with smallest store number
					if (expectedSales.compareTo(maxExpectedSales) == 0) {
						if (storeId < selectedStoreId) {
							selectedStore = entry;
						}
					}
				}
			}
		}
		
		// adding one allocation unit from selected store
		int newValue = selectedStore.getValue() + 1;
		System.out.printf("\n>> Add one unit for store %s", selectedStore.getKey());
		selectedStore.setValue(newValue);
	}

	private static void fixRoundingBiggest(final Map<Long, Integer> allocatedAmounts,
			final Map<Long, Integer> storeDemands, final Map<Long, BigDecimal> interpolatedExpectedSales) {
		// List<Entry<Long, Integer>>
		final var nonZeroAllocatedAmounts = filterToList(allocatedAmounts.entrySet(), e -> e.getValue() != 0);

		// Entry<Long, Integer>
		var selectedStore = nonZeroAllocatedAmounts.get(0);

		for (final var entry : nonZeroAllocatedAmounts) {
			final var storeId = entry.getKey();
			final var selectedStoreId = selectedStore.getKey();

			// find store which’s difference between Amount Allocated and Demand is biggest
			final var maxDiff = selectedStore.getValue() - storeDemands.get(selectedStoreId);
			final var diff = entry.getValue() - storeDemands.get(storeId);

			if (diff > maxDiff) {
				selectedStore = entry;
				continue;
			}

			// If two or more stores have the same difference: take the one with smallest Demand
			if (diff == maxDiff) {
				final var minDemand = storeDemands.get(selectedStoreId);
				final var demand = storeDemands.get(storeId);

				if (demand < minDemand) {
					selectedStore = entry;
					continue;
				}

				// If two or more stores also have same Demand: take the one with smallest Expected Sales incl.reference/interpolated
				if (demand == minDemand) {
					final var minExpectedSales = interpolatedExpectedSales.get(selectedStoreId);
					final var expectedSales = interpolatedExpectedSales.get(storeId);

					if (expectedSales.compareTo(minExpectedSales) < 0) {
						selectedStore = entry;
						continue;
					}

					// If two or more stores also have same Expected Sales incl.reference/interpolated: take the one with smallest store number
					if (expectedSales.compareTo(minExpectedSales) == 0) {
						if (storeId < selectedStoreId) {
							selectedStore = entry;
						}
					}
				}
			}
		}
		
		// subtracting one allocation unit from selected store
		int newValue = selectedStore.getValue() - 1;
		System.out.printf("\n>> Subtract one unit for store %s", selectedStore.getKey());
		selectedStore.setValue(newValue);
	}

	private static Map<Long, Integer> calculateDemand(Map<Long, BigDecimal> interpolatedExpectedSales,
			Map<Long, BigDecimal> stockPreviousDays) {
		return toMap(interpolatedExpectedSales.entrySet(), Entry::getKey, e -> {
			final var expectedSales = e.getValue();
			final var stockPreviousDay = stockPreviousDays.get(e.getKey());
			return zeroIfNegative(
					expectedSales.subtract(stockPreviousDay).setScale(0, RoundingMode.HALF_UP).intValue());
		}, TreeMap::new);

	}

	private static Map<Long, Integer> calculateAllocatedAmount(Integer whAllocationAmount,
			Map<Long, BigDecimal> allocationKeys, StoreParamDto<BigDecimal> stockPreviousDayParamDto,
			List<Store> stores) {

		final var stockPreviousDays = stockPreviousDayParamDto.getStorePrams();
		final var sumOfStorePreviousDay = stockPreviousDayParamDto.getSum();

		return toMap(stores, Store::getStoreId, store -> {
			final var storeId = store.getStoreId();
			final var allocationKey = allocationKeys.get(storeId);
			final var stockPreviousDay = stockPreviousDays.get(storeId);

			final var allocatedAmount = allocationKey
					.multiply(bd(whAllocationAmount).add(sumOfStorePreviousDay), MathContext.DECIMAL64)
					.subtract(stockPreviousDay).setScale(0, RoundingMode.HALF_UP).intValue();

			return zeroIfNegative(allocatedAmount);
		}, TreeMap::new);
	}

	private static Map<Long, BigDecimal> calculateAllocationKey(Map<Long, BigDecimal> interpolatedExpectedSales) {
		final var sum = sumOfBigDecimal(interpolatedExpectedSales.values());
		return interpolatedExpectedSales.entrySet().stream()
				.collect(Collectors.toMap(Entry::getKey, e -> e.getValue().divide(sum, 10, RoundingMode.HALF_UP)));
	}

	private static Map<Long, BigDecimal> fillMissingExpectedSales(List<Store> stores) throws CalculationException {
		final var ownNonNullExpectedSales = filterToMap(stores, store -> store.getExpectedSales() != null,
				Store::getStoreId, Store::getExpectedSales);

		if (isNullOrEmpty(ownNonNullExpectedSales)) {
			throw new CalculationException(
					"Expected sales cannot be calculated. Please add a reference store or include stores with expected sales for interpolation");
		}

		final var avgOwnStoreExpectedSales = sumOfBigDecimal(ownNonNullExpectedSales.values())
				.divide(bd(ownNonNullExpectedSales.size()), 1, RoundingMode.HALF_UP);

		return toMap(stores, Store::getStoreId, store -> {
			final var expectedSales = store.getExpectedSales();
			if (expectedSales != null) {
				return rounding(expectedSales, 1);
			}
			final var refStoreId = store.getReferenceStoreId();
			if (refStoreId != null) {
				final var refStoreExpectedSales = ownNonNullExpectedSales.get(refStoreId);
				// UC1 UC2B
				return rounding(refStoreExpectedSales != null ? refStoreExpectedSales : avgOwnStoreExpectedSales, 1);
			}
			// UC2A
			return rounding(avgOwnStoreExpectedSales, 1);
		}, TreeMap::new);
	}

}
