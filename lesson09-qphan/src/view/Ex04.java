package view;

import java.util.Arrays;

import common.AccountException;
import common.AccountException.AccountError;

public class Ex04 {
	
	private static final int MAX_LENGTH = 9999;

	public static void main(String[] args) {

		String username = "abcdefgh";
		String password = "aaa*%";

		try {
			validate(username, password);
			System.out.println("Đăng ký thành công");
		} catch (AccountException e) {
			AccountError[] errors = e.getErrors();
			for (AccountError error : errors) {
				System.out.println(">> " + error.getMessage());
			}
		}

	}

	private static void validate(String username, String password) throws AccountException {
		AccountError[] errors = new AccountError[MAX_LENGTH];
		int count = 0;

		if (password.length() < 8) {
			errors[count++] = AccountError.INVALID_LENGTH;
		}

		if (!password.matches(".*\\d.*")) {
			errors[count++] = AccountError.AT_LEAST_ONE_DIGIT;
		}

		if (!password.matches(".*[A-Z].*")) {
			errors[count++] = AccountError.AT_LEAST_ONE_UPPERCASE_LETTER;
		}

		if (!password.matches(".*[~!@#$%^&*].*")) {
			errors[count++] = AccountError.AT_LEAST_ONE_SPECIAL_LETTER;
		}
		
		if (countNrOfOvlLetters(username, password) >= 3) {
			errors[count++] = AccountError.OVERLAPPED_ACCOUNT_LETTERS;
		}

		if (count != 0) {
			throw new AccountException(Arrays.copyOfRange(errors, 0, count));
		}
	}
	
	private static int countNrOfOvlLetters(String username, String password) {
		int nrOfOvlLetters = 0;
		String uniqueLetters = unique(password);
		for (char letter: uniqueLetters.toCharArray()) {
			if (isExist(letter, username)) {
				nrOfOvlLetters++;
			}
		}
		return nrOfOvlLetters;
	}
	
	private static boolean isExist(char givenLetter, String s) {
		for (char letter: s.toCharArray()) {
			if (letter == givenLetter) {
				return true;
			}
		}
		return false;
	}
	
	// aabbc -> abc
	private static String unique(String s) {
		StringBuilder target = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			String letter = s.charAt(i) + "";
			if (!target.toString().contains(letter)) {
				target = target.append(letter);
			}
		}
		return target.toString();
	}

}
