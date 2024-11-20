package view;

import java.time.Year;
import java.util.Scanner;

public class Ex01AgeYearException {
	public static void main(String[] args) {
		//Bài 1 : Nhập vào năm sinh, in số tuổi người dùng
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập năm sinh : ");
		
		int yob = Integer.parseInt(sc.nextLine());
		int currentYear = Year.now().getValue();
		
		int age = currentYear - yob + 1;
		
		System.out.println("Số tuổi : "+age);
		
		sc.close();
		
	}
}
