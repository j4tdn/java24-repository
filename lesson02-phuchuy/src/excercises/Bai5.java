package excercises;

import untils.InputFilter;

public class Bai5 {
	private static boolean isSymmetrical(int n) {
		int m = 0;
		int check = n;
		while (n != 0) {
			m = m * 10 + n % 10;
			n /= 10;
		}
		if (check == m) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int n = InputFilter.inputData();
		System.out.println("Result: " + isSymmetrical(n));
	}
}
