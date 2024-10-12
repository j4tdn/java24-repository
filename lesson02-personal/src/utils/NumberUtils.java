package utils;

public class NumberUtils {

	public static long Factorial(int number) {
		long f = number;
		while (number > 1) {
			number--;
			f = f * number;
		}
		return f;
	}
	
	public static boolean checkPrime(int number) {
		if(number < 2) {
			return false;
		}
		
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
