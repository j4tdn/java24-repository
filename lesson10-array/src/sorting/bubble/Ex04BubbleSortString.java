package sorting.bubble;

import static utils.ArrayUtils.*;

import java.util.Arrays;

import functional.StringCompFunc;

public class Ex04BubbleSortString {
	public static void main(String[] args) {
		String[] elements = { "tt", null, "A12", null, "Z", "k7181", null, "-", "mat81" };

		System.out.printf("1. Mang ban dau %s\n\n", Arrays.toString(elements));

		bubbleSort(elements, (s1, s2) -> {
			if (s1 == null) {
				return -1;
			}
			if (s2 == null) {
				return 1;
			}
			return s1.compareTo(s2);
		});
		
		System.out.printf("2. Mang sap xep tang dan(null first) %s\n\n", Arrays.toString(elements));

		bubbleSort(elements, (s1, s2) -> {
			if (s2 == null) {
				return -1;
			}
			if (s1 == null) {
				return 1;
			}
			return s1.compareTo(s2);
		});
		System.out.printf("2. Mang sap xep tang dan(null last) %s\n\n", Arrays.toString(elements));
		bubbleSort(elements, (s1, s2) -> {
			if (s1 == null) {
				return -1;
			}
			if (s2 == null) {
				return 1;
			}
			return s2.compareTo(s1);
		});
		System.out.printf("2. Mang sap xep giam dan(null first) %s\n\n", Arrays.toString(elements));
		bubbleSort(elements, (s1, s2) -> {
			if (s2 == null) {
				return -1;
			}
			if (s1 == null) {
				return 1;
			}
			return s2.compareTo(s1);
		});
		System.out.printf("2. Mang sap xep giam dan(null last) %s\n\n", Arrays.toString(elements));

		
	}

	private static void bubbleSort(String[] elements, StringCompFunc scf) {
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements.length - i - 1; j++) {
				if (scf.compare(elements[j], elements[j + 1]) > 0) {
					swap(elements, j, j + 1);
				}
			}
		}
	}
}
