package exercises;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = 5;
		System.out.print("Enter a number: ");
		while (times >= 0) {
			String input = sc.nextLine();
			if (isNumber(input)) {
				int number = Integer.parseInt(input);
				if (number % 2 == 0) {
					System.out.println("True");
				} else {
					System.out.println("False");
				}
				break;
			} else {
				times--;
				if (times == -1) {
					System.out.print("You are wrong over 5 times");
				} else {
					System.out.print("Invalid number! Please enter again: ");
				}
			}
		}
		sc.close();
	}

	private static boolean isNumber(String str) {
		if (str == null || str.isEmpty()) {
			return false;
		} else {
			for (char c : str.toCharArray()) {
				if (!Character.isDigit(c)) {
					return false;
				}
			}
			return true;
		}
	}
}
