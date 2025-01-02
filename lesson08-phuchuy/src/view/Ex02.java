package view;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập vào họ tên: ");
		String name = ip.nextLine();
		String[] words = name.split("\\s+");
	
		
		for (String word: words) {
			String sub = word.substring(0,1);
			
			word = word.toLowerCase();
			
			sub = sub.toUpperCase();
			
			
			word = word.replaceFirst("^[a-zA-Z]", sub);
			
			System.out.print(word + " ");
		}

		ip.close();
	}
	

}
