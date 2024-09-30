package datastructure.object;

import been.Item;

public class Ex04PassParamViaMethod {
	
	public static void main(String[] args) {
		// primitive type
		long number = 22;
		
		// --> Cập nhật giá trị cho biến
		// --> Cập nhật giá tị tại stack
		number = 44;
		
		// object type
		Item it1 = new Item(1, 'A', 11d);
		Item it2 = new Item(2, 'B', 11d);
		
		// --> Cập nhật giá trị cho biến
		// --> Cập nhật giá trị tại stack
		it1 = new Item(1, 'W', 111);
		it1 = it2;
		
		it1.name = 'Z';
		
		System.out.println("==================");
		
		int digit = 55;
		Item it3 = new Item(3, 'C', 33d);
		
		modify(digit);
		modify(it3);
		
		System.out.println("digit --> " + digit); // 55 55
		System.out.println("it3 --> " + it3); // 3 3
		
		/*
		 Khi biến được truyền tham số qua hàm
		 Nếu muốn sau khi thoát khỏi hàm, biến đc cập nhật giá trị thì
		 + Biến KDL đối tượng
		 + Trong hàm cập nhật giá trị tại HEAP của biến đó	 
		 */
		Item it4 = new Item(4, 'D', 44);
		update(it4);
		System.out.println("it4 --> " + it4);
		
	}
	
	private static void update(Item item) {
		item.name = 'H';
		item = new Item(55, 'R', 55d);
		item.id = 77;
		item.name = 'W';
		item.salesPrice = 77;
	}
	
	// int element = digit
	private static void modify(int element) {
		element = 66;
	}
	
	private static void modify(Item element) {
		element.name = 'V';
	}
	
//	private static void modify(Item element) {
//		Item itz = new Item(10, 'Z', 100);
//		element = itz;
//	}
	
//	private static void modify(Item element) {
//		element = new Item(9, 'T', 99d);
//	}
	
	
}
