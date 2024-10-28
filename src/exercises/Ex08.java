package exercises;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		while(true) {
			String input = sc.nextLine();
			if (isNumber(input)) {
				 int num = Integer.parseInt(input);
				 System.out.println(isPrime(num));
				 break;
			} else {
				System.out.println("Invalid number! Enter again: ");
			}
		}
		sc.close();
	}
	private static boolean isNumber(String str) {
		if (str == null || str.isEmpty()) {
			return false;
		} else {
			for (char c: str.toCharArray()) {
				if (!Character.isDigit(c)) {
					return false;
				}
			}
			return true;
		}
	}
	private static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		} else {
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					return false;
				}
			}
		}
		return true;
	}
}
