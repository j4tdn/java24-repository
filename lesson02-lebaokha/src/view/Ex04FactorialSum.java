package view;

import java.util.Arrays;
import java.util.Random;

import utils.NumbersUtils;

public class Ex04FactorialSum {

	private static Random rd = new Random();

	public static void main(String[] args) {

		int[] numbers = generateRandomNumbers(4, 10, 20);

		System.out.println("Mảng số ngẫu nhiên[10, 20) --> " + Arrays.toString(numbers));
		
		System.out.println("Tổng giai thừa = " + sumOfFactorials(numbers));

	}

	private static long sumOfFactorials(int[] numbers) {
		long sum = 0;
		for (int number : numbers) {
			sum = sum + NumbersUtils.fact(number);
		}
		
		return sum;
	}

	private static int[] generateRandomNumbers(int length, int minInclusive, int maxInclusive) {
		int[] numbers = new int[length];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rd.nextInt(minInclusive, maxInclusive);

		}
		return numbers;
	}
}
