package view;

import java.util.Scanner;

import Exception.InvalidEmailException;

public class Ex03Email {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		String email = "";
		
		do {
		try {
			System.out.print("nhap email: ");
			email = ip.nextLine();
			checkEmail(email);
			break;
		}catch(InvalidEmailException e) {
			System.out.println(e.getMessage()); 
			System.out.println("email khong hop le, yeu cau nhap lai!");
		}
		} while(true);
		
		System.out.print("email cua ban la: " + email);
	}
	
	private static void checkEmail(String email) {
		String[] arrayString = email.split("@");
		
		if(!arrayString[1].equals("gmail.com")) {
			throw new InvalidEmailException("domain is no valid!!");
		}
		
		String[] prefix = arrayString[0].split("[^~!#$%^&*()_\\-{}\\[\\];:,.<>/?]");
		
		if(prefix.length!=0) {
			throw new InvalidEmailException("prefix is no valid!!");
		}
	}
	
}
