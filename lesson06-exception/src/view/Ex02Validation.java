package view;

import java.time.Year;
import java.util.Scanner;

public class Ex02Validation {
	
	/*
	Exception in thread "main" java.lang.NumberFormatException: For input string: "aaa"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
	at java.base/java.lang.Integer.parseInt(Integer.java:588)
	at java.base/java.lang.Integer.parseInt(Integer.java:685)
	at view.Ex01AgeYearException.main(Ex01AgeYearException.java:15)
	*/
	
	/*
	Cách 1: Sử dụng validation
	--> đảm bảo đoạn code bị exception sẽ không bao giờ xảy ra
	 */
	
	public static void main(String[] args) {
		// Nhap nam sinh in ra so tuoi cua nguoi dung
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap nam sinh: ");
		
		String text = "";
		do {
			text = sc.nextLine();
			
			if(text.matches("\\d+")) {
				break;
			}
			System.out.println("Năm sinh khong hop le");
		}while(true);
		
		int yob = Integer.parseInt(text);
		
		int currentYear = Year.now().getValue();
		
		int age = currentYear - yob + 1;
		
		System.out.println("--> Số tuổi = " + age);
		
		sc.close();
	}
}
