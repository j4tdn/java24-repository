package utils;

import java.util.Arrays;

public class UtilsEx01 {

	public static int[] removeDuplicate(int[] elements) {
		int[] target = new int[elements.length];

		int count = 0;

		for (int i = 0; i < elements.length; i++) {
			boolean isDuplicate = false;

			for (int j = 0; j < i; j++) {

				if (elements[i] == elements[j]) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				target[count] = elements[i];
				count++;
			}
		}

		return Arrays.copyOfRange(target, 0, count);
	}

	public static double averageOf(int... elements) {
		int sum = 0;
		for (int element : elements) {
			sum = sum + element;
		}

		return (double) sum / elements.length;
	}

	public static void bubbleSort(int[] source) {
		for (int i = 0; i < source.length; i++) {
			for (int j = 0; j < source.length - i - 1; j++) {
				if (source[j] > source[j + 1]) {
					swap(source, j, j + 1);
				}
			}
		}

	}

	public static void swap(int[]elements, int left, int right) {
		int temp = elements[left];
		elements[left] = elements[right];
		elements[right] = temp;
	}

}
