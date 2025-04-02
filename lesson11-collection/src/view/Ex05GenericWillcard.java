package view;

import java.util.Date;
import java.util.List;

public class Ex05GenericWillcard {
	
	public static void main(String[] args) {
		
		List<Integer> lints = List.of(1, 2, 3, 4, 5);
		List<Double> ldobs = List.of(1d, 2d, 3d, 4d, 5d);
		List<String> lstrs = List.of("a", "b", "c", "d", "e");
		List<Object> lobjs = List.of("a", 1, 2d, 3f, new Date());
		
		generate("1. In mang voi objects", lints);
//		generate("1. In mang voi objects", ldobs);
//		generate("1. In mang voi objects", lstrs);
		generate("1. In mang voi objects", lobjs);
		
		
		
	}
	
	private static void generate(String prefix, List<? super Integer> elements) {
		System.out.println(prefix + "{ ");
		for (Object object: elements) {
			System.out.println("    - " + object);
		}
		System.out.println("}\n");	
	}

}
