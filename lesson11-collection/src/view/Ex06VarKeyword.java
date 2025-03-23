package view;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import bean.Item;

public class Ex06VarKeyword {
	public static void main(String[] args) {
		// khai báo biến thông thường
		int a =5;
		Integer b = 6;
		String s = "hello";
		Item item = new Item();
		List<String> list = new ArrayList<>();
		List<String> stringList = List.of("a","b","c","d","e");
		Set<Entry<String, Integer>> set = new HashSet<>();
		
		// sử dụng tự khoá var
		var a1 = 5;
		var b1 = 6;
		var s1 = "hello";
		var item1 = new Item();
		
		// là list of object
		var list1 = new ArrayList<String>();
		var stringList1 = List.of("a","b","c","d","e");
		var set1 = new HashSet<Entry<String, Integer>>();
		
		
		
	}
	

}
