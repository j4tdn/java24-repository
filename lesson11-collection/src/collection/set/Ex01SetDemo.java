package collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import utils.CollectionUtils;

public class Ex01SetDemo {
	
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("a8");
		set.add("c1");
		set.add("k2");
		set.add("b8");
		set.add("t4");
		set.add("z11");
		set.add("g7");
		//duplicated values
		set.add("c1");
		set.add("t4");
		
		System.out.println("size: " + set.size());
		
		CollectionUtils.generate("1. Dữ liệu: ", set);
	}
	
}
