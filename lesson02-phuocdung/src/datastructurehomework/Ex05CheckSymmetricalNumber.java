package datastructurehomework;

import java.util.Scanner;

public class Ex05CheckSymmetricalNumber {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập vào số nguyên N");

		for (int i = 0;; i++) {
			String numbers = ip.nextLine();
			if (isAllDigits(numbers)) {
				int targetNumber = Integer.parseInt(numbers);
				if (targetNumber > 9) {
					if (isSymmetricalNumber(targetNumber)) {
						System.out.println("N là số đối xứng");
					} else {
						System.out.println("N không phải là số đối xứng");
					}
				} else {
					System.out.println("Không hợp lệ vui lòng nhập lại");
				}
			} else {
				System.out.println("Không hợp lệ vui lòng nhập lại");
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

	public static boolean isSymmetricalNumber(int num) {
		int reversed = 0;
		int original = num;
		while (num > 0) {
			int remainder = num % 10;
			reversed = reversed * 10 + remainder;
			num /= 10;
		}
		return original == reversed;
	}
}
