package utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeUtils {
	private DateTimeUtils() {

	}

	// Convert Date to String
	public static String toString(Date date, String pattern) {
		DateFormat df = new SimpleDateFormat(pattern);
		return df.format(date);
	}

	// Convert Calendar to String
	public static String toString(Calendar c, String pattern) {
		return toString(toDate(c), pattern);
	}

	// Convert String to Date
	public static Date toDate(String str, String pattern) {
		Date date = null;
		DateFormat df = new SimpleDateFormat(pattern);
		try {
			date = df.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	// Convert Calendar to Date
	public static Date toDate(Calendar c) {
		return c.getTime();
	}

	// Convert Date to Calendar
	public static Calendar toCalendar(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c;
	}

	// Convert String to Calendar
	public static Calendar toCalendar(String str, String pattern) {
		return toCalendar(toDate(str, pattern));
	}

}
