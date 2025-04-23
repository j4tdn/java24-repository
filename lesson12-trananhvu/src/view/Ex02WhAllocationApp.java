package view;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.stream.Collectors;

import Utils.WhAllocationAppUtils;
import Utils.WhAllocationAppUtils.*;
import bean.Store;
import bean.Allocation;
import model.DataModel;

import static Utils.WhAllocationAppUtils.*;

public class Ex02WhAllocationApp {

    public static void main(String[] args) {

        // B1
        final Integer whAllocationAmount = 300;

        // B2
        final List<Store> stores = DataModel.getStores();

        // B3
        Map<Long, Integer> storeAllocatedValues = doAllocation(stores, whAllocationAmount);

        // B4
        // In kết quả
        for (Map.Entry<Long, Integer> entry : storeAllocatedValues.entrySet()) {
            Long storeId = entry.getKey();
            Integer allocatedAmount = entry.getValue();

            System.out.println("Store ID: " + storeId + ", Allocated Amount: " + allocatedAmount);
        }
    }

    /**
     * Do Allocation.
     * Key: storeId with Long type
     * Value: storeAllocatedAmount after calculation with 4 steps
     *
     * @return map of storeId, storeAllocatedAmount
     */
    private static Map<Long, Integer> doAllocation(List<Store> data, Integer whAllocationAmount) {


        var step1 = fillingInMissingExpectedSales(data);

        var step2 = calculationOfAllocationKey(step1);

        BigDecimal sumOfStockPreviousDay = sumOfStockPreviousDay(data);
        var step3 = calculationOfAmountAllocated(step2, whAllocationAmount, sumOfStockPreviousDay);

        var step4 = fixRoundingIssues(step3);
        int sumOfAllocation = sumOfAllocation(step4);

        while (sumOfAllocation != whAllocationAmount) {
            if (sumOfAllocation > whAllocationAmount) {
                step4 = subtractAndAddOneAllocation(step4, WhAllocationAppUtils.cp1, -1);
            } else {
                step4 = subtractAndAddOneAllocation(step4, WhAllocationAppUtils.cp2, 1);
            }

            sumOfAllocation = sumOfAllocation(step4);
        }

        return step4.stream()
                .collect(Collectors.toMap(
                        allocation -> allocation.getStore().getStoreId(),
                        allocation -> allocation.getAmountAllocated().intValue(),
                        (a, b) -> a,
                        LinkedHashMap::new
                ));
    }

    private static List<Store> fillingInMissingExpectedSales(List<Store> data) {
        List<Store> copyOfData = DataModel.getStores();
        BigDecimal average = calculateAverage(data);


        return data.stream().filter(Store::getSelected)
                .peek(store -> {
                    if (store.getExpectedSales() == null) {
                        BigDecimal filled = null;
                        if (store.getReferenceStoreId() != null) {
                            Store referenceStore = findStoreById(copyOfData, store.getReferenceStoreId());
                            if (referenceStore != null && referenceStore.getExpectedSales() != null) {
                                filled = referenceStore.getExpectedSales();
                            }
                        }

                        if (filled == null) {
                            filled = average;
                        }

                        store.setExpectedSales(filled);
                    }
                }).toList();
    }

    private static List<Allocation> calculationOfAllocationKey(List<Store> data) {
        List<Allocation> result = new ArrayList<>();
        BigDecimal sum = sumOfExpectedSales(data);

        data.forEach(store -> {
            BigDecimal allocationKey = store.getExpectedSales()
                    .divide(sum, 10, RoundingMode.HALF_UP);

            var allocation = new Allocation(store, allocationKey, null, null, null, null);
            result.add(allocation);
        });

        return result;
    }

    private static List<Allocation> calculationOfAmountAllocated(List<Allocation> data, Integer whAllocationAmount, BigDecimal sumOfStockPreviousDay) {
        data.forEach(allocation -> {
            BigDecimal allocationKey = allocation.getAllocationKey();
            Store store = allocation.getStore();

            BigDecimal amountAllocated = allocationKey
                    .multiply(BigDecimal.valueOf(whAllocationAmount).add(sumOfStockPreviousDay))
                    .subtract(store.getStockPreviousDay())
                    .setScale(0, RoundingMode.HALF_UP);

            allocation.setAmountAllocated(amountAllocated);
        });

        return data;
    }

    private static List<Allocation> fixRoundingIssues(List<Allocation> data) {
        data.forEach(allocation -> {
            Store store = allocation.getStore();
            BigDecimal demandStore = store.getExpectedSales()
                    .subtract(store.getStockPreviousDay())
                    .setScale(0, RoundingMode.HALF_UP);

            if (demandStore.compareTo(BigDecimal.ZERO) > 0) {
                allocation.setDemand(demandStore);
            } else {
                allocation.setDemand(BigDecimal.ZERO);
            }
        });

        return data;
    }

    private static void calDiffBetweenAllocatedAndDemand(List<Allocation> data) {
        data.forEach(allocation -> {
            if (allocation.getAmountAllocated().compareTo(BigDecimal.ZERO) == 0) {
                allocation.setDiffBetweenAllocatedAndDemand(null);
            } else {
                BigDecimal diff = allocation.getAmountAllocated()
                        .subtract(allocation.getDemand())
                        .setScale(0, RoundingMode.HALF_UP);

                allocation.setDiffBetweenAllocatedAndDemand(diff);
            }
        });
    }

    private static List<Allocation> subtractAndAddOneAllocation(List<Allocation> data, Comparator<Allocation> comparator, int value) {
        calDiffBetweenAllocatedAndDemand(data);

        data.sort(comparator);

        BigDecimal oldValueOfAmountAllocated = data.getFirst().getAmountAllocated();
        data.getFirst().setAmountAllocated(oldValueOfAmountAllocated.add(BigDecimal.valueOf(value)));

        return data;
    }
}
