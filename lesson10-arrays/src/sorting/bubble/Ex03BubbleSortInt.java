package sorting.bubble;

import java.util.Arrays;

import functional.IntCompFunc;
import utils.ArrayUtils;
public class Ex03BubbleSortInt {

	public static void main(String[] args) {
		
		int[] elements = { 8, 2, 17, 22, 14, 36, 3, 18 };

		System.out.println("Mảng ban đầu: " + Arrays.toString(elements));

		bubbleSort(elements, (e1, e2) -> e1-e2);
		
		System.out.println("\nMảng sắp xếp tăng dần: " + Arrays.toString(elements));
		bubbleSort(elements, (e1,e2) -> e2-e1);
		
		System.out.println("\nMảng sắp xếp giảm dần: " + Arrays.toString(elements));
	}
	private static void bubbleSortDec(int[] elements) {
		for (int i =0 ; i < elements.length; i++) {
			
			for (int j =0; j < elements.length -i-1; j++) {
				if (elements[j] < elements[j+1]	) {
					ArrayUtils.swap(elements, j, j+1); 
				}
			}
		}
	}
	private static void bubbleSortAsc(int[] elements) {
		for (int i = 0 ; i < elements.length; i++) {
			for (int j = elements.length - 1; j > i-1 +1 ; j--) {
				if (elements[j-1] > elements[j]) {
					ArrayUtils.swap(elements, j-1, j);
				}
			}
		}
	}
	private static void bubbleSort(int[] elements, IntCompFunc so) {
		for (int i = 0 ; i < elements.length; i++) {
			for (int j = 0; j < elements.length -1-i ; j++) {
				if (so.checking(elements[j], elements[j+1]) > 0) {
					utils.ArrayUtils.swap(elements, j, j+1);
				}
			}
		}
	}
}
