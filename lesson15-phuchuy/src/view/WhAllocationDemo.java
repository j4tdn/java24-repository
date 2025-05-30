package view;

import static model.DataModel.mockRefStores;
import static model.DataModel.mockRefWeights;
import static model.DataModel.mockStoreTrendFactors;
import static model.DataModel.mockStoresOfRefItemA77;
import static model.DataModel.planningAmount;
import static model.DataModel.requiredMinPlanningAmount;
import static utils.NumberUtils.bd;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import bean.Item;
import bean.Store;

public class WhAllocationDemo {

	public static void main(String[] args) {

		System.out.println(
				"Check Planning Amount ..... " + checkPlanningAmount(planningAmount, requiredMinPlanningAmount));
		
		List<Store> interpolatedPotential = fillingGapPotentials(mockStoresOfRefItemA77(), mockRefStores());
		System.out.println(interpolatedPotential);
		calDemand(mockRefWeights(), mockStoreTrendFactors(), fillingGapPotentials(mockStoresOfRefItemA77(), mockRefStores()));

	}

	private static boolean checkPlanningAmount(Integer planningAmount, Integer requireAmount) {
		return planningAmount > requireAmount;
	}

	private static List<Store> fillingGapPotentials (Map<Item, List<Store>> item, Map<Integer, Integer> refStore) {
		List<Store> result = new ArrayList<>();

		List<Store> stores = item.entrySet().stream().flatMap(entry -> entry.getValue().stream())
				.collect(Collectors.toList());

		List<Store> storeWithNoPotential = stores.stream().filter(t -> t.getPotential().compareTo(bd(0)) == 0).toList();

		List<Store> storeWithPotential = stores.stream().filter(t -> t.getPotential().compareTo(bd(0)) != 0).toList();
		
		for (var ele : storeWithPotential) {
			ele.setPotential(ele.getPotential().setScale(1, RoundingMode.HALF_UP));
		}
		BigDecimal sumPotential = storeWithPotential.stream().map(Store::getPotential).reduce(BigDecimal.ZERO,
				BigDecimal::add);
		BigDecimal avgPotential = sumPotential.divide(bd(storeWithPotential.size()), 1, RoundingMode.HALF_UP);

		for (var ele : storeWithNoPotential) {
			Integer storeId = ele.getId();
			
			Integer refStoreId = refStore.get(storeId);
			
			Store refStorePotential = stores.stream().filter(t -> t.getId() == refStoreId).findFirst().orElse(null);
			if (refStoreId != null) {
				ele.setPotential(refStorePotential.getPotential().setScale(1, RoundingMode.HALF_UP));
			} else {
				ele.setPotential(avgPotential);
			}

		}
		result.addAll(storeWithPotential);
		result.addAll(storeWithNoPotential);
		result.sort(Comparator.comparing(Store::getId));

		return result;
	}
	
	private static void calDemand (Map<Integer, BigDecimal> mockStoreTrendFactors, Map<Integer, BigDecimal> mockRefWeights, List<Store> intepolatedPotential) {
//		Integer weight = mockRefWeights.get()
		List<Integer> itemIds = new ArrayList<>(mockRefWeights.keySet());
		
		Map<Integer, List<Store>> itemToStores = new HashMap<>();
		
		
		
	}
	  
	

}
