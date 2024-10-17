package utils;

public class NumbersUtils {

	public static long fact(int n) {
		long f = n;
		while (n > 1) {
			n--;
			f = f * n;

		}
		return f;
	}

	public static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
