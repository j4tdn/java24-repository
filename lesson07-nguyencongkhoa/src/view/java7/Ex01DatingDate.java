package view.java7;

import static utils.UtilsDateTime.*;
import static utils.UtilsInput.*;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import utils.UtilsInput;

public class Ex01DatingDate {

	private static Calendar start, end;
	
	public static void main(String[] args) {
		startDateTime();
		UtilsInput.nextLine();// handle trôi lệnh
		String choice = getValue("\nHave you broken up yet? (y/n): ");
		if (choice.equals("y")) {
			endDateTime();
		} else {
			end = Calendar.getInstance();
		}
		calDurationDating(start, end);
	}
	
	private static void startDateTime() {
		System.out.println("\n========== START DATING DATE ==========");
		int year = validYear("Enter start dating year: ");
		int month = validMonth("Enter start dating month: ");
		int day;
		while (true) {
			day = validDay("Enter start dating day: ");
			if (validDate(year, month, day)) {
				break;
			} else {
				System.out.println("Invalid day in month. Please enter again!!");
			}
		}
		System.out.println("\n========== START DATING TIME ==========");
		int hour = validHour("Enter start dating hour: ");
		int minute = validMinute("Enter start dating minute: ");
		int second = validSecond("Enter start dating second: ");
		start = Calendar.getInstance();
		start.set(year, month - 1, day, hour, minute, second);
	}
	
	private static void endDateTime() {
		System.out.println("\n=========== END DATING DATE ===========");
		int year = validYear("Enter end dating year: ");
		int month = validMonth("Enter end dating month: ");
		int day;
		while (true) {
			day = validDay("Enter end dating day: ");
			if (validDate(year, month, day)) {
				break;
			} else {
				System.out.println("Invalid day in month. Please enter again!!");
			}
		}
		System.out.println("\n========== START DATING TIME ==========");
		int hour = validHour("Enter end dating hour: ");
		int minute = validMinute("Enter end dating minute: ");
		int second = validSecond("Enter end dating second: ");
		end = Calendar.getInstance();
		end.set(year, month - 1, day, hour, minute, second);
	}
	
}
