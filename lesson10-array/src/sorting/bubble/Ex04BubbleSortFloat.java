package sorting.bubble;

import static utils.ArrayUtils.swap;

import java.util.Arrays;

import functional.FloatCompFunc;

public class Ex04BubbleSortFloat {
	
	public static void main(String[] args) {
		float[] elements = { 8f, 17.8f, 22.1f, 14.8f, 36.2f, 17.6f, 18f };

		System.out.println("1. Mảng ban đầu: " + Arrays.toString(elements));

		bubbleSort(elements, (e1, e2) -> {
			/*if (e1 > e2) {
				return 1;
			}
			return -1;*/
			// Lưu ý: không được ép kiểu (int)(e1-e2)
			return Float.compare(e1, e2);
		});

		System.out.println("\n2. Mảng sắp xếp tăng dần: " + Arrays.toString(elements));
	}
	
	private static void bubbleSort(float[] elements, FloatCompFunc fcf) {
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements.length - i - 1; j++) {
				if (fcf.compare(elements[j], elements[j+1]) > 0) {
					swap(elements, j, j + 1);
				}
			}
		}
	}
	
}
