package datastructure.object;

import bean.Item;

public class Ex04PassParamViaMethod {
	
	public static void main(String[] args) {
		
		// primitive type
		long number = 22;
		
		// --> cập nhật giá trị cho biến
		number = 44;
		
		
		//object type
		Item it1 = new Item(1, 'A', 11d);
		Item it2 = new Item(2, 'B', 22d);
		
		// --> Cập nhật giá trị cho biến
		it1 = new Item(1, 'W', 111);
		it1 = it2;
		
		// --> Cập nhật giá trị tại HEAP
		it1.name = 'Z';
		
		System.out.println("=================");
		
		int digit = 55;
		Item it3 = new Item(3, 'C', 33d);
		
		modify(digit);
		modify(it3);
		
		System.out.println("digit --> " + digit);
		System.out.println("it3 --> " + it3);
		
		/*
		 * Khi biến được truyền tham số qua hàm
		 * Nếu muốn sau khi thoát khỏi hàm, biến được cập nhật giá trị thì 
		 * + Biến KDL đối tượng
		 * + Trong hàm cập nhật giá trị tại HEAP của biến đó
		 */
		Item it4 = new Item(4, 'D', 44);
		update(it4);
		System.out.println("it4 --> " + it4);
	}
		;
		
		
	
		private static void update(Item item) {
			item.name = 'H';
			item = new Item(55, 'R', 55d);
			item.id = 77;
			item.name = 'W';
			item.salesPrice = 77;
		}
		
		// int element = digit;
		private static void modify(int element) {
			element = 66;			
		}
		
		private static void modify(Item  element) {
			element.name = 'V';
		}
		
		//Item element = it3;
		//private static void modify(Item element) {
		//	element = new Item(9, 'T', 99d);
		//}
		
		// So sánh KDL nguyên thủy int với object interger : int bắt buộc có giá trị , interger có giá trị hoặc null tùy vào tình hình
		// thực tế data nhận vào như thế nào
}
