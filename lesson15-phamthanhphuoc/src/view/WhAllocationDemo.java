package view;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Map;

import model.DataModel;
import service.warehouseAllocationService;
import service.warehouseAllocationService.AllocationResult;


public class WhAllocationDemo {
	public static final DecimalFormat df = new DecimalFormat("#.##");
	public static void main(String[] args) {
		System.out.println("=== WAREHOUSE ALLOCATION ALGORITHM ===");
		System.out.println("Planning Amount: " + DataModel.planningAmount);
		System.out.println("Required Min Planning Amount: " + DataModel.requiredMinPlanningAmount);
		System.out.println("Min Per Store: " +DataModel.minPerStore);
		System.out.println();
		
		AllocationResult result = warehouseAllocationService.calculateAllocation();
		
		if(result.isSuccess()) {
			displayResult(result);
		}else {
			System.out.println("CALCULATION FAILED: " + result.getMessage());
		}
	}
	private static void displayResult(AllocationResult result) {
		System.out.println("== CALCULATION RESULTS ==");
		System.out.println(result.getMessage());
		System.out.println();
		
		System.out.println("STORE DEMANS:");
		System.out.println("store ID\tDemand");
		System.out.println("-----------------");
		for(Map.Entry<Integer, BigDecimal>entry : result.getStoreDemands().entrySet()) {
			System.out.printf("Store %d\t%s%n", entry.getKey(),df.format(entry.getValue()));
		}
		System.out.println();
		System.out.println("WAREHOUSE DEMANDS:");
        System.out.println("WH ID\tDemand");
        System.out.println("-------------");
        for (Map.Entry<Integer, BigDecimal> entry : result.getWarehouseDemands().entrySet()) {
            System.out.printf("WH %d\t%s%n", entry.getKey(), df.format(entry.getValue()));
        }
        System.out.println();
        
        System.out.println("WAREHOUSE SHARES:");
        System.out.println("WH ID\tShare (%)");
        System.out.println("----------------");
        for (Map.Entry<Integer, BigDecimal> entry : result.getWarehouseShares().entrySet()) {
            System.out.printf("WH %d\t%s%%%n", entry.getKey(), df.format(entry.getValue()));
        }
        System.out.println();
        
        System.out.println("FINAL WAREHOUSE ALLOCATIONS:");
        System.out.println("WH ID\tAllocation");
        System.out.println("-------------------");
        BigDecimal totalAllocated = BigDecimal.ZERO;
        for (Map.Entry<Integer, BigDecimal> entry : result.getWarehouseAllocations().entrySet()) {
            System.out.printf("WH %d\t%s%n", entry.getKey(), entry.getValue().toString());
            totalAllocated = totalAllocated.add(entry.getValue());
        }
        System.out.println("-------------------");
        System.out.printf("TOTAL\t%s%n", totalAllocated.toString());
        System.out.printf("TARGET\t%d%n", DataModel.planningAmount);
        
        if (totalAllocated.intValue() == DataModel.planningAmount) {
            System.out.println(" ALLOCATION SUCCESSFUL - Total matches planning amount!");
        } else {
            System.out.println(" ALLOCATION WARNING - Total does not match planning amount!");
        }
		
	}
	

}
