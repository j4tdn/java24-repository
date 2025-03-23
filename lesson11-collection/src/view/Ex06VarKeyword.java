package view;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import bean.Item;

public class Ex06VarKeyword {

	public static void main(String[] args) {
		// khai bao bien thong thuong
		int a = 5;
		Integer b = 6;
		String s = "hello";
		Item item = new Item();
		List<String> elements = new ArrayList<>();
		Set<Entry<String, Integer>> set = new HashSet<>();
		
		
		var c = 4;
		var j = 6;
		var s1 = "hello";
		var elements1 = new ArrayList<String>();

		var set1 = new HashSet<Entry<String, Integer>>();
	}
	
}
