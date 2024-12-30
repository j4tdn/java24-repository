package view;

import utils.UtilsInput;

public class Ex03PrintVNMWithoutAccents {
	
	private final static String accents = "áàãảạăắằẵặẳâấậầẫẩèéẽẹẻêềếểễệịíỉĩìùúụũủưứừửựữòóọõỏôốồổỗộơớờỡởợỳýỹỵỷ";

	public static void main(String[] args) {
		String input = UtilsInput.getValue("Enter the string Vietnamese with accents: ");
		printVNMStringWithoutAccents(input);
	}
	
	private static void printVNMStringWithoutAccents(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.print(solveAccents(str.charAt(i)));
			
		}
	}
	
	private static Character solveAccents(Character c) {
		for (int i = 0; i < accents.length(); i++) {
			if (c.equals(accents.charAt(i))) {
				c = parseVNMCharactersWithoutAccents(i, c);
			}
		}
		return c;
	}
	
	private static Character parseVNMCharactersWithoutAccents(int index, Character c) {
		if (index >= 0 && index <= 16) {
			return 'a';
		} else if (index >= 17 && index <= 27) {
			return 'e';
		} else if (index >= 28 && index <= 32) {
			return 'i';
		} else if (index >= 33 && index <= 43) {
			return 'u';
		} else if (index >= 44 && index <= 60) {
			return 'o';
		} else if (index >= 61 && index <= 65) {
			return 'y';
		} 
		
		return c;

	}
	
}
