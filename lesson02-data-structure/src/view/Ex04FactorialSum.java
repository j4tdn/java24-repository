package view;

import java.lang.reflect.Array;
import java.util.Random;

public class Ex04FactorialSum {
	
	private static Random rd = new Random();
	
	public static void main(String[] args) {
		int[] numbers = generateRandomNumbers(4, 10, 20);
		
		System.out.println("Mang so ngau nhien[10,20) --> "+ Array.toString(numbers));
		
		System.out.println("Tong giai thua = " + sumOfFactorials(numbers));
	}
	
	private static long sumOfFactorials(int... numbers) { // int ... co the truyen 1 mang int hoac truyen 1
		long sum =0;
		
		for (int number: numbers) {
			sum = sum + NumberUtils.fact(number);
		}
		return sum;
	}
	
	private  static int[] generateRandomNumbers(int length, int minInclusive, int maxInclusive) {
		int[] numbers = new int[length];
		
		for(int i=0;i<numbers.length;i++) {
			numbers[i] = rd.nextInt(minInclusive,minInclusive);
		}
		return numbers;
	}
}
