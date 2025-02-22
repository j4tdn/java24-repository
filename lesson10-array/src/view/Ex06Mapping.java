package view;

import java.util.Arrays;

import bean.Item;
import functional.ObjectMapper;

public class Ex06Mapping {
	public static void main(String[] args) {
		Item[] items = mockItems();
		
		System.out.println("Danh sách mã mặt hàng --> " + Arrays.toString(findIds(items)));
		System.out.println("Danh sách tên mặt hàng --> " + Arrays.toString(findNames(items)));
		
		System.out.println("\n=============================\n");
		
		System.out.println("Danh sách mã mặt hàng --> " 
				+ Arrays.toString(mapping(items, item -> item.getId())));
		
		System.out.println("Danh sách tên mặt hàng --> " 
				+ Arrays.toString(mapping(items, item -> item.getName())));
		
		System.out.println("Danh sách giá bán của các mặt hàng --> " 
				+ Arrays.toString(mapping(items, item -> item.getSalePrices())));
	}
	
	private static Object[] mapping(Item[] items, ObjectMapper objectMapper) {
		Object[] target = new Object[items.length];
		
		for(int i = 0; i<items.length; i++) {
			target[i] = objectMapper.apply(items[i]);
		}
		return target;
	}
	
	
	//===============================================//
	
	private static Integer[] findIds(Item[] items) {
		Integer[] ids = new Integer[items.length];
		
		for(int i = 0; i < items.length; i++) {
			ids[i] = items[i].getId();
		}
		return ids;
	}
	private static String[] findNames(Item[] items) {
		String[] names = new String[items.length];
		
		for(int i = 0; i < items.length; i++) {
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
				new Item(8, "Item A8", 10d)
		};
	}
}
