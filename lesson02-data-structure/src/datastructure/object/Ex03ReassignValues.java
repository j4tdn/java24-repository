package datastructure.object;

import bean.Item;

public class Ex03ReassignValues {
	public static void main(String[] args) {
		// =     --> STACK
		// final --> STACK
		
		// Cập nhật giá trị cho biến KDL nguyên thủy
		// KNT --> thông qua toán tử =
		int a = 5;
		int b = 10;
		a = b;
		b = 20;
		// Cập nhật giá trị tại ô nhớ mà biến đang trỏ đến STACK
		
		// Cập nhật giá trị cho biến KDL đối tượng
		// KDT
		Item i1 = new Item(1, 'A', 11d);
		final Item i2 = new Item(2, 'B', 22d);
		Item i3 = new Item(3, 'C', 33d);
		
		System.out.println("i1 address: " + System.identityHashCode(i1));
		System.out.println("i2 address: " + System.identityHashCode(i2));
		System.out.println("i3 address: " + System.identityHashCode(i3));
		
		System.out.println();
		
		// = --> STACK
		// Cách 1: Cập nhật địa chỉ của biến -> trỏ đến ô nhớ khác ở HEAP
		i1 = i3;
		i1 = new Item(4, 'D', 44d);

		System.out.println("i1 address: " + System.identityHashCode(i1));
		System.out.println("i2 address: " + System.identityHashCode(i2));
		System.out.println("i3 address: " + System.identityHashCode(i3));
		// Cách 2: Cập nhật giá trị thuộc tính ô nhớ ở HEAP mà biến đang trỏ đến
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
