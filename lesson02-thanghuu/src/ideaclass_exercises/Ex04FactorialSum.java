package ideaclass_exercises;

import java.util.Arrays;
import java.util.Random;

import utils.NumberUtils;

public class Ex04FactorialSum {
	private static Random rd = new Random();

	public static void main(String[] args) {
		int[] numbers = generateRandomNumbers(4, 10, 20);
		System.out.println("Mang so ngau nhien [10,20) --> " + Arrays.toString(numbers));
		
		System.out.println("Tong giai thua 1 = " + sumOfFactorials(numbers));
		System.out.println("Tong giai thua 2 = " + sumOfFactorials(2, 5, 8));
	}
	
	private static long sumOfFactorials(int... numbers) { //int[] numbers
		long sum = 0;
		for (int number : numbers) {
			sum = sum + NumberUtils.fact(number);
		}
		return sum;
	}
	
	private static int[] generateRandomNumbers(int length, int minInclusive, int maxInclusive) {
		int[] numbers = new int[length];
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = rd.nextInt(minInclusive, maxInclusive);
		}
		
		return numbers;
	}
}
