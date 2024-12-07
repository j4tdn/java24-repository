package view.datetime;

import java.util.Calendar;
import java.util.Date;

import utils.DateTimeUtils;

public class Ex06DateTimeConverter {

	// String - Date - Calendar
	// Calendar - Date - String

	private static String inputString = "12.10.2008";
	private static Date inputDate = new Date(1234567);
	private static Calendar inputCalendar = Calendar.getInstance();
	private static String pattern = "dd.MM.yyyy";

	public static void main(String[] args) {

		System.out.println("date -> string: " + DateTimeUtils.toString(inputDate, pattern));
		System.out.println("cal -> string: " + DateTimeUtils.toString(inputCalendar, pattern));
		
		System.out.println("\n=========================\n");
		
		System.out.println("date -> string: " + DateTimeUtils.toDate(inputString, pattern));
		System.out.println("cal -> string: " + DateTimeUtils.toDate(inputCalendar));
		
		System.out.println("\n=========================\n");
		
		System.out.println("date -> cal: " + DateTimeUtils.toCalendar(inputDate));
		System.out.println("string -> calc: " + DateTimeUtils.toCalendar(inputString, pattern));
		
	}

}
