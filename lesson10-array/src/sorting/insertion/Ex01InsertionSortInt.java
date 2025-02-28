package sorting.insertion;

import java.util.Arrays;

import functional.sorting.IntCompFunc;
import utils.ArrayUtils;

import static utils.ArrayUtils.*;

public class Ex01InsertionSortInt {

	public static void main(String[] args) {

		int[] elements = { 8, 0, 17, 22, 14, 36, 3, 18 };

		System.out.println("1. Mảng ban đầu: " + Arrays.toString(elements));

		insertionSort(elements, (e1, e2) -> {
			return e1 - e2;
		});

		System.out.println("\n2. Mảng sắp xếp tăng dần: " + Arrays.toString(elements));

		insertionSort(elements, (e1, e2) -> {
			return e2 - e1;
		});

		System.out.println("\n3. Mảng sắp xếp giảm dần: " + Arrays.toString(elements));
	}
	
	private static void insertionSort(int[] elements, IntCompFunc isf) {
		for (int i = 1; i < elements.length; i++) {
			for (int j = 0; j < i; j++) {
				if (isf.compare(elements[j], elements[i]) > 0) {
					ArrayUtils.swap(elements, j, i);
				}
			}
		}
	}
}
