package view.datetime;

import java.util.Calendar;
import java.util.Date;

import util.DateTimeUtill;

import static util.DateTimeUtill.*;

public class Ex06DateTimeConverter {

	// String - Date - Calendar
	// Calendar - Date - String

	private static String pattern = "dd.MM.yyyy";
	private static String inputString = "12.10.2008";
	private static Date inputDate = new Date(1234567);
	private static Calendar inputCalendar = Calendar.getInstance();

	public static void main(String[] args) {

		System.out.println("date --> string: " + DateTimeUtill.toString(inputDate, pattern));
		System.out.println("cal --> string: " + DateTimeUtill.toString(inputCalendar, pattern));

		System.out.println("\n========================\n");

		System.out.println("string --> date: " + DateTimeUtill.toDate(inputString, pattern));
		System.out.println("cal --> date: " + DateTimeUtill.toDate(inputCalendar));
		
		System.out.println("\n========================\n");
		
		System.out.println("date --> cal: " + DateTimeUtill.toCalendar(inputDate));
		System.out.println("String --> cal: " + DateTimeUtill.toCalendar(inputString, pattern));

	}

}
