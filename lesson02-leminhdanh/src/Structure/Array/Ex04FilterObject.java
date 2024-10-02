package Structure.Array;

import java.util.Arrays;

import bean.Item;

public class Ex04FilterObject {
	public static void main(String[] args) {
		Item itemA = new Item(123, "Item 123", 720);
		Item itemB = new Item(234, "Item 234", 260);
		Item itemC = new Item(345, "Item 345", 120);
		Item[] items = { itemA, itemB, itemC };
		System.out.println(Arrays.toString(items));
		System.out.println(Arrays.toString(filter(items)));
	}

	private static Item[] filter(Item[] items) {
		Item[] gia = new Item[items.length];
		int count = 0;
		for (Item item : items) {
			if (item.price > 200) {
				gia[count] = item;
				count++;
			}
		}

		return Arrays.copyOfRange(gia, 0, count);
	}

}
