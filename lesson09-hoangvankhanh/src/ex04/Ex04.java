package ex04;

import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Tên tài khoản: ");
		String accountName = ip.nextLine();
		
		String password;
		boolean check;
		
		do {
			System.out.println("Mật khẩu: ");
			password = ip.nextLine();
			check = checkPassword(password, accountName);
			} while(!check); 
		
		System.out.println("Đăng ký tài khoản thành công");
	}

	public static boolean checkPassword(String password, String accountName) {
		if(password.length() < 8) {
			System.out.println("Độ dài mật khẩu chưa đạt yêu cầu về số lượng kí tự");
			return false;
		}
		
		if(!password.matches(".*\\d.*")) {
			System.out.println("Mật khẩu phải chứa số");
			return false;
		}
		
		if(!password.matches(".*[A-Z].*")) {
			System.out.println("Mật khẩu phải chứa chữ in hoa");
		    return false;
		}
		
		if(!password.matches(".*[~!@#$%^&*].*")) {
			System.out.println("Mật khẩu phải chứa kí tự đặc biệt");
			return false;
		}
		
		
		int d = 0;
		for (char c : password.toCharArray()) {
			if(accountName.contains(Character.toString(c))){
				d++;
				if (d > 3) {
					System.out.println("Mật khẩu trùng 3 kí tự giống nhau với tên tài khoản");
					return false;
				}
			}
		}
		
		return true;
	}
}
