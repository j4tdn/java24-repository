package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex06ListInitial {
	
	public static void main(String[] args) {
		
		//List <T> list = new ArrayList<>();
		// Gen 1 dynamic list, sp add/del/set/get
		
		List<String> l1 = new ArrayList<>();
		l1.add("a");
		l1.add("b");
		l1.add("c");
		l1.add("d");
		System.out.println("l1 size: " + l1.size());
		
		
		//Tạo ra 1 fixed-size list, sp get/set
		List<String> l2 = Arrays.asList("a", "b", "c", "d");
		//l2.add("e"); // UnsupportedOperationException
		System.out.println("l2 set " + l2.set(1, "z"));
		System.out.println("l2 size: " + l2.size());
		
		// gen ra 1 immutable list, kh support null
		List<String> l3 = List.of("a", "b", "c", "d");
//		l3.add("z");
//		l3.remove(0);
//		l3.set(0, "z2");
		System.out.println("l3 size: " + l3.size());

	}
	
}
