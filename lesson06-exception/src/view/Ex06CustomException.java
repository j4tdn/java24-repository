package view;

import exception.InvalidAgeException;

public class Ex06CustomException {
	
	public static void main(String[] args) {
		
		/*
		 Khi try catch với:
		 	+ runtime exception: catch bất kỳ runtime exception nào mà không quan tâm đến 
		 	code trong khối try
		 	
		 	+ compile exception (ngoại trừ exception): chỉ được phép catch compile exception
		 	đang dùng code/hàm nào đó yêu cầu xử lý catch exception thì mới dược phép catch
		 
		 */
		
		try {
			System.out.println("validate 18 --> " + validate(18));
		} catch (InvalidAgeException e) {
			System.out.println("exp --> message: " + e.getMessage());
		}
		
		try {
			System.out.println("validate 12 --> " + validate(12));
		} catch (InvalidAgeException e) {
			System.out.println("exp --> message: " + e.getMessage());
		}
		
		System.out.println("....");
		
		
		
	}
	
	private static boolean validate (int age) throws InvalidAgeException {
		if (age < 16) {
			throw new InvalidAgeException("Age " + age + " is invalid, please re-enter!!!");
		}
		return true;
	}
}
