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
	
	public static boolean isPassword(String username, String password) {
		if (password.length()<8) {
			return false;
		}
		boolean haveDigit = false;
		boolean haveCapital = false;
		boolean haveSpecial = false;
		String special ="~!@#$%^&*";
		
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
