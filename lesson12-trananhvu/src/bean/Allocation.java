package bean;

import java.math.BigDecimal;

public class Allocation {
    private Store store;
    private BigDecimal allocationKey;
    private BigDecimal amountAllocated;
    private BigDecimal demand;
    private BigDecimal diffBetweenAllocatedAndDemand;

    public Allocation(Store store, BigDecimal allocationKey, BigDecimal amountAllocated, BigDecimal demand, BigDecimal diffBetweenAllocatedAndDemand, BigDecimal totalAllocated) {
        this.store = store;
        this.allocationKey = allocationKey;
        this.amountAllocated = amountAllocated;
        this.demand = demand;
        this.diffBetweenAllocatedAndDemand = diffBetweenAllocatedAndDemand;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public BigDecimal getAllocationKey() {
        return allocationKey;
    }

    public void setAllocationKey(BigDecimal allocationKey) {
        this.allocationKey = allocationKey;
    }

    public BigDecimal getAmountAllocated() {
        return amountAllocated;
    }

    public void setAmountAllocated(BigDecimal amountAllocated) {
        this.amountAllocated = amountAllocated;
    }

    public BigDecimal getDemand() {
        return demand;
    }

    public void setDemand(BigDecimal demand) {
        this.demand = demand;
    }

    public BigDecimal getDiffBetweenAllocatedAndDemand() {
        return diffBetweenAllocatedAndDemand;
    }

    public void setDiffBetweenAllocatedAndDemand(BigDecimal diffBetweenAllocatedAndDemand) {
        this.diffBetweenAllocatedAndDemand = diffBetweenAllocatedAndDemand;
    }

    @Override
    public String toString() {
        return "Allocation{" +
                "store=" + store +
                ", allocationKey=" + allocationKey +
                ", amountAllocated=" + amountAllocated +
                ", demand=" + demand +
                ", diffBetweenAllocatedAndDemand=" + diffBetweenAllocatedAndDemand +
                '}';
    }
}
