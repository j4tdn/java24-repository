package view;

import java.util.Arrays;

import javax.lang.model.element.Element;

public class Ex01 {
	public static void main(String[] args) {
		int[] elements = { 1, 2, 3, 4, 3, 1 };
		
		System.out.println("Mảng ban đầu: " + Arrays.toString(elements));
		System.out.println("Mảng sau khi xóa các phần tử trùng lặp: " + Arrays.toString(removeDuplicateElement(elements)));
		
		System.out.println("\n========================================\n");
		
		System.out.println("Mảng ban đầu: " + Arrays.toString(elements));
		if (compare(elements) > 0) {
			System.out.println("Giá trị trung bình của N/2 phần tử đầu tiên lớn hơn N/2 phần tử cuối cùng");
		} else if (compare(elements) < 0) {
			System.out.println("Giá trị trung bình của N/2 phần tử cuối cùng lớn hơn N/2 phần tử đầu tiên");
		} else {
			System.out.println("Giá trị trung bình của N/2 phần tử cuối cùng bằng hơn N/2 phần tử đầu tiên");
		}
		System.out.println("\n========================================\n");
		System.out.println("Phần tử lớn thứ 3 là " + findKthLargest(new int[] { 7, 8, 8, 8, 6, 2, 5, 1 }, 3));

	}

	private static int findKthLargest(int[] elements, int k) {
		int[] arr = new int[k];
		int count = 0;
		for (int i = 0; i < k; i++) {
			int temp = 0;
			for (int element : elements) {
				if (temp < element && isSmallThanall(arr, element, count))
					temp = element;
			}
			arr[count++] = temp;
		}
		return arr[count-1];
	}

	private static boolean isSmallThanall(int[] arr, int element, int count) {
		for (int i = 0; i < count; i++) {
			if (element >= arr[i])
				return false;
		}
		return true;
	}

	private static int compare(int[] elements) {
		int start = 0, end = 0;

		for (int i = 0; i < elements.length; i++) {
			if (i < elements.length / 2) {
				start += elements[i];
			}
			if (i >= elements.length / 2) {
				end += elements[i];
			}
		}

		return (start / (elements.length / 2)) - (end / (elements.length / 2));

	}

	private static int[] removeDuplicateElement(int[] elements) {
		int count = 0;
		int[] source = Arrays.copyOf(elements, elements.length);
		for (int i = 0; i < elements.length; i++) {
			if (!isDup(source, source[i])) {
				elements[count++] = source[i];
			}
		}
		return Arrays.copyOfRange(elements, 0, count);
	}

	private static boolean isDup(int[] source, int n) {
		int count = 0;
		for (int element : source) {
			if (n == element) {
				count++;
			}
		}
		return count == 2;
	}
}
