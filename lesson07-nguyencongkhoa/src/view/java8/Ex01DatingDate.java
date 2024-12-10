package view.java8;

import java.time.DateTimeException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

import utils.UtilsInput;

import static utils.UtilsDateTime.*;
import static utils.UtilsInput.*;

public class Ex01DatingDate {
	
	private static LocalDate startDate, endDate;
	private static LocalTime startTime, endTime;
	
	public static void main(String[] args) {
		startDateTime();
		UtilsInput.nextLine();// handle trôi lệnh
		String choice = getValue("\nHave you broken up yet? (y/n): ");
		if (choice.equals("y")) {
			endDateTime();
		} else {
			endDate = LocalDate.now();
			endTime = LocalTime.now();
		}

		Period period = Period.between(startDate, endDate);
		Duration duration = Duration.between(startTime, endTime);
		
		if (duration.isNegative()) {
			duration  = duration.plusDays(1);
			period = period.minusDays(1);
		}
		
		String dtDetails = optional(period.getYears(), "Year") 
				+ optional(period.getMonths(), "Month")
				+ optional(period.getDays(), "Day") 
				+ optional(duration.toHoursPart(), "Hour") 
				+ optional(duration.toMinutesPart(), "Minute")
				+ optionalEnd(duration.toSecondsPart(), "Second");
		System.out.println("\nDating period is: " + dtDetails);

	}
	
	private static void startDateTime() {
		System.out.println("========== START DATING DATE ==========");
		while (true) {
			int year = validYear("Enter start dating year: ");
			int month = validMonth("Enter start dating month: ");
			int day = validDay("Enter start dating day: ");
			try {
				startDate = LocalDate.of(year, month, day);
				System.out.println("Start dating day: " + startDate);
				break;
			} catch (DateTimeException e) {
				System.out.println("Invalid Start Dating Date: " + year + "." + month + "." + day);
			}
		}
		System.out.println("\n========== START DATING TIME ==========");
		while (true) {
			int hour = validHour("Enter start dating hour: ");
			int minute = validMinute("Enter start dating minute: ");
			int second = validSecond("Enter start dating second: ");
			try {
				startTime = LocalTime.of(hour, minute, second);
				System.out.println("Start dating time: " + startTime);
				break;
			} catch (DateTimeException e) {
				System.out.println("Invalid Start Dating Time: " + hour + ":" + minute + ":" + second);
			}
		}
	}
	
	private static void endDateTime() {
		System.out.println("\n=========== END DATING DATE ===========");
		while (true) {
			int year = validYear("Enter end dating year: ");
			int month = validMonth("Enter end dating month: ");
			int day = validDay("Enter end dating day: ");
			try {
				endDate = LocalDate.of(year, month, day);
				System.out.println("End dating day: " +endDate);
				break;
			} catch (DateTimeException e) {
				System.out.println("Invalid End Dating Date: " + year + "." + month + "." + day);
			}
		}
		System.out.println("\n=========== END DATING TIME ===========");
		while (true) {
			int hour = validHour("Enter end dating hour: ");
			int minute = validMinute("Enter end dating minute: ");
			int second = validSecond("Enter end dating second: ");
			try {
				endTime = LocalTime.of(hour, minute, second);
				System.out.println("End dating time: " +endTime);
				break;
			} catch (DateTimeException e) {
				System.out.println("Invalid End Dating Time: " + hour + ":" + minute + ":" + second);
			}
		}
	}
}
