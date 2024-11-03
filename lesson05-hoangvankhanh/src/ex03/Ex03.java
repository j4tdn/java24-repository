package ex03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);

		String a = ip.nextLine();

		System.out.println(getMaxValidNumber(a));

		ip.close();
	}

	private static int getMaxValidNumber(String a) {

		int maxValidNumber = 0;
		int number = 0;

		for (char n : a.toCharArray()) {
			if (Character.isDigit(n)) {
				number = number * 10 + (n - '0');

			}

		}

		return maxValidNumber;
	}
}
