package view.localdatetime;

import java.time.LocalDate;
import java.time.Month;

public class Ex01LocalDate {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.now();
		System.out.println("date: " + date1);
		
		LocalDate date2 = LocalDate.of(2024, Month.OCTOBER, 28);
		System.out.println("date: " + date2);
		
		
		LocalDate date3 = LocalDate.now();
		
		System.out.println("date3 --> " + date3);
		
		date3 = date3.withYear(2016)
					.withDayOfMonth(18)
					.withMonth(2)
					.plusDays(12);
		
		System.out.println("date3 --> " + date3);
		
	}
	
}
