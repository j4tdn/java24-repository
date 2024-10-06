package view;


import java.util.Arrays;
import java.util.Random;
import utils.NumberUtils;

public class Ex04FactorialSum {
	
	
	private static Random rd = new Random();
	public static void main(String[] args) {
		
		int[] numbers = generateRandomNumbers(4, 10, 20);
		System.out.println("Mảng số ngẫu nhiên [10,20] --> " + Arrays.toString(numbers));
		
		System.out.println("Tổng giai thừa 01 = " + sumOfFactorials(numbers));
		
		//2, 5, 8
		System.out.println("Tổng giai thừa 02 = " + sumOfFactorials(2,5,8));
		
	}
	// sumOfFactorials(into[] numbers) --> bắt buộc luôn truyền một mảng
	// sumOfFactorials(int... numbers) --> truyền 1 mảng int[], hoặc truyền 1
	// danh sách [0,n] các biến int cách nhau bởi dấu,
	private static long sumOfFactorials(int... numbers) {
		long sum = 0;
		
		for(int number: numbers) {
			sum = sum + NumberUtils.factorial(number);
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
