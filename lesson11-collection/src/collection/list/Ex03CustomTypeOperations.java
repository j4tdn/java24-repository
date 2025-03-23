package collection.list;

import java.util.Iterator;
import java.util.List;

import bean.Item;
import model.DataModel;

import static utils.NumberUtils.*;
import static utils.CollectionUtils.*;

public class Ex03CustomTypeOperations {
	/*
    public boolean remove(Object o) {
    final Object[] es = elementData;
    final int size = this.size;
    int i = 0;
    found: {
        if (o == null) {
            for (; i < size; i++)
                if (es[i] == null)
                    break found;
        } else {
            for (; i < size; i++)
                if (o.equals(es[i]))
                    break found;
        }
        return false;
    }
    fastRemove(es, i);
    return true;
}


 */
	
	public static void main(String[] args) {
		
		// add, get, set, remove
		List<Item> items = DataModel.mocItems();
		generate("1. Danh sách mặt hàng", items);
		
		
		// remove: List, ArrayList
		// list.remove(itemToBeDeleted);
		// Cơ chế: Duyệt từng phần tử trong danh sách(list)
		// : Kiểm tra nếu có phần tử nào 'equals' với phần tử cần xóa 'itemToBeDeleted'
		// : XÓa phần tử đó khỏi danh sách và dừng hàm xử lý
		// Mặc định: sử dụng hàm equals của class Obkect --> this == o --> so sánh địa
		// chỉ

		// contains: List, ArrayList
		// list.contains(item);
		// Cơ chế: Duyệt từng phần tử trong danh sách(list)
		// : Kiểm tra nếu có phần tử nào 'equals' với phần tử đang kiểm tra 'item'
		// : Nếu có trả về true, ngược lại flas
		// Mặc định: sử dụng hàm equals của class Obkect --> this == o --> so sánh địa
		// chỉ

		// user entered item need to be deleted
		Item itemToBeDeleted = new Item(4, "Item A4",bd("111"), 102);
		
		System.out.println("Kiểm tra tồn tại: " + items.contains(itemToBeDeleted));
		
		items.remove(itemToBeDeleted);
		

		generate("2. Danh sách mặt hàng sau khi xóa", items);
		
		// Tạo ra 1 class 100% override lại hàm equals 
		
		// Xóa các mặt hàng đang bán tại cửa hàng có storeId = 103
		
		
		items.removeIf(item -> item.getStoreId() == 102 );
		
		
		items.sort((i1, i2) -> i1.getStoreId().compareTo(i2.getStoreId()));
 		
		generate("3. Danh sách mặt hàng sau khi xóa", items);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
