package view;

import java.time.Year;
import java.util.Scanner;

public class Ex02Validation {
	
	/*
	 
	 Cách 1: Sử dụng validation
	 --> đảm bảo đoạn code bị exception sẽ không bao giờ xảy ra
	 
	 */

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Nhập năm sinh: ");
		
		String text = "";
		do {
			text = ip.nextLine();
			
			if (text.matches("\\d+")) {
				break;
			}
			
			System.out.println("Năm sinh chưa hợp lệ, nhập lại: ");
		} while (true);
		
		int yob = Integer.parseInt(text);
		
		int currentYear = Year.now().getValue();
		
		int age = currentYear - yob + 1;
		
		System.out.println("Số tuổi = " + age);
		
		ip.close();
	}
}
