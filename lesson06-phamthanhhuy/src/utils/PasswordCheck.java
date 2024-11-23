package utils;

import java.io.IOException;

public class PasswordCheck {
	
	public static boolean passCheck(String pass) throws IOException {

		if (pass.length() < 8) {
			throw new IOException("Tối thiểu 8 ký tự");
		}

		if (pass.length() > 256) {
			throw new IOException("Tối đa 256 ký tự");
		}

		int numberCount = 0;
		int alphabeticCount = 0;
		int bigAlphabeticCount = 0;
		int specialCount = 0;

		for (int i = 0; i < pass.length(); i++) {
			char p1 = pass.charAt(i);
			if (Character.isDigit(p1)) {
				numberCount++;
			} 
		}

		for (int i = 0; i < pass.length(); i++) {
			char p2 = pass.charAt(i);
			if (Character.isLowerCase(p2)) {
				alphabeticCount++;
			}
		}

		for (int i = 0; i < pass.length(); i++) {
			char p3 = pass.charAt(i);
			if (Character.isUpperCase(p3)) {
				bigAlphabeticCount++;
			}
		}

		for (int i = 0; i < pass.length(); i++) {

			char p4 = pass.charAt(i);

			if (!Character.isDigit(p4) && !Character.isLetter(p4)) {
				specialCount++;
			}

		}

		if (numberCount < 1) {
			throw new IOException("Tối thiểu 1 ký tự 0-9");
		}

		if (alphabeticCount < 1) {
			throw new IOException("Tối thiểu 1 ký tự a-z");
		}

		if (bigAlphabeticCount < 1) {
			throw new IOException("Tối thiểu 1 ký tự A-Z");
		}

		if (specialCount < 1) {
			throw new IOException("Tối thiểu 1 ký tự đặc biệt");
		}

		return true;
	}

}
