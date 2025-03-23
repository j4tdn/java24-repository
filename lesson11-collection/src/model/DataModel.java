package model;

import static utils.NumberUtils.bd;

import java.util.ArrayList;
import java.util.List;

import bean.Item;

public class DataModel {

	private DataModel() {
	}
	
	public static List<Item> mockItems(){
		List<Item> items = new ArrayList<>();
		
		items.add(new Item(1, "Item A1", bd("218"), 101));
		items.add(new Item(2, "Item A2", bd("221"), 101));
		items.add(new Item(3, "Item A3", bd("789"), 102));
		items.add(new Item(4, "Item A4", bd("11"), 102));
		items.add(new Item(5, "Item A5", bd("888"), 102));
		items.add(new Item(6, "Item A6", bd("304"), 103));
		items.add(new Item(7, "Item A7", bd("107"), 101));
		items.add(new Item(8, "Item A8", bd("982"), 104));
		
		return items;
	}
	
}
