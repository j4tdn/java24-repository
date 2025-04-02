package view;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import bean.Item;

public class Ex06VarKeyword {
	
	public static void main(String[] args) {
		int a = 5;
		Integer b =6;
		String s = "hello";
		Item item = new Item();
		List<String> elements = new ArrayList<>();
		Set<Entry<String, Integer>> set = new HashSet<>();
		
		var a1 = 5;
		var b1 = 6;
		var s1 = "Hello";
	}

}
