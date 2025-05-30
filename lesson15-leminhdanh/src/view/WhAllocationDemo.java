package view;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

import bean.Item;
import bean.Store;
import model.DataModel;
import static model.DataModel.*;
import static utils.LogUtils.*;
import static utils.NumberUtils.*;

public class WhAllocationDemo {

	public static void main(String[] args) {
		
		// Step 1: Check for planning amount.
		
		final var planningAmount = DataModel.planningAmount;
		final var requiredMinPlanningAmount = DataModel.requiredMinPlanningAmount;
		if (planningAmount <= requiredMinPlanningAmount) {
			return;
		}
		
		// Step 2: Filling gaps by references or average
		List<Map<Item, List<Store>>> refItems = new ArrayList<>();
		refItems.add(mockStoresOfRefItemA55());
		refItems.add(mockStoresOfRefItemA77());
		
		Map<Integer, Integer> refStores = mockRefStores();
		
		Map<Item, Map<Integer, BigDecimal>> ownNonNullPotentialStores = new HashMap<>();
				
		refItems.forEach(item -> {
			Item key = item.keySet().iterator().next();
			Map<Integer, BigDecimal> potentialStores = new TreeMap<>();
			item.get(key).forEach(store -> {
				if(store.getPotential().compareTo(BigDecimal.ZERO) != 0) {
					potentialStores.put(store.getId(), store.getPotential());
				}
			});
			ownNonNullPotentialStores.put(key, potentialStores);
		});
		
		Map<Item, BigDecimal> avgOfOwnNonNullPotentialStores = ownNonNullPotentialStores.entrySet().stream()
				.collect(Collectors.toMap(Entry::getKey, e -> {
					return e.getValue().values().stream()
							.reduce(BigDecimal.ZERO, BigDecimal::add).divide(new BigDecimal(String.valueOf(e.getValue().size())), 1, RoundingMode.HALF_UP);
				}));
		
		//avgOfOwnNonNullPotentialStores.entrySet().stream().forEach(System.out::println);
		
		Map<Item, Map<Integer, BigDecimal>> potentialStores = calculatePotentialStores(refItems, refStores, ownNonNullPotentialStores, avgOfOwnNonNullPotentialStores);
		generate("Step 2: Filling gaps by references or average", potentialStores);
		
		// Step 3: Calculate Store Demand of current Item(Item A1)
		
		Map<Integer, BigDecimal> storeTrend = mockStoreTrendFactors();
		Map<Integer, BigDecimal> weightting = mockRefWeights();
		Map<Integer, BigDecimal> demandStores = calculateDemandStores(refItems, weightting, storeTrend, potentialStores);
		generate1("Step 3: Calculate Store Demand of current Item(Item A1)", demandStores);
		
		
		// Step 4: Sum up Demand to WH Level 
		Map<Integer, BigDecimal> demandWH = calculateDemandWH(demandStores, refItems);
		generate1("Step 4: Sum up Demand to WH Level ", demandWH);
		
		
		// Step 5: Calculate Shares
		
		Map<Integer, BigDecimal> shareWH = calculateShareWH(demandWH);
		generate1("Step 5: Calculate Shares", shareWH);
		
		// Step 6: Allocate by Shares
		
		Map<Integer, BigDecimal> allocationAmountWH = calculateAllocationAmountWH(shareWH, planningAmount);
		generate1("Step 6: Allocate by Shares", allocationAmountWH);
		
		
		
	}
	
	private static Map<Integer, BigDecimal> calculateAllocationAmountWH(Map<Integer, BigDecimal> shareWH, Integer planningAmount) {
		return shareWH.entrySet().stream()
				.collect(Collectors.toMap(Entry::getKey, e -> {
					return rounding(e.getValue().divide(bd(100)).multiply(bd(planningAmount)), 1);
				}));
	}
	
	private static Map<Integer, BigDecimal> calculateShareWH(Map<Integer, BigDecimal> demandWH) {
		BigDecimal sumOfdemandWH = demandWH.values().stream()
				.reduce(BigDecimal.ZERO, BigDecimal::add);
		
		return demandWH.entrySet().stream()
				.collect(Collectors.toMap(Entry::getKey, e -> {
					return rounding(e.getValue().divide(sumOfdemandWH, 3,RoundingMode.HALF_UP).multiply(bd(100)), 1);
				}));
	}
	
	private static Map<Integer, BigDecimal> calculateDemandWH(Map<Integer, BigDecimal> demandStores, List<Map<Item, List<Store>>> refItems) {
		
		List<Store> allStores = refItems.get(0).entrySet().stream()
			    .flatMap(map -> map.getValue().stream())        
			    .collect(Collectors.toList());   
		
		return allStores.stream()
				.collect(Collectors.toMap(Store::getWhId, e -> demandStores.get(e.getId()), BigDecimal::add));
	}
	
	private static Map<Integer, BigDecimal> calculateDemandStores(List<Map<Item, List<Store>>> refItems,
			Map<Integer, BigDecimal> weightting, Map<Integer, BigDecimal> storeTrend,
			Map<Item, Map<Integer, BigDecimal>> potentialStores) {
		
		Map<Integer, BigDecimal> sumOfPotentialStores = new TreeMap<>();
		AtomicReference<BigDecimal> sumOfWeighttingStore = new AtomicReference<>(BigDecimal.ZERO);
		
		potentialStores.forEach((k, v) -> {
			BigDecimal weighttingStore = weightting.get(k.getId());
		    sumOfWeighttingStore.updateAndGet(current -> current.add(weighttingStore));
			v.entrySet().stream()
			.forEach(m -> {
				if(sumOfPotentialStores.containsKey(m.getKey())) {
					sumOfPotentialStores.put(m.getKey(), sumOfPotentialStores.get(m.getKey()).add(m.getValue().multiply(weighttingStore)));
				} else {
					sumOfPotentialStores.put(m.getKey(), m.getValue().multiply(weighttingStore));
				}
			});
			
		});
		BigDecimal totalWeight = sumOfWeighttingStore.get();
		
		
		// sumOfPotentialStores.entrySet().stream().forEach(System.out::println);
		return sumOfPotentialStores.entrySet().stream()
				.collect(Collectors.toMap(Entry::getKey, e -> {
					if(storeTrend.get(e.getKey())!=null) {
						return rounding(e.getValue().divide(totalWeight, 1, RoundingMode.HALF_UP).multiply(storeTrend.get(e.getKey())), 1);
					} else {

						return rounding(e.getValue().divide(totalWeight, 1, RoundingMode.HALF_UP).multiply(bd(1)), 1);
					}
				}));
	}
	
	private static Map<Item, Map<Integer, BigDecimal>> calculatePotentialStores(List<Map<Item, List<Store>>> refItems,
			Map<Integer, Integer> refStores, Map<Item, Map<Integer, BigDecimal>> ownNonNullPotentialStores, Map<Item, BigDecimal> avgOfOwnNonNullPotentialStores) {

		Map<Item, Map<Integer, BigDecimal>> potentialItems = new HashMap<>();
		refItems.forEach(item -> {
			Item key =  item.keySet().iterator().next();
			Map<Integer, BigDecimal> potentialStores = new TreeMap<>();
			item.get(key).forEach(store -> {
				potentialStores.put(store.getId(), store.getPotential());
			});
			potentialItems.put(key, potentialStores);
		});
		Map<Item, Map<Integer, BigDecimal>> calculatePotentialStore = potentialItems.entrySet().stream()
			.collect(Collectors.toMap(Entry::getKey, (e) -> {
				return e.getValue().entrySet().stream()
						.collect(Collectors.toMap(Entry::getKey, s -> {
							Integer storeId = s.getKey();
							BigDecimal potentialStore = s.getValue();
							BigDecimal avgOfOwnNonNullPotentialStore = avgOfOwnNonNullPotentialStores.get(e.getKey());
							
							if(potentialStore.compareTo(BigDecimal.ZERO)!=0) {
								return rounding(potentialStore, 1);
							}
							Integer refStoreId = refStores.get(storeId);
							
							if(refStoreId!=null) {
								BigDecimal refPotentialStore = ownNonNullPotentialStores.get(e.getKey()).get(refStoreId);
								
								return rounding(refPotentialStore != null ? refPotentialStore:avgOfOwnNonNullPotentialStore, 1);
							}
							
							return avgOfOwnNonNullPotentialStore;
						}));
			}));
		
		

		return calculatePotentialStore;
		
		
	}
	
}
