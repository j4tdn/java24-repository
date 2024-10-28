package exercises;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = 5;
		System.out.print("Enter a number: ");
		while (times >= 0) {
			String input = sc.nextLine();
			if (isNumber(input)) {
				double number = Math.sqrt(Integer.parseInt(input));
				if (number == Math.floor(number)) {
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
