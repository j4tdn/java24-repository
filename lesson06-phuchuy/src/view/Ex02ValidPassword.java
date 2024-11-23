package view;

import java.util.Scanner;

import exception.InvalidPassword;

public class Ex02ValidPassword {
	static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		createPassword();
	}

	private static void createPassword() {
		while (true) {
			try {
				System.out.print("Nhập mật khẩu cần tạo: ");
				String password = ip.nextLine();
				validPassword(password);
				System.out.println("Đã tạo thành công mật khẩu !");
				break;
			} catch (InvalidPassword e) {
				System.out.println(e.getMessage());
			}
		}
	}

	private static void validPassword(String password) {
		if (password == null || password.isEmpty()) {
			throw new InvalidPassword("Vui lòng tạo mật khẩu");
		}
		if (password.length() < 8 || password.length() > 256) {
			throw new InvalidPassword("Độ dài mật khẩu không đạt yêu cầu !");
		}
		if (isAllNumber(password) == true) {
			throw new InvalidPassword("Phải tồn tại ít nhất 1 chữ cái");
		}
		if (isNumber(password) == false) {
			throw new InvalidPassword("Phải tồn tại ít nhất 1 chữ số");
		}
		if (isUpperCase(password) == false) {
			throw new InvalidPassword("Phải tồn tại ít nhất 1 chữ cái viết hoa");
		}
		if (isSpecial(password) == false) {
			throw new InvalidPassword("Phải tồn tại 1 kí tự đặc biệt");
		}

	}

	private static boolean isUpperCase(String password) {

		for (int i = 0; i < password.length(); i++) {
			char letter = password.charAt(i);
			if (Character.isUpperCase(letter)) {
				return true;
			}
		}
		return false;
	}

	private static boolean isAllNumber(String password) {
		for (int i = 0; i < password.length(); i++) {
			char letter = password.charAt(i);
			if (letter < '0' || letter > '9') {
				return false;
			}
		}
		return true;
	}

	private static boolean isSpecial(String password) {
		for (int i = 0; i < password.length(); i++) {
			if (!Character.isDigit(password.charAt(i)) && !Character.isUpperCase(password.charAt(i))
					&& !Character.isLetter(password.charAt(i)) && !Character.isWhitespace(password.charAt(i))) {
				return true;
			}
		}
		return false;
	}

	private static boolean isNumber(String password) {
		for (int i = 0; i < password.length(); i++) {
			if (Character.isDigit(password.charAt(i))) {
				return true;
			}
		}
		return false;
	}

}
