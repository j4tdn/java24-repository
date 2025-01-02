package view;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		int a = 75;
		int b = 15;

		System.out.println("a --> "+Arrays.toString(findEquivalentPrime(findDivisors(a))));
		System.out.println("b --> "+Arrays.toString(findEquivalentPrime(findDivisors(b))));
		
		isEquivalentPrime(findEquivalentPrime(findDivisors(a)), findEquivalentPrime(findDivisors(b)));

	}
	private static void isEquivalentPrime (int[] num1, int[] num2) {
		if (Arrays.equals(num1, num2)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
	}
	private static int[] findEquivalentPrime (int[] divisors) {
		int[] res = new int[divisors.length];
		int count = 0;
		for (int divisor: divisors) {
			if (isPrime(divisor)) {
				res[count++] = divisor;
			}
		}
		return Arrays.copyOfRange(res, 0, count);
	}

	private static int[] findDivisors(int n) {
		int[] res = new int[n+1];
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				res[count++] = i;
			}
		}
		return Arrays.copyOfRange(res, 0, count);
	}

	private static boolean isPrime(int n) {
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
