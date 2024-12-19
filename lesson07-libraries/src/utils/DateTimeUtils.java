package utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeUtils {

	public DateTimeUtils() {
	}
	
	public static String optional(long value, String unit) {
		if(value == 0) {
			return "";
		}
		return value + " " + unit + " ";
	}
	
	
	public static String optionalEnd(long value, String unit) {
		if(value == 0) {
			return "";
		}
		return value + " " + unit;
	}
	

	// Date --> String
	public static String toString(Date date, String pattern) {
		DateFormat df = new SimpleDateFormat(pattern);
		return df.format(date);
	}

	// Calendar --> String
	public static String toString(Calendar c, String pattern) {
		return toString(toDate(c), pattern);
	}

	// String --> Date
	public static Date toDate(String str, String pattern) {
		Date date = null;
		DateFormat df = new SimpleDateFormat(pattern);
		try {
			date = df.parse(str);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
	}

	// Calendar --> Date
	public static Date toDate(Calendar c) {
		return c.getTime();
	}

	// Date --> Calendar
	public static Calendar toCalendar(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c;
	}

	// String --> Calendar
	public static Calendar toCalendar(String str, String pattern) {
		return toCalendar(toDate(str, pattern));
	}

}
