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
import exception.CalculationException;
import model.DataModel;

import static utils.LogUtils.*;
import static utils.NumberUtils.*;
import static utils.StreamUtils.*;

public class Ex02WhAllocationApp {

	public static void main(String[] args) {

		final Integer whAllocationAmount = 300;

		// Tìm các store được chọn để cấp phát hàng hóa
		final var selectedStores = filterToList(DataModel.getStores(), Store::isSelected);

		if (selectedStores == null || selectedStores.isEmpty()) {
			System.out.println(">> There is no selected store for allocation. Stop calculation ...");
			return;
		}

		try {
			var storeAllocatedValues = doAllocation(selectedStores, whAllocationAmount);
			System.out.println("ignored --> " + storeAllocatedValues);
		} catch (CalculationException e) {
			e.printStackTrace();
		}
		
		System.out.println("==> Return HomePage ....");
	}

	/**
	 * Do Allocation.
	 * 
	 * Key: storeId with Long type Value: storeAllocatedAmount after calculation
	 * with 4 steps
	 * 
	 * @return map of storeId, storeAllocatedAmount
	 */
	private static Map<Long, Integer> doAllocation(List<Store> stores, Integer whAllocationAmount) throws CalculationException {
		// Step 1: Filling in missing 'Expected Sales' values
		final var interpolatedExpectedSales = fillMissingExpectedSales(stores);
		logging("Step 1: Filling in missing 'Expected Sales' values", interpolatedExpectedSales);

		// Step 2: Calculation of 'Allocation Key'
		final var allocationKeys = calculateAllocationKey(interpolatedExpectedSales);
		logging("Step 2: Calculation of 'Allocation Key'", allocationKeys);

		// Step 3: Calculation of 'Amount Allocated'
		final var allocatedAmounts = calculateAllocatedAmount(whAllocationAmount, allocationKeys, stores);
		logging("Step 3: Calculation of 'Amount Allocated'", allocatedAmounts);

		// Step 4: Fix Rounding Issues

		return null;
	}
	
	private static Map<Long, Integer> calculateAllocatedAmount(Integer whAllocationAmount, Map<Long, BigDecimal> allocationKeys, List<Store> stores) {
		final var stockPreviousDays = toMap(stores, Store::getStoreId, Store::getStockPreviousDay);
		final var sumOfStorePreviousDay = sum(stockPreviousDays.values());
		
		return toMap(stores, Store::getStoreId, store -> {
			final var storeId = store.getStoreId();
			final var allocationKey = allocationKeys.get(storeId); 
			final var stockPreviousDay = stockPreviousDays.get(storeId);
			
			final var allocatedAmount = allocationKey
					.multiply(bd(whAllocationAmount).add(sumOfStorePreviousDay), MathContext.DECIMAL64)
					.subtract(stockPreviousDay)
					.setScale(0, RoundingMode.HALF_UP).intValue();
			
			return zeroIfNegative(allocatedAmount);
		}, TreeMap::new);
	}
	
	private static Map<Long, BigDecimal> calculateAllocationKey(Map<Long, BigDecimal> interpolatedExpectedSales) {
		final var sum = sum(interpolatedExpectedSales.values());
		return interpolatedExpectedSales.entrySet()
				.stream()
				.collect(Collectors.toMap(Entry::getKey, e -> e.getValue().divide(sum, 10, RoundingMode.HALF_UP)));
	}

	private static Map<Long, BigDecimal> fillMissingExpectedSales(List<Store> stores) throws CalculationException {
		final var ownNonNullExpectedSales = filterToMap(stores,
				store -> store.getExpectedSales() != null, Store::getStoreId, Store::getExpectedSales);

		if (isNullOrEmpty(ownNonNullExpectedSales)) {
			throw new CalculationException(
					"Expected sales cannot be calculated. Please add a reference store or include stores with expected sales for interpolation");
		}

		final var avgOwnStoreExpectedSales = sum(ownNonNullExpectedSales.values())
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
