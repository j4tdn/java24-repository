package datastructure.object;

import bean.Item;

public class Ex04PassParamViaMethod {

	public static void main(String[] args) {
		
		//primitive
		long number=22;
		
		//Cập nhật giá trị, luôn luôn tại STACK
		number = 44;
	    //Object type
		Item it1=new Item (1, 'A', 11d);
		Item it2=new Item (2, 'B', 22d);
		
		//Cập nhật giá trị
		//-->Cập nhật giá trị tại STACK
		it1=new Item(1,'W', 111);
		it1=it2;
		 //Cập nhật giá trị tại HEAP
		it1.name='Z';
		
		System.out.println("=============");
		 
		int digit =55;
		Item it3=new Item(3,'C',33d);
		
		System.out.println("digit-->"+digit);
		System.out.println("it3-->"+it3);
		
		/*
		 Khi biến được truyền tham số qua hàm
		 Nếu muốn sau khi thoát khỏi hàm, biến được cập nhật giá trị thì
		 +biến KDL đối tượng
		 +trong hàm cập nhật giá trị tại HEAP của biến đó
		 
		 */
		Item it4=new Item(4,'D',44);
		update(it4);
		System.out.println("it4-->"+it4);
	}
	
	
	private static void update(Item item) {
		item.name='H';
		item=new Item(55,'R',55d);
		item.id=77;
		item.name='W';
		item.salesPrice=77;
		
	}
	private static void modify(Item element) {
		element.name='V';
	}
	//Item element = it3;
//	private static void modify(Item element) {
//		element=new Item(9,'T',99d);
//	}
}
