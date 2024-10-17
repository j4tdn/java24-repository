package view;

import utils.NumbersUtils;

public class Ex09nthPrime {

	public static void main(String[] args) {

		int nthNumber = 200;

		int runningNumber = 2;
		int count = 0;

		while (true) {
			if (NumbersUtils.isPrime(runningNumber)) {
				count++;
				if (count == nthNumber) {
					break;
				}
			}

			runningNumber++;
		}

		System.out.println(runningNumber);
	}
}
