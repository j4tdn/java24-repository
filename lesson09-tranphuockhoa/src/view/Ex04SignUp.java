package view;

import java.io.IOException;
import java.util.Scanner;
import utils.PassWordCheck;

public class Ex04SignUp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập tên tài khoản: ");
		String username = scanner.nextLine();

		System.out.print("Nhập mật khẩu: ");
		String password = scanner.nextLine();
		PassWordCheck.ValidPassword(password);
		if (isValidPassword(password, username)) {
			System.out.println("Đăng ký tài khoản thành công!");
		} else {
			System.out.println("Đăng ký tài khoản thất bại. Vui lòng kiểm tra lại các yêu cầu.");
		}

		scanner.close();
	}
	}



