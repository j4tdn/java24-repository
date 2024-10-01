package datastructure.object;

// composition over i

import bean.Item;


public class Ex01ObjectTypeDemo {
	public static void main(String[] args) {
		//Primitive Data Type
		int a = 5;
		char c = 'A';
		//Primitive Data Type
		// vế phải biến , vế trái kiểu dữ liệu
		Item item1 = new Item();
		item1.id = 1;
		item1.name = 'A';
				
//		System.out.println("item1 id = " + item1.id); 
//		System.out.println("item1 name = " + item1.name); 
//		System.out.println("item1 salesPrice = " + item1.salesPrice); 
		System.out.println("item1 ==>" + item1);
//		System.out.println("item1 toString -->" + item1.toString());
		
		//getClass().getName() + "@" + Integer.toHexString(hashCode());
		
		// tất cả mọi class điều mặc định kế thừa từ class 'Object'
		// khi in biến KDL đối trượng mặt định --> biến đó gọi đến hàm toString cho class Object
		
		// Khởi tạo ô nhớ kèm giá trị mặc định cho thuộc tính
		Item item2 = new Item();
		//Gán, truyền giá trị vào cho thuộc tính ô nhớ
		item2.id = 2;
		item2.name = 'B';
		item2.salesPrice = 22d;
		System.out.println("item2 ==>" + item2);
		
		Item item3 = new Item();
		item3.id = 3;
		item3.name = 'C';
		item3.salesPrice = 33d;
		System.out.println("item3 ==>" + item3);
		
		Item item4 = new Item(4 , 'D' , 44d);
		System.out.println("item4 ==>" + item4);

	}	 
}