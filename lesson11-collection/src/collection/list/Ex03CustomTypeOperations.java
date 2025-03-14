package collection.list;

import java.util.List;

import bean.Item;
import model.DataModel;
import static utils.NumberUtils.*;
import static utils.CollectionUtils.*;

public class Ex03CustomTypeOperations {
	
	public static void main(String[] args) {
		List<Item> items = DataModel.mockItems();
		generate("1. Danh sách mặt hàng", items);
		Item itemToBeDeleted = new Item(4, "Item A4", bd("222"), 102);
		
		System.out.println("Kiểm tra tồn tại: " + items.contains(itemToBeDeleted));
		
		items.remove(itemToBeDeleted);
		
		generate("2. Danh sách mặt hàng(sau khi xoá)", items);
		
		System.out.println("Kiểm tra tồn tại: " + items.contains(itemToBeDeleted));
		
		
		items.removeIf(item -> {
			return item.getStoriId() == 102;
		});
		generate("3. Danh sách mặt hàng(sau khi xoá theo storeId = 103", items);
		

	}
	
}
