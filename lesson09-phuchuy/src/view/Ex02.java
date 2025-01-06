package view;

import java.util.Scanner;

public class Ex02 {
 static	Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		
		String s1 = "01a2b3456cde478";
		String s2 = "aa6b546c6e22h";
		
	
		

			
	}
	private static String[] inputString(int length) {
		String[] strings = new String[length];
		
		for (int i =0; i < strings.length; i++ ) {
			System.out.print("Nhập xâu: ");
			String s = ip.nextLine();
			strings[i] = s;
			
		}
		return strings;
		
	}
	/*
	 * private static String[] getLargestNumberrs(String[] strings) { int current =
	 * 0; int max = 0; for (String string: strings) { for (int i =0; i <
	 * string.length(); i++) { char letter = string.charAt(i); if
	 * (!Character.isDigit(letter)) { continue; } current = current *10 + letter;
	 * char nextLetter = string.charAt(i+1); if (Character.isDigit(nextLetter)) {
	 * continue; } if (i == string.length() -1) {
	 * 
	 * }
	 * 
	 * } } }
	 */
	
	
	
	
}
