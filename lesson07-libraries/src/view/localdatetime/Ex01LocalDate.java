package view.localdatetime;

import java.time.LocalDate;
import java.time.Month;

public class Ex01LocalDate {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.now();
		System.out.println("date:" + date1);

		// LocalDate date2 = LocalDate.of(2024, 12, 2);
		LocalDate date2 = LocalDate.of(2024, Month.APRIL, 3);
		System.out.println("date2:" + date2);

		LocalDate date3 = LocalDate.now();
		date3 = date3.withYear(2012).withDayOfMonth(12).plusDays(12);
		System.out.println("date3:" + date3);
	}
}
