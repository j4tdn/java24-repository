package view;

import java.util.Scanner;

import Exception.InvalidPasswordException;

public class Ex02Password {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String password;
		int count = 0;
		do {
			System.out.print("Nhap mat khau: ");
			count++;
			password = ip.nextLine();
			try {
				checkPassword(password);
				break;
			} catch (InvalidPasswordException e) {
				System.out.println(e.getMessage());
			}
			if(count == 5) {
				break;
			}
		} while (count <= 5);
		System.out.println();
	}

	private static void checkPassword(String password) {
		char[] s = password.toCharArray();
		if (password.length() < 8) {
			throw new InvalidPasswordException("At least 8 characters!");
		}
		if (password.length() > 256) {
			throw new InvalidPasswordException("At most 256 characters!");
		}
		String[] lowercase = password.split("[^a-z]");
		if (lowercase.length == 0) {
			throw new InvalidPasswordException("At least 1 lowercase alphabetic character!");
		}

		String[] uppercase = password.split("[^A-Z]");
		if (uppercase.length == 0) {
			throw new InvalidPasswordException("At least 1 uppercase alphabetic character!");
		}

		String[] digit = password.split("[^\\d]");
		if (digit.length == 0) {
			throw new InvalidPasswordException("At least 1 number!");
		}

		String[] specialCharacter = password.split("[^~!@#$%^&*()_\\-{}\\[\\];:,.<>/?]");
		if (specialCharacter.length == 0) {
			throw new InvalidPasswordException("At least 1 special character!");
		}
	}
}
