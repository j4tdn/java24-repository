package sorting.bubble;

import java.util.Arrays;

import functional.IntCompFunc;

import static utils.ArrayUtils.*;

public class Ex03BubbleSortInt {

	public static void main(String[] args) {

		int[] elements = { 8, 0, 17, 22, 14, 36, 3, 18 };

		System.out.println("1. Mảng ban đầu: " + Arrays.toString(elements));

		bubbleSort(elements, (e1, e2) -> {
			/*if (e1 > e2) {
				return 1;
			}
			return -1;*/
			return e1 - e2;
		});

		System.out.println("\n2. Mảng sắp xếp tăng dần: " + Arrays.toString(elements));

		bubbleSort(elements, (e1, e2) -> {
			/*if (e1 < e2) {
				return 1;
			}
			return -1;*/
			return e2 - e1;
		});

		System.out.println("\n3. Mảng sắp xếp giảm dần: " + Arrays.toString(elements));
	}
	
	// elements[j] > elements[j + 1] --> elements[j] - elements[j+1] > 0
	// elements[j] < elements[j + 1] --> elements[j+1] - elements[j] > 0
	
	private static void bubbleSort(int[] elements, IntCompFunc isf) {
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements.length - i - 1; j++) {
				if (isf.compare(elements[j], elements[j+1]) > 0) {
					swap(elements, j, j + 1);
				}
			}
		}
	}
}