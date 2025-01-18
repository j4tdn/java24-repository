package view;

import java.util.Scanner;

import exception.PasswordFormatException;
import exception.PasswordLengthException;

public class Ex04RegisterAcc {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		System.out.print("Nhap tai khoan: ");
		String name = ip.nextLine();
		do {
			try {
				System.out.print("Nhap mat khau: ");
				String password = ip.nextLine();
				requirePass(password);
				System.out.println("Dang ki thanh cong!!");
				break;
			} catch (PasswordLengthException ple) {
				System.out.println(ple.getMessage());
			} catch (PasswordFormatException pfe) {
				System.out.println(pfe.getMessage());
			}
		} while (true);

		ip.close();
	}

	// Chưa đặt yêu cầu
	// A sẽ sửa tại lớp hi
	private static void requirePass(String str) throws PasswordLengthException, PasswordFormatException {
		if (str.length() < 8) {
			throw new PasswordLengthException("Chieu dai mat khau khong du !!! Vui long nhap lai");
		}

		if (!str.matches(".*[^a-zA-Z0-9!@#$%^*-]*")) {
			throw new PasswordFormatException("Mat khau chua it nhat 1 ki tu thuong, 1 ki tu hoa, 1 ki tu dac biet !!! Vui long nhap lai");

		}
		
		
	}

}
