package exercise;

import java.util.Scanner;

import exception.InvalidCharacterException;

public class Ex02 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		String password = " ";
		
		do {
			try {
				System.out.println("Enter your password: ");
				password = ip.nextLine();
				isValidPassword(password);
				break;
			} catch (InvalidCharacterException ce) {
				System.out.println(ce.getMessage());
			}
		}while(true);
		System.out.print("Login successfully. Your password is: " + password);
		
		ip.close();
		
	}
	
	public static boolean isValidPassword( String password) {
		if (password.length() < 8 || password.length() > 256) {
			throw new InvalidCharacterException("Password is invalid. Must be at least 8 characters and at most 256 characters. Please enter again ");
		}
		
		// .* : dùng để so các ký tự có trong chuỗi và số lần lặp lại của chúng.
		if (!password.matches(".*[a-z].*")) {
			throw new InvalidCharacterException("Password is invalid. Must be at least 1 characters lowercase alphabetic character. Please enter again ");
		}
		
		if (!password.matches(".*[A-Z].*")) {
			throw new InvalidCharacterException("Password is invalid. Must be at least 1 characters upercase alphabetic character. Please enter again ");
		}
		
		if (!password.matches(".*[0-9].*")) {
			throw new InvalidCharacterException("Password is invalid. Must be at least 1 number. Please enter again. ");
		}
		
		// // : dùng để so các ký tự đặt biệt mà không sử dụng tính năng của chúng. 
		if (!password.matches(".*[~!@#$%^&*()\\[\\]\\-_=+{}:;',\\.<>/?].*")) {
			throw new InvalidCharacterException("Password is invalid. Must be at least 1 special character. Please enter again. ");
		}
		
		return true;
	} 
}
