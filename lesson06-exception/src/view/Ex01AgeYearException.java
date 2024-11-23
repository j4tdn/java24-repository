package view;

import java.time.Year;
import java.util.Scanner;

public class Ex01AgeYearException {
	
	public static void main(String[] args) {
		// Nhap nam sinh in ra so tuoi cua nguoi dung
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap nam sinh: ");
		int yob = Integer.parseInt(sc.nextLine());
		
		int currentYear = Year.now().getValue();
		
		int age = currentYear - yob + 1;
		
		System.out.println("--> Số tuổi = " + age);
		
		sc.close();
	}
}
