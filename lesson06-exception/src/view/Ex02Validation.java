package view;

import java.time.Year;
import java.time.YearMonth;
import java.util.Scanner;

public class Ex02Validation {
	
	/*
	  Cách 1 : Sử dụng validation 
	  --> Đảm bảo đoạn code bị exception sẽ không bao giờ xảy ra
	 
	 
	 */
	public static void main(String[] args) {
		//Bài 1 : Nhập vào năm sinh 
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập năm sinh : ");
		
		String text = " ";
		do {
			text = sc.nextLine();
			//.matches() : Kiểm tra chuỗi thỏa mãn điều kiện ?
			if(text.matches("\\d+")) {
				break;
			}
			
			System.out.println("Năm sinh không hợp lệ, nhập lại: ");
		}while(true);
		
		int yob = Integer.parseInt(text);
		
		int currentYear = Year.now().getValue();
		
		int age = currentYear - yob + 1;
		
		System.out.println("Số tuổi : "+age);
		
		sc.close();
		
	}
}
