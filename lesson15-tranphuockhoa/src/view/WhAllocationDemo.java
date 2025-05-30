package view;

import model.DataModel;
import bean.Store;
import bean.Item;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class WhAllocationDemo {

	public static void main(String[] args) {
		
		
		// Step 1
		int planningAmount = DataModel.planningAmount;
		int requiredMinPlanningAmount = DataModel.requiredMinPlanningAmount;
		
		System.out.println("Step1: Check planning ammount: ");
		System.out.println("Planning ammount: " + planningAmount);
		System.out.println("Required min ammount: " + requiredMinPlanningAmount);
		// kiem tra neu planning < min Required thi dung tinh toan nguoc lai qua buoc tiep theo
		
		if(planningAmount <= requiredMinPlanningAmount) {
			System.out.println("planning amount <= requiredMinPlanningAmount, stop calculation !!!");
			return;
		} else {
			System.out.println("-> Countinue step 2");
		}
		System.out.println("--------------------------");
		
		// Step 2
		System.out.println("Step2: Filling gaps by references or average");
		List<Map<Item, List<Store>>> listOfRefItemsMaps = List.of(
				DataModel.mockStoresOfRefItemA55(),
				DataModel.mockStoresOfRefItemA77()
				// Thay đổi ref item khác ở đây
		);
		
		Map<Integer, Integer> refStoreMap = DataModel.mockRefStores();
		
		Map<Item, List<Store>> allRefItemsStores = new HashMap<>();
		for (Map<Item, List<Store>> map : listOfRefItemsMaps) {
			allRefItemsStores.putAll(map);
		}
		
		for (Item refItem : allRefItemsStores.keySet()) {
			System.out.println("Reference Item: " + refItem.getName());
			
			List<Store> stores = allRefItemsStores.get(refItem);
			
			// Tính trung bình Potential của các store đã có giá trị
			List<BigDecimal> maintainedPotntials = new ArrayList<>();
			
			for (Store s : stores) {
				if (s.getPotential() != null && s.getPotential().compareTo(BigDecimal.ZERO)>0) {
					maintainedPotntials.add(s.getPotential());
				}
			}
			
			BigDecimal avgPotential = BigDecimal.ZERO;
			if (!maintainedPotntials.isEmpty()) {
				BigDecimal total = maintainedPotntials.stream().reduce(BigDecimal.ZERO, BigDecimal::add);
				avgPotential = total.divide(BigDecimal.valueOf(maintainedPotntials.size()), 1, RoundingMode.HALF_UP);
			}
			
			//Bổ sung potential nếu không đc duy trì
			for (Store store : stores) {
				BigDecimal potential = store.getPotential();
				if (potential == null || potential.compareTo(BigDecimal.ZERO) == 0){
					Integer refId = refStoreMap.get(store.getId());
					Store refStore = null;
					
					if(refId != null) {
						for (Store s : stores) {
							if(s.getId().equals(refId)) {
								refStore = s;
								break;
							}
						}
					}
					
					// nếu có reference store có potential thì dùng ko thì trung bình
					if (refStore != null && refStore.getPotential() != null 
						&& refStore.getPotential().compareTo(BigDecimal.ZERO) > 0) {
						store.setPotential(refStore.getPotential());
					} else {
						store.setPotential(avgPotential);
					}
				}
			}
			
			// In ra nếu có bổ sung potential
			for (Store store : stores) {
				BigDecimal potential = store.getPotential();
				
				if(potential == null || potential.compareTo(BigDecimal.ZERO) == 0) {
					System.out.println(store .getDesc() + "\t" + "not maintained");
				}
				else {
					System.out.println(store .getDesc() + "\t" + potential);
				}
			}
			System.out.println("--------------------------");
		}

		// Step 3
		System.out.println("Step3: Calculate Store Demand of current Item(Item A1)");
		
		Map<Integer, BigDecimal> storeDemandMap = new HashMap<>();

		Map<Item, List<Store>> refItemStores = new HashMap<>();
		refItemStores.putAll(DataModel.mockStoresOfRefItemA55());
		refItemStores.putAll(DataModel.mockStoresOfRefItemA77());
		
		// trọng số
		Map<Integer, BigDecimal> refItemWeights = DataModel.mockRefWeights();
		
		// trend factor
		Map<Integer, BigDecimal> storeTrendFactors = DataModel.mockStoreTrendFactors();
		
		Set<Integer> storeIds = new HashSet<>();
		for (List<Store> stores : refItemStores.values()) {
			for (Store store : stores) {
				storeIds.add(store.getId());
			}
		}
		
		for (Integer storeId : storeIds) {
			BigDecimal numerator = BigDecimal.ZERO;
			BigDecimal denominator = BigDecimal.ZERO;
		
			for (Item refItem : refItemStores.keySet()) {
				List<Store> stores = refItemStores.get(refItem);
				
				BigDecimal potential = null;
				for (Store store : stores){
					if (store.getId() == storeId) {
						potential = store.getPotential();
						break;
					}
				}
				
				if(potential == null || potential.compareTo(BigDecimal.ZERO) == 0){
					continue;
				}
				
				BigDecimal weight = refItemWeights.getOrDefault(refItem.getId(), BigDecimal.ONE);
				
				numerator = numerator.add(potential.multiply(weight));
				denominator = denominator.add(weight);
			}
			
			if (denominator.compareTo(BigDecimal.ZERO) == 0) {
				storeDemandMap.put(storeId, demand);
				System.out.println("Store " + storeId + "\tDemand = 0 (No maintained Potential)");
				continue;
			}
			
			
			BigDecimal trendFactor = storeTrendFactors.getOrDefault(storeIds, BigDecimal.ONE);
			
			BigDecimal demand = numerator.divide(denominator, 4, RoundingMode.HALF_UP)
										 .multiply(trendFactor)
										 .setScale(1, RoundingMode.HALF_UP);
			
			storeDemandMap.put(storeId, demand);
			System.out.println("Store " + storeId + "\tDemand = " + demand);
			
			
		}
		System.out.println("--------------------------");
	
	
		// Step 4
		System.out.println("Step4: Sum up Demand to WH Level");
		
		Map<Integer, String> storeIdToWh = new HashMap<>();
		for (List<Store> stores : refItemStores.values()) {
			for (Store store : stores) {
				storeIdToWh.put(store.getId(), store.getWh());
			}
		}
		
		Map<String, BigDecimal> whDemandMap = new HashMap<>();
		
		for (Store store : stores) {
			BigDecimal demand = store.getDemand();
			
			
		}
	}
}
