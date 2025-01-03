package view;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập họ và tên: ");
		
		String input = ip.nextLine().trim();
		String[] words = input.split("\\s+");
		
		StringBuilder resuft = new StringBuilder();
		for ( String word : words) {
			if (!word.isEmpty()) {
				resuft.append(Character.toUpperCase(word.charAt(0)))
				      .append(word.substring(1).toLowerCase())
				      .append(" ");
			}
		}
		System.out.println("Kết quả: "+ resuft.toString().trim());
		ip.close();
	}

}
