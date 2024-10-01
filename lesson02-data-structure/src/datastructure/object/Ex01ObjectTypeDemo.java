package datastructure.object;

import bean.Item;

public class Ex01ObjectTypeDemo {
	
	public static void main(String[] args) {
		
		// Primitive Data Type
		int a = 5;
		char c = 'A';
		
		// Object Data Type
		// VP: new Item();
		//   : đang tạo ra 1 đối tượng Item nằm ở HEAP
		//	 : 1 ô nhớ nằm ở HEAP
		// VT: Item: KDl
		// item1: biến
		Item item1 = new Item();
		item1.id = 1; // Gán giá trị cho Id của ô nhớ mà item1 đang trỏ đến
		item1.name = 'A';
		//item1.salesPrice = ;
		
	
		System.out.println("item1 ==> " + item1);
		
		
		// getClass().getName() + "@" + Integer.toHexString(hashCode()); 
		// Tất cả mọi class đều mặc định kế thừa từ class 'Object'
		// Khi in biến KDL kiểu đối tượng mặc định --> biến đó gọi điến hàm toStrig trong class 'Object'
		
		// Khởi tạo ô nhớ kèm giá trị mặc cho thuộc tính
		// Gán giá trị vào các thuộc tính của ô nhớ
		Item item2 = new Item();
		item2.id = 2;
		item2.name = 'B';
		item2.salesPrice = 22d;
		System.out.println("Item2 ==> " + item2);
		
		Item item3 = new Item();
		item3.id = 3;
		item3.name = 'C';
		item3.salesPrice = 33d;
		System.out.println("Item3 ==> " + item3);
		
		Item item4 = new Item(4, 'D', 44d);
		System.out.println("Item4 ==> " + item4);
		
	}

}
