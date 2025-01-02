package view;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào họ tên: ");
		String name = sc.nextLine();
		String[] words = name.split("\\s+");
	
		
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String sub = word.substring(0, 1).toUpperCase();
			word = word.toLowerCase();
			word = sub + word.substring(1);
			System.out.print(word + " ");
		}

		sc.close();
	}
}