package view;

import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Ex05GenericWildCard {
	
	public static void main(String[] args) {
		List<Integer> lints = List.of(1, 2, 3, 4, 5);
		List<Double> ldobs = List.of(1d, 2d, 3d, 4d, 5d);
		List<String> lstrs = List.of("a", "b", "c", "d", "e");
		List<Object> lobjs = List.of("a", 1, 2d, 3f, new Date());
		
		generate("3. In danh sách với ints", lints);
		// generate("3. In danh sách với dobs", ldobs);
		// generate("3. In danh sách với strs", lstrs);
		generate("3. In danh sách với objs", lobjs);
	}
	
	private static <T extends Comparable<? super T>> void sort(List<T> list) {
		Collections.sort(list);
	}
	
	private static void generate(String prefix, List<? super Integer> elements) {
		System.out.println(prefix + " { ");
		for (Object element: elements) {
			System.out.println("   - " + element);
		}
		System.out.println("}\n");
	}
	
}
