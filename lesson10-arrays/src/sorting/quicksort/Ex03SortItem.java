package sorting.quicksort;

import java.util.Arrays;

import bean.Item;
import model.DataModel;
import utils.ArrayUtils;

public class Ex03SortItem {

	public static void main(String[] args) {
		//Arrays.sort(Object[] object)
		//Object phải là con của Comparable
		//Hạn chế: Nếu sắp sử dụng Arrays.sort(Object[] object) với Comparable thì mỗi object
		// chỉ sắp xếp theo 1 hình thức được thôi, vì chỉ override duy nhất 1 hàm compareTo
		
		
		//Arrays.sort(T[] a, Comparator <T> comparator)
		//Hỗ trợ sort theo nhiều chức năng khác nhau thông qua override comparator
		Item[] items = DataModel.mockItems();
		// Sắp xếp các mặt hàng, tăng dần theo id
		Arrays.sort(items, (i1, i2) -> {
			return i1.getId().compareTo(i2.getId());
		});
		ArrayUtils.generate("Tăng dần theo id", items);
		
		Arrays.sort(items, (i1, i2) -> {
			return Double.compare(i2.getSalesPrice(), i1.getSalesPrice());
		});
		ArrayUtils.generate("Giảm dần theo SalePrice", items);
		
		Arrays.sort(items, (i1, i2) ->{
			int storeDiff = i1.getStoreId().compareTo(i2.getStoreId());
			if (storeDiff != 0) {
				return storeDiff;
			}
			return i2.getExpiredDate().compareTo(i1.getExpiredDate());
		});
		ArrayUtils.generate("Tăng dần theo storeId, giảm dần theo ExpiredDay", items);
		
	}
}
