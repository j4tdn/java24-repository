package view;

import java.util.Arrays;

import bean.Item;

public class Ex03 {
	
	public static void main(String[] args) {
		Item[] items = mockData();		
		System.out.println("Mac hang cao nhat store 101 --> " + getHighestPriceOfStore(items, 101));
		System.out.println("Mac hang cao nhat store 102 --> " + getHighestPriceOfStore(items, 102));
	}
	
	private static Item[] mockData() {
		return new Item[] {
			new Item(1, "A", 25d, 101),
			new Item(2, "B", 90d, 102),
			new Item(3, "C", 88d, 102),
			new Item(4, "D", 40d, 101),
			new Item(5, "E", 60d, 102),
			new Item(6, "F", 18d, 101)
		};
	}
	
	private static Item getHighestPrice(Item[] sources) {
		Item target = new Item();
		double maxPrice = Double.MIN_VALUE;
		for(Item source : sources) {
			if(source.getPrice() > maxPrice) {
				maxPrice = source.getPrice();
				target = source;
			}
		}
		return target;	
	}
	private static Item getHighestPriceOfStore(Item[] sources, int idStore) {
		Item[] target = new Item[sources.length];
		int count = 0;
		for(Item source : sources) {
			if(source.getIdStore() == idStore) {
				target[count++] = source;
			}
		}
		return getHighestPrice(Arrays.copyOfRange(target, 0, count));
	}
}
