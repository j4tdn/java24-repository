package view;

import utils.UtilsInput;

public class Ex04 {
	
	public static void main(String[] args) {
		String account = UtilsInput.getValue("Nhập tên tài khoản: ");
		String password = UtilsInput.getValue("Nhập mật khẩu: ");
		if (isValidPassword(account, password)) {
			System.out.println("Đăng ký tài khoản thành công!!");
		} else {
			System.out.println("Đăng ký tài khoản thất bại!!");
		}
	}
	
	private static boolean isValidPassword(String account, String password) {
		if (password.length() < 8) {
			return false;
		}
		
		if (!checkValidLetter(password)) {
			return false;
		}
		
		if (!checkDuplicatedCharacters(account, password)) {
			return false;
		}
		
		return true;
	}
	
	private static boolean checkValidLetter(String password) {
		boolean isExistDigit = false;
		boolean isExistUpperCase = false;
		boolean isExistSpecialCharacter = false;
		
		if (password.matches("(~!@#$%^&*)+")) {
			isExistSpecialCharacter = true;
		}
		
		for (int i = 0 ; i < password.length(); i++) {
			char c = password.charAt(i);
			if (Character.isUpperCase(c)) {
				isExistUpperCase = true;
			}
			if (Character.isDigit(c)) {
				isExistDigit = true;
			}
		}
		
		return isExistDigit && isExistSpecialCharacter && isExistUpperCase;
	}
	
	private static boolean checkDuplicatedCharacters(String account, String password) {
		int cnt = 0;
		
		for (int i = 0; i < account.length(); i++) {
			for (int j = 0; j < password.length(); i++) {
				if (account.charAt(i) == password.charAt(j)) {
					cnt++;
				}
			}
		}
		
		return cnt <= 3;
	}
	
}
