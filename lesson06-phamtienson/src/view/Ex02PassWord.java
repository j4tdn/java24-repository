package view;

import java.util.Scanner;

import utils.PasswordCheck;

public class Ex02PassWord {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		PasswordCheck validate = new PasswordCheck();
		int attempts = 5 ;
		
		while (attempts > 0) {
			System.out.println("Nhập mật khẩu của bạn:");
			String password = scanner.nextLine();
			
			try {
				validate.validate(password);
				System.out.println("Mật khẩu hợp lệ!!!");
				break;
			} catch (Exception e) {
				System.out.println("Lỗi: "+ e.getMessage());
				attempts--;
				if (attempts>0) {
					System.out.println(" Vui lòng nhập lại. Bạn còn "+attempts+"lần thử");
				} else {
					System.out.println("Bạn đã hết lượt thử!");
				}
			}
		}
		
		scanner.close();
		
	}
	
	
}

