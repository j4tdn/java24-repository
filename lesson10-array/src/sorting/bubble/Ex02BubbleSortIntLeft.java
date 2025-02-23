package sorting.bubble;

import java.util.Arrays;

public class Ex02BubbleSortIntLeft {

	public static void main(String[] args) {
		int[] elements = { 8, 0, 17, 22, 14, 36, 3, 18 };

		System.out.println("1. Mảng ban đầu: " + Arrays.toString(elements));

		bubbleSortAsc(elements);

		System.out.println("\n2. Mảng sắp xếp tăng dần: " + Arrays.toString(elements));
	}

	// Sắp xếp tăng dần
	// Sau mỗi lần lặp, cho phần tử nhỏ nhất nằm bên trái
	private static void bubbleSortAsc(int[] elements) {
		for (int i = 0; i < elements.length; i++) {
			for (int j = elements.length - 1; j > i; j--) {
				if (elements[j-1] > elements[j]) {
					swap(elements, j-1, j);
				}
			}
		}
	}
	
	private static void swap(int[] elements, int left, int right) {
		int temp = elements[left];
		elements[left] = elements[right];
		elements[right] = temp;
	}

}