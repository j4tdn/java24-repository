package utils;

import exception.InvalidPasswordException;

public class PasswordUtils {
	public static void checkPassword(String pw, String ac) throws InvalidPasswordException {
		char[] password = pw.toCharArray();
		char[] account = ac.toCharArray();
		if (password.length <= 8) {
			throw new InvalidPasswordException("Có ít nhất 8 ký tự!");
		}

		String[] uppercase = pw.split("[^A-Z]");
		if (uppercase.length == 0) {
			throw new InvalidPasswordException("có ít nhất 1 chữ hoa!");
		}

		String[] digit = pw.split("[^\\d]");
		if (digit.length == 0) {
			throw new InvalidPasswordException("Có ít nhất 1 số!");
		}

		if (pw.matches("[\\w\\d]+")) {
			throw new InvalidPasswordException("Có ít nhất một kí tự đặc biệt (~!@#$%^&*)");
		}
//		char[] temp = new char[10];
//		for (char p : password) {
//			for (char a : account) {
//				int count = 0;
//				if (p == a) {
//					int n = 0;
//					for (int i = 0; i < temp.length; i++) {
//						if (p != temp[i]) {
//							n++;
//						}
//					}
//					if (n == count) {
//						temp[count] = p;
//					}
//				}
//			}
//		}
//
//		if (temp.length >= 3) {
//			throw new InvalidPasswordException();
//		}

	}
}
