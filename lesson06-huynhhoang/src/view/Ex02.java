package view;

import java.util.Scanner;

public class Ex02 {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {

		do {
			try {
				System.out.println("chọn password : ");
				String password = ip.nextLine();
				validatePassword(password);
				break;
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
			}

		} while (true);

	}

	private static void validatePassword(String password) throws Exception {
		if (password.length() < 8) {
			throw new Exception("At least 8 characters!");
		}

		if (password.length() > 256) {
			throw new Exception("At most 256 characters!");
		}

		if (!password.matches(".*[a-z].*")) {
			throw new Exception("At least 1 lowercase alphabetic character ");
		}

		if (!password.matches(".*[A-Z].*")) {
			throw new Exception("At least 1 uppercase alphabetic character ");
		}

		if (!password.matches(".*\\d.*")) {
			throw new Exception("At least 1 number ");
		}

		if (!password.matches(".*[@+*].*")) {
			throw new Exception("At least 1 special character ");
		}
	}
}
