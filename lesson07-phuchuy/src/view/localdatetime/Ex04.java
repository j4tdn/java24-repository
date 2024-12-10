package view.localdatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex04 {

	public static void main(String[] args) {
		String date = "07.06.2022";
		workDays(date);

	}

	private static void workDays(String date) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		LocalDate lc = LocalDate.parse(date, dtf);

		int workDay = 0;
		while (workDay < 111) {
			if (lc.getDayOfWeek() != DayOfWeek.SUNDAY && lc.getDayOfWeek() != DayOfWeek.SATURDAY) {
				workDay++;
			}
			lc = lc.plusDays(1);
		}
		System.out.println("Ngày ban giao sản phẩm: " + lc.format(dtf));
	}

}
