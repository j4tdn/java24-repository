package view;

import java.util.Scanner;

import exception.AtLeastCharactersException;

public class Ex04Account {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);

		System.out.println("Nhập tên tài khoản");
		String id = ip.nextLine();

		try {
			System.out.println("Nhập mật khẩu");
			String password = ip.nextLine();
			isPassword(password);
			System.out.println("Bạn đã đăng kí thành công");

		} catch (RuntimeException e) {

			System.out.println(e.getMessage());

		}

		ip.close();
	}

	private static boolean isPassword(String password) {
		if (!password.matches("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$")) {
			throw new AtLeastCharactersException();
		}
		return true;
	}

}
