
package sorting.bubble;

import static utils.ArrayUtils.*;

import bean.Item;
import functional.sorting.ItemCompFunc;
import model.DataModel;

public class Ex06BubbleSortItem {
	
	public static void main(String[] args) {
		Item[] items = DataModel.mockItems();
		
		generate("0. Danh sách mặt hàng", items);
		// ==========================================
		
		bubbleSort(items, (item1, item2) -> {
			return Double.compare(item1.getSalesPrice(), item2.getSalesPrice());
		});
		
		generate("1. Sắp xếp theo GiaBan(tăng dần)", items);
		// ==========================================
		
		bubbleSort(items, (item1, item2) -> {
			return item2.getName().compareTo(item1.getName());
		});
		
		generate("2. Sắp xếp theo Ten(giảm dần)", items);
		// ==========================================
		
		bubbleSort(items, (item1, item2) -> {
			return item1.getExpiredDate().compareTo(item2.getExpiredDate());
		});
		
		generate("3. Sắp xếp theo NgayHetHan(tăng dần)", items);
		// ==========================================
		
		bubbleSort(items, (item1, item2) -> {
			int storeIdDiff = item1.getStoreId().compareTo(item2.getStoreId());

			if (storeIdDiff == 0) {
				return item1.getId().compareTo(item2.getId());
			}
			
			return storeIdDiff;
		});
		
		generate("4. Sắp xếp theo MaCuaHang(tăng dần), MaMH(tăng dần)", items);
		// ==========================================
		
		bubbleSort(items, (item1, item2) -> {
			int storeIdDiff = item2.getStoreId().compareTo(item1.getStoreId());

			if (storeIdDiff == 0) {
				return item1.getExpiredDate().compareTo(item2.getExpiredDate());
			}
			
			return storeIdDiff;
		});
		
		generate("5. Sắp xếp theo MaCuaHang(giảm dần), NgayHetHan(tăng dần)", items);
		// ==========================================
		
		bubbleSort(items, (item1, item2) -> {
			int storeIdDiff = item2.getStoreId().compareTo(item1.getStoreId());

			if (storeIdDiff != 0) {
				return storeIdDiff;
			}
			
			int expiredDateDiff = item1.getExpiredDate().compareTo(item2.getExpiredDate());
			
			if (expiredDateDiff != 0) {
				return expiredDateDiff;
			}
			
			return item2.getId().compareTo(item1.getId());
		});
		
		generate("6. Sắp xếp theo MaCuaHang(giảm dần), NgayHetHan(tăng dần), MaMH(giảm dần)", items); //
	}
	
	private static void bubbleSort(Item[] items, ItemCompFunc icf) {
		for (int i = 0; i < items.length; i++) {
			for (int j = 0; j < items.length - i - 1; j++) {
				if (icf.compare(items[j], items[j+1]) > 0) {
					swap(items, j, j + 1);
				}
			}
		}
	}
	
}
