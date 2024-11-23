package view;

import java.time.Year;
import java.util.Scanner;

public class Ex01AgeYearException {

	// ctrl shift O import thư viện và xoá cái dư thừa
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter year of birth: ");
		int yob = Integer.parseInt(sc.nextLine());
		
		int currentYear = Year.now().getValue();
		
		int age = currentYear - yob + 1;
		
		System.out.println("==> Age = " + age);
		
		sc.close();
	}
	
}
