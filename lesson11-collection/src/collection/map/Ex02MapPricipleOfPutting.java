package collection.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Item;

import static utils.CollectionUtils.*;

public class Ex02MapPricipleOfPutting {
	
	public static void main(String[] args) {
		/*
		 Bài toán liên quan đến
		 K: Item
		 V: Danh sách mã cửa hàng bán mặt hàng đó
		 
		 Quy ước: 2 items sẽ trùng nhau nếu trùng itemId
		 == Trùng trong K của Map ==
		 
		 + Có hascode trùng với hashcode của key nào trong map chưa
		 + Có equals với key nào trong map chưa
		 
		 */
		
		Map<Item, List<Integer>> itemStoreMap = new HashMap<>();
		itemStoreMap.put(new Item(1, "Item A1"), List.of(101, 201));
		itemStoreMap.put(new Item(2, "Item A2"), List.of(102, 202));
		itemStoreMap.put(new Item(3, "Item A3"), List.of(103, 203));
		
		// thêm mới
		itemStoreMap.put(new Item(2, "Item A2"), List.of(501, 502));
		
		System.out.println("itemStoreMap size = " + itemStoreMap.size());
		generate("itemStoreMap values", itemStoreMap);
	}
	
}
