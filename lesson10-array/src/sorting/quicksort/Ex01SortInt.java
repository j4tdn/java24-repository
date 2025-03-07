package sorting.quicksort;

import java.util.Arrays;

import common.SortDir;
import utils.ArrayUtils;

public class Ex01SortInt {
	
	public static void main(String[] args) {
		
		// Với mảng KDL nguyên thủy
		// Java chỉ hỗ trợ sắp xếp tăng dần, muốn giảm dần phải tự viết hàm reverse
		
		int[] elements = { 8, 0, 17, 22, 14, 36, 3, 18 };

		System.out.println("1. Mảng ban đầu: " + Arrays.toString(elements));

		sort(elements);

		System.out.println("\n2. Mảng sắp xếp tăng dần: " + Arrays.toString(elements));

		sort(elements, SortDir.DESC);

		System.out.println("\n3. Mảng sắp xếp giảm dần: " + Arrays.toString(elements));
	}
	
	private static void sort(int[] elements) {
		Arrays.sort(elements);
	}
	
	private static void sort(int[] elements, SortDir sortDir) {
		Arrays.sort(elements);

		if (sortDir == SortDir.DESC) {
			ArrayUtils.reverse(elements);
		}
	}
	
}