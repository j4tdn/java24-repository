package view;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import bean.Item;
import bean.Store;
import model.DataModel;

public class WhAllocationDemo {

	public static void main(String[] args) {
		
		
		int planningAmount = DataModel.planningAmount;
		int requireMinPlanningAmount = DataModel.requiredMinPlanningAmount;
		//step1
		checkForPlanningAmount(planningAmount, requireMinPlanningAmount);
		//step2 
		fillingGapsByReferencesOrAverage();
		//step3
		calculateStoreDemand();
		//Step4
		sumUpDemandToWHLevel();
		//Step5 
		calculateShare();
	}
	
	private static void checkForPlanningAmount(int planningAmount, int rerequireMinPlanningAmount) {
		System.out.println("Step1 : Check For Planning Amount ");
		System.out.println("Planning Amount : "+planningAmount);
		System.out.println("Require min planning amount "+rerequireMinPlanningAmount);
		
		if(planningAmount < rerequireMinPlanningAmount) {
			System.out.println("Planning Amount("+planningAmount+") is less than require minimum ("+rerequireMinPlanningAmount+")");
			System.out.println("Caculation stopped");
		}else {
			System.out.println("Planning Amount("+planningAmount+") meet the minimum requirement ("+rerequireMinPlanningAmount+")");
			System.out.println("Continue step 2");
		}
	}
	
	private static void fillingGapsByReferencesOrAverage() {
		System.out.println("Step2 : Filling Gaps By References Or Average");
		
		Map<Item, List<Store>> stores55 = DataModel.mockStoresOfRefItemA55();
		Map<Item, List<Store>> stores77 = DataModel.mockStoresOfRefItemA77();
		Map<Integer, Integer> refStores = DataModel.mockRefStores();
		Map<Integer, BigDecimal> refWeights = DataModel.mockRefWeights();
		
		Map<Integer, Store> allStores = new HashMap<>();
		stores55.values().forEach(list -> list.forEach(store -> allStores.put(store.getId(), store)));
		stores77.values().forEach(list -> list.forEach(store -> allStores.put(store.getId(), store)));
		
		List<BigDecimal> ownPotentials = allStores.values().stream().filter(store -> store.getPotential() != null && store.getPotential().compareTo(BigDecimal.ZERO) > 0 )
				.map(Store::getPotential).collect(Collectors.toList());
		BigDecimal averagePotential = ownPotentials.stream().reduce(BigDecimal.ZERO, BigDecimal::add).divide(BigDecimal.valueOf(ownPotentials.size()), 1, RoundingMode.HALF_UP);
		
		for(Map.Entry<Integer, Store> entry : allStores.entrySet()) {
			int storeId = entry.getKey();
			Store store = entry.getValue();
			BigDecimal currentPotential = store.getPotential();
			
			if(currentPotential == null || currentPotential.compareTo(BigDecimal.ZERO) == 0) {
				Integer refStoreId = refStores.get(storeId);
				if(refStoreId != null) {
					Store refStore = allStores.get(refStoreId);
					if(refStore != null && refStore.getPotential() != null && refStore.getPotential().compareTo(BigDecimal.ZERO) > 0) {
						store.setPotential(refStore.getPotential().setScale(1, RoundingMode.HALF_UP));
						System.out.println(String.format("Store %d -> reference store is maintained, filling gap by Potential of reference store %d: %.1f", storeId, refStoreId, store.getPotential()));
						
					}else {
						store.setPotential(averagePotential);
						System.out.println(String.format("Store %d -> reference store %d has no Potential, filling gap by average of stores that have own values: %.1f", storeId, refStoreId, store.getPotential()));
					}
				}else {
					store.setPotential(averagePotential);
					System.out.println(String.format("Store %d -> since no reference store is mantained in SHD, filling gap by average of stores thathave own value: %.1f", storeId, store.getPotential()));
				}
				
			}else {
				System.out.println(String.format("Store %d has it own potential, no cares reference store: %.1f", storeId, currentPotential));
			}
		}
		
		System.out.println("Reference Item A55 potential Ref 1 :");
		stores55.forEach((Item, stores) -> {
			stores.forEach(store -> System.out.println(String.format("Store%d\t%.1f", store.getId(), store.getPotential())));
		});
		System.out.println("Reference Item A77 potential Ref 2 :");
		stores77.forEach((Item, stores) -> {
			stores.forEach(store -> System.out.println(String.format("Store%d\t%.1f", store.getId(), store.getPotential())));
		});
		
		
	}
	
	private static void calculateStoreDemand() {
		System.out.println("Step 3 : Calculate Store Demand");
		
		Map<Item, List<Store>> stores55 = DataModel.mockStoresOfRefItemA55();
		Map<Item, List<Store>> stores77 = DataModel.mockStoresOfRefItemA77();
		Map<Integer, BigDecimal> storeTrendFactor = DataModel.mockStoreTrendFactors();
		Map<Integer, BigDecimal> refWeights = DataModel.mockRefWeights();
		
		BigDecimal weight55 = refWeights.getOrDefault(55, BigDecimal.ONE);
		BigDecimal weight77 = refWeights.getOrDefault(77, BigDecimal.ONE);
		BigDecimal totalWeight = weight55.add(weight77);
		
		Map<Integer, Store> allStores = new HashMap<>();
		stores55.values().forEach(list -> list.forEach(store -> allStores.put(store.getId(), store)));
		stores77.values().forEach(list -> list.forEach(store -> allStores.put(store.getId(), store)));
		System.out.println("Item A1");
		System.out.println("Store\tStore trend factore\tReference store potential\tReference item a77\tDemand new campaign ");
		
		for(Map.Entry<Integer, Store> entry : allStores.entrySet()) {
			int storeId = entry.getKey();
			Store store = entry.getValue();
			BigDecimal potentialA55 = store.getPotential();
			Store A77Store = stores77.values().stream().flatMap(List::stream).filter(s -> s.getId().equals(storeId)).findFirst().orElse(null);
			BigDecimal potentialA77 = A77Store != null ? A77Store.getPotential() : BigDecimal.ZERO;
			BigDecimal storeTrend = storeTrendFactor.getOrDefault(storeId, BigDecimal.ONE);
			BigDecimal demand = (potentialA55.multiply(weight55)).add(potentialA77.multiply(weight77)).divide(totalWeight, 1, RoundingMode.HALF_UP).multiply(storeTrend).setScale(1, RoundingMode.HALF_UP);
			
			System.out.println(String.format("%d\t%.1f\t\t\t\t%.1f\t\t\t\t%.1f\t\t\t\t%.1f", storeId, storeTrend, potentialA55, potentialA77, demand));
		}
	}
	
	private static void sumUpDemandToWHLevel() {
		System.out.println("Step 4 : Sum up demand to WH level");
		
		Map<Item, List<Store>> stores55 = DataModel.mockStoresOfRefItemA55();
		Map<Item, List<Store>> stores77 = DataModel.mockStoresOfRefItemA77();
		Map<Integer, Store> allStores = new HashMap<>();
		stores55.values().forEach(list -> list.forEach(store -> allStores.put(store.getId(), store)));
		stores77.values().forEach(list -> list.forEach(store -> allStores.put(store.getId(), store)));
		
		Map<Integer, List<Store>> storeByWH = allStores.values().stream().collect(Collectors.groupingBy(Store::getWhId));
		Map<Integer, BigDecimal> whDemand = new HashMap<>();
		for(Map.Entry<Integer, List<Store>> entry : storeByWH.entrySet()) {
			int whId = entry.getKey();
			BigDecimal totalDemand = entry.getValue().stream().map(Store::getPotential).reduce(BigDecimal.ZERO, BigDecimal::add).setScale(1, RoundingMode.HALF_UP);
			whDemand.put(whId, totalDemand);
		}
		
		System.out.println("Demand new campaign in store level");
		System.out.println("Store\tWH\tDemand new campaign in store level");
		allStores.values().forEach(store -> System.out.println(String.format("%d\tWH%d\t%.1f",store.getId(),store.getWhId(), store.getPotential())));
		
		System.out.println("\nDemand new Campaign in WH level");
		whDemand.forEach((wHId, demand) -> System.out.println(String.format("WH%d\t%.1f", wHId, demand)));
	}
	
	private static void calculateShare() {
		System.out.println("Step 5 : Calculate Share");
		
		int planningAmout = DataModel.planningAmount;
		System.out.println("Planning Amount "+planningAmout);
		
		Map<Integer, BigDecimal> whDemand = new HashMap<>();
		BigDecimal totalDemand = whDemand.values().stream().reduce(BigDecimal.ZERO, BigDecimal::add);
		
		Map<Integer, Integer> whAllocation = new HashMap<>();
		Map<Integer, BigDecimal> whPercentages = new HashMap<>();
		
		System.out.println("WH\tDemand\tPercentafe\tPlanning Amount");
		
		for(Map.Entry<Integer, BigDecimal> entry : whDemand.entrySet()) {
			int whId = entry.getKey();
			BigDecimal demand = entry.getValue();
			
			BigDecimal percentage = demand.divide(totalDemand, 4, RoundingMode.HALF_UP).multiply(BigDecimal.valueOf(100)).setScale(1, RoundingMode.HALF_UP);
			BigDecimal allocatedAmount = percentage.multiply(BigDecimal.valueOf(planningAmout)).divide(BigDecimal.valueOf(100), 0, RoundingMode.HALF_UP);
			
			whPercentages.put(whId, percentage);
			whAllocation.put(whId,allocatedAmount.intValue());
			System.out.println(String.format("WH%d\t%.1f\t%.1f\t\t%d",whId, demand, percentage, allocatedAmount.intValue() ));
			
		}
		
		int totallAllocated = whAllocation.values().stream().mapToInt(Integer::intValue).sum();
		System.out.println("Total planning amount : "+totallAllocated);
	}
}
