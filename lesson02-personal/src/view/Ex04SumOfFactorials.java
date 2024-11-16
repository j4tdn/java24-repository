package view;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

import utils.NumberUtils;

public class Ex04SumOfFactorials {

	public static void main(String[] args) {
		
		int[] numbers = getRandomNumber(4, 10, 20);
		System.out.println("Dãy các số ngẫu nhiên từ 10 đến là 20 là " + Arrays.toString(numbers));
		System.out.println("Tổng giai thừa các số ngẫu nhiên trên là " +  sumOfFatorials(numbers));

	}
	
	public static long sumOfFatorials(int... numbers) {
		long sum = 0;
		for(int number:numbers) {
			sum = sum + NumberUtils.Factorial(number);
		}
		return sum;
	}
	
	private static int[] getRandomNumber(int length, int min, int max) {
		Random rd = new Random();

		int[] numbers = new int[length];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rd.nextInt(min, max);
		}

		return numbers;
	}
}
