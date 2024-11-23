package view;

import java.util.Scanner;

import utils.Emailcheck;

public class Ex03Email {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		 while (true) {
			 try {
				System.out.println("Nhập địa chỉ emali:");
				String email = scanner.nextLine();
				if (!Emailcheck.isEmail(email)) {
					throw new Exception("Địa chỉ email không hợp lệ. Vui lòng nhập lại");
				}
				System.out.println("Địa chỉ email hợp lệ: "+ email);
				break;
			 } catch (Exception e) {
				 System.out.println(e.getMessage());
			 }
		 }
		 scanner.close();
		
	}

}
