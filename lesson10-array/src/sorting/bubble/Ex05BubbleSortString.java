package sorting.bubble;

import static utils.ArrayUtils.*;

import java.util.Arrays;

import functional.sorting.StringCompFunc;

public class Ex05BubbleSortString {
	
	public static void main(String[] args) {
		String[] elements = {"tt", "A12", "Z", "k7181", "-", "mat81"};
		System.out.println("1. Mang ban dau: \n" + Arrays.toString(elements));
		
		bubbleSort(elements, (s1, s2) -> {
			if (s1 == null)
				return -1;
			if (s2 == null)
				return 1;
			return s1.compareTo(s2);
		});
		
		System.out.println("2. Mang sap xep tang dan(null first): \n" + Arrays.toString(elements));
		
		
		bubbleSort(elements, (s1, s2) -> {
			if (s1 == null && s2 != null)
				return 1;
			if (s2 == null)
				return -1;
			return s1.compareTo(s2);
		});
		
		System.out.println("2. Mang sap xep tang dan(null last): \n" + Arrays.toString(elements));
		
		
		bubbleSort(elements, (s1, s2) -> {
			if (s1 == null)
				return -1;
			if (s2 == null)
				return 1;
			return s2.compareTo(s1);
		});
		
		System.out.println("2. Mang sap xep giam dan(null fist): \n" + Arrays.toString(elements));
		
		
		bubbleSort(elements, (s1, s2) -> {
			if (s1 == null && s2 != null)
				return 1;
			if (s2 == null)
				return -1;
			return s2.compareTo(s1);
		});
		
		System.out.println("2. Mang sap xep giam dan(null last): \n" + Arrays.toString(elements));
	}
	
	private static void bubbleSort(String[] elements, StringCompFunc scf) {
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements.length - i - 1; i++) {
				if (scf.compare(elements[j], elements[j+1]) > 0) {
					swap(elements, j, j + 1);
				}
			}
		}
	}
	
}
