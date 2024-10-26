package datastructure.object;

import bean.Item;

public class Ex03ReassignValues {

	public static void main(String[] args) {
		// =  ----> STACK
		// final ----> STACK
		
		
		// KDL nguyen thuy --->  thong qua toan tu =
//		int a = 5;
//		int b = 10;
		// Cập nhật giá trị tại ô nhớ STACK mà biến đang trỏ đến
		
		
		
		// Cap nhat gia tri cho bien KDL doi tuong
		// KDL doi tuong
		Item i1 = new Item(1, 'A', 11d);
		Item i2 = new Item(2, 'B', 22d);
		Item i3 = new Item(3, 'C', 33d);
		
		
		System.out.println("i1 addesss: " + System.identityHashCode(i1));
		System.out.println("i2 addesss: " + System.identityHashCode(i2));
		System.out.println("i3 addesss: " + System.identityHashCode(i3));
		
		
		System.out.println();
		// Cách 1: Cập nhật địa chỉ của biến để trỏ đến ô nhớ khác ở HEAP
		i1 = i3;
		// i1 = new Item(4, 'D', 44d);  -> tao 1 o nho moi'

		System.out.println("i1 addesss: " + System.identityHashCode(i1));
		System.out.println("i2 addesss: " + System.identityHashCode(i2));
		System.out.println("i3 addesss: " + System.identityHashCode(i3));
		
		// Cách 2: Cập nhật giá trị thuộc tính của ô nhớ ở HEAP mà biến đang trỏ đến
		i2.name = 'Z';

		System.out.println("i1 -----> " + i1);
		System.out.println("i2 -----> " + i2);
		System.out.println("i3 -----> " + i3);
		
		
	}
	
}
