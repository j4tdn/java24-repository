package view;

import java.time.Year;
import java.util.Scanner;

public class Ex01AgeYearException {
	
	// ctrl shift o
	
	/*
	 Exception in thread "main" java.lang.NumberFormatException: For input string: "aaa"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
	at java.base/java.lang.Integer.parseInt(Integer.java:668)
	at java.base/java.lang.Integer.parseInt(Integer.java:786)
	at view.Ex01AgeYearException.main(Ex01AgeYearException.java:18)
	 */
	
	public static void main(String[] args) {
		
		// Bài toán 1: 
		// Nhập vào năm sinh, in ra số tuổi của người dùng
		
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Nhập năm sinh: ");
		
		// Dòng 28 bị exception
		int yob = Integer.parseInt(ip.nextLine());
		
		int currentYear = Year.now().getValue();
		
		int age = currentYear - yob + 1;
		
		System.out.println("==> Số tuổi = " + age);
		
		ip.close();
	}
	
}
