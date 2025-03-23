package collection.list;

import static utils.CollectionUtils.generate;
import static utils.NumberUtils.bd;

import java.util.List;

import bean.Item;
import model.DataModel;

public class Ex03CustomTypeOperations {

	public static void main(String[] args) {
		
		//add, get, set, remove
		List<Item> items = DataModel.mockItems();
		generate("Danh sách mặt hàng", items);
		
		// remove: List, ArrayList
		//list.remove(itemToBeDeleted);
		//Cơ chế: Duyệt từng phần tử trong danh sách (list)
		//		: Kiểm tra nếu có phần tử nào 'equals' với phần từ cần xóa 'itemToBeDeleted'
		//		: Xóa phần tử đó khỏi danh sách, dùng hàm xử lí
		// Mặc định: sử dụng hàm equals của class Object --> this == o --> so sánh địa chỉ
		
		// contains: List, ArrayList
		//Cơ chế: Duyệt từng phần tử trong danh sách (list)
		//		: Kiểm tra nếu có phần tử nào 'equals' với phần từ cần kiểm tra 'itemToBeDeleted'
		//		: Xóa phần tử đó khỏi danh sách, dùng hàm xử lí
		//		: Nếu có trả về true, hoặc false
		// Mặc định: sử dụng hàm euqals của class Object --> this == o --> so sánh địa chỉ
		Item itemToBeDeleted = new Item(4, "Item A4", bd("11"), 102);
		
		items.remove(itemToBeDeleted);
		
		generate("Danh sách mặt hàng sau khi xóa", items);
		
		System.out.println("Kiểm tra tồn tại: "+ items.contains(itemToBeDeleted));
		
		// Tạo ra 1 class 100% override lại hàm equals
		
		//Xóa các mặt hàng đang bán tại cửa hàng có storeId = 102
		
		items.removeIf(item -> {
			return item.getStoreId() == 102;
		});
		
		generate("Danh sách mặt hàng sau khi xóa (storeId = 102)", items);
	
		items.sort((i1, i2) -> {
			return i1.getStoreId().compareTo(i2.getStoreId());
		});
		generate("Danh sách mặt hàng sau khi sort theo StoreId", items);
	
	}
	
	
}
