package view;

import bean.Item;
import bean.Store;
import model.DataModel;
import utils.NumberUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WhAllocationDemo {
    public static void main(String[] args) {
        final Integer minPerStore = DataModel.minPerStore;
        final Integer planningAmount = DataModel.planningAmount;
        final Integer requiredMinPlanningAmount = DataModel.requiredMinPlanningAmount;

        if (planningAmount <= requiredMinPlanningAmount) {
            return;
        }

        final List<Map<Item, List<Store>>> refItemStores = new ArrayList<>();
        refItemStores.add(DataModel.mockStoresOfRefItemA55());
        refItemStores.add(DataModel.mockStoresOfRefItemA77());

        final Map<Integer, Map<Integer, BigDecimal>> refItem = new HashMap<>();
        final List<Integer> refItemIds = new ArrayList<>();

        refItemStores.forEach(stores -> {
            stores.forEach((item, storeList) -> {
                final Map<Integer, BigDecimal> storePotential = storeList.stream()
                        .collect(Collectors.toMap(Store::getId, Store::getPotential));
                refItem.put(item.getId(), storePotential);
                refItemIds.add(item.getId());
            });
        });

        final var mockRefStores = DataModel.mockRefStores();


        final var refWeights = DataModel.mockRefWeights();
        final var storeTrends = DataModel.mockStoreTrendFactors();


        final var res = doAllocation(refItem, mockRefStores, refWeights, storeTrends, refItemIds, refItemStores);


    }

    public static Map<Integer, Map<BigDecimal, Integer>> doAllocation(Map<Integer, Map<Integer, BigDecimal>> refItem, Map<Integer, Integer> refStores,
                                                                      Map<Integer, BigDecimal> refWeights, Map<Integer, BigDecimal> storeTrends,
                                                                      List<Integer> refItemIds, List<Map<Item, List<Store>>> refItemStores) {
        //step1: check for planning amount


        //step 2: filling gaps by references or average
        final var step2 = fillingGapsByReferencesOrAverage(refItem, refStores);
        System.out.println(step2);

        //step 3: calculate store demand of current item
        final var step3 = calculateStoreDemandOfCurrentItem(step2, refWeights, storeTrends, refItemIds);
        System.out.println("Store Demand: " + step3);

        final var step4 = sumOfDemandToWHLevel(refItemStores, step3);

        return null;
    }

    public static Map<Integer, BigDecimal> sumOfDemandToWHLevel(List<Map<Item, List<Store>>> refItemStores, Map<Integer, BigDecimal> storeDemand) {
        final List<Integer> whIds = refItemStores.stream()
                .flatMap(map -> map.values().stream())
                .flatMap(List::stream)
                .map(Store::getWhId)
                .distinct()
                .toList();
        return null;
    }

    public static Map<Integer, BigDecimal> calculateStoreDemandOfCurrentItem(Map<Integer, Map<Integer, BigDecimal>> refItem, Map<Integer,
                                                                                     BigDecimal> refWeights, Map<Integer, BigDecimal> storeTrends,
                                                                             List<Integer> refItemIds) {
        final List<Integer> stores = DataModel.mockItemStoreIds();

        final Map<Integer, BigDecimal> storeDemand = new HashMap<>();

        stores.forEach(storeId -> {
            BigDecimal totalDemand = BigDecimal.ZERO;
            BigDecimal sumOfWeights = BigDecimal.ZERO;

            for (Integer refItemId : refItemIds) {
                BigDecimal weight = refWeights.get(refItemId);

                Map<Integer, BigDecimal> storePotentials = refItem.get(refItemId);
                if (storePotentials != null && storePotentials.containsKey(storeId)) {
                    BigDecimal potential = storePotentials.get(storeId);
                    if (potential != null && potential.compareTo(BigDecimal.ZERO) > 0) {
                        totalDemand = totalDemand.add(potential.multiply(weight));
                        sumOfWeights = sumOfWeights.add(weight);
                    }
                }
            }

            BigDecimal storeTrend = storeTrends.getOrDefault(storeId, BigDecimal.ONE);
            BigDecimal demand = totalDemand.divide(sumOfWeights).multiply(storeTrend)
                    .setScale(1, RoundingMode.HALF_UP);
            storeDemand.put(storeId, demand);
        });

        return storeDemand;
    }

    public static Map<Integer, Map<Integer, BigDecimal>> fillingGapsByReferencesOrAverage(Map<Integer, Map<Integer, BigDecimal>> refItem, Map<Integer, Integer> refStores) {
        final var ownNonNullRefStores = refItem.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> entry.getValue().entrySet().stream()
                                .filter(potential -> potential.getValue() != null && potential.getValue().compareTo(BigDecimal.ZERO) > 0)
                                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue))
                ));

        final Map<Integer, BigDecimal> avgOwnStorePotential = ownNonNullRefStores.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> entry.getValue().values().stream()
                                .reduce(BigDecimal.ZERO, BigDecimal::add)
                                .divide(NumberUtils.bd(entry.getValue().size()), 1, RoundingMode.HALF_UP)
                ));


        return refItem.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> entry.getValue().entrySet().stream()
                                .collect(Collectors.toMap(Map.Entry::getKey, potential -> {
                                    BigDecimal value = potential.getValue();
                                    if (value == null || value.compareTo(BigDecimal.ZERO) <= 0) {
                                        if (refStores.get(potential.getKey()) != null) {
                                            Integer refStoreId = refStores.get(potential.getKey());
                                            if (ownNonNullRefStores.get(entry.getKey()).get(refStoreId) != null) {
                                                return ownNonNullRefStores.get(entry.getKey()).get(refStoreId).setScale(1, RoundingMode.HALF_UP);
                                            } else {
                                                return avgOwnStorePotential.get(entry.getKey()).setScale(1, RoundingMode.HALF_UP);
                                            }
                                        } else {
                                            return avgOwnStorePotential.get(entry.getKey()).setScale(1, RoundingMode.HALF_UP);
                                        }
                                    }
                                    return potential.getValue().setScale(1, RoundingMode.HALF_UP);
                                }))
                ));
    }

}