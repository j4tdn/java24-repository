package view;

import java.util.List;
import java.util.Map;

import bean.Store;
import model.DataModel;

public class Ex02WhAllocationApp {
	
	 public static void main(String[] args) {
	    	
	        // B1: Khởi dữ liệu đầu vào
	        final Integer whAllocationAmount = 300;
	        final List<Store> stores = DataModel.getStores();
	        
	        // B2: Thực hiện tính toán
	        Map<Long, Integer> storeAllocatedValues = doAllocation(stores, whAllocationAmount);
	        
	        // B3: In kết quả cuối cùng
	        //   : Lưu ý: In kết quả từng bước sau khi xử lý
	    }

	    /**
	     * Do Allocation.
	     * 
	     * Key: storeId with Long type
	     * Value: storeAllocatedAmount after calculation with 4 steps
	     * @return map of storeId, storeAllocatedAmount
	     */
	    private static Map<Long, Integer> doAllocation(List<Store> data, Integer whAllocationAmount) {
	        // calculation

	        return null;
	    }
	
}
