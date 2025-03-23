package sorting.selection;

import java.util.Arrays;

import functional.sorting.IntCompFunc;

import static utils.ArrayUtils.*;

public class Ex01SelectionSortInt {

	public static void main(String[] args) {

		int[] elements = { 8, 0, 17, 22, 14, 36, 3, 18 };

		System.out.println("1. Mảng ban đầu: " + Arrays.toString(elements));

		selectionSort(elements, (e1, e2) -> {
			return e1 - e2;
		});

		System.out.println("\n2. Mảng sắp xếp tăng dần: " + Arrays.toString(elements));

//		selectionSort(elements, (e1, e2) -> {
//			return e2 - e1;
//		});
//
//		System.out.println("\n3. Mảng sắp xếp giảm dần: " + Arrays.toString(elements));
	}
	
	private static void selectionSort(int[] elements, IntCompFunc isf) {
		for (int i = elements.length-1; i > 0; i--) {
			int maxIndex = -1;
			int max = Integer.MIN_VALUE;
			for (int j = 0; j < i; j++) {
				if (elements[j] > elements[i] && elements[j] > max) {
					maxIndex = j;
					max = elements[j];
				}
			}
			if (maxIndex != -1) {
				swap(elements, maxIndex, i);
			}
		}
	}
}