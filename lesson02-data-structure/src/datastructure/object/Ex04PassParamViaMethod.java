package datastructure.object;

import bean.Item;

public class Ex04PassParamViaMethod {
	
	public static void main(String[] args) {
		
		long number = 22;
		
		number = 44;
		
		Item it1 = new Item(1, 'a', 11d);
		Item it2 = new Item(2, 'b', 22d);
		
		it1 = new Item(1, 'w', 111d);
		
		it1 = it2;
		
		it1.name = 'z';
		
		System.out.println("==============================");
		
		int digit = 55;
		
		Item it3 = new Item(3, 'c', 33d);

		modify(digit);
		modify(it3);
		
		System.out.println("digit --->" + digit);
		System.out.println("it3 --> " + it3);
		
		/*
		 * khi biến duọc truyền tham số qua hàm 
		 * muôn sau khi thoat khỏi hàm, biến được cập nhật giá trị thì 
		 * +Biến kdl đối tượng 
		 * +trong hàm cập nhật giá trị tại HEAD  của biến đó 
		 */
		
		Item it4 = new  Item(4, 'd', 44);
		update(it4);
		System.out.println(it4);
	}
	
	private static void modify(int element) {
		element = 66;
	}

	private static void update(Item item) {
		item.name = 'h';
		item = new Item(55,'r', 55d);
		item.id = 77;
		item.name = 'ư';
		item.salesPrice = 77;
	}
	
//	private static void modify(Item element) {
//		element = new Item(9, 't', 99d);
//	}
	
	private static void modify(Item element) {
		element.name = 'v';
	}
}
