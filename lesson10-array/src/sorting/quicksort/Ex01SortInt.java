package sorting.quicksort;

import java.util.Arrays;

import common.SortDir;
import utils.ArrayUtils;

public class Ex01SortInt {
	public static void main(String[] args) {
		int[] elements = {8, 0, 17, 22, 14, 36, 18};
		
		System.out.println("1. Mang ban dau:" + Arrays.toString(elements));
		
		sort(elements);
		
		System.out.println("\n2. Mang sap xep tang dan : " + Arrays.toString(elements));
		
		sort(elements, SortDir.DESC);
		
		System.out.println("\n3. Mang sap xep giam dan : " + Arrays.toString(elements));
		
		
		
	}
	
	private static void sort(int[] elements) {
		Arrays.sort(elements);
	}
	private static void sort(int[] elements, SortDir sortDir) {
		Arrays.sort(elements);
		if(sortDir == SortDir.DESC) {
			ArrayUtils.reverse(elements);
		}
	}
}
