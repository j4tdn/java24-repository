package view;

import java.io.IOException;

import exception.InvalidAgeException;

public class Ex06CustomException {

	public static void main(String[] args) {
		/*
		 Khi try catch với 
		 
		 + runtime exception: catch bất kỳ runtime exception nào 
		 mà không quan tâm đến code trong khối try
		 
		 + compile exception(ngoại trừ Exception): chỉ được phép catch compile exception 
		 nếu trong khối try đnag dùng code/hàm nào đó yêu cầu xử lý
		 catch exception thì mới được phép catch
		 
		 
		 
		 */
		try {
			System.out.println("validate 18 --> " + validate(18));

		} catch (Exception e) {
			System.out.println("exp1 --> message: " + e.getMessage());
		}
		

		try {
			System.out.println("validate 18 --> " + validate(12));

		} catch (Exception e) {
			System.out.println("exp2 --> message: " + e.getMessage());
		}

		System.out.println("........");
	}

	private static boolean validate(int age) throws IOException{
		if (age < 16) {
			throw new InvalidAgeException("Age is not valid ");
		}
		return true;

	}

}
