package datastructure.object;
import javax.lang.model.element.Element;

import bean.Item;
public class Ex04PasParamVieMethod {
	public static void main(String[] args) {
		long number = 22;
		number = 44;
		
		Item it1 = new Item(1 , 'A' , 11d);
		Item it2 = new Item(2 , 'B' , 22d);
		
		it1 = new Item (1, 'M' , 111);
		it1 = it2;
		
		int digit = 55;
		Item it3 = new Item(3 , 'C' , 33d);
		
		modify(digit);
		modify(it3);
		
		System.out.println("digit -->" + digit);
		System.out.println("it3 -->" + it3);
		/*
		 Khi biến được truyền tham số qua hàm
		 nếu muốn sau khi thoát khỏi hàm, biến được cập nhật giá trị thì
		 + Biến KDL đối tượng
		 + trong hàm cập nhật giá trị tại HEAP của biến đó
		 */
		Item it4 = new Item(4, 'D' ,44);
		update(it4);
		System.out.println("it4 ==>" + it4);
	}
	private static void update(Item item) {
		item.name = 'H';
		item = new Item(55 ,'R', 55);
		item.id = 77 ;
	    item.name = 'W';
	    item.salesPrice = 77;
	}
	private static void modify(int element) {
		element = 66;
	}

//	private static void modify(Item element) {
//		element = new Item(9 , 'T' , 99d);
//	}
	private static void modify(Item element) {
		element.name = 'V';
	}
}