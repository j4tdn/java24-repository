package sorting.selection;

import static utils.ArrayUtils.swap;

import java.util.Arrays;

import functional.sorting.IntCompFunc;
import utils.ArrayUtils;
public class Ex01SelectionSortInt {

	public static void main(String[] args) {
		
		int[] elements = { 8, 2, 17, 22, 14, 36, 3, 18 };

		System.out.println("Mảng ban đầu: " + Arrays.toString(elements));

		selectionSort(elements, (e1, e2) -> e1-e2);
		
		System.out.println("\nMảng sắp xếp tăng dần: " + Arrays.toString(elements));
		selectionSort(elements, (e1,e2) -> e2-e1);
		
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
	private static void selectionSort(int[] elements, IntCompFunc icf) {
		for (int i = elements.length-1;i> 0 ; i--) {
			 int maxIndex = -1;
			 int max = Integer.MIN_VALUE;
			for (int j = 0; j < i ; j++) {
				if (elements[j] > elements[i] && elements[j] > max) {
					maxIndex = j;
					max = elements[j];
					
				}
				if ( maxIndex != -1 ) {
					swap(elements, maxIndex, i);
				}
			}
		}
	}
}
