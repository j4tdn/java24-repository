package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import exception.InvalidAgeException;

public class Ex06CustomException {
	
	public static void main(String[] args) {
		/*
		 Khi try catch với
		 
		 + runtime exception: catch bất kỳ runtime exception nào mà ko quan tâm
		 đến code trong khối try
		 
		 + compile exception(ngoại trừ Exception): chỉ được phép catch compile exception nếu trong khối try
		 đang dùng code/hàm nào đó yêu cầu xử lý catch exception thì mới được phép catch
		 
		 */
		
		try {
			System.out.println("validate 18 --> " + validate(18));
		} catch (Exception e) {
			System.out.println("exp1 --> message: " + e.getMessage());
		}
		
//		try {
//			System.out.println("validate 12 --> " + validate(12));
//		} catch (InvalidAgeException e) {
//			System.out.println("exp2 --> message: " + e.getMessage());
//		}
		
		try {
			System.out.println("Teo");
			// new File("").createNewFile();
		} catch (Exception e) {
			
		}
		
		System.out.println("...");
	}
	
	private static boolean validate(int age) throws InvalidAgeException {
		if (age < 16) {
			throw new InvalidAgeException("Age " + age + " is invalid, please re-enter !!!");
		}
		return true;
	}
	
}
