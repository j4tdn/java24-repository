package sorting.quicksort;

import java.util.Arrays;

import common.SortDir;
import utils.ArrayUtils;

public class Ex01SortInt {

	public static void main(String[] args) {

		int[] elements = { 8, 0, 17, 22, 14, 36, 3, 18 };
		
		System.out.println("1. Mảng ban đầu: " + Arrays.toString(elements));
		
		sort(elements);
		
		System.out.println("\n2. Mảng sắp xếp tăng dần: " + Arrays.toString(elements));
		
		sort(elements, SortDir.DESC);
		
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
