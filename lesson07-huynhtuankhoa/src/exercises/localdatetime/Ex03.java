package exercises.localdatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalField;

import static utils.DateTimeUtils.*;

public class Ex03 {
	public static void main(String[] args) {
		System.out.println(getCurrentTimeAt("Asia/Ho_Chi_Minh"));
		System.out.println(getLastDayOfCurrentMonth());
		getFirstAndLastDayOfCurrentWeek();
		getNumberOfWeekInYear();
		getTheNext20Days();
		getDaysYouHaveLived();
	}
	
	private static LocalDateTime getCurrentTimeAt(String area) {
		return LocalDateTime.now(ZoneId.of(area));
	}
	
	private static LocalDate getLastDayOfCurrentMonth() {
		LocalDate date = LocalDate.now();
		return LocalDate.of(date.getYear(), date.getMonth(), date.lengthOfMonth());
	}
	
	private static void getFirstAndLastDayOfCurrentWeek() {
		LocalDate date = LocalDate.now();
		
		LocalDate startDay = date.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
		LocalDate endDay = date.with(TemporalAdjusters.previousOrSame(DayOfWeek.SUNDAY));
		
		System.out.println(startDay);
		System.out.println(endDay);
	}
	
	private static void getNumberOfWeekInYear() {
		LocalDate now = LocalDate.now();
		LocalDate firstDayOfYear = LocalDate.of(now.getYear(), 1, 1);
		int week = 1;
		while (firstDayOfYear.isBefore(now)) {
			firstDayOfYear = firstDayOfYear.plusDays(7);
			week++;
		}
		System.out.println(week);
	}
	
	private static void getTheNext20Days() {
		LocalDate now = LocalDate.now();
		System.out.println((now = now.plusDays(20)) + " " + now.getDayOfWeek().toString());
	}
	
	private static void getDaysYouHaveLived() {
		LocalDate dateOfBirth = LocalDate.of(2005, 7, 10);
		LocalDate now = LocalDate.now();
		int daysBetweenTwoYears = 0;
		while (dateOfBirth.getYear() < now.getYear()) {
			daysBetweenTwoYears += dateOfBirth.lengthOfYear();
			dateOfBirth = dateOfBirth.plusYears(1);
		}
		int daysRemainInBirthYear = dateOfBirth.lengthOfYear() - dateOfBirth.getDayOfYear() + 1;
		int daysPassedInCurrentYear = now.getDayOfYear();
		System.out.println(daysRemainInBirthYear + daysBetweenTwoYears + daysPassedInCurrentYear);
	}
}

