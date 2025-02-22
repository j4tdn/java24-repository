package sorting.bubble;

import java.util.Arrays;

import static utill.ArrayUtils.*;

public class Ex03BubbleSortInt {
	
	public static void main(String[] args) {
		int[] elements = {8,0,17,22,14,36,3,18};
		System.out.println("1. Mảng ban đầu : " + Arrays.toString(elements));
		bubbleSortAsc(elements);
		System.out.println("\n2. Mảng sắp xếp tăng dần : " + Arrays.toString(elements));
		bubbleSortDesc(elements);
		System.out.println("\n3. Mảng sắp xếp giảm dần : " + Arrays.toString(elements));
	}
	// Mặc định tăng dần
		// Sau mỗi lần lặp, phần tử lướn nhất nằm bên phải
		private static void bubbleSortAsc(int[] elements) {
			for(int i=0;i<elements.length;i++) {
				for(int j=0;j<elements.length - i - 1;j++) {
					if(elements[j] > elements[j+1]) {
						swap(elements, j, j+1);
					}
				}
			}
		}
		// mặc định tăng dần
		// sau mỗi lần lặp, phần tử nhỏ nhất nằm bên phải
		private static void bubbleSortDesc(int[] elements) {
			for(int i=0;i<elements.length;i++) {
				for(int j=0;j<elements.length - i - 1;j++) {
					if(elements[j] > elements[j+1]) {
						swap(elements, j, j+1);
					}
				}
			}
		}
}
