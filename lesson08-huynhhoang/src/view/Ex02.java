package view;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s ;
		do {
			System.out.print("moi bạn nhap chuoi: ");
			s= scanner.nextLine();
			if(!isValidName(s)) {
				System.out.println("Vui long nhap lai");
			}
		}while(!isValidName(s));
		System.out.println(formatName(s));
		
	}
	private static boolean isValidName(String text) {
        return text.matches("[A-Za-z ]+");
	}
	public static String formatName(String name) {
        String[] words = name.toLowerCase().split("\\s+");
        String result = "";

        for (String word : words) {
            if (!word.isEmpty()) {
            	result += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
            }
        }
        return result.trim();
    }
}
