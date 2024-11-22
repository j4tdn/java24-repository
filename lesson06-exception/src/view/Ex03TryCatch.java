package view;

import java.time.Year;
import java.util.Scanner;

public class Ex03TryCatch {
	
	/*
	 
	 Cách 2: Sử dụng try/catch để bắt lỗi
	 + Với đoạn code bị exception
	 
	 + Khi không xử lý lỗi --> gặp dòng lỗi --> dừng chương trình
	 
	 + Xử lý lỗi với try/catch
	 	. Đặt đoạn code có khả năng bị exception trong khối try
	 	. Đặt đoạn code xử lý trong khối catch
	 	. Lưu ý: Xử lý được khi bắt đúng exception
	 			 Exception cha có thể bắt cho exception con
	 */

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Nhập năm sinh: ");
		
		int yob = 0;
		
		do {
			try {
				yob = Integer.parseInt(ip.nextLine());
				break;
			} catch (NumberFormatException nfe) {
				System.out.println("Năm sinh chưa hợp lệ, nhập lại: ");
			}
		} while (true);
		
		int currentYear = Year.now().getValue();
		
		int age = currentYear - yob + 1;
		
		System.out.println("Số tuổi = " + age);
		
		ip.close();
	}
}
