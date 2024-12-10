package view.datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex02WeekdayCalc {

	public static void main(String[] args) {
		String datePattern = "dd/MM/yyyy";
		Scanner ip = new Scanner(System.in);

		Calendar birthDay = null;

		while (birthDay == null) {
			System.out.print("Nhập vào ngày tháng năm sinh (dd/MM/yyyy) ");
			String input = ip.nextLine();
			birthDay = stringToCalc(input, datePattern);
		}

		String daysOfWeek = formatDate(birthDay, "EEEE");
		String month = formatDate(birthDay, "MMMM");
		String date = formatDate(birthDay, "dd MMMM yyyy");

		int year = birthDay.get(Calendar.YEAR);

		System.out.println(date + " is a " + daysOfWeek);

		System.out.println("Additional facts");

		int daysOfYear = birthDay.get(Calendar.DAY_OF_YEAR);

		int daysLeft = birthDay.getActualMaximum(Calendar.DAY_OF_YEAR) - daysOfYear;
		System.out.printf("It is day number %s of the year, %s days left.\n", daysOfYear, daysLeft);

		int[] yearDetails = countWeekdays(birthDay, birthDay.get(Calendar.DAY_OF_WEEK), Calendar.DAY_OF_YEAR);
		System.out.printf("It is a %s number %s out of %s in %s.\n", daysOfWeek, yearDetails[1], yearDetails[0], year);

		int[] monthDetails = countWeekdays(birthDay, birthDay.get(Calendar.DAY_OF_WEEK), Calendar.DAY_OF_MONTH);
		System.out.printf("It is a %s number %s out of %s in %s %s.\n", daysOfWeek, monthDetails[1], monthDetails[0],
				month, year);

		int maxDaysOfYear = birthDay.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.printf("Year %s has %s days.\n", year, maxDaysOfYear);

		int maxDaysOfMonth = birthDay.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.printf("%s %s has %s days.", month, year, maxDaysOfMonth);

		ip.close();
	}

	private static String formatDate(Calendar source, String pattern) {
		DateFormat df = new SimpleDateFormat(pattern);
		return df.format(source.getTime());
	}

	private static int[] countWeekdays(Calendar source, int weekdayValue, int field) {
		Calendar start = cloneAndSet(source, field, 1);
		Calendar end = cloneAndSet(source, field, source.getActualMaximum(field));
		end.add(field, 1);

		while (start.get(Calendar.DAY_OF_WEEK) != weekdayValue) {
			start.add(field, 1);
		}

		int weekdayCount = 0;
		int currentWeekdaysPosition = 0;

		for (Calendar c = start; c.before(end); c.add(field, 7)) {
			weekdayCount++;
			if (currentWeekdaysPosition == 0 && c.get(field) == source.get(field)) {
				currentWeekdaysPosition = weekdayCount;
			}
		}
		return new int[] { weekdayCount, currentWeekdaysPosition };
	}

	private static Calendar stringToCalc(String dateAsString, String pattern) {
		DateFormat df = new SimpleDateFormat(pattern);

		try {
			Calendar c = Calendar.getInstance();
			Date date = df.parse(dateAsString);
			c.setTime(date);
			return c;
		} catch (Exception e) {
			System.out.println("Cú pháp không hợp lệ, vui lòng nhập lại");
			return null;
		}

	}

	private static Calendar cloneAndSet(Calendar source, int field, int value) {
		Calendar target = Calendar.getInstance();
		target.setTimeInMillis(source.getTimeInMillis());
		target.set(field, value);
		return target;
	}
}
