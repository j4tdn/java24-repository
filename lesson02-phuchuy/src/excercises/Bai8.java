package excercises;

import untils.Input;

public class Bai8 {
	private static boolean isPrime(int n) {
		if (n == 0) {
			return false;
		}
		if (n == 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int n = Input.inputData();
		System.out.println("Result: " + isPrime(n));

	}

}
