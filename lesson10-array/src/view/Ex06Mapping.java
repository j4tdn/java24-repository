package view;

import java.util.Arrays;

import bean.Item;
import functional.itemMapper;

public class Ex06Mapping {
	
	/*
	 Bài toán : cho danh sách các mặt hàng
	 Viết chương trình 
	  + Liệt kê id của tất cả các mặt hàng
	  + Liệt kê name của tất cả các mặt hàng
	 */
	public static void main(String[] args) {
		Item[] items = mockItems();
		System.out.println("Danh sách mã mặt hàng -->" + Arrays.toString(findIds(items)));
		System.out.println("Danh sách mã mặt hàng -->" + Arrays.toString(findNames(items)));
		
		System.out.println("\n========================================");
		System.out.println("Danh sách mã mặt hàng -->" + Arrays.toString(mapping(items, item -> item.getId())));
		System.out.println("Danh sách mã mặt hàng -->" + Arrays.toString(mapping(items, item -> item.getName())));
		
	}
	//	target= items[i].getId();
	//  target= items[i].getName(

	// 	ObjectMapper
	//	Object apply(Item item)
	private static Object[] mapping(Item[] items, itemMapper objectMapper) {
		Object[] target = new Object[items.length];
		for(int i=0;i<items.length;i++) {
			target[i]= objectMapper.apply(items[i]);
			}
		return target;
	}
	
	//===============================================
	private static Integer[] findIds(Item[] items) {
		Integer[] ids = new Integer[items.length];
		
		for(int i=0;i<items.length;i++) {
			ids[i]= items[i].getId();	
			}
		return ids;
	 }
	private static String[] findNames(Item[] items) {
		String[] names = new String[items.length];
		
		for(int i=0;i<items.length;i++) {
			names[i]= items[i].getName();	
			}
		return names;
	 }
		
	
	
	
	
	private static Item[] mockItems() {
		return new Item[] {
				new Item(1, " Item A1",21d),
				new Item(2, " Item A2",22d),
				new Item(3, " Item A3",23d),
				new Item(4, " Item A4",24d),
				new Item(5, " Item A5",25d),
				new Item(6, " Item A6",26d),
				new Item(7, " Item A7",27d),
				new Item(8, " Item A8",28d),
		};
	}
}
