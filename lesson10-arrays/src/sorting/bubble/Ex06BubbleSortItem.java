package sorting.bubble;

import static utils.ArrayUtils.generate;
import static utils.ArrayUtils.swap;

import bean.Item;
import functional.sorting.ItemCompFunc;
import model.DataModel;

public class Ex06BubbleSortItem {
	
	public static void main(String[] args) {
		
		/*
		 Item: id, name, salesPrice, storeId, expiredDate
		 
		 + Sắp xếp mảng mặt hàng tăng/ giảm dần theo thuộc tính ( 1/N)
		 
		 VD: Sắp xếp mảng mặt hàng tăng dần theo giá bán
		 - Duyệt 2 vòng 2 for như bth với bubble sort
		 - Khi so sánh 2 ptu liền kề -> so sánh dựa trên giá trị của thuộc tính muốn so sánh
		 							 -> hoán vị 2 mặt hàng
		 */
		
		Item[] items = DataModel.mockItems();
		generate("Danh sách mặt hàng", items);
		bubbleSort(items, (item1, item2)-> {
			return Double.compare(item1.getSalesPrice(), item2.getSalesPrice());
		});
		generate("1. Sắp xếp theo giá tăng dần -> ", items);
		
		
		
		bubbleSort(items, (i1,i2)-> {
			return i2.getName().compareTo(i1.getName());
		});
		generate("2. Sắp xếp theo tên giảm dần -> ", items);
		
		
		bubbleSort(items, (i1, i2)-> {
			return i1.getExpiredDate().compareTo(i2.getExpiredDate());
		});
		generate("3. Sắp xếp theo NgayHetHan tăng dần -> ", items);
		
		
		
		bubbleSort(items, (i1,i2)-> {
			int idDiff = i1.getStoreId().compareTo(i2.getStoreId());
			if (idDiff == 0) {
				return i1.getId().compareTo(i2.getId());
		}
			return idDiff;
		});
		generate("4. Sắp xếp theo MaCuaHang tăng dần, MaMH(tăng dần) -> ", items);
		
		
		
		bubbleSort(items, (i1,i2)-> {
			int storeDiff = i2.getStoreId().compareTo(i1.getStoreId());
			if (storeDiff == 0) {
				return i1.getExpiredDate().compareTo(i2.getExpiredDate());
		}
			return storeDiff;
		});
		generate("5. Sắp xếp theo MaCuaHang giảm dần, NgayHetHan(tăng dần) -> ", items);
		
		bubbleSort(items, (i1, i2)-> {
			int storeDiff = i2.getStoreId().compareTo(i1.getStoreId());
			if ( storeDiff !=0) { // ưu tiên trước (theo yêu cầu)--> nếu nó k trùng nhau thì 1. đổi chỗ / 2. giữ nguyên 
								// nếu như trùng thì mới tiêp tục so sánh các yếu phụ, nếu khác nhau sẽ lướt tiếp, trùng thì mơi so sánh phần con 
				return storeDiff;
			}
			int expiredDateDiff = i1.getExpiredDate().compareTo(i2.getExpiredDate());
			if (expiredDateDiff !=0) {
				return expiredDateDiff;
			}
			return i2.getId().compareTo(i1.getId());
		});
		generate("6. Sắp xếp theo MaCuaHang giảm dần, NgayHetHan(tăng dần), MaMH(giảm dần) -> ", items);
	}
	private static void bubbleSort(Item[] items, ItemCompFunc icf) {
		for (int i =0 ; i < items.length; i++) {
			for (int j = 0; j < items.length -i -1; j++) {
				if ( icf.compare(items[j],items[j+1]) > 0) {
					swap(items, j, j+1);
				}
			}
		}
	}
	
		

}
