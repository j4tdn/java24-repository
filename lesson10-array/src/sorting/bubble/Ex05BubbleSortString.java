
package sorting.bubble;

import static utils.ArrayUtils.*;

import java.util.Arrays;

import functional.sorting.StringCompFunc;

public class Ex05BubbleSortString {

	public static void main(String[] args) {
		String[] elements = { null, "tt", "A12", null, null, "", "Z", "k7181", "z2", null, "w7", "-", "mat81", null };
		
		System.out.printf("1. Mảng ban đầu %s\n\n", Arrays.toString(elements));
		bubbleSort(elements, (s1, s2) -> {
			// B1: Xử lý cho những phần tử mang giá trị null
			if (s1 == null) {
				return -1;
			}
			
			if (s2 == null) {
				return 1;
			}
			// B2: Sắp xếp cho các cặp phần tử liền kề khác null
			return s1.compareTo(s2);
		});
		
		System.out.printf("2. Mảng sắp xếp tăng dần(null first) %s\n\n", 
				Arrays.toString(elements));
		bubbleSort(elements, (s1, s2) -> {
			// B1: Xử lý cho những phần tử mang giá trị null
			if (s1 == null & s2 != null) {
				return 1;
			}
			
			if (s2 == null) {
				return -1;
			}
			// B2: Sắp xếp cho các cặp phần tử liền kề khác null
			return s1.compareTo(s2);
		});
		
		System.out.printf("3. Mảng sắp xếp tăng dần(null last) %s\n\n", 
				Arrays.toString(elements));
		
		bubbleSort(elements, (s1, s2) -> {
			// B1: Xử lý cho những phần tử mang giá trị null
			if (s1 == null) {
				return -1;
			}
			
			if (s2 == null) {
				return 1;
			}
			// B2: Sắp xếp cho các cặp phần tử liền kề khác null
			return s2.compareTo(s1);
		});
		
		System.out.printf("4. Mảng sắp xếp giảm dần(null first) %s\n\n", 
				Arrays.toString(elements));
		// Giảm dần, null last
	}

	// Sẽ swap(s1, s2) nếu compare(s1, s2) > 0
	// Sắp xếp tăng dần, nếu s1 > s2 -> swap -> compare trả về số > 0 khi s1 > s2
	
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
