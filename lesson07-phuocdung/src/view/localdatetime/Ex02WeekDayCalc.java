package view.localdatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex02WeekDayCalc {

	public static void main(String[] args) {

		final String DATE_PATTERN = "dd/MM/yyyy";
		Scanner scanner = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");

		LocalDate birthDay = null;

		while (birthDay == null) {
			System.out.println("Nhập vào ngày tháng năm sinh");
			String input = scanner.nextLine();
			birthDay = stringToLocalDate(input, DATE_PATTERN);
		}
		
		DayOfWeek dayOfWeek = birthDay.getDayOfWeek();
		int dayOfYear = birthDay.getDayOfYear();
		int lengthOfYear = birthDay.lengthOfYear();

		System.out.println(birthDay.format(formatter) + " is a " + dayOfWeek);
		
		System.out.println("Additional facts");

		int daysLeftInYear = lengthOfYear - dayOfYear;
		System.out.printf("It is day number %s of the year %s days left \n", dayOfYear, daysLeftInYear);

		int[] countWeekDaysInYear = countWeekDays(birthDay, dayOfWeek, true);
		System.out.printf("It is %s number %s out of %s in %s\n", dayOfWeek, countWeekDaysInYear[1],
				countWeekDaysInYear[0], birthDay.getYear());
		
		int[] countWeekDaysInMonth = countWeekDays(birthDay, dayOfWeek, false);
		System.out.printf("It is %s number %s out of %s in %s\n", dayOfWeek, countWeekDaysInMonth[1],
				countWeekDaysInMonth[0], birthDay.getYear());
		
		System.out.printf("Year %s has %s days.\n", birthDay.getYear(), lengthOfYear );
		System.out.printf("%s %s has %s days.", birthDay.getMonth(), birthDay.getYear(), birthDay.lengthOfMonth());

		scanner.close();

	}

	private static int[] countWeekDays(LocalDate source, DayOfWeek dayOfWeek, Boolean calculateForYear) {
		LocalDate start = calculateForYear ? source.withDayOfYear(1) : source.withDayOfMonth(1);
		LocalDate end = calculateForYear ? source.withDayOfYear(source.lengthOfYear()) : source.withDayOfMonth(source.lengthOfMonth());
		end = end.plusDays(1);

		while (!start.getDayOfWeek().equals(dayOfWeek)) {
			start = start.plusDays(1);
		}

		int weekdayCount = 0;
		int currentWeekdaysPosition = 0;

		for (LocalDate localDate = start; localDate.isBefore(end); localDate = localDate.plusDays(7)) {
			weekdayCount++;
			if (localDate.equals(source)) {
				currentWeekdaysPosition = weekdayCount;
			}
		}
		return new int[] { weekdayCount, currentWeekdaysPosition };

	}

	private static LocalDate stringToLocalDate(String dateAsString, String pattern) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
		try {
			LocalDate target = LocalDate.parse(dateAsString, formatter);
			return target;
		} catch (Exception e) {
			System.out.println("Lỗi định dạng, vui lòng nhập lại");
			return null;
		}
	}
}
