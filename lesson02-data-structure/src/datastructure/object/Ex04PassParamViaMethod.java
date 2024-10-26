package datastructure.object;

import bean.Item;

public class Ex04PassParamViaMethod {
	
	public static void main(String[] args) {
		int digit = 55;
		Item it3 = new Item(3, 'C', 33d);
		
		modify(digit);
		modify(it3);
		
		System.out.println("Digit ----> " + digit);
		System.out.println("it3 ----> " + it3);
		
		/*
		 Khi biến được truyền tham số qua hàm
		 Nếu mình muốn sau khi thoát khỏi hàm, biến được cập nhật giá trị thì phải:
		 + Biến KDL đối tượng
		 + Trong hàm cập nhật giá trị tại HEAP của biến đó
		 
		 */
		 Item it4 = new Item(4,'D',44);
		 update(it4);
		 System.out.println("it 4 ----->" + it4);
	}
	
	private static void update (Item item) {
		item.name = 'H';
		item = new Item(5,'R',55d);
		item.id = 77;
		item.name = 'W';
		item.salesPrice = 77;
	}
	
	private static void modify(int element) {
		element = 66;
	}
	
	private static void modify(Item element) {
		element = new Item(9, 'T', 99d);
	}

}
