package view;

import java.util.Arrays;

import bean.Item;
import functional.ObjectMapper;

public class Ex06Mapping {
	/*
	 Bài toán: cho ds các mặt hàng
	 Viết ctrinh
	 	+ Liệt kê id của tất cả các mặt hàng 
	 	+ Liệt kê name của tất cả các mặt hàng 
	 */
	
	// Arrays ... 

	public static void main(String[] args) {
		Item[] items = mockItems();
		
		System.out.println("Danh sách mã mặt hàng: "+Arrays.toString(findIds(items)));
		System.out.println("Danh sách tên mặt hàng: "+Arrays.toString(findNames(items)));
		
		
		System.out.println("Danh sách mã mặt hàng: "+ Arrays.toString(mapping(items, (i1) -> i1.getId())));
		System.out.println("Danh sách tên mặt hàng: "+Arrays.toString(mapping(items, (i2)-> i2.getName())));
		
		
	}
	// target[i] = items[i].getId();
	// target[i] = items[i].getName();

	//giữa 2 thằng có KDL khác nhau, lúc này lúc kia => dùng kiểu object là cha chung của chúng
	private static Object[] mapping(Item[] items, ObjectMapper object) {
		Object[] target = new Object[items.length];
		
		for (int i = 0; i < items.length; i++) {
			target[i] = object.apply(items[i]);
		}
		
		
		return target;
	}
	
	// ==========================================//
	
	private static Integer[] findIds(Item[] items) {
		Integer[] ids = new Integer[items.length];
		
		for (int i = 0; i < items.length; i++) {
			ids[i] = items[i].getId();
		}
		return ids;
	}
	private static String[] findNames(Item[] items) {
		String[] names = new String[items.length];
		
		for (int i = 0; i < items.length; i++) {
			names[i] = items[i].getName();
		}
		return names;
	}
	
	private static Item[] mockItems() {
		return new Item[] {
				new Item(1, "Item A1", 22d),
				new Item(2, "Item A2", 12d),
				new Item(3, "Item A3", 45d),
				new Item(4, "Item A4", 57d),
				new Item(5, "Item A5", 88d),
				new Item(6, "Item A6", 22d),
				new Item(7, "Item A7", 33d),
				new Item(8, "Item A8", 10d),
				
		};
	}
}
