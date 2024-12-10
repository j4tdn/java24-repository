package utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeUtils {
	private DateTimeUtils() {
	}

	public static String optional(long value, String unit) {
		if (value == 0) {
			return "";
		}
		return value + " " + unit + " ";
	}

	public static String optionalEnd(long value, String unit) {
		if (value == 0) {
			return "";
		}
		return value + " " + unit;
	}

	public static Date toDate(String string, String pattern) {
		DateFormat df = new SimpleDateFormat(pattern);
		Date date = null;
		try {
			date = df.parse(string);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	public static Date toDate(Calendar calendar) {
		return calendar.getTime();
	}

	public static Calendar toCalendar(String string, String pattern) {
		return toCalendar(toDate(string, pattern));
	}

	public static Calendar toCalendar(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c;
	}

	public static String toString(Date date, String pattern) {
		DateFormat df = new SimpleDateFormat(pattern);
		return df.format(date);
	}

	public static String toString(Calendar c, String pattern) {

		DateFormat df = new SimpleDateFormat(pattern);
		return df.format(toDate(c));
	}
}
