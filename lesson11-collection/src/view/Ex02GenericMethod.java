package view;

import java.util.List;

public class Ex02GenericMethod {

	public static void main(String[] args) {
		
		// In ra mảng  Integer, double, String
		// In ra danh sách Integer, double, String
		
		Integer[] ints = {1,2,3,4,5};
		Double[] doubs = {1d,2d,3d,4d,5d};
		String[] strs = {"a","b","c","d","e"};
		
		generateObjects("1. In mảng với object", ints);
		generateObjects("1. In mảng với object", doubs);
		generateObjects("1. In mảng với object", strs);
		
		System.out.println("\n=================\n");
		
		generate("2. In mảng với generic", ints);
		generate("2. In mảng với generic", doubs);
		// generate("2. In mảng với generic", strs);
		
		System.out.println("\n=================\n");
		

		List<Integer> lints = List.of(1,2,3,4,5);
		List<Double> ldoubs = List.of(1d,2d,3d,4d,5d);
		List<String> lstrs = List.of("a","b","c","d","e");
		
		// generate("3. In ds với ints", lints);
		// generate("3. In ds với doubs", ldoubs);
		generate("3. In ds với strs", lstrs);
		
		// Integer, Double, String là con của Object		
		// List<Integer>, List<Double>, List<String> thì ko phải là con của List<Object> vì Object chỉ là tham số truyền vào
		// -> truyền vào một List<Object> thì mới hợp lệ
		// ArrayList<> hay LinkedList<> mới là con của List
	}
	private static <E extends Number> void generate(String prefix , E[] input) {
		System.out.println(prefix+ " {");
		for (E element:input) {
			System.out.println("-  "+ element);
		}
		System.out.println("}\n");
	}
	
	private static <T extends CharSequence> void generate(String prefix , List<T> input) {
		System.out.println(prefix+ " {");
		for (T element:input) {
			System.out.println("-  "+ element);
		}
		System.out.println("}\n");
	}
	private static void generateObjects(String prefix, Object[] objects) {
		System.out.println(prefix + " {");
		for (Object element: objects) {
			System.out.println("- "+ element);
		}
		System.out.println("}\n");
	}
}
