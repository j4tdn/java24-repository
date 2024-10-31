package exercise;

import java.util.Arrays;
import java.util.Random;

public class Ex05 {
public static void main(String[] args) {
		
		Random rd = new Random();
		int length = rd.nextInt(3,21);
		int[] arr = new int[length];
		System.out.println("length of array: " + length);
		for (int i = 0; i < length; i++) { 
			arr[i] = rd.nextInt(1,30); 
		} 
		System.out.println("Array before sorting level: " + Arrays.toString(arr));
		for( int i = 0; i < length - 1; i++) {
			for (int j = 1; j < length; j++) { 
				if (getLevelOfInteger(arr[j - 1]) > getLevelOfInteger(arr[j])) {
					int tmp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println("Array after: " + Arrays.toString(arr));
		
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
}
