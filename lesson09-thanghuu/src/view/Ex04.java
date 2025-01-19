package view;

import java.util.Scanner;

public class Ex04 {

	// Hmm, sao Thắng đợt này code tệ ri :(
	// Các bài trước code tốt mà, cố gắng xem lại em nghen
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		do {
			System.out.println("Nhap tai khoan: ");
			String account = ip.nextLine();
			System.out.println("Nhap mat khau: ");
			String password = ip.nextLine();
			
			if(password.length() < 8) {
				System.out.println("Do dai khong du 8 ky tu\nMoi nhap lai!!");
				continue;
			}
			for (int i = 1; i <= password.length(); i++) {
//				char c = s.cha
//				s.matches("[a-zA-Z\\s]+");
			}
			
		}while (true);
		
	}
}
