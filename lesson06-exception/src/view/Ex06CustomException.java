package view;

import exception.InvalidAgeException;

public class Ex06CustomException {
	public static void main(String[] args) {
	
		
		try {
			System.out.println("validate 18 --> "+validate(18));
		} catch (InvalidAgeException e) {
			System.out.println("exp --> message : "+e.getMessage());
		}
		System.out.println("....");
	}
	private static boolean validate(int age) throws InvalidAgeException{
		if(age < 16) {
			throw new InvalidAgeException();
		}
		return true;
	}
}
