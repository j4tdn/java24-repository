package sorting.insertion;

import static utils.ArrayUtils.swap;

import java.util.Arrays;

import functional.sorting.IntCompFunc;
public class Ex01InsertionSortInt {

	public static void main(String[] args) {
		
		int[] elements = { 8, 2, 17, 22, 14, 36, 3, 18 };

		System.out.println("Mảng ban đầu: " + Arrays.toString(elements));

		insertionSort(elements, (e1, e2) -> e1-e2);
		
		System.out.println("\nMảng sắp xếp tăng dần: " + Arrays.toString(elements));
		insertionSort(elements, (e1,e2) -> e2-e1);
		
		System.out.println("\nMảng sắp xếp giảm dần: " + Arrays.toString(elements));
	}
	private static void insertionSort (int[] elements, IntCompFunc icf) {
		for (int i = 1; i < elements.length; i++) {
			for (int j = 0; j < i; j++) {
				if (icf.compare(elements[j], elements[i]) > 0) {
					swap(elements, j, i);
				}
			}
		}
	}

}
	