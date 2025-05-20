package view;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import bean.Store;
import model.DataModel;

import static utils.LogUtils.*;
import static utils.NumberUtils.*;

public class Ex02WhAllocationApp {
	
	 public static void main(String[] args) {
	    	
	        // B1 Khoi taot du lieu dau vao
	        final Integer whAllocationAmount = 300;

	        // tim cac store duoc chon de cap phat hang hoa
	        final List<Store> selectedStores = DataModel.getStores()
	        		.stream()
	        		.filter(Store::isSelected)
	        		.toList();
	        
	        if (selectedStores == null || selectedStores.isEmpty()) {
	        	System.out.println(">> There is no selected sore for allocation. Stop calculation ...");
	        	return;
	        }
	        
	        // B2 Thuc hien tinh toan
	        Map<Long, Integer> storeAllocatedValues = doAllocation(selectedStores, whAllocationAmount);
	        
	        // B3 In kết quả
	        System.out.println(storeAllocatedValues);
	    }

	    /**
	     * Do Allocation.
	     * Key: storeId with Long type
	     * Value: storeAllocatedAmount after calculation with 4 steps
	     * @return map of storeId, storeAllocatedAmount
	     */
	    private static Map<Long, Integer> doAllocation(List<Store> stores, Integer whAllocationAmount) {
	        // calculation
	    	final Map<Long, BigDecimal> interpolatedExpectedSales = fillMissingExpectedSales(stores);
	    	logging("Step 1: Filling in missing 'Expeceted sales' values", interpolatedExpectedSales);

	        return null;
	    }
	
	    private static Map<Long, BigDecimal> fillMissingExpectedSales(List<Store> stores) {
	    	final Map<Long, BigDecimal> interpolatedSales = new TreeMap<Long, BigDecimal>();
	    	
	    	final Map<Long, BigDecimal> ownNonNullExpectedSales = stores.stream()
	    		.filter(store -> store.getExpectedSales() != null)
	    		.collect(Collectors.toMap(Store::getStoreId, Store::getExpectedSales));
	    	
	    	final BigDecimal avgOwnStoreExpectedSales = ownNonNullExpectedSales.values()
	    			.stream()
	    			.reduce(BigDecimal.ZERO, BigDecimal::add)
	    			.divide(bd(ownNonNullExpectedSales.size()), 1, RoundingMode.HALF_UP);
	    	
	    	for (Store store: stores) {
	    		final Long storeId = store.getStoreId();
	    		final BigDecimal expectedSales = store.getExpectedSales();
	    		if (expectedSales != null) {
	    			interpolatedSales.put(storeId, expectedSales);
	    		}else {
	    			// UC1
	    			final Long refStoreId = store.getReferenceStoreId();
	    			if (refStoreId != null) {
	    				final BigDecimal refStoreExpectedSales = ownNonNullExpectedSales.get(refStoreId);
	    				if (refStoreExpectedSales != null) {
	    					interpolatedSales.put(refStoreId, refStoreExpectedSales);
	    				}else {
	    					// UC2B
	    					interpolatedSales.put(refStoreId, avgOwnStoreExpectedSales);
	    				}
	    			}else {
	    				//UC2A
	    				interpolatedSales.put(refStoreId, avgOwnStoreExpectedSales);
	    			}
	    		}
	    	}
	    	
	    	return interpolatedSales;
	    	
	    }
	    
}
