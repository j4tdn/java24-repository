package collection.set;

import java.util.HashSet;
import java.util.Set;

import bean.Item;
import utils.CollectionUtils;

public class Ex02DuplicationOfSet {
	
	public static void main(String[] args) {
		
		Set<Item> items = new HashSet<>();
		
		items.add(new Item(1, "A1"));
		items.add(new Item(2, "A2"));
		items.add(new Item(3, "A3"));
		items.add(new Item(4, "A4"));
		items.add(new Item(5, "A5"));
		

		items.add(new Item(3, "A3"));
		
		System.out.println("size" + items.size());
		CollectionUtils.generate("1. Danh sach mat hang", items);
		
		Set<String> set = Set.of("a", "b", "c", "d");
		System.out.println("set size:" + set);
		
	}
	
}
