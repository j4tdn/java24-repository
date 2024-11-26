package view;

import java.util.Scanner;

import exception.PasswordRequirementsException;

public class Ex02RegisterAnAccount {

	public static void main(String[] args) {
		System.out.println(">>> Đăng ký >>>");

		Scanner ip = new Scanner(System.in);

		System.out.println("Tên đăng nhập");
		String name = ip.nextLine();
		String password = "";

		int count = 0;
		do {

			try {
				System.out.println("Mật khẩu");
				password = ip.nextLine();
				count++;
				validatePassword(password);
				break;

			} catch (PasswordRequirementsException pre) {
				System.out.println("message: " + pre.getMessage());
			}

		} while (count < 5);

		if (count == 5) {
			System.out.println("Sai quá 5l thoát chương trình");
		} else {
			System.out.println(name);
			System.out.println(validatePassword(password));
		}

		ip.close();

	}

	private static String validatePassword(String password) {
		if (password.length() < 8) {
			throw new PasswordRequirementsException("Độ dài quá ngắn! Nhập lại");
		}
		if (password.length() > 255) {
			throw new PasswordRequirementsException("Độ dài quá dài! Nhập lại");
		}
		return password;
	}
}
