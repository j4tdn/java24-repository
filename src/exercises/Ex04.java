package exercises;

import java.util.Random;

public class Ex04 {
	public static void main(String[] args) {
		Random rd = new Random();
		int sum = 0;
		for (int i = 0; i < 4; i++) {
			int rdNumber = rd.nextInt(10, 21);
			sum += factorial(rdNumber);
		}
		System.out.println(sum);
	}
	private static int factorial(int n) {
		int fac = 1;
		while (n > 1) {
			fac *= n;
			n--;
		}
		return fac;
	}
}
