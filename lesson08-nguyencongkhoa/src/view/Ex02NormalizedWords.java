package view;

import utils.UtilsInput;

public class Ex02NormalizedWords {

	public static void main(String[] args) {
		String input;
		while (true) {
			input = UtilsInput.getValue("Enter the string (A-Za-z): ");
			if (isValidCharactersAZaz(input)) {
				break;
			}
		}
		normalizedString(input);
	}

	private static boolean isValidCharactersAZaz(String str) {
		return str.matches("[A-Za-z ]+");
	}

	private static void normalizedString(String str) {
		System.out.println("String before normalization is: " + str);
		
		String[] words = str.split("\\s+");
		String normalizedString = "";
		for (String word : words) {
			normalizedString += normalizedWord(word) + " ";
		}
		
		normalizedString = normalizedString.strip();
		System.out.println("String after normalization is: " + normalizedString);
	}

	private static String normalizedWord(String str) {
		return Character.toUpperCase(str.charAt(0)) + str.substring(1).toLowerCase();
	}
}
