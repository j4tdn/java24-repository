package collection.set;

import java.util.HashSet;
import java.util.Set;

import utils.CollectionUtils;

public class Ex01SetDemo {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("a8");
		set.add("c1");
		set.add("k2");
		set.add("b4");
		set.add("t4");
		set.add("z1");
		set.add("g6");
		
		
		
		// duplicated values
		set.add("b4");
		set.add("a8");
		
		System.out.println("Size : " + set.size());
		CollectionUtils.generate("Dữ liệu : ", set);
	}

}
