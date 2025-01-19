package view;

import java.util.Scanner;
import java.util.regex.Pattern;

import exception.InvalidPasswordException;

public class Ex04 {
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Nhập tài khoản: ");
		String name = ip.nextLine();
		
		System.out.print("Nhập mật khẩu: ");
		try {
			String pass = ip.nextLine();
			valid(pass, name);
			System.out.println("đăng kí thành công !");
		} catch (InvalidPasswordException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
	}
	private static void valid(String pass, String name)  {
		if (pass.length() < 8) {
			throw new InvalidPasswordException("Độ dài mật khẩu phải lớn hơn 8");
		}
		
		// Này ko phải là isDigi, is ...
		// Mà nên là hasDigitLetter .. has... em hi
		// A check sơ các pattern thì chưa đúng
		boolean isDigit = Pattern.matches("^\\d", pass);
		boolean isUpperCase = Pattern.matches("[A-Z]", pass);
		boolean isContainSpec = Pattern.matches("[^\\w]", pass);
		if (isDigit) {
			throw new InvalidPasswordException("Phải có ít nhất 1 chữ số");
		}
		if (!isUpperCase) {
			throw new InvalidPasswordException("Phải có ít nhất 1 kí tự in hoa");
		}
		if (isContainSpec) {
			throw new InvalidPasswordException("Phải có ít nhất một kí tự đặc biệt (~!@#$%^&*)");
		}
		
		int count = 0;
		char[] letters = name.toCharArray();
		for (int i = 0; i < letters.length; i++) {
			char letter = pass.charAt(i);
			if (letter == letters[i]) {
				count++;
			}
			if (count > 3) {
				throw new InvalidPasswordException("Không được trùng quá 3 kí tự với tk");
			}
		}
		
		
		
		
		
	
	}

}
