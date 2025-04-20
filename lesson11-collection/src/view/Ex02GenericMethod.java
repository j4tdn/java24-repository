package view;

import java.util.List;

public class Ex02GenericMethod {

	public static void main(String[] args) {
		Integer[] ints = { 1, 2, 3, 4, 5 };
		Double[] doubles = { 1d, 2d, 3d, 4d, 5d };
		String[] strings = { "a", "b", "c", "d", "e" };
		
		generateObjects("1. In ra mang voi ints", ints);
		generateObjects("2. In ra mang voi doubles", doubles);
		generateObjects("3. In ra mang voi strings", strings);
		
		System.out.println("===================/n");
		
		generate("1. In ra mang voi ints", ints);
		generate("2. In ra mang voi doubles", doubles);
		generate("3. In ra mang voi strings", strings);
		
		System.out.println("===================/n");
		
		List<Integer> lints = List.of(1,2,3,4,5);
		List<Double> ldoubles = List.of(1d, 2d, 3d, 4d, 5d);
		List<String> lstrings = List.of("a", "b", "c", "d", "e");
	}
	
	private static <Element> void generate(String prefix, Element[] elements) {
		System.out.println(prefix + "{ ");
		for (Element element : elements) {
			System.out.println("   - " + element);
		}
		System.out.println("}/n");
	}

	private static void generateObjects(String prefix, Object[] oblects) {
		System.out.println(prefix + "{ ");
		for (Object object : oblects) {
			System.out.println("   - " + object);
		}
		System.out.println("}/n");
	}

}
