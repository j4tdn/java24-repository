package view.datetime;

import java.util.Calendar;
import java.util.Date;

import utils.DateTimeUtils;

public class Ex06DateTimeConverter {

	// String - Date - Calendar
	// Calendar - Date - String
	private static String pattern = "dd.MM.yyyy";

	private static String inputString = "12.01.2003";
	private static Date inputDate = new Date(1234567);
	private static Calendar inputCal = Calendar.getInstance();

	public static void main(String[] args) {
		System.out.println("date --> string: " + DateTimeUtils.toString(inputDate, pattern));
		System.out.println("calendar --> string: " + DateTimeUtils.toString(inputCal, pattern));

		System.out.println("\n======================\n");

		System.out.println("string --> date: " + DateTimeUtils.toDate(inputString, pattern));
		System.out.println("calendar --> date: " + DateTimeUtils.toDate(inputCal));

		System.out.println("\n=======================\n");

		System.out.println("string --> calendar: " + DateTimeUtils.toCalendar(inputString, pattern));
		System.out.println("date --> calendar: " + DateTimeUtils.toCalendar(inputDate));
	}
}
