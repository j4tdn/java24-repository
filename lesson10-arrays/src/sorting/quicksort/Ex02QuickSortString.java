package sorting.quicksort;

import static utils.ArrayUtils.swap;

import java.util.Arrays;

import functional.sorting.StringCompFunc;
public class Ex02QuickSortString {

	public static void main(String[] args) {
		
		//Arrays.sort(Object[] object)
		//Object phải là comparable hoặc là con của comparable interface, sử dụng hàm compareTo để sắp xếp tăng dần
		// Nếu object ko phải là comparable hoặc con của nó thì quăng Exception
		// => mặc định ko xử lí null pointer exception
		
		//Arrays.sort(T[] a, Comparator <T> comparator)
		//Kiểu generic type, cho phép truyền vào bất kỳ KDL đối tượng nào
		// Comparator<T>: functional interface, có hàm compare(T o1, T o2) truyền vào sắp xếp tăng or giảm dần
		
		
		String[] elements = { "a1", "z2", "b3", "k4", "c5" };

		System.out.println("Mảng ban đầu: " + Arrays.toString(elements));

		Arrays.sort(elements, (s1, s2) -> {
			if (s1 == null) {
				return -1;
			}
			if (s2 == null) {
				return 1;
			}
			return s2.compareTo(s1);
		});
		System.out.println("\nMảng sắp xếp tăng dần: " + Arrays.toString(elements));
		
		
		System.out.println("\nMảng sắp xếp giảm dần: " + Arrays.toString(elements));
	}
	private static void insertionSort (String[] elements, StringCompFunc scf) {
		for (int i = 1; i < elements.length; i++) {
			for (int j = 0; j < i; j++) {
				if (scf.compare(elements[j], elements[i]) > 0) {
					swap(elements, j, i);
				}
			}
		}
	}

}
	