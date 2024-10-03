package video_array;

import java.util.Arrays;

import bean.Item;

public class Ex04FilterObject {
	public static void main(String[] args) {
		Item itemA = new Item(123, "Item 123", 720);
		Item itemB = new Item(234, "Item 234", 260);
		Item itemC = new Item(345, "Item 345", 100);
		Item[] items = {itemA, itemB, itemC};
		
		Item[] result = getPriceItem(items);
		
		for(Item conclude : result) {
			System.out.println(conclude);
		}
		
	}
	//Tim nhung mat hang co gia lon hon 200
	private static Item[] getPriceItem(Item[] elements) {
		
		Item[] result = new Item[elements.length];
		int count = 0;
		for(Item item : elements) {
			if(item.price > 200) {
				result[count] = item;
				count++;
			}
		}
		
		return Arrays.copyOfRange(result, 0, count);
	}
}