package datastructure.object;

import bean.Item;

public class Ex04PassParamViaMethod {

	public static void main(String[] args) {
		Item it1 = new Item(1, 'A', 11d);
		Item it2 = new Item(2, 'B', 22d);
		
		System.out.println("==============");
		
		int digit = 55;
		Item it3 = new Item(3, 'C', 33d);
		
		modify(digit);
		modify(it3);
		
		System.out.println("digit --> " + digit);
		System.out.println("digit --> " + it3);
		
		update(it3);
		System.out.println("It3 --> " + it3);
		
	}
	
	/*
	 * Khi biến được truyền tham số qua hàm
	 * Nếu muốn sau khi thoát khỏi hàm, biến được cạp nhật giá trị thì:
	 * 	+ Biến KDL đối tượng
	 * 	+ Trong hàm cập nhật giá trị tại HEAP của biến đó
	 *
	 * 
	 */
	
	private static void modify(int element) {
		element = 66;
	}
	
	
	
	private static void modify(Item element) {
		element.name = 'V';
		
	}
	
	private static void update(Item item) {
		item.name = 'H';
		item = new Item(55, 'R', 55d);
		item.id = 77;
		item.name = 'W';
		item.salesPrice = 77d;
	}
	
//	private static void modify(Item element) {
//		element = new Item(9, 'T', 99d);
//	}
}
