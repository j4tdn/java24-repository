package collection.list;

import java.util.List;

import bean.Item;
import model.DataModel;

import static utils.NumberUtils.*;
import static utils.CollectionUtils.*;

public class Ex03CustomTypeOperations {
	
	public static void main(String[] args) {
		
		// add, get, set, remove
		List<Item> items = DataModel.mockItems();
		generate("1. Danh sách mặt hàng", items);
		
		// remove: List, ArrayList
		// list.remove(itemToBeDeleted);
		
		// Cơ chế: Duyệt từng phần tử trong danh sách(list)
		//       : Kiểm tra nếu có phần tử nào 'equals' với phần tử cần xóa 'itemToBeDeleted'
		//       : Xóa phần tử đó khỏi danh sách, dừng hàm xử lý  
		// Mặc định: sử dụng hàm equals của class Object --> this == o --> so sánh địa chỉ
		
		// contains: List, ArrayList
		// list.contains(item)
		// Cơ chế: Duyệt từng phần tử trong danh sách(list)
		//       : Kiểm tra nếu có phần tử nào 'equals' với phần tử đang kiểm tra 'item'
		//       : Nếu có trả về true, ngược lại false
		// Mặc định: sử dụng hàm equals của class Object --> this == o --> so sánh địa chỉ
		
		// user entered item need to be deleted
		Item itemToBeDeleted = new Item(4, "Item A4", bd("111"), 102);
		
		System.out.println("Kiểm tra tồn tại: " + items.contains(itemToBeDeleted));
		
		items.remove(itemToBeDeleted);
		
		generate("2. Danh sách mặt hàng(sau khi xóa)", items);
		
		System.out.println("Kiểm tra tồn tại: " + items.contains(itemToBeDeleted));
		
		// Tạo ra 1 class 100% override lại hàm equals
		
		// Xóa các mặt hàng đang bán tại cửa hàng có storeId = 102
		
		items.removeIf(item -> {
			return item.getStoreId() == 102;
		});
		
		items.sort((i1, i2) -> {
			return i1.getStoreId().compareTo(i2.getStoreId());
		});
		
		generate("3. Danh sách mặt hàng(sau khi xóa theo storeId=103)", items);
		
	}
	
}