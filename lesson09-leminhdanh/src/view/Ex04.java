package view;

import java.util.Scanner;

import exception.InvalidPasswordException;
import utils.PasswordUtils;

public class Ex04 {
	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		String account;
		String password;
		do {
			System.out.println("Nhap tai khoan :");
			account = ip.nextLine();
			System.out.println("Nhap mat khau: ");
			password = ip.nextLine();
			try {
				PasswordUtils.checkPassword("dDDasdnasdasd1@231", "ashdgasdg");
				System.out.println("dang ky tai khoan thanh cong");
			} catch (InvalidPasswordException e) {
				System.out.println(e.getMessage());
			}
		} while (true);
		

	}
}
