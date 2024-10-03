package datastructure.object;

import bean.Item;

public class Ex01ObjectTypeDemo {

	public static void main(String[] args) {
		
		//Primitive
		int a=5;
		char c='A';
		System.out.println("a= " + a);
		System.out.println("\n\n " );
		
		//Oject Data Type
		//VP: new Item()
		// Đang tạo ra một đối tượng Item nằm ở HEAP
		// 1 ô nhớ nằm ở HEAP
		//item1: biến 
		
		Item item1 = new Item(); 
		item1.id=1; //gán giá trị cho id của ô nhớ mà item1 đang trỏ đến
		item1.name='A';
		//item1.salesPrice
		System.out.println("item1==>" + item1);
		// getClass().getName() + "@" + Integer.toHexString(hashCode());	
	    // Tất cả mọi class đều mặc định kế thừa từ class 'Object'
		//Khi in biến KDL đối tượng mặc định--> biến đó gọi đến hàm toString trong class Object
		
		//Khởi tạo ô nhớ kèm giá trị mặc định cho thuộc tính
	    Item item2=new Item();
	    //Truyền giá trị vào cho thuộc tính của ô nhớ
	    item2.id=2;
	    item2.name='B';
	    item2.salesPrice=22d;
	    System.out.println("item2==>" + item2);
	    
	    Item item3=new Item();
	    item3.id=3;
	    item3.name='C';
	    item3.salesPrice=33d;
	    System.out.println("item3==>" + item3);
	    
	    Item item4 = new Item (1, 'D', 44d);
	    System.out.println("item4==>"+item4);
	}
	
	
}
