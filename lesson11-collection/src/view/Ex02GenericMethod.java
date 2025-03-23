package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex02GenericMethod {

	public static void main(String[] args) {

		// In ra mảng Integer, Double, String
		// In ra danh sách Integer, Double, String
		Integer[] ints = { 1, 2, 3, 4, 5 };
		Double[] dobs = { 1d, 2d, 3d, 4d, 5d };
		String[] strs = { "a", "b", "c", "d" };

		generateObjects("1. In mảng với ints)", ints);
		generateObjects("1. In mảng với dobs", dobs);
		generateObjects("1. In mảng với strs", strs);

		System.out.println("====================");

		generate("2. In mảng với ints", ints);
		generate("2. In mảng với dobs", dobs);
		//generate("2. In mảng với strs", strs);

		System.out.println("\n====================\n");

		// List<Integer> lints = List.of(1, 2, 3, 4, 5);
		ArrayList<Integer> lints = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

		List<Double> ldobs = List.of(1d, 2d, 3d, 4d, 5d);
		List<String> lstrs = List.of("a", "b", "c", "d", "e");

		//generate("3. In mảng với ints", lints);
		//generate("3. In mảng với dobs", ldobs);
		generate("3. In mảng với strs", lstrs);

		// Integer, Double, String là con của Object
		// List<Integer>, List<Double>, List<String> không phải là con của List<Object>
		// ArrayList<Object>, LinkedList<Object> mới là con của List<Object>
	}

	private static <T extends CharSequence> void generate(String prefix, List<T> elements) {
		System.out.println(prefix + " { ");
		for (Object element : elements) {
			System.out.println("  - " + element);
		}
		System.out.println("}\n");
	}

	private static <Element extends Number> void generate(String prefix, Element[] elements) {
		System.out.println(prefix + " { ");
		for (Element element : elements) {
			System.out.println("  - " + element);
		}
		System.out.println("}\n");
	}

	private static void generateObjects(String prefix, Object[] objects) {
		System.out.println(prefix + " { ");
		for (Object object : objects) {
			System.out.println("  - " + object);
		}
		System.out.println("}\n");
	}
}
