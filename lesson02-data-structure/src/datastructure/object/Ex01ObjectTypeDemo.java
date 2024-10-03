package datastructure.object;

import bean.Item;

public class Ex01ObjectTypeDemo {

	public static void main(String[] args) {
		//primitive data type
		int a = 5;
		char c = 'a';
		System.out.println("a= " + a);
		
		System.out.println("\n\n");
		
		//object data typpe 
		Item item1 = new Item();
		
		item1.id = 1;
		item1.name = 'a';
		
		System.out.println("item1 ==> " + item1);
	
		Item item2 = new Item();
		item2.id = 2;
		item2.name = 'b';
		item2.salesPrice = 22d;
		
		System.out.println("item2 ==> " + item2);
		
		Item item3 = new Item();
		item3.id = 3;
		item3.name = 'c';
		item3.salesPrice = 33d;
		
		System.out.println("item3 ==> " + item3);
		
		Item item4 = new Item(1, 'a', 44d);
		
	    System.out.println("item4 ==>" + item4);
	}
}
