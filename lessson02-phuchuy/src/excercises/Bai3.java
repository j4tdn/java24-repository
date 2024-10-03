package excercises;

import untils.Input;

public class Bai3 {
	public static long factorial(long n) {
		long count = 1;
		for (int i = 1; i <= n; i++) {
			count = count * i;

		}
		return count;
	}

	public static void main(String[] args) {
		long n = Input.inputData();
		System.out.println("Result: " + factorial(n));
	}
}
