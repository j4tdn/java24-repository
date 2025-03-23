package collection.map;

import static utils.CollectionUtils.generate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Item;

public class Ex02MapPrincipleOfPutting {

	public static void main(String[] args) {
		/*
		 Bài toán liên quan đến 
		 K: item
		 V: Danh sách mã cửa hàng bán mặt hàng đó
		 
		 Quy ước: 2 items sẽ trùng nhau nếu trùng itemId
		 == Trùng trong K của Map == 
		 
		 + Có hashcode trùng vs hashcode của nào trong map chưa
		 + có equals với key nào trong map chưa => báo trùng
		 
		 
		 
		 */
		Map<Item, List<Integer>> itemStoreMap = new HashMap<Item, List<Integer>>();
		itemStoreMap.put(new Item(1, "A1"), List.of(101,201));
		itemStoreMap.put(new Item(2, "A2"), List.of(102,202));
		itemStoreMap.put(new Item(3, "A3"), List.of(103,203));
		
		//them moi
		itemStoreMap.put(new Item(2, "A2"), List.of(501,205));
		
		System.out.println("itemStoreMap size: "+itemStoreMap.size());
		generate("itemStoreMap values: ", itemStoreMap);
	}
}
