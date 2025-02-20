package view;

import exception.AccountError;
import exception.AccountException;

public class Ex04 {
	
	
	public static void main(String[] args) {
		String username = "abcdefg";
		String password = "acd%";
		
		try {
			
		} catch (AccountException e) {
			AccountError[] errors = e.getErrors();
			for (AccountError error : errors) {
				System.out.println(" >> "+ error.getMessage());
			}
		}
	}
		
		
	}
	private static void validate(String username, String password) throws AccountException{
		AccountError[] errors = new AccountError[MAX_LENGTH];
		int count = 0 ;
		
		if (password.length() < 8) {
			errors[count++] = AccountError
		}
	
	
	private static int countNrOfOvlLetters (String username, String password) {
		int nrOfOvlLetters = 0;
		String uniqueLetters = unique(password);
		for (char letter: uniqueLetters.toCharArray()) {
			if (isExist(letter, username)) {
				nrOfOvlLetters++;
			}
		}
		return nrOfOvlLetters;
	}
	private static boolean isExist (char givenLetter, String s) {
		for (char letter: s.toCharArray()) {
			if (letter == givenLetter) {
				return true;
			}
		}
		return false;
	}
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
