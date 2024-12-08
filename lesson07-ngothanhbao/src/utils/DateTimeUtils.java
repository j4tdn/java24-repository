package utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeUtils {

	private DateTimeUtils() {

	}
	
	public static String toString(Date date, String pattern) {
		DateFormat df = new SimpleDateFormat(pattern);
		return df.format(date);
	}
	
	public static String toString(Calendar c,String pattern) {
		return toString(toDate(c), pattern);
	}

	public static Date toDate(String str, String pattern) {
		DateFormat df = new SimpleDateFormat(pattern);
		Date date = null;
		try {
			date = df.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	public static Date toDate(Calendar c) {
		return c.getTime();
	}

	public static Calendar toCalendar(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c;
	}

	public static Calendar toCalendar(String str, String pattern) {
		return toCalendar(toDate(str, pattern));
	}
	
	public static String optionalEnd(long value, String unit) {
		if(value == 0 ) {
			return "";
		}
		return value + " " + unit + " ";
	}
	
	public static String optional(long value, String unit) {
		return optionalEnd(value, unit);
	}

}
