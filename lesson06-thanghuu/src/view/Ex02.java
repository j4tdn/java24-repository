package view;

import java.util.Scanner;

import utils.*;


public class Ex02 {
	
	private static Scanner ip = new Scanner(System.in);
	
	private static boolean isPassword(String password) {
		if(password.length() < 8 || password.length() > 256) {
			throw new LengthException();
		}
		if(!password.matches(".[a-z].*")) {
			throw new LowercaseException();
		}
		if(!password.matches(".*[A-Z].*")){
            throw new UpcaseException();
        }
		if(!password.matches(".*[0-9].*")){
            throw new NumberException();
        }
		if(!password.matches(".*[^a-zA-Z0-9].*")){
            throw new SpecialCharacterException();
        }
		return true;
	}
	
	public static void main(String[] args) {
		int count = 0;
		String password = "";
		boolean isPassword = false;
		do {
			try {
                System.out.print("Nhập mật khẩu: ");
                password = ip.nextLine();
                isPassword = isPassword(password);
                break;
            }catch (RuntimeException e) {
                count ++;
                System.out.println("---------------------------");
                System.out.println(e.getMessage());
                System.out.println("Vui lòng nhập lại!!!");
                System.out.println("Đã nhập sai " + count +" lần!");
            }
		} while (count < 5);
		if(isPassword) {
            System.out.println("Đăng ký thành công!!!");
        } else {
            System.out.println("Đăng ký không thành công!!!");

        }
	}
	
	
}
