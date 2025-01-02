package view;

import java.util.Scanner;

import exception.InvalidStringException;

public class Ex01 {
	 
	
	public static void main(String[] args) throws InvalidStringException {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập vào chuỗi kí tự: ");
		String text = ip.nextLine();
	
		printLetters(text);
		System.out.println("\n====================\n");
		printWords(text);
		System.out.println("\n====================\n");
		printReversedLetters(text);
		System.out.println("\n====================\n");
		printReversedWords(text);
		System.out.println("\n====================\n");
		
		
	}
	private static void printLetters(String text) {
		for (char letter : text.toCharArray()) {
			System.out.println(letter);
		}
	}
	private static void printWords(String text) {
		String[] words = text.split("\\s+");
		for (String word : words) {
			System.out.println(word);
		}
	}
	private static void printReversedLetters(String text) {
		StringBuilder sb = new StringBuilder(text);
		System.out.println(sb.reverse());
	}
	private static void printReversedWords(String text) {
		String[] words = text.split("\\s+");
		int i = words.length -1;
		while (i >= 0) {
			System.out.print(words[i]+ " " );
			i--;
		}
	}
	
}
