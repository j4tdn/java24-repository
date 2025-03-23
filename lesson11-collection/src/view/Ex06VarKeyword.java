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
		Integer b = 6;
		String s = "Hello";
		Item item = new Item();
		List<String> list = new ArrayList<>();
		List<String> listString = List.of("a","b","c","d");
		Set<Entry<String, Integer>> set = new HashSet<>();
		
		// Sử dụng từ khóa var
		var a1 = 5;
		var b1 = 6;
		var s1 = "hello";
		var item1 = new Item();
		// Đang hiểu là list of Object vì ta không truyền tham số gì vào cho ArrayList
		var list1 = new ArrayList<String>();
		var stringList1 = List.of("a","b","c","d");
		var set1 = new HashSet<>();
	}
}
