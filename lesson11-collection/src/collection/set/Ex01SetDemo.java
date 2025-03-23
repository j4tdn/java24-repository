package collection.set;

import java.util.Set;
import java.util.TreeSet;

import utils.CollectionUtils;

public class Ex01SetDemo {

	
	public static void main(String[] args) {
		
		Set<String> set = new TreeSet<>();
		
		set.add("a8");
		set.add("c1");
		set.add("k2");
		set.add("b4");
		set.add("t4");
		set.add("z1");
		set.add("g6");
		
		//duplicate value
		set.add("b4");
		set.add("a8");
		
		
		
		System.out.println("size: "+ set.size());
		CollectionUtils.generate("1. Dữ liệu", set);
	
	}
	
}
