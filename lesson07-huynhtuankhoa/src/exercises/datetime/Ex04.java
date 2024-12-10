package exercises.datetime;

import static utils.DateTimeUtils.toCalendar;
import static utils.DateTimeUtils.toStringFromCalendar;

import java.util.Calendar;

public class Ex04 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		Calendar d = Calendar.getInstance();
		c.set(Calendar.DAY_OF_MONTH, 07);
		c.set(Calendar.MONTH, Calendar.JUNE);
		c.set(Calendar.YEAR, 2022);
		d.set(Calendar.DAY_OF_YEAR, c.get(Calendar.DAY_OF_YEAR) + 1);

		int finishedDays = 110;
		while (finishedDays > 0) {
			if (!isHolidayOrWeekend(d)) {
				c.add(Calendar.DAY_OF_YEAR, 1);
				finishedDays--;
			}
		}
		System.out.println(toStringFromCalendar(c, "dd/MM/yyyy"));

	}

	private static boolean isHolidayOrWeekend(Calendar d) {
		Calendar hld = Calendar.getInstance();
		String[] holidays = { "01/01/2000", "25/01/2000", "26/01/2000", "27/01/2000", "28/01/2000", "29/01/2000", "30/01/2000",
				"31/01/2000", "01/02/2000", "02/02/2000", "10/03/2000", "30/04/2000", "01/05/2000", "02/09/2000"};
		boolean isHoliday = false;
		boolean isWeekend = false;
		for (String holiday : holidays) {
			hld = toCalendar(holiday, "dd/MM/yyyy");
			if (d.get(Calendar.DAY_OF_MONTH) == hld.get(Calendar.DAY_OF_MONTH)
					&& d.get(Calendar.MONTH) == hld.get(Calendar.MONTH)) {
				isHoliday = true;
			}
		}
		if (d.get(Calendar.DAY_OF_WEEK) == 1 || d.get(Calendar.DAY_OF_WEEK) == 7) {
			isWeekend = true;
		}
		return isHoliday || isWeekend;
	}
	
}
