package datastructure.object;

import bean.Item;

public class Ex01ObjectTypeDemo {
	public static void main(String[] args) {
		int a = 5;
		int c = 'A';
		Item item1 = new Item(1, 'a', 10);
		System.out.println(item1.toString());
		Item item2 = new Item(2, 'b', 11);
		System.out.println(item2.toString());
	}
}
