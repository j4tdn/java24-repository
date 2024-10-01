package datastructure.object;

import bean.Item;

public class Ex03ReassignValues {
	
	public static void main(String[] args) {
		// = --> STACK
		// final --> STACK
		// KNT --> thông qua "="
		int a = 5;
		int b = 10;
		a = b;
		b = 20; 
		
		
		// KDT
		Item i1 = new Item(1, 'A', 11d);//H1
		Item i2 = new Item(2, 'B', 22d);//H2
		Item i3 = new Item(3, 'C', 33d);//H3
		
		System.out.println("i1 address: " + System.identityHashCode(i1));
		System.out.println("i2 address: " + System.identityHashCode(i2));
		System.out.println("i3 address: " + System.identityHashCode(i3));
		
		System.out.println();
		
		// Cách 1: Cập nhật địa chỉ của biến -> trỏ đến ô nhớ khắc ở HEAP
		// toán tử = chỉ gán ở stack
		i1 = i3;
		i1 = new Item(4, 'D', 44d);
		
		System.out.println("i1 address: " + System.identityHashCode(i1));
		System.out.println("i2 address: " + System.identityHashCode(i2));
		System.out.println("i3 address: " + System.identityHashCode(i3));
		

		
		i1.id = 999;
		System.out.println("i1 ==>"+ i1);
		System.out.println("i3 ==>"+ i3);
		
		// Cách 2: Cập nhật giá trị thuộc tính của ô nhớ ở HEAP mà biến đang trỏ đến
		i2.name = 'Z';
		
		System.out.println();
		
		System.out.println("i1 address: " + System.identityHashCode(i1));
		System.out.println("i2 address: " + System.identityHashCode(i2));
		System.out.println("i3 address: " + System.identityHashCode(i3));
		
		System.out.println("i1 ==>"+ i1);
		System.out.println("i2 ==>"+ i2);
		System.out.println("i3 ==>"+ i3);
	
	}

}
