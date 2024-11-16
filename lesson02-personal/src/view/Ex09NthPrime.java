package view;

import utils.NumberUtils;

public class Ex09NthPrime {

	public static void main(String[] args) {

		int number = 200;
		System.out.println("Số nguyên tố thứ " + number + " là " + nthNumber(number));

	}

	public static int nthNumber(int number) {
		int nth = number;
		int count = 0;
		int running = 2;
		while (true) {
			if (NumberUtils.checkPrime(running)) {
				count++;
				if (count == nth) {
					break;
				}
			}

			running++;
		}
		return running;
	}

}
