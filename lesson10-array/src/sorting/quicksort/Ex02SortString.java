package sorting.quicksort;

import java.util.Arrays;

public class Ex02SortString {
	public static void main(String[] args) {
		
		/*
		 * Array.sort(Object[] object)
		 * Object phải là Comparable hoặc là con Comparable interface, sử dụng hàm compareTo để sắp xếp(mđ là tăng dần)
		 * Nếu Object không phỉa là Comparable 
		 * 
		 */
		
	
		String[] elements = {"tt", "A12", "Z", "k7181", "-", "mat81"};

		System.out.println("1. Mảng ban đầu: " + Arrays.toString(elements));

			

		System.out.println("\n2. Mảng sắp xếp tăng dần: " + Arrays.toString(elements));
	}
}
