package datastructure.object;

import bean.Item;

public class Ex03ReassignValues {
	//final --> STACK
	public static void main(String[] args) {
		Item i1 = new Item(1, 'A', 11d);
		final Item i2 = new Item(2, 'B', 22d);
		Item i3 = new Item(3, 'C', 33d);
		
		System.out.println("i1 address: " + System.identityHashCode(i1));
		System.out.println("i2 address: " + System.identityHashCode(i2));
		System.out.println("i3 address: " + System.identityHashCode(i3));
		// = -> STACK
		//Cách 1: cập nhập địa chỉ của biến -> trỉ đến ô nhớ khác ở HEAP;
		
		System.out.println();
		
		i1 = i3;
		//i1= new Item(4, 'D', 44d);
		
		System.out.println("i1 address: " + System.identityHashCode(i1));
		System.out.println("i2 address: " + System.identityHashCode(i2));
		System.out.println("i3 address: " + System.identityHashCode(i3));
		
		//Cách 2: Cập nhập val thuộc tính của ô nhớ ỏ HEAP mà biến đang trỏ đến 
		i1.id = 999;
		i2.name = 'Z';
		
		System.out.println();
		
		System.out.println("i1 address: " + System.identityHashCode(i1));
		System.out.println("i2 address: " + System.identityHashCode(i2));
		System.out.println("i3 address: " + System.identityHashCode(i3));
		
		System.out.println("i1 --> " + i1);
		System.out.println("i2 --> " + i2);
		System.out.println("i3 --> " + i3);
		
	}
}
