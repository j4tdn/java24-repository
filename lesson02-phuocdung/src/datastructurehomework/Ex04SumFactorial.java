package datastructurehomework;

import java.util.Random;

public class Ex04SumFactorial {
	
	public static void main(String[] args) {
		
		Random rd = new Random();
		long[] numbers = new long[4];
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = rd.nextInt(10,21);
			System.out.println("Số ngẫu nhiên thứ " + (i+1) + " là " + numbers[i]);
		}
		
		long[] sumFactorials = new long[4];
		
		for(int i =0; i < sumFactorials.length; i++) {
			sumFactorials[i] = factorial(numbers[i]);
			System.out.println("Giai thừa của số ngẫu nhiên thứ " + (i+1) + " là " + sumFactorials[i]);
		}
		
		long sum = 0;
		for(long sumFactorial : sumFactorials) {
			 sum += sumFactorial;		
		}
		System.out.println("Tổng giai thừa các số ngẫu nhiên là " + sum);
	
	}
	
	public static long factorial(long num) {
		long result = num;
		while (num > 1) {
			result = result * --num;
		}
		return result;
	}

}
