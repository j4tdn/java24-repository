package collection.set;

import java.util.HashSet;
import java.util.Set;

public class Ex01SetDemo {
	
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("a8");
		set.add("k2");
		set.add("d5");
		set.add("m7");
		set.add("t3");
		set.add("q1");
		
		System.out.println("size " + set.size());
		
	}

}
