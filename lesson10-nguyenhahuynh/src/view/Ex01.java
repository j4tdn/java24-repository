package view;

import java.util.Arrays;
import java.util.Random;

public class Ex01 {

	private static Random rd = new Random();
	
	public static void main(String[] args) {
		
		int[] elements = randomElements(10);
		
		System.out.println("Mảng ban đầu: " + Arrays.toString(elements));

		System.out.println("Loại bỏ phần tử trùng nhau: " + Arrays.toString(uniqueElements(elements)));
		
		compareAverage(elements);
		
	}

	private static int[] randomElements(int length) {
		int[] elements = new int[length];
		for (int i = 0; i < length; i++) {
			elements[i] = rd.nextInt(10, 51);
		}
		return elements;
	}
	
	private static int[] removeElement(int[] elements, int pos) {
		int[] newArray = Arrays.copyOfRange(elements, 0, elements.length);
		for (int i = pos; i < elements.length-1; i++) {
			newArray[i] = newArray[i+1];
		}
		return Arrays.copyOfRange(newArray, 0, newArray.length-1);
	}
	
	private static int[] uniqueElements(int[] elements) {
		for (int i = 0; i < elements.length - 1; i++) {
			for (int j = i + 1; j < elements.length; j++) {
				if (elements[i] == elements[j]) {
					elements = removeElement(elements, j);
					elements = removeElement(elements, i);			
				}
			}
		}
		return elements;
	}
	
	private static void compareAverage(int[] elements) {
		int n = elements.length;
		int mid = n / 2;
		double sumFirst = 0, sumLast = 0;
		
		for (int i = 0; i < mid; i++) {
			sumFirst += elements[i];
		}
		for (int i = n - mid; i < n; i++) {
			sumLast += elements[i];
		}
		
		double avgFirst = sumFirst / mid;
		double avgLast = sumLast / mid;

		System.out.println("Giá trị trung bình của n/2 phần tử đầu tiên " + avgFirst);
		System.out.println("Giá trị trung bình của n/2 phần tử cuối cùng " + avgLast);
		System.out.println(avgFirst > avgLast ? "n/2 phần tử đầu tiên có giá trị lớn hơn" : "n/2 phần tử cuối cùng có giá trị lớn hơn");
	}
}
