package view;

import static model.DataModel.mockItemStoreIds;
import static model.DataModel.mockRefStores;
import static model.DataModel.mockRefWeights;
import static model.DataModel.mockStoreTrendFactors;
import static model.DataModel.mockStoresOfRefItemA55;
import static model.DataModel.mockStoresOfRefItemA77;
import static model.DataModel.planningAmount;
import static model.DataModel.requiredMinPlanningAmount;
import static utils.LogUtils.logging;
import static utils.LogUtils.logging2;
import static utils.NumberUtils.bd;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import bean.Item;
import bean.Store;

public class WhAllocationDemo {

	public static void main(String[] args) {

		final Map<Item, List<Store>> storesA55 = mockStoresOfRefItemA55();
		final Map<Item, List<Store>> storesA77 = mockStoresOfRefItemA77();
		final Map<Integer, Integer> refStores = mockRefStores();
		final Map<Integer, BigDecimal> refWeights = mockRefWeights();
		final Map<Integer, BigDecimal> trendFactors = mockStoreTrendFactors();
		
		
		
		if (checkAmount(planningAmount, requiredMinPlanningAmount) && planningAmount == null) {
			System.out.println("planning amount must higher than required plannning amount or != null !!!");
			return;
		} else {
			System.out.println("=======Step 2=======");
			Map<Item, List<Store>> fillPotenA55 = fillingPotentialGap(storesA55, refStores);
			logging2("StoreA55 filling -> ", fillPotenA55);
			
			Map<Item, List<Store>> fillPotenA77 = fillingPotentialGap(storesA77, refStores);
			logging2("StoreA77 filling -> ", fillPotenA77);
			System.out.println("=======Step 3=======");
			Map<Integer, BigDecimal> storeDemands = storeDemands(storesA55, storesA77, refWeights,trendFactors);
			logging("Step 3", storeDemands);
			System.out.println("=======Step 4=======");
			Map<Integer, BigDecimal> totalDemandOfWhLevel = totalDemandOfWhLevels(storesA55, storeDemands);
			logging("StoreA55 -> ", totalDemandOfWhLevel);
			System.out.println("=======Step 5=======");
			Map<Integer, BigDecimal> sharesWh = calculateSharesWh(totalDemandOfWhLevel);
			logging("SharesWh -> ", sharesWh);
			System.out.println("=======Step 6=======");
			BigDecimal planningAmountEachCoutnry = BigDecimal.valueOf(planningAmount);
			Map<Integer, BigDecimal> allocateByShares = allocateByShares(totalDemandOfWhLevel,planningAmountEachCoutnry);
			logging("AllocatedByShares", allocateByShares);
		}

	}
	
	// Step 6
	private static Map<Integer, BigDecimal> allocateByShares(Map<Integer, BigDecimal> calculateSharesWh, BigDecimal planningAmount) {
		
		return calculateSharesWh
				.entrySet()
				.stream()
				.collect(Collectors.toMap(Entry::getKey, entry -> entry.getValue().multiply(planningAmount).divide(BigDecimal.valueOf(100))));
	
		
	}
	// Step 5
	private static Map<Integer, BigDecimal> calculateSharesWh(Map<Integer, BigDecimal> totalDemands) {
		final BigDecimal sum = totalDemands
				.values()
				.stream()
				.reduce(BigDecimal.ZERO, BigDecimal::add);
		
		return totalDemands
				.entrySet()
				.stream()
				.collect(Collectors.toMap(Entry::getKey, entry -> entry.getValue().divide(sum, 2, RoundingMode.HALF_UP).multiply(BigDecimal.valueOf(100))));
		
		
	
	}
	
	//step 4
	
	private static Map<Integer, BigDecimal> totalDemandOfWhLevels(Map<Item, List<Store>> sources, Map<Integer, BigDecimal> storeDemands) {
	    return sources.values().stream()
	            .flatMap(List::stream)
	            .collect(Collectors.toMap(
	                    Store::getWhId,
	                    store -> storeDemands.getOrDefault(store.getId(), BigDecimal.ZERO),
	                    BigDecimal::add
	            ));
	}
	
	// Step 3
	private static Map<Integer, BigDecimal> storeDemands(Map<Item, List<Store>> stores1, Map<Item, List<Store>> stores2,
			Map<Integer, BigDecimal> refWeights,Map<Integer, BigDecimal> trendFactors) {
		
        final Map<Integer, BigDecimal> res = new HashMap<>();
        final BigDecimal weightOfStore1 = refWeights.getOrDefault(55, BigDecimal.ONE);
        final BigDecimal weightOfStore2 = refWeights.getOrDefault(77, BigDecimal.ONE);
        
        final BigDecimal totalWeight = weightOfStore1.add(weightOfStore2);
        
        
        BigDecimal demands = BigDecimal.valueOf(0);
        final List<Integer> storeIds = mockItemStoreIds();
        
//        final List<Store> listOfStore = storesOfA55.values().stream()
//                .flatMap(List::stream)
//                .toList();
//        
//        final List<Store> listOfStore2 = storesOfA77.values().stream()
//                .flatMap(List::stream)
//                .toList();
        
        for (Integer storeId : storeIds) {
            BigDecimal totalPotenOfStores1 = listOfStore(stores1).stream()
                .filter(store -> store.getId().equals(storeId))
                .map(store -> store.getPotential().multiply(weightOfStore1))
                .reduce(BigDecimal.ZERO, BigDecimal::add);

            BigDecimal totalPotenOfStores2 = listOfStore(stores2).stream()
                .filter(store -> store.getId().equals(storeId))
                .map(store -> store.getPotential().multiply(weightOfStore2))
                .reduce(BigDecimal.ZERO, BigDecimal::add);

            BigDecimal totalPotential = totalPotenOfStores1.add(totalPotenOfStores2);
            if (trendFactors.containsKey(storeId)) {
				demands = totalPotential.divide(totalWeight).multiply(trendFactors.get(storeId));
			} else {
				demands = totalPotential.divide(totalWeight);
			}
            res.put(storeId, demands);

        }

        return res;
    }
	
	
	
	// Step 1
	private static boolean checkAmount(Integer planningAmount, Integer requiredMinPlanningAmount) {
		if (planningAmount <= requiredMinPlanningAmount) {
			return false;
		}
		return true;
	}
	// Step 2
	private static Map<Item, List<Store>> fillingPotentialGap(Map<Item, List<Store>> sources,
			Map<Integer, Integer> refStores) {

		final Map<Item, List<Store>> res = new HashMap<>();

		// DS != 0
		final List<BigDecimal> ownNonNullPotential = sources.values().stream().flatMap(List::stream)
				.map(Store::getPotential).filter(potential -> potential.compareTo(BigDecimal.ZERO) > 0)
				.collect(Collectors.toList());

		final BigDecimal avgPotential = ownNonNullPotential.stream().reduce(BigDecimal.ZERO, BigDecimal::add)
				.divide(bd(ownNonNullPotential.size()), 2, RoundingMode.HALF_UP);

		final Map<Integer, Store> storesMap = sources.values().stream().flatMap(List::stream)
				.collect(Collectors.toMap(Store::getId, store -> store));

		for (Map.Entry<Item, List<Store>> entry : sources.entrySet()) {
			Item items = entry.getKey();
			List<Store> stores = entry.getValue();

			for (Store store : stores) {
				final BigDecimal storePotential = store.getPotential();
				if (storePotential.compareTo(BigDecimal.ZERO) == 0) {
					Integer refStoresId = refStores.get(store.getId());
					if (refStoresId != null) {
						Store refStore = storesMap.get(refStoresId);
						if (refStore != null) {
							store.setPotential(refStore.getPotential());
						} else {
							store.setPotential(avgPotential);
						}
					} else {
						store.setPotential(avgPotential);
					}
				}
			}
			res.put(items, stores);

		}

		return res;
	}
	
	private static List<Store> listOfStore(Map<Item, List<Store>> storesMap) {
        return storesMap.values().stream()
            .flatMap(List::stream)
            .toList();
    }

}
