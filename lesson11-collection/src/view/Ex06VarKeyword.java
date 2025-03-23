package view;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import bean.Item;

public class Ex06VarKeyword {
	
	public static void main(String[] args) {
		// Khai báo biến thông thường
		int a = 5;
		Integer b = 6;
		String s = "hello";
		Item item = new Item();
		List<String> list = new ArrayList<>();
		List<String> stringList = List.of("a", "b", "c");
		Set<Entry<String, Integer>> set = new HashSet<>();
		
		// Sử dụng từ khóa var
		var a1 = 5;
		var b1 = 6;
		var s1 = "hello";
		var item1 = new Item();
		
		// là list of objects
		var list1 = new ArrayList<String>();
		var stringList1 = List.of("a", "b", "c");
		var set1 = new HashSet<Entry<String, Integer>>();
		
		// var x1 = null;
		// void test(var a)
		
		// var f1 = (v1, v2) -> {
		//	return v1 + v2;
		// };
		
		Test1 f2 = (v1, v2) -> {
			return v1 + v2;
		};
		
		
		// js --> var: function scope
		
		// java --> var: short version of code at compile
		//           : block
	}
	
	void test() {
	    var a = 5;
	    {
	        var b = 7;
	        System.out.println(b);
	    }

	    var c = a + b;
	   System.out.println();
	}
	
	static interface Test1 {
		int process(int a, int b);
	}
	
	static interface Test2 {
		int calc(int a, int b);
	}
}