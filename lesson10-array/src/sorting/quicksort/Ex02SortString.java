package sorting.quicksort;

import java.util.Arrays;

import common.SortDir;

public class Ex02SortString {
	
	
	//Arrays.sort(Object[] object)
	//Obj phải là Comparable or con của IComparable, use hàm compareTo to sort (mđ tăng)
	// nếu Obj kh phải Comparable or con Comparable, quăng excep
	// default: ko xử lý NPE
	
	// Arrays.sort(T[] a, Comparator<T> comparator)
	// T: generic type
	// Comparator<T>: functional interface, có hàm int compare(T o1, T o2) truyền vào sort
	
	public static void main(String[] args) {
		String[] elements = { "a1" , null ,"z2" ,"b3", "k4", null ,"c5" };
		
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
				return 1;
			}
			if (s2 == null) {
				return -1;
			}
			return s2.compareTo(s1);
		});
		
		System.out.println("\n3. Mảng sắp xếp giảm dần: " + Arrays.toString(elements));
		
	}
	
		
}
