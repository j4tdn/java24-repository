package ideaclass_exercises;

import java.util.Arrays;
import java.util.Random;

public class Ex10Random {
	
	private static Random rd = new Random();
	
	public static void main(String[] args) {
		int[] numbers = generateRandomNumbers(5, 20, 25);
		System.out.println("numbers --> " + Arrays.toString(numbers));
	}
	
	private static int[] generateRandomNumbers(int length, int minInclusive, int MaxExclusive) {
		if(length > MaxExclusive - minInclusive) {
			System.out.println(">> Yêu cầu không hợp lệ ...");
			return new int[] {};
		}
		
		int[] numbers = new int[length];
		int i = 0;
		while(i < numbers.length) {
			int newVal = rd.nextInt(minInclusive, MaxExclusive);
			
			if(!isExist(numbers, i, newVal)) {
				numbers[i] = newVal;
				i++;
			}
		}
		return numbers;
	}
	
	private static boolean isExist(int[] numbers, int pos, int newVal) {
		for (int i = 0; i < pos; i++) {
			if (numbers[i] == newVal) {
				return true;
			}
		}
		return false;
	}
}
