package view;

import java.util.Date;
import java.util.List;

public class Ex02GenericMethod {

	public static void main(String[] args) {
		Integer[] ints = {1, 2, 3, 4, 5};
		Double[] dous = {1d, 2d, 3d, 4d, 5d};
		String[] strs = {"a", "b", "c", "d", "e"};
		
		List<Integer> lints = List.of(1, 2, 3, 4, 5);
		List<Double> ldobs = List.of(1d, 2d, 3d, 4d, 5d);
		List<String> lstrs = List.of("a", "b", "c", "d", "e");
		List<Object> lobjs = List.of("a", 1, 2d, 3f, new Date());
		
		generateObject("1. In mang voi objects", lints);
		generateObject("1. In mang voi objects", ldobs);
//		generateObject("1. In mang voi objects", lstrs);
//		generateObject("1. In mang voi objects", lobjs);
		
		System.out.println("========================");
		
		generate("1. In mang voi objects", ints);
		
	}
	
	private static <T extends Number> void generateObject(String prefix, List<T> elements) {
		System.out.println(prefix + "{ ");
		for (T object: elements) {
			System.out.println("    - " + object);
		}
		System.out.println("}\n");	
	}
	
	private static <E> void generate(String prefix, E[] elements) {
		System.out.println(prefix + "{ ");
		for (E object: elements) {
			System.out.println("    - " + object);
		}
		System.out.println("}\n");	
	}
	
//	private static void generateObject(String prefix, Object[] objects) {
//		System.out.println(prefix + "{ ");
//		for (Object object: objects) {
//			System.out.println("    - " + object);
//		}
//		System.out.println("}\n");
//	}
}
