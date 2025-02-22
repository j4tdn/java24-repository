package view;

import java.util.Arrays;
import bean.Item;

public class Ex03 {
	public static void main(String[] args) {
		
		Item[] items = mockItems();
		System.out.println("Mặt hàng có giá bán cao nhất của cửa hàng là: " + findHighestPriceItem(items));
    
	}
	
	private static void findHighestPriceItem(Item[] items) {
		for(int i = 0 ; i < items.length; i++) {
			for(int j = 0 ; j < items.length; j++) {
				if(items[j].getStoreId() > items[j+1].getStoreId()) {
					Item temp = items[j];
					items[j] = items[j+1];
					items[j+1] = temp;
				}
			}
		}
	}
	
	private static Item[] mockItems() {
		return new Item[] {
				new Item(1, "A", 25, 101),	
				new Item(2, "B", 90, 102),
				new Item(3, "C", 88, 102),
				new Item(4, "D", 40, 101),
				new Item(5, "E", 60, 102),
				new Item(6, "F", 18, 101),
		};
	}
}
