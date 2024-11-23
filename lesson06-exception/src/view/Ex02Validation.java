package view;

import java.time.Year;
import java.util.Scanner;

public class Ex02Validation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter year of birth: ");
		
		String text = "";
		do {
			text = sc.nextLine();
			
			if (text.matches("\\d+")) {
				break;
			}
			
			System.out.print("Invalid year of birth, enter again: ");
			
		} while (true);
		
		int yob = Integer.parseInt(text);
		
		int currentYear = Year.now().getValue();
		
		int age = currentYear - yob + 1;
		
		System.out.println("==> Age = " + age);
		
		sc.close();
	}
	
}
