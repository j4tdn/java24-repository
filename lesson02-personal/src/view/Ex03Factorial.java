package view;

import utils.NumberUtils;

public class Ex03Factorial {

	public static void main(String[] args) {

		int[] numbers = { 5, 6, 7, 8 };
		for (int number : numbers) {
			System.out.println(number + "! = " + NumberUtils.Factorial(number));
		}

	}

}
