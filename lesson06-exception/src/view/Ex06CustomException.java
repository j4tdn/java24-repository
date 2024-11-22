package view;

import exception.InvalidAgeException;

public class Ex06CustomException {
	public static void main(String[] args) {
		
		/*
		 Khi try catch voi 
		 + runtime exception: catch bat ky runtime exception nao ma khong quan tam den code trong khoi catch
		 
		 + compile exception: 
		 
		 
		 */
		try {
			System.out.println("validate --> " + validate(18));
		} catch (InvalidAgeException e) {
			System.out.println("exp --> message: " + e.getMessage());
		}
		try {
			System.out.println("validate --> " + validate(12));
		} catch (InvalidAgeException e) {
			System.out.println("exp --> message: " + e.getMessage());
		}
	}
	
	private static boolean validate(int age) throws InvalidAgeException {
		if (age < 16) {
			throw new InvalidAgeException("Age " + age + "invalid, please re-enter!!");
		}
		return true;
	}
	
}
