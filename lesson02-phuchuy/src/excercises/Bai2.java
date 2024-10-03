package excercises;

import untils.Input;

public class Bai2 {
	private static boolean checkExponentiationOf2(float n) {
		if (n == 1) {
			return true;
		}
		if (n == 0) {
			return false;
		}

		while (n > 2) {
			n /= 2;
		}
		if (n % 2 == 0) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		int n = Input.inputData();
		System.out.println("Result: " + checkExponentiationOf2(n));

	}
}
