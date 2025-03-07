package sorting.quicksort;

import static utils.ArrayUtils.revert;

import java.util.Arrays;

import common.SortDir;

public class Ex01SortInt {
	
	 public static void main(String[] args) {
		
		 int[] elements = { 8, 2, 17, 22, 14, 36, 3, 18 };

		 // Với mảng KDL nguyên thủy, JAVA chỉ hỗ trợ sắp xếp tăng dần, muốn giảm dần phải tự viết hàm revert
			System.out.println("Mảng ban đầu: " + Arrays.toString(elements));

			sort(elements);
			
			System.out.println("\nMảng sắp xếp tăng dần: " + Arrays.toString(elements));
			
			sort(elements, SortDir.DSC);
			
			System.out.println("\nMảng sắp xếp giảm dần: " + Arrays.toString(elements));
			
	}

	private static void sort(int[] elements, SortDir sortDir) {
		 if (sortDir == sortDir.DSC) {
			 revert(elements);}
		 }

	private static void sort(int[] elements) {
		Arrays.sort(elements);
		 
	 }

}
