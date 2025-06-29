package service;

import bean.Item;
import bean.Store;
import model.DataModel;
import utils.NumberUtils;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;
import java.util.stream.Collectors;

import static utils.NumberUtils.bd;

public class warehouseAllocationService {

	private static final MathContext MC = new MathContext(10, RoundingMode.HALF_UP);

	public static class AllocationResult {
		private Map<Integer, BigDecimal> storeDemands;
		private Map<Integer, BigDecimal> warehouseDemands;
		private Map<Integer, BigDecimal> warehouseShares;
		private Map<Integer, BigDecimal> warehouseAllocations;
		private boolean success;
		private String message;

		public AllocationResult() {
			this.storeDemands = new HashMap<>();
			this.warehouseDemands = new HashMap<>();
			this.warehouseShares = new HashMap<>();
			this.warehouseAllocations = new HashMap<>();
		}

		public Map<Integer, BigDecimal> getStoreDemands() {
			return storeDemands;
		}

		public void setStoreDemands(Map<Integer, BigDecimal> storeDemands) {
			this.storeDemands = storeDemands;
		}

		public Map<Integer, BigDecimal> getWarehouseDemands() {
			return warehouseDemands;
		}

		public void setWarehouseDemands(Map<Integer, BigDecimal> warehouseDemands) {
			this.warehouseDemands = warehouseDemands;
		}

		public Map<Integer, BigDecimal> getWarehouseShares() {
			return warehouseShares;
		}

		public void setWarehouseShares(Map<Integer, BigDecimal> warehouseShares) {
			this.warehouseShares = warehouseShares;
		}

		public Map<Integer, BigDecimal> getWarehouseAllocations() {
			return warehouseAllocations;
		}

		public void setWarehouseAllocations(Map<Integer, BigDecimal> warehouseAllocations) {
			this.warehouseAllocations = warehouseAllocations;
		}

		public boolean isSuccess() {
			return success;
		}

		public void setSuccess(boolean success) {
			this.success = success;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

	}

	public static AllocationResult calculateAllocation() {
		AllocationResult result = new AllocationResult();
		try {
			// step 1: check planning amount
			if (DataModel.planningAmount <= DataModel.requiredMinPlanningAmount) {
				result.setSuccess(false);
				result.setMessage(
						"Planning amout (" + DataModel.planningAmount + ") is less than or equal to required minium ("
								+ DataModel.requiredMinPlanningAmount + "). Stopping calculation.");
				return result;
			}
			Map<Item, List<Store>> refItemA55Data = DataModel.mockStoresOfRefItemA55();
			Map<Item, List<Store>> refItemA77Data = DataModel.mockStoresOfRefItemA77();
			Map<Integer, Integer> refStores = DataModel.mockRefStores();
			Map<Integer, BigDecimal> refWeights = DataModel.mockRefWeights();
			Map<Integer, BigDecimal> trendFactors = DataModel.mockStoreTrendFactors();

			Item itemA55 = refItemA55Data.keySet().iterator().next();
			Item itemA77 = refItemA77Data.keySet().iterator().next();
			List<Store> storesA55 = refItemA55Data.get(itemA55);
			List<Store> storesA77 = refItemA77Data.get(itemA77);

			// step 2: Fill gaps by references or average
			fillPotentialGaps(storesA55, refStores);
			fillPotentialGaps(storesA77, refStores);

			// Step 3: Calculate store demands
			calculateStoreDemands(storesA55, storesA77, refWeights, trendFactors, result);

			// Step 4: Sum up demand to warehouse level
			calculateWarehouseDemands(storesA55, result);

			// Step 5: Calculate shares
			calculateWarehouseShares(result);

			// Step 6: Allocate by shares
			allocateByShares(result);

			// Step 7: Apply minimum
			applyMinimum(storesA55, result);

			// Step 10: Round up
			roundAllocations(result);

			result.setSuccess(true);
			result.setMessage("Allocation calculation completed successfully.");

		} catch (Exception e) {
			result.setSuccess(false);
			result.setMessage("Error during calculation: " + e.getMessage());
			e.printStackTrace();
		}

		return result;

	}

	private static void fillPotentialGaps(List<Store> stores, Map<Integer, Integer> refStores) {
		// Calculate average of stores with own potentials (non-zero)
		BigDecimal totalPotential = BigDecimal.ZERO;
		int countWithPotential = 0;

		for (Store store : stores) {
			if (store.getPotential() != null && store.getPotential().compareTo(BigDecimal.ZERO) > 0) {
				totalPotential = totalPotential.add(store.getPotential());
				countWithPotential++;
			}
		}

		BigDecimal averagePotential = countWithPotential > 0
				? totalPotential.divide(BigDecimal.valueOf(countWithPotential), MC)
				: BigDecimal.ZERO;

		// Fill gaps for stores without potential (potential = 0 or null)
		for (Store store : stores) {
			if (store.getPotential() == null || store.getPotential().compareTo(BigDecimal.ZERO) == 0) {
				Integer refStoreId = refStores.get(store.getId());

				if (refStoreId != null) {
					// Find reference store potential
					Store refStore = stores.stream().filter(s -> s.getId().equals(refStoreId)).findFirst().orElse(null);

					if (refStore != null && refStore.getPotential() != null
							&& refStore.getPotential().compareTo(BigDecimal.ZERO) > 0) {
						store.setPotential(refStore.getPotential());
					} else {
						// Reference store has no potential, use average
						store.setPotential(averagePotential);
					}
				} else {
					// No reference store, use average
					store.setPotential(averagePotential);
				}
			}
		}
	}

	private static void calculateStoreDemands(List<Store> storesA55, List<Store> storesA77,
			Map<Integer, BigDecimal> refWeights, Map<Integer, BigDecimal> trendFactors, AllocationResult result) {

		BigDecimal weightA55 = refWeights.get(55);
		BigDecimal weightA77 = refWeights.get(77);
		BigDecimal totalWeight = weightA55.add(weightA77);

		for (int i = 0; i < storesA55.size(); i++) {
			Store storeA55 = storesA55.get(i);
			Store storeA77 = storesA77.get(i);

			// Calculate weighted potential
			BigDecimal weightedSum = storeA55.getPotential().multiply(weightA55)
					.add(storeA77.getPotential().multiply(weightA77));

			BigDecimal averagePotential = weightedSum.divide(totalWeight, MC);

			// Apply trend factor (default 1 if not specified)
			BigDecimal trendFactor = trendFactors.getOrDefault(storeA55.getId(), BigDecimal.ONE);
			BigDecimal demand = averagePotential.multiply(trendFactor);

			result.getStoreDemands().put(storeA55.getId(), demand);
		}
	}

	private static void calculateWarehouseDemands(List<Store> stores, AllocationResult result) {
		Map<Integer, List<Store>> warehouseStores = stores.stream().collect(Collectors.groupingBy(Store::getWhId));

		for (Map.Entry<Integer, List<Store>> entry : warehouseStores.entrySet()) {
			Integer warehouseId = entry.getKey();
			List<Store> warehouseStoreList = entry.getValue();

			BigDecimal warehouseDemand = warehouseStoreList.stream()
					.map(store -> result.getStoreDemands().get(store.getId())).filter(Objects::nonNull)
					.reduce(BigDecimal.ZERO, BigDecimal::add);

			result.getWarehouseDemands().put(warehouseId, warehouseDemand);
		}
	}

	private static void calculateWarehouseShares(AllocationResult result) {
		BigDecimal totalDemand = result.getWarehouseDemands().values().stream().reduce(BigDecimal.ZERO,
				BigDecimal::add);

		if (totalDemand.compareTo(BigDecimal.ZERO) > 0) {
			for (Map.Entry<Integer, BigDecimal> entry : result.getWarehouseDemands().entrySet()) {
				BigDecimal share = entry.getValue().divide(totalDemand, MC).multiply(bd(100));
				result.getWarehouseShares().put(entry.getKey(), share);
			}
		}
	}

	private static void allocateByShares(AllocationResult result) {
		for (Map.Entry<Integer, BigDecimal> entry : result.getWarehouseShares().entrySet()) {
			BigDecimal allocation = entry.getValue().divide(bd(100), MC).multiply(bd(DataModel.planningAmount));
			result.getWarehouseAllocations().put(entry.getKey(), allocation);
		}
	}

	private static void applyMinimum(List<Store> stores, AllocationResult result) {
		Map<Integer, Long> warehouseStoreCounts = stores.stream()
				.collect(Collectors.groupingBy(Store::getWhId, Collectors.counting()));

		Map<Integer, BigDecimal> minimumRequired = new HashMap<>();
		for (Map.Entry<Integer, Long> entry : warehouseStoreCounts.entrySet()) {
			BigDecimal minRequired = bd(DataModel.minPerStore).multiply(bd(entry.getValue()));
			minimumRequired.put(entry.getKey(), minRequired);
		}

		// Apply minimum where needed
		for (Map.Entry<Integer, BigDecimal> entry : result.getWarehouseAllocations().entrySet()) {
			Integer whId = entry.getKey();
			BigDecimal currentAllocation = entry.getValue();
			BigDecimal minRequired = minimumRequired.get(whId);

			if (currentAllocation.compareTo(minRequired) < 0) {
				result.getWarehouseAllocations().put(whId, minRequired);
			}
		}
	}
	private static void roundAllocations(AllocationResult result) {
		Map<Integer, BigDecimal> roundedAllocations = new HashMap<>();
		for (Map.Entry<Integer, BigDecimal> entry : result.getWarehouseAllocations().entrySet()) {
			BigDecimal rounded = entry.getValue().setScale(0, RoundingMode.UP);
			roundedAllocations.put(entry.getKey(), rounded);
		}
		result.setWarehouseAllocations(roundedAllocations);
	}

	
}
