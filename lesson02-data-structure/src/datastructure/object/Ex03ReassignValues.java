package datastructure.object;

import bean.Item;

public class Ex03ReassignValues {
	public static void main(String[] args) {
		
		int a = 5;
		int b = 10;
		a = b;
		b = 20;

		Item i1 = new Item(1, 'A', 11d);
		final Item i2 = new Item(2, 'B', 22d);
		Item i3 = new Item(3, 'C', 33d);

		System.out.println("i1 address:" + System.identityHashCode(i1));
		System.out.println("i2 address:" + System.identityHashCode(i2));
		System.out.println("i3 address:" + System.identityHashCode(i3));
		System.out.println();

		i1 = i3;
		
		
		System.out.println("i1 address:" + System.identityHashCode(i1));
		System.out.println("i2 address:" + System.identityHashCode(i2));
		System.out.println("i3 address:" + System.identityHashCode(i3));
		System.out.println();
		
		i1 = new Item(3, 'D', 44d);
		System.out.println("i1--> " + i1);
		System.out.println("i2--> " + i2);
		System.out.println("i3--> " + i3);
	}
}
