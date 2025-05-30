package view;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Formatter.BigDecimalLayoutForm;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import javax.swing.table.TableCellRenderer;

import bean.Item;
import bean.Store;
import model.DataModel;
import utils.CollectionUtils;

public class WhAllocationDemo {

	public static void main(String[] args) {

		// Step 1: Check for planning amount
		Integer planningAmount = DataModel.planningAmount;
		Integer requiredMinPlanningAmount = DataModel.requiredMinPlanningAmount;

		if (planningAmount <= requiredMinPlanningAmount) {
			System.out.println("Planing amount not enough required min planning amount. Stop calculation");
			return;
		}

		// Step 2: Filling gaps by references or average
		List<Store> storesA55 = DataModel.mockStoresOfRefItemA55().values().stream().flatMap(List::stream)
				.collect(Collectors.toList());
		List<Store> storesA77 = DataModel.mockStoresOfRefItemA77().values().stream().flatMap(List::stream)
				.collect(Collectors.toList());

		fillingGapsPotential(storesA55, DataModel.mockRefStores());
		System.out.println("Stores A55 after filling gaps");
		storesA55.forEach(System.out::println);

		fillingGapsPotential(storesA77, DataModel.mockRefStores());
		System.out.println("Stores A77 after filling gaps");
		storesA55.forEach(System.out::println);

		// Step 3: Calculate Store Demand of current Item(Item A1)
		Map<Store, BigDecimal> demand = calculateStoreDemandOfA1(storesA55, storesA77);
		demand.forEach((s, demandNew) -> {
			System.out.printf("Store %s, Demand New: %s\n", s.getDesc(), demandNew);
		});

		// Step 4: Sum up Demand to WH Level
		Map<Integer, BigDecimal> demandWH = sumDemandByWH(demand);
		demandWH.forEach((whId, totalDemand) -> {
			System.out.printf("WH: %d, Total Demand: %s\n", whId, totalDemand);
		});

		// Step 5 Calculate Shares
		Map<Integer, BigDecimal> whShare = calWHShare(demandWH);
		whShare.forEach((wh, share) -> {
			System.out.printf("WH: %d, WH share: %s\n", wh, share);
		});
		// Step 6 Allocate by Shares
		Map<Integer, BigDecimal> allocateShare = calAllocateByShare(whShare, planningAmount);
		allocateShare.forEach((wh, alloc) -> {
			System.out.printf("WH: %d, Alloc: %s\n", wh, alloc);
		});

		// Step 7 Apply Minimum
		Integer minPerStore = DataModel.minPerStore;
		Integer amountOfStore = DataModel.mockItemStoreIds().size();
		Map<Integer, BigDecimal> min = applyMin(allocateShare, minPerStore, amountOfStore);
		min.forEach((wh, alloc) -> {
			System.out.printf("Apply Min => WH: %d, Alloc: %s\n", wh, alloc);
		});
		// Step 8 Recalculate Share

		// Step 9 Reallocate

		// Step 10 Round Up

		// Step 11 Fix Rounding

	}

	private static Map<Integer, BigDecimal> applyMin(Map<Integer, BigDecimal> allocation, int minPerStore,
			int amountOfStore) {
		BigDecimal minTotal = BigDecimal.valueOf(minPerStore * amountOfStore);

		Map<Integer, BigDecimal> check = new LinkedHashMap<>();

		for (Entry<Integer, BigDecimal> entry : check.entrySet()) {
			BigDecimal alloc = entry.getValue();
			if (alloc.compareTo(minTotal) < 0) {
				alloc = minTotal;
			}
			check.put(entry.getKey(), alloc);
		}
		return check;
	}

	private static Map<Integer, BigDecimal> calAllocateByShare(Map<Integer, BigDecimal> share, Integer planningAmount) {
		Map<Integer, BigDecimal> allocated = new LinkedHashMap<>();

		for (Entry<Integer, BigDecimal> entry : share.entrySet()) {
			BigDecimal alloc = entry.getValue().multiply(new BigDecimal(planningAmount)).divide(new BigDecimal("100"),
					10, RoundingMode.HALF_UP);
			allocated.put(entry.getKey(), alloc);

		}
		return allocated;
	}

	private static Map<Integer, BigDecimal> calWHShare(Map<Integer, BigDecimal> demandWH) {
		BigDecimal totalDemand = demandWH.values().stream().reduce(BigDecimal.ZERO, BigDecimal::add);

		Map<Integer, BigDecimal> shareWH = new LinkedHashMap<>();
		for (Entry<Integer, BigDecimal> entry : demandWH.entrySet()) {
			BigDecimal share = totalDemand.multiply(new BigDecimal("100")).divide(totalDemand, 10,
					RoundingMode.HALF_UP);
			shareWH.put(entry.getKey(), share);
		}
		return shareWH;
	}

	private static Map<Integer, BigDecimal> sumDemandByWH(Map<Store, BigDecimal> demandA1) {
		Map<Integer, BigDecimal> demandByWH = new LinkedHashMap<>();
		demandA1.forEach((s, demand) -> {
			int whId = s.getWhId();
			demandByWH.merge(whId, demand, BigDecimal::add);
		});

		return demandByWH;
	}

	private static Map<Store, BigDecimal> calculateStoreDemandOfA1(List<Store> storesA55, List<Store> storesA77) {
		var refWeights = DataModel.mockRefWeights();
		var trendFactors = DataModel.mockStoreTrendFactors();

		Map<Integer, Store> mapA55 = storesA55.stream().collect(Collectors.toMap(s -> s.getId(), s -> s));
		Map<Integer, Store> mapA77 = storesA77.stream().collect(Collectors.toMap(s -> s.getId(), s -> s));

		Set<Integer> allStoreId = new HashSet<>();
		allStoreId.addAll(mapA55.keySet());
		allStoreId.addAll(mapA77.keySet());

		Map<Store, BigDecimal> res = new LinkedHashMap<>();

		for (int id : allStoreId) {
			BigDecimal potentialA55 = mapA55.getOrDefault(id, new Store(id, "", BigDecimal.ZERO, 0)).getPotential();
			BigDecimal potentialA77 = mapA77.getOrDefault(id, new Store(id, "", BigDecimal.ZERO, 0)).getPotential();

			BigDecimal trend = trendFactors.getOrDefault(id, BigDecimal.ONE);

			BigDecimal num = potentialA55.multiply(refWeights.getOrDefault(55, BigDecimal.ZERO))
					.add(potentialA77.multiply(refWeights.getOrDefault(77, BigDecimal.ZERO)));

			BigDecimal den = refWeights.getOrDefault(55, BigDecimal.ZERO)
					.add(refWeights.getOrDefault(77, BigDecimal.ZERO));

			if (BigDecimal.ZERO == new BigDecimal("0")) {
				System.out.println("Error");
			}
			BigDecimal demand = num.multiply(trend).divide(den);

			Store storeId = mapA55.containsKey(id) ? mapA55.get(id) : mapA77.get(id);
			res.put(storeId, demand);
		}
		return res;
	}

	private static void fillingGapsPotential(List<Store> stores, Map<Integer, Integer> refStores) {
		// get map storeid
		Map<Integer, BigDecimal> ownPotential = stores.stream()
				.filter(s -> s.getPotential() != null && s.getPotential().compareTo(BigDecimal.ZERO) > 0)
				.collect(Collectors.toMap(s -> s.getId(), s -> s.getPotential()));
		// avg
		BigDecimal avgPotential = ownPotential.values().stream().reduce(BigDecimal.ZERO, BigDecimal::add)
				.divide(BigDecimal.valueOf(ownPotential.size()), 10, RoundingMode.HALF_UP);
		stores.forEach(s -> {
			if (s.getPotential() == null || s.getPotential().compareTo(BigDecimal.ZERO) == 0) {
				Integer refStoreId = refStores.get(s.getId());
				if (refStoreId != null) {
					BigDecimal refPotential = ownPotential.get(refStoreId);
					if (refPotential != null && refPotential.compareTo(BigDecimal.ZERO) > 0) {
						s.setPotential(refPotential.setScale(1, RoundingMode.HALF_UP));
					} else {
						s.setPotential(avgPotential.setScale(1, RoundingMode.HALF_UP));
					}
				} else {
					s.setPotential(avgPotential.setScale(1, RoundingMode.HALF_UP));
				}
			}
		});

	}
}