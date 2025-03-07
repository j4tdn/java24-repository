package sorting.quicksort;

import java.util.Arrays;

public class Ex02SortString {
	
	public static void main(String[] args) {
		
		// Arrays.sort(Object[] object)
		// Object phải là Comparable hoặc con của Comparable interface, sử dụng hàm compareTo để sắp xếp(mđ là tăng dần)
		// Nếu Object ko phải là Comparable hoặc con Compareble, quăng exception
		// Mặc định: không xử lý NPE
		
		// Arrays.sort(T[] a, Comparator<T> comparator)
		// T: kiểu generic type, cho phép truyền vào bất kỳ KDL đối tượng nào
		// Comparator<T>: functional interface, có hàm int compare(T o1, T o2) truyền vào sắp xếp tăng/giảm dần

		String[] elements = { "a1", "z2", null, "b3", "k4", null, "c5" };

		System.out.println("1. Mảng ban đầu: " + Arrays.toString(elements));

		Arrays.sort(elements, (s1, s2) -> {
			if (s1 == null) {
				return -1;
			}
			if (s2 == null) {
				return 1;
			}
			return s1.compareTo(s2);
		});

		System.out.println("\n2. Mảng sắp xếp tăng dần: " + Arrays.toString(elements));

		Arrays.sort(elements, (s1, s2) -> {
			if (s1 == null) {
				return -1;
			}
			if (s2 == null) {
				return 1;
			}
			return s2.compareTo(s1);
		});

		System.out.println("\n3. Mảng sắp xếp giảm dần: " + Arrays.toString(elements));
	}
	
}