package view;

import java.util.Iterator;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao 1 chuoi ");
		String text = scanner.nextLine();
		printSLetters(text);
		printWord(text);
		reverseLetter(text);
		
	}
	private static void printSLetters(String text) {
		for(int i = 0 ; i < text.length() ; i ++) {
			char letter = text.charAt(i);
			System.out.print(letter+" ");
		}
		System.out.println();
	}
	private static void printWord(String text ) {
		String[] words = text.split(" ");
		for (String word : words) {
			System.out.print(word + " ");
		}
		System.out.println();
	}
	private static void reverseLetter(String text) {
		for(int i = text.length() -1 ; i >= 0 ; i --) {
			char letter = text.charAt(i);
			System.out.print(letter+" ");
		}
		System.out.println();
	}
	
	private static void reverseWord(String text) {
		String[] words = text.split(" ");
		for (String word : words) {
			System.out.print(" "+ word );
		}
		System.out.println();
	}

}
