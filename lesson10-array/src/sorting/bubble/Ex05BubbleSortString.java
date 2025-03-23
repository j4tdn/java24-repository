package sorting.bubble;

import java.util.Arrays;

public class Ex05BubbleSortString {

	public static void main(String[] args) {
		String[] elements = {"tt", "A12", "Z", "k7181", "-", "mat81"};
		
		System.out.printf("1. Mảng ban đầu %s\n\n" + Arrays.toString(elements));
		
		bubbleSort(elements, (s1, s2) -> {
			return s1.compareTo(s2);
		});
		
		System.out.printf("2. Mảng sắp xếp tăng dần %s\n\n", Arrays.toString(elements) );
	}
	
	private static void bubbleSort(String[] elements, StringCompFunc scf) {
		for (int i=0; i < elements.length; i++) {
			for (int j=0; j < elements.length - i -1; j++) {
				if (scf.compare(elemtents[j], elements[j + 1]) > 0) {
					 swap(elemtents, j, j+1);
				}
			}
		}
		
	}
}
