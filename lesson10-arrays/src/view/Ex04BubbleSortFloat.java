package view;

import java.util.Arrays;

import functional.FloatCompFunc;

public class Ex04BubbleSortFloat {
	public static void main(String[] args) {

		float[] elements = { 8, 17.6f, 17.2f, 22.1f, 14.8f, 36.2f, 17.6f, 18f };
		
		bubbleSort(elements, (e1,e2)-> {
			if (e1 - e2 > 0) {
				return 1;
			}
			return -1;
		});
		System.out.println(Arrays.toString(elements));
	}
	private static void bubbleSort(float[] elements, FloatCompFunc fo) {
		for (int i = 0 ; i < elements.length; i++) {
			for (int j = 0; j < elements.length -1-i ; j++) {
				if (fo.compare(elements[j], elements[j+1]) > 0) {
					utils.ArrayUtils.swap(elements, j, j+1);
				}
			}
		}
	}

}
