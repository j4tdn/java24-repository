package video_array;

import java.util.Arrays;

import bean.Item;

public class Ex04FilterObject {

	public static void main(String[] args) {
		Item itA = new Item(123, "Item 123", 720);
		Item itB = new Item(234, "Item 234", 260);
		Item itC = new Item(345, "Item 345", 100);
		
		Item[] items = {itA, itB, itC};
		for (Item it : items) {
			System.out.println(it);
		}
		
		System.out.println("\n===============\n");
		
		
		Item[] res = filter(items);
		for (Item it : res) {
			System.out.println(it);
		}
		
		// shoudn't override, nên override chỗ Item
		// toString Arrays # toString object Item
		// => [Item [id=123, name=Item 123, salesPrice=720.0], Item [id=234, name=Item 234, salesPrice=260.0]]
		//System.out.println(Arrays.toString(res));
		
	}
	
	// search Item have price > 200
	private static Item[] filter(Item[] items) {
		Item[] res = new Item[items.length];
		int cnt = 0;
		for (Item item : items) {
			if (item.salesPrice > 200) {
				res[cnt++] = item;
			}
		}
		return Arrays.copyOfRange(res, 0, cnt);
	}

}
