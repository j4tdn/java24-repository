package view;

import java.util.ArrayList;

import utils.PrimeNumberUtils;

public class Ex09 {
	static int MAX_SIZE = 1000001;
	private static ArrayList<Integer> primes = new ArrayList<Integer>();

	public static void main(String[] args) {
		for (int i = 2; i < MAX_SIZE; i++) {
			if (PrimeNumberUtils.isPrime(i))
				primes.add(i);
		}
		System.out.println("So nguyen to thu 200: " + primes.get(199));
	}
}
