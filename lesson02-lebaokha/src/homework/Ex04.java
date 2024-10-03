package homework;

import java.util.Random;

public class Ex04 {

	public static void main(String[] args) {
		Random rd = new Random();

		int a = rd.nextInt(10, 21);
		int b = rd.nextInt(10, 21);
		int c = rd.nextInt(10, 21);
		int d = rd.nextInt(10, 21);

		long factorialSum = factorial(a) + factorial(b) + factorial(c) + factorial(d);
		
		System.out.printf("S = %d! + %d! + %d! + %d! = %d", a, b, c, d, factorialSum);

	}

	public static long factorial(int number) {
		long relsut = 1;
		for (int i=number;i>=1;i--) {
			relsut = relsut * i;
		}
		return relsut;
	}
}
