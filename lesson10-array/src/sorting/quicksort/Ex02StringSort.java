package sorting.quicksort;

import java.util.Arrays;

import common.SortDir;

public class Ex02StringSort {
	
	// Arrays.sort(Object[] object)
	// Object phải là Comparable hoặc là con của interface Comparable, sử dụng
	// compareTo để sắp xếp (Mặc định là tăng dần)
	// Nếu Object ko phải là Comparable haowjc con Comparable thì sẽ quăng exception
	// Mặc định: ko xử lý null
	
	// Arrays.sort(T[] a, Comparator<T> comparator)
	// T: kiểu generic type , cho phép truyền vào bất kỳ KDL đối tượng nào
	// Comparable<T>; functional interface, có hàm int compare{T o1, T o2) truyền vào sắp xếp
	// tăng/giảm dần
 	
	public static void main(String[] args) {

		String[] elements = { "a112", "43f", null, "df", "c7", "d8", "m7" };

		
		System.out.println("1. Mảng ban đầu: " + Arrays.toString(elements));
		
		Arrays.sort(elements,(s1,s2) -> {
				if(s1 ==null) {
					return -1;
				}
				if( s2 == null) {
					return 1;
				}
				return s1.compareTo(s2);
		});

		System.out.println("\n2. Mảng sắp xếp tăng dần: " + Arrays.toString(elements));
		
		Arrays.sort(elements,(s1,s2) -> {
			if(s1 ==null) {
				return -1;
			}
			if( s2 == null) {
				return 1;
			}
			return s2.compareTo(s1);
	});

		
		
		System.out.println("\n2. Mảng sắp xếp tăng dần: " + Arrays.toString(elements));
		

	}	
}
