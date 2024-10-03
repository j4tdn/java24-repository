package structure.array;

import java.util.Arrays;

public class Ex04FilterObject {

	public static void main(String[] args) {
		
		Item iA = new Item(123, "a", 720);
		Item iB = new Item(234, "b", 260);
		Item iC = new Item(345, "c", 100);
		
		Item[] items = {
				iA, iB, iC};
		
		Item[] result = filter(items);
		
		System.out.println(Arrays.toString(result));
		
	}
	
	private static Item[] filter(Item[] items) {
		Item[] result = new Item[items.length];
		
		int count = 0;
		
		for(Item item: items) {
			if(item.salesPrice > 200) {
				result[count] = item;
				count++;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	 
}
