package collection.set;

import java.util.HashSet;
import java.util.Set;

import bean.Item;
import utils.CollectionUtils;

public class Ex02DuplicationOfSet {
	public static void main(String[] args) {
		
		Set<Item> items = new HashSet<>();
		items.add(new Item(1,"ItemA1"));
		items.add(new Item(2,"ItemA2"));
		items.add(new Item(3,"ItemA3"));
		items.add(new Item(4,"ItemA4"));
		items.add(new Item(5,"ItemA5"));
		
		
		items.add(new Item(3,"ItemA3"));
		
		
		
		System.out.println("Size : " + items.size());
		CollectionUtils.generate("1.Danh sách mặc hàng", items);
		
		Set<String> set = Set.of("a","b","c","d");
		System.out.println("set size: " + set);
		
	}

}
