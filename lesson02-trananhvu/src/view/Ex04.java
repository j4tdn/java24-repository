package view;

import java.util.Random;

import utils.FactorialUtils;

public class Ex04 {
	private static Random rd = new Random();

	public static void main(String[] args) {
		int a, b, c, d;
		long sum;
		int min = 10;
		int max = 20;
		a = rd.nextInt(min, max + 1);
		b = rd.nextInt(min, max + 1);
		c = rd.nextInt(min, max + 1);
		d = rd.nextInt(min, max + 1);
		sum = FactorialUtils.factorial(a) + FactorialUtils.factorial(b) + FactorialUtils.factorial(c)
				+ FactorialUtils.factorial(d);
		System.out.printf("S = %s! + %s! + %s! + %s! = %s", a, b, c, d, sum);
	}
}
