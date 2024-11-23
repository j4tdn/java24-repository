package view;

import java.util.Scanner;

public class Ex04Throw {

	/*
	 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// th1: validation
		System.out.println("th1 --> " + div(6, 2));

		// th2: non-validtation
		try {
			System.out.println("th2 --> " + div(6, 0));
		} catch (ArithmeticException ae) {
			System.out.println("exception --> " + ae.getMessage());
		}

	}

	private static int div(int num, int den) {
		if (den == 0) {
			throw new ArithmeticException("Please enter denominator != 0");
		}

		return num / den;
	}

}
