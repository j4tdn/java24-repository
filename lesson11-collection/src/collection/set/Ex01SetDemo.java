package collection.set;

import java.util.HashSet;
import java.util.Set;

import utils.CollectionUtils;

public class Ex01SetDemo {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("a2");
		set.add("c4");
		set.add("k9");
		set.add("g5");
		set.add("i2");
		set.add("h9");
		set.add("c3");

		
		set.add("h9");
		set.add("c3");
		
		System.out.println("size: " + set.size());
		CollectionUtils.generate("1. du lieu", set);
	}
	
}
