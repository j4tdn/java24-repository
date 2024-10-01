package structure.array;

import java.util.Arrays;

import bean.Item;

public class Ex04FilterObject {
	
	public static void main(String[] args) {
		Item itemA = new Item(123, '1', 720); 
		Item itemB = new Item(234, '2', 260); 
		Item itemC = new Item(345, '3', 100); 
		Item[] items = { itemA, itemB, itemC};
		
		System.out.println(Arrays.toString(filter(items)));
		
	}

	//Tìm những mặt hàng có giá lớn hơn 200
	
	private static Item[] filter (Item[] items) {
		
		Item[] result = new Item[items.length];
		int count = 0;
		for(Item item: items) {
			if(item.salesPrice  > 200) {
				result[count] = item;
				count++;
			}
		}
		return Arrays.copyOfRange(result, 0,count);
	}
}
