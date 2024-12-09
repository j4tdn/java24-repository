package view.localdatetime;

import java.time.LocalDate;
import java.time.Month;

public class Ex01LocalDate {
	
	/* khởi tạo Obj
	 --> new Class() --> constructor
	 --> getInstance --> singleton, factory pattern
	 --> 			 --> builder pattern
	 */
	
	public static void main(String[] args) {
		LocalDate date1 = LocalDate.now();
		System.out.println("date1: " + date1);
		
		// LocalDate.of(2024, 10, 28);
		LocalDate date2 = LocalDate.of(2024, Month.OCTOBER, 28);
		System.out.println("date2: " + date2);
		
		LocalDate date3 = LocalDate.now();
		System.out.println("date3: " + date3);
		date3 = date3.withYear(2016)
				.withDayOfMonth(18)
				.withMonth(2)
				.plusDays(12);
		System.out.println("date3: " + date3);

	}
	
}
