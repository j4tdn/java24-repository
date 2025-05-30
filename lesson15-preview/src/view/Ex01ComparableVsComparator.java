package view;

import java.util.Arrays;
import java.util.Comparator;

import bean.Item;
import model.DataModel;
import utils.ArrayUtils;

public class Ex01ComparableVsComparator {
	
	public static void main(String[] args) {
		
		var items = DataModel.mockItems();
		
		// Từng object phải là con của Comparable<?>
		// Chỉ sort theo 1 chức năng duy nhất
		// Arrays.sort(items);
		
		
		ArrayUtils.generate("1. Dữ liệu ban đầu", items);
		
		Arrays.sort(items, (i1, i2) -> i1.getStoreId().compareTo(i2.getStoreId()));
		
		ArrayUtils.generate("2. Sắp xếp tăng dần theo storeId", items);
		
		Arrays.sort(items, (i1, i2) -> i2.getStoreId().compareTo(i1.getStoreId()));
		
		ArrayUtils.generate("3. Sắp xếp giảm dần theo storeId", items);
		
	}
	
}
