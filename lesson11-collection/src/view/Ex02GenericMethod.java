package view;

import java.util.Date;
import java.util.List;

public class Ex02GenericMethod {

	public static void main(String[] args) {

		Integer[] ints = { 1, 2, 3, 4, 5 };
		Double[] dous = { 1d, 2d, 3d, 4d, 5d };
		String[] strs = { "a", "b", "c", "d", "e" };

		generateObjects("1. In mảng với ints ", ints);
		generateObjects("1. In mảng với dous ", dous);
		generateObjects("1. In mảng với strs ", strs);

		System.out.println("===================\n");

		generate("2. In mảng với ints ", ints);
		generate("2. In mảng với dous ", dous);
		generate("2. In mảng với strs ", strs);

		System.out.println("========================\n");

		List<Integer> lints = List.of(1, 2, 3, 4, 5);
		List<Double> ldobs = List.of(1d, 2d, 3d, 4d, 5d);
		List<String> lstrs = List.of("a", "b", "c", "d", "e");
		List<Object> lobjs = List.of("a", 1, 2d, 3f, new Date());

		generate("3. In danh sách với ints", lints);
		generate("3. In danh sách với dobs", ldobs);
		generate("3. In danh sách với strs", lstrs);
		generate("3. In danh sách với objs", lobjs);

		// Integer, Double, String là con của Object
		// List<Integer>, List<Double>, List<String> không phải là con của List<Object>
		// ArrayList<Object>, LinkedList<Object> là con của List<Object>
	}

	private static <T> void generate(String prefix, List<T> elements) {
		System.out.println(prefix + " { ");
		for (T element : elements) {
			System.out.println("   - " + element);
		}
		System.out.println("}\n");
	}

	private static <Element> void generate(String prefix, Element[] elements) {
		System.out.println(prefix + " { ");
		for (Element element : elements) {
			System.out.println("   - " + element);
		}
		System.out.println("}\n");
	}

	private static void generateObjects(String prefix, Object[] objects) {
		System.out.println(prefix + " { ");
		for (Object o : objects) {
			System.out.println("  - " + o);
		}
		System.out.println("}\n");
	}

}
