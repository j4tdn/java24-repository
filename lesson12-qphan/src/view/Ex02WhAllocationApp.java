package view;

import java.util.List;
import java.util.Map;

import bean.Store;
import model.DataModel;

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
	    }

	    /**
	     * Do Allocation.
	     * Key: storeId with Long type
	     * Value: storeAllocatedAmount after calculation with 4 steps
	     * @return map of storeId, storeAllocatedAmount
	     */
	    private static Map<Long, Integer> doAllocation(List<Store> data, Integer whAllocationAmount) {
	        // calculation

	        return null;
	    }
	
}
