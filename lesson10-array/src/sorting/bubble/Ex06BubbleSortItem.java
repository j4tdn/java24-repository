package sorting.bubble;

import static utils.ArrayUtils.*;

import bean.Item;
import functional.sorting.ItemCompFunc;
import model.DataModel;

public class Ex06BubbleSortItem {
	
	public static void main(String[] args) {
		/*
		 
		 Item: id, name, salesPrice, storeId, expiredDate
		 
		 */
		Item[] items = DataModel.mockItems();
		generate("Danh sach mat hang: ", items);
		
//		bubbleSort(items, (a, b) -> {
//			return Double.compare(a.getSalesPrices(), b.getSalesPrices());
//		});
//		
//		generate("1. Sắp xếp theo GiaBan(Tăng dần): ", items);
//		
//		System.out.println("============================================");
//		bubbleSort(items, (a, b) -> {
//			return b.getName().compareTo(a.getName());
//		});
//		
//		generate("2. Sắp xếp theo Ten(Giảm dần) : ", items);
//		
//		System.out.println("============================================");
//		bubbleSort(items, (a, b) -> {
//			return a.getExpiredDate().compareTo(b.getExpiredDate());
//		});
//		
//		generate("3. Sắp xếp theo NgayHethan(Tăng dần) : ", items);
//		
//		System.out.println("============================================");
//		bubbleSort(items, (a, b) -> {
//			Integer id1 = a.getStoreId();
//			Integer id2 = b.getStoreId();
//			int idDiff = id1.compareTo(id2);
//			if (idDiff == 0)
//				return a.getId().compareTo(b.getId());
//			
//			return idDiff; 
//		});
//		
//		generate("4. Sắp xếp theo MaCuaHang(Tăng dần), MaMH(Tăng dần) : ", items);
		
		System.out.println("============================================");
		bubbleSort(items, (a, b) -> {
			Integer id1 = a.getStoreId();
			Integer id2 = b.getStoreId();
			int idDiff = id2.compareTo(id1);
			if (idDiff == 0)
				return a.getExpiredDate().compareTo(b.getExpiredDate());
			
			return idDiff; 
		});
		
		generate("5. Sắp xếp theo MaCuaHang(giảm dần), NgayHetHan(Tăng dần) : ", items);
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
