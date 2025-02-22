package sorting.bubble;

import java.util.Arrays;

public class Ex02BubbleSortIntRight {
	
	public static void main(String[] args) {
		
		int[] elements = { 8, 2, 17, 22, 14, 36, 3, 18 };
	
		System.out.println("Mảng ban đầu: "+ Arrays.toString(elements));
		bubbleSortDec(elements);
		System.out.println("\nMảng sắp xếp giảm dần: "+ Arrays.toString(elements));
		
	}
	//ascending
	//decending
	
	
	
	//Mặc định tăng dần
	//Sau mỗi lần lặp, phần tử lớn nhất nằm bên phải
	
	private static void bubbleSortDec(int[] elements) {
		for (int i =0 ; i < elements.length; i++) {
			
			for (int j =0; j < elements.length -i-1; j++) {
				if (elements[j] < elements[j+1]	) {
					swap(elements, j, j+1);
				}
				System.out.println("log i = "+ i + " >> "+ Arrays.toString(elements));
			}
		}
	}
	private static void swap (int[] elements, int left, int right) {
		int temp = elements[left];
		elements[left] = elements[right];
		elements[right] = temp;
		
	}

}
