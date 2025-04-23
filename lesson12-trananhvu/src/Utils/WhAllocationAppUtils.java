package Utils;

import bean.Allocation;
import bean.Store;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Comparator;
import java.util.List;

public class WhAllocationAppUtils {
    private WhAllocationAppUtils() {}

    public static Comparator<Allocation> cp1 = (o1, o2) -> {
        if (o1.getDiffBetweenAllocatedAndDemand() == null && o2.getDiffBetweenAllocatedAndDemand() == null) {
            return 0;
        } else if (o1.getDiffBetweenAllocatedAndDemand() == null) {
            return 1;
        } else if (o2.getDiffBetweenAllocatedAndDemand() == null) {
            return -1;
        }

        int diff = o2.getDiffBetweenAllocatedAndDemand().compareTo(o1.getDiffBetweenAllocatedAndDemand());
        if (diff != 0) {
            return diff;
        }

        int demandComparison = o1.getDemand().compareTo(o2.getDemand());
        if (demandComparison != 0) {
            return demandComparison;
        }

        int expectedSalesComparison = o1.getStore().getExpectedSales().compareTo(o2.getStore().getExpectedSales());
        if (expectedSalesComparison != 0) {
            return expectedSalesComparison;
        }

        return o1.getStore().getStoreId().compareTo(o2.getStore().getStoreId());
    };

    public static Comparator<Allocation> cp2 = (o2, o1) -> {
        if (o1.getDiffBetweenAllocatedAndDemand() == null && o2.getDiffBetweenAllocatedAndDemand() == null) {
            return 0;
        } else if (o1.getDiffBetweenAllocatedAndDemand() == null) {
            return 1;
        } else if (o2.getDiffBetweenAllocatedAndDemand() == null) {
            return -1;
        }

        int diff = o2.getDiffBetweenAllocatedAndDemand().compareTo(o1.getDiffBetweenAllocatedAndDemand());
        if (diff != 0) {
            return diff;
        }

        int demandComparison = o1.getDemand().compareTo(o2.getDemand());
        if (demandComparison != 0) {
            return demandComparison;
        }

        int expectedSalesComparison = o1.getStore().getExpectedSales().compareTo(o2.getStore().getExpectedSales());
        if (expectedSalesComparison != 0) {
            return expectedSalesComparison;
        }

        return o1.getStore().getStoreId().compareTo(o2.getStore().getStoreId());
    };

    public static Integer sumOfAllocation(List<Allocation> data) {
        return data.stream()
                .map(Allocation::getAmountAllocated)
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .intValue();
    }

    public static Store findStoreById(List<Store> data, Long referenceStoreId) {
        return data.stream()
                .filter(store -> store.getStoreId().equals(referenceStoreId))
                .findFirst()
                .orElse(null);
    }

    public static BigDecimal calculateAverage(List<Store> data) {
        BigDecimal average = sumOfExpectedSales(data);
        var newData = data.stream().filter(store -> store.getExpectedSales() != null && store.getSelected()).toList();
        BigDecimal size = BigDecimal.valueOf(newData.size());
        return average.divide(size, 1, RoundingMode.HALF_UP);
    }

    public static BigDecimal sumOfExpectedSales(List<Store> data) {
        return data.stream()
                .filter(store -> store.getExpectedSales() != null && store.getSelected())
                .map(Store::getExpectedSales)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public static BigDecimal sumOfStockPreviousDay(List<Store> data) {
        return data.stream()
                .filter(store -> store.getStockPreviousDay() != null && store.getSelected())
                .map(Store::getStockPreviousDay)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

}
