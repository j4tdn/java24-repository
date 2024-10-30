package exercise;

import java.util.Arrays;
import java.util.Random;

public class Ex05 {
	public static void main(String[] args) {
	
		Random rd = new Random();
		int length = rd.nextInt(3,21);
		int[] arr = new
		int[length];
		int[] levelArr = new int[length];
		System.out.println("length of array: " + length);
		for (int i = 0; i < length; i++) { 
			arr[i] = rd.nextInt(1,30); 
		} 
		System.out.println("Array before sorting level: " + Arrays.toString(arr));
		for (int i = 0; i < length; i++) { 
			levelArr[i] = getLevelOfInteger(arr[i]); 
		}
		
		System.out.println("Array after sorting level: " + Arrays.toString(sortArray(arr, levelArr)));
		
	}
	
	public static int getLevelOfInteger(int n) {
		int count = 1;
		for (int i = n; i > 1; i--) {
			if (n % i == 0) {
				count++;
			}
		}
		return count;
	}
	
	public static int[] sortArray(int[] arr, int[] levelArr) {
		for (int i = 0; i < levelArr.length - 1; i++) {
			for (int j = 0; j < levelArr.length - 1; j++) {
				if (levelArr[j] > levelArr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
					
					int temp = levelArr[j];
					levelArr[j] = levelArr[j + 1];
					levelArr[j + 1] = temp;
				}
			}
		}
		return arr;
	}
}
