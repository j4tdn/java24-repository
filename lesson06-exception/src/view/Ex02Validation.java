package view;

import java.time.Year;
import java.util.Scanner;

public class Ex02Validation {
	
	/*
	 Exception in thread "main" java.lang.NumberFormatException: For input string: "dsa"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
	at java.base/java.lang.Integer.parseInt(Integer.java:662)
	at java.base/java.lang.Integer.parseInt(Integer.java:778)
	at view.Ex01AgeYearException.main(Ex01AgeYearException.java:16)
	
	Cách 1: Sử dụng validation
	--> đảm bảo đoạn code bị exception sẽ không bao giờ xảy ra
	
	 */
	
	

	public static void main(String[] args) {

		// Bài toán 1:
		// Nhập vào năm sinh, in ra số tuổi của người dùng

		Scanner ip = new Scanner(System.in);

		System.out.print("Nhập năm sinh");
		
		String text = "";
		do {
			text = ip.nextLine();
			if(text.matches("\\d+") ) {
				break;
			}
			
			System.out.print("Năm sinh chưa hợp lệ, nhập lại: ");
		} while(true);
		
		int yob = Integer.parseInt(text);

		int currentYear = Year.now().getValue();

		int age = currentYear - yob + 1;

		System.out.println("==> Số tuổi = " + age);

		ip.close();
	}

}
