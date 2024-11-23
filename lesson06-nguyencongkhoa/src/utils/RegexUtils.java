package utils;

import java.util.Scanner;

public class RegexUtils {

	private static Scanner sc = new Scanner(System.in);
	
	public static boolean hasUpperCase(String data) {
		for (int i = 0; i < data.length(); i++) {
			char c = data.charAt(i);
			if (Character.isUpperCase(c)) {
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean hasLowerCase(String data) {
		for (int i = 0; i < data.length(); i++) {
			char c = data.charAt(i);
			if (Character.isLowerCase(c)) {
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean hasNumber(String data) {
		for (int i = 0; i < data.length(); i++) {
			char c = data.charAt(i);
			if (Character.isDigit(c)) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean hasSpecialChracter(String data) {
		for (int i = 0; i < data.length(); i++) {
			char c = data.charAt(i);
			if (!Character.isDigit(c) && !Character.isAlphabetic(c)) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean isValidNextCharacterEmailFormat(String data) {
		for (int i = 0; i < data.length() - 1; i++) {
			char c = data.charAt(i);
			char next = data.charAt(i + 1);
			if (c == '_' || c == '-' || c == '.' || c == '@') {
				if (!(Character.isAlphabetic(next) || Character.isDigit(next))) {
					return false;
				}
			}
		}
		return true;
	}
}
