package datastructurehomework;

import java.util.Scanner;

public class Ex02findPowersOf2 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập vào số nguyên N");

		for (int i = 0; i < 5; i++) {
			String number = ip.nextLine();
			if (isAllDigits(number)) {
				int targetNumber = Integer.parseInt(number);
				if (isPowers(targetNumber)) {
					System.out.println(targetNumber + " là lũy thừa của 2");
				} else {
					System.out.println(targetNumber + " không phải là lũy thừa của 2");
				}

			} else {
				System.out.println("Không hợp lệ hãy nhập lại");
			}
		}
	}

	public static boolean isAllDigits(String str) {
		for (char ch : str.toCharArray()) {
			if (!Character.isDigit(ch)) {
				return false;
			}
		}
		return true;
	}

	public static boolean isPowers(int num) {
		do {
			if (num % 2 != 0) {
				return false;
			}
			num /= 2;
		} while (num > 1);
		return true;
	}
}
