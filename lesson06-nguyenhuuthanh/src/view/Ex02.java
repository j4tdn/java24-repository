package view;

import java.util.Scanner;
import java.util.regex.Pattern;

import exception.NoLowerException;
import exception.NoNumberException;
import exception.NoSpecialException;
import exception.NoUpperException;
import exception.PassLongException;
import exception.PassShortException;

public class Ex02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Nhập mật khẩu");
			String pass = sc.nextLine();
			
			try {
				valiPass(pass);
				System.out.println("Taọ tài khoản thành công ");
			} catch (PassShortException|PassLongException|NoUpperException|NoLowerException| NoSpecialException|NoNumberException e) {
				System.out.println("Lỗi-->"+e.getMessage());
			} 
		}
	}
	
	public static  void valiPass(String pass) throws PassShortException,PassLongException,NoUpperException,NoLowerException, NoSpecialException,NoNumberException {
		if(pass.length() < 8) {
			throw new PassShortException("Mật khẩu quá ngắn");
		}
		if(pass.length() > 256) {
			throw new PassLongException("Mật khẩu quá dài");
		}
		if(!Pattern.compile("[A-Z]").matcher(pass).find()) {
			throw new NoUpperException("Mật khẩu không có chữ hoa");
		}
		if(!Pattern.compile("[a-z]").matcher(pass).find()) {
			throw new NoLowerException("Mật khẩu không có chữ thường");
		}
		if(!Pattern.compile("[^a-zA-Z0-9]").matcher(pass).find()) {
			throw new NoSpecialException("Mật khẩu không có ký tự đặc biệt");
		}
		if(!Pattern.compile("[0-9]").matcher(pass).find()) {
			throw new NoNumberException("Mật khẩu không có số");
		}
	}

}
