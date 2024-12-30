package view;

import utils.UtilsInput;

public class Ex01Print {
	
	public static void main(String[] args) {
		String input = UtilsInput.getValue("Enter the string: ");
		printCharacters(input);
		printWords(input);
		printReverseCharacters(input);
		printReverseWords(input);
	}
	
	private static void printCharacters(String str) {
		System.out.println("\nEach character in line");
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i) + " ");
		}
	}
	
	private static void printWords(String str) {
		System.out.println("\n\nEach word per line");
		String[] words = str.split("\\s+");
		for (String word : words) {
			System.out.println(word);
		}
	}
	
	private static void printReverseCharacters(String str) {
		System.out.println("\nEach reverse character in line");
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i) + " ");
		}
	}
	
	private static void printReverseWords(String str) {
		System.out.println("\n\nEach reverse word per line");
		String[] words = str.split("\\s+");
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.println(words[i]);
		}
	}
}
