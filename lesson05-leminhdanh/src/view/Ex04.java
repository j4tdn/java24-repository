package view;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		int[] n = {5,3,1,4,2};
		System.out.println(Arrays.toString(getUniqueNumbers(n)));
	}
	public static int[] getUniqueNumbers(int[] numbers) {
		int[] result = new int[numbers.length];
		int n = 0;
		for(int number:numbers) {
			if(!isDuplicate(number, numbers)) {
				result[n] = number;
				n++;
			}
			
		}
		result = Arrays.copyOfRange(result, 0, n);
		arrangeNumber(result);
		return result;
	}
	public static boolean isDuplicate(int n, int[] numbers) {
		
		int count = 0;
		for(int number:numbers) {
			
			if(n == number) {
				count++;
			}	
		}
		
		return count > 1;
	}
	public static int[] arrangeNumber(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
}
