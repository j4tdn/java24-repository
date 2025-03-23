package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex06ListInitial {
	
	public static void main(String[] args) {
		
		// Tạo ra 1 dynamic list, hỗ trợ add/delete/get/set
		List<String> l1 = new ArrayList<>();
		l1.add("a");
		l1.add("b");
		l1.add("c");
		l1.add("d");
		System.out.println("l1 size: " + l1.size());
		
		// Tạo ra 1 fixed-size list, hỗ trợ get/set
		List<String> l2 = Arrays.asList("a", "b", "c", "d");
		// l2.add("e"); // UnsupportedOperationException
		System.out.println("l2 set " + l2.set(1, "z"));
		System.out.println("l2 size: " + l2.size());
		
		// Tạo ra 1 immutable list, hỗ trợ get, non null values
		List<String> l3 = List.of("a", "b", "c", "d");
		// l3.add("z1");
		// l3.remove(0);
		// l3.set(0, "z2");
		System.out.println("l3 size: " + l3.size());
		
		// new ArrayList<>(collection), List.copyOf(collection)
	}
	
}