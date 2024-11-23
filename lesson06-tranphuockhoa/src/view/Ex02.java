package view;

import java.io.IOException;
import java.util.Scanner;

import utils.PasswordCheck;

public class Ex02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String password;
		
		
		for (int i =0; i<=5; i++) {
			System.out.println("Nhap mat khau: ");
			
			try {
				password = sc.nextLine();
				PasswordCheck.ValidPassword(password);
				System.out.println("Mat khau hop le: " + password);
				return;
			} catch (IOException e) {
				System.out.println("Loi " + e.getMessage());
				if (i == 5) {
					System.out.println("Ban da nhap sai qua nhieu lan");
				}
			}
			
		}
		
		
		
	}
}
