package exercises.localdatetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex04 {
	public static void main(String[] args) {
		LocalDate startDay = LocalDate.of(2022, 6, 7);
		LocalDate nextStartDay = startDay.plusDays(1);
		int finishedDays = 110;
		while (finishedDays > 0) {
			if (!isHolidayOrWeekend(nextStartDay)) {
				startDay.plusDays(1);
				finishedDays--;
			}
		}
		System.out.println(startDay);
	}
	
	private static boolean isHolidayOrWeekend(LocalDate d) {
		LocalDate date = LocalDate.now();
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String[] holidays = { "01/01/2000", "25/01/2000", "26/01/2000", "27/01/2000", "28/01/2000", "29/01/2000", "30/01/2000",
				"31/01/2000", "01/02/2000", "02/02/2000", "10/03/2000", "30/04/2000", "01/05/2000", "02/09/2000"};
		boolean isHoliday = false;
		boolean isWeekend = false;
		for (String holiday : holidays) {
			date = LocalDate.parse(holiday, df);
			if (date.getDayOfMonth() == d.getDayOfMonth() && date.getMonthValue() == d.getDayOfMonth()) {
				isHoliday = true;
			}
		}
		if (date.getDayOfWeek().toString().equals("MONDAY") || date.getDayOfWeek().toString().equals("SUNDAY")) {
			isWeekend = true;
		}
		return isHoliday || isWeekend;
	}
}

