package view;

import java.util.Arrays;

import bean.Item;
import functional.ItemMapper;

public class Ex06Mapping {
	
	/*
	Bài toán: cho ds các mặt hàng
	VIết chương trình
	 + liệt kê id của tất cả các mặt hàng cách nhau bởi dấu ,
	 + liệt kê name của tất cả các mặt hàng cách nhau bởi dấu ,
	 
	 
	 */
	
	public static void main(String[] args) {
		Item[] items = mockItem();
		
		System.out.println("Danh sach ma mat hang --> " + Arrays.toString(findIds(items)));
		System.out.println("Danh sach ten mat hang --> " + Arrays.toString(findName(items)));
		
		System.out.println("=========================");
		
		System.out.println("Danh sach ma mat hang --> " + Arrays.toString(mapping(items, item -> item.getId())));
		System.out.println("Danh sach ten mat hang --> " + Arrays.toString(mapping(items, item -> item.getName())));
	}
	
	
	private static Object[] mapping(Item[] items, ItemMapper objectMapper) {
		Object[] target = new Object[items.length];
		
		for (int i = 0; i < items.length; i++) {
			target[i] = objectMapper.apply(items[i]);
		}
		return target;
	}
	
	
//	=========================================
	
	private static Integer[] findIds(Item[] items) {
		Integer[] ids = new Integer[items.length];
		
		for (int i = 0; i < items.length; i++) {
			ids[i] = items[i].getId();
		}
		return ids;
	}
	
	private static String[] findName(Item[] items) {
		String[] names = new String[items.length];
		
		for (int i = 0; i < items.length; i++) {
			names[i] = items[i].getName();
		}
		return names;
	}
	
	private static Item[] mockItem() {
		return new Item[] {
				new Item(1, "Item A1", 22d),
				new Item(2, "Item A2", 12d),
				new Item(3, "Item A3", 52d),
				new Item(4, "Item A4", 62d),
				new Item(5, "Item A5", 72d),
				new Item(6, "Item A6", 92d),
				new Item(7, "Item A7", 15d),
				new Item(8, "Item A8", 19d)
		};
	}
	
}
