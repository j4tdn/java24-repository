package sorting.insertion;

import java.util.Arrays;

import functional.sorting.StringCompFunc;
import utils.ArrayUtils;


public class Ex02InsertionSortString {

	public static void main(String[] args) {

		String[] elements = { "a1", "z2", "b3", "k4", "c5" };

		System.out.println("1. Mảng ban đầu: " + Arrays.toString(elements));

		insertionSort(elements, (e1, e2) -> {
			return e1.compareTo(e2);
		});

		System.out.println("\n2. Mảng sắp xếp tăng dần: " + Arrays.toString(elements));

		insertionSort(elements, (e1, e2) -> {
			return e2.compareTo(e1);
		});

		System.out.println("\n3. Mảng sắp xếp giảm dần: " + Arrays.toString(elements));
	}
	
	private static void insertionSort(String[] elements, StringCompFunc scf) {
		for (int i = 1; i < elements.length; i++) {
			for (int j = 0; j < i; j++) {
				if (scf.compare(elements[j], elements[i]) > 0) {
					ArrayUtils.swap(elements, j, i);
				}
			}
		}
	}
}