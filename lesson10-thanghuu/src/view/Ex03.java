package view;

import bean.Item;

public class Ex03 {

	public static void main(String[] args) {
		
	}
	
	private static Item[] mockItem() {
		return new Item[] {
				new Item(1, "A", 25, 101),
	            new Item(2, "B", 90, 102),
	            new Item(3, "C", 88, 102),
	            new Item(4, "D", 40, 101),
	            new Item(5, "E", 60, 102),
	            new Item(6, "F", 18, 101),
	            new Item(7, "G", 100, 103),
	            new Item(8, "H", 200, 103),
	            new Item(9, "I", 70, 104),
	            new Item(10, "J", 40, 105)
		};
	}
}
