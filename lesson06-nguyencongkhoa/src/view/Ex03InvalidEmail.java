package view;

import java.util.Scanner;

import exception.InvalidEmailFormat;
import utils.RegexUtils;

public class Ex03InvalidEmail {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("Enter email: ");
			String email = sc.nextLine();
			
			try {
				isValidEmailFormat(email);
				System.out.println("Valid Email Format!!");
				break;
			} catch (InvalidEmailFormat e) {
				System.out.println(e.getMessage() + "\n");
			}
		}
	}
	
	private static void isValidEmailFormat(String email) throws InvalidEmailFormat {
		if (!email.matches("[a-zA-Z0-9_.-]+@[a-zA-Z0-9_.-]+.[a-zA-Z]{2,}") && !RegexUtils.isValidNextCharacterEmailFormat(email)) {
			throw new InvalidEmailFormat();
		}
	}
	
}
