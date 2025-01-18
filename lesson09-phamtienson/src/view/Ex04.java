package view;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner ip= new Scanner(System.in);
		
		System.out.println("Nhập tên tài khoản: ");
		String username = ip.nextLine();
		
		System.out.println("Nhập vào mật khẩu: ");
		String password = ip.nextLine();
		
		ip.close();
	}
	
	// Tên hàm chưa đúng
	// isValidPassword hoặc sao đó cho có nghĩa em hi
	public static boolean isPassword(String username, String password) {
		if (password.length()<8) {
			return false;
		}
		boolean haveDigit = false;
		boolean haveCapital = false;
		boolean haveSpecial = false;
		String special ="~!@#$%^&*";
		
		// Logic của em thì thành ra haveDigit, haveCapital, haveSpecial nó chỉ phụ thuộc
		// vào kí tự cuối cùng --> chưa đúng
		for(char c : password.toCharArray()) {
			if (Character.isDigit(c)) {
				haveDigit = true;
			} else if (Character.isUpperCase(c)) {
				haveCapital =true;
			} else if (special.indexOf(c) != 1) {
				haveSpecial =true;
			}
		}
		
		if (!haveDigit || !haveCapital || !haveSpecial) {
			return false;
		}
		
		
		
		
		
		return true;
	}

}
