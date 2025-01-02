package view;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex01 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String input;
		
		do {
			System.out.print("Nhập chuỗi: ");
			input = ip.nextLine();
		} while (!checkVietnamese(input));
		System.out.println("Mỗi ký tự 1 dòng: "); 
		char[] charArray = input.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == ' ') {
				continue;
			}
			System.out.println(charArray[i]);
		}
		System.out.println("Mỗi từ 1 dòng: "); 
		String[] words = input.split("[\\s]+");
		for (String w : words) {
			System.out.println(w);
		}
		System.out.print("Chuỗi đảo ngược(theo ký tự): "); 
		for (int i = charArray.length - 1; i >= 0; i--) {
			System.out.print(charArray[i]);
		}
		
		System.out.println("\nChuỗi đảo ngược(theo từ): "); 
		StringBuilder result = new StringBuilder();
		for (int i = words.length - 1; i >= 0; i--) {
			result.append(words[i]);
		}
		System.out.println(result);
		
		ip.close();
	}

	private static boolean checkVietnamese(String str) {
		return Pattern.matches("^[\\s\\p{L}]+", str);
	}

}
