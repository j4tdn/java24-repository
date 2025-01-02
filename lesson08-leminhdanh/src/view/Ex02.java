package view;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex02 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String input;
		
		do {
			System.out.print("Nhập họ và tên(không dấu): ");
			input = ip.nextLine();
		} while (!checkVietnamese(input));
		String str = input.strip().replaceAll("[^A-Za-z]+", " ");
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (i == 0) {
				System.out.print(Character.toUpperCase(charArray[i]));
				continue;
			}
			if (charArray[i] == ' ') {
				System.out.print(charArray[i]);
				i++;
				System.out.print(Character.toUpperCase(charArray[i]));
				continue;
			}
			System.out.print(Character.toLowerCase(charArray[i]));
		}
		ip.close();
	}
	
	private static boolean checkVietnamese(String str) {
		return Pattern.matches("^[A-Za-z\\s]+", str);
	}
}
