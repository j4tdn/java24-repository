package sorting.bubble;

import java.util.Arrays;

import functional.IntComFunc;

public class Ex03BubbleSortInt {
	
	public static void main(String[] args) {

		int[] elements = { 8, 0, 17, 22, 14, 36, 3, 18 };

		System.out.println("1. Mảng ban đầu: " + Arrays.toString(elements));

		bubbleSort(elements, (e1,e2) -> {
			return e1 - e2;
		});

		System.out.println("\n2. Mảng sắp xếp tăng dần: " + Arrays.toString(elements));
		
		System.out.println("=======================");
		

		System.out.println("1. Mảng ban đầu: " + Arrays.toString(elements));

		bubbleSort(elements, (e1,e2) -> {
			return e2 - e1;
		});

		System.out.println("\n2. Mảng sắp xếp tăng dần: " + Arrays.toString(elements));
	}
	
	private static void bubbleSort(int[] elements, IntComFunc isf) {
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements.length - i - 1; j++) {
				if (isf.compare(elements[j], elements[j+1])> 0) {
					swap(elements, j, j + 1);
				}
			}
		}
	}
	
	//====================================================

	private static void bubbleSortAsc(int[] elements) {
		long start = System.nanoTime();
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements.length - i - 1; j++) {
				if (elements[j] > elements[j + 1]) {
					swap(elements, j, j + 1);
				}
			}
			System.out.println("log i = " + i + " >> " + Arrays.toString(elements));
		}
		long end = System.nanoTime();
		System.out.println("Thời gian xử lý: " + (end - start) + "ns");
	}
	

	private static void bubbleSortDesc(int[] elements) {
		long start = System.nanoTime();
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements.length - i - 1; j++) {
				if (elements[j] < elements[j + 1]) {
					swap(elements, j, j + 1);
				}
			}
			System.out.println("log i = " + i + " >> " + Arrays.toString(elements));
		}
		long end = System.nanoTime();
		System.out.println("Thời gian xử lý: " + (end - start) + "ns");
	}
	
	private static void swap(int[] elements, int left, int right) {
		int temp = elements[left];
		elements[left] = elements[right];
		elements[right] = temp;
	}

}
