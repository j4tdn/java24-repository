package utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeUtils {
    private DateTimeUtils() {
    }

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

    public static Date toDate(Calendar cal) {
        return cal.getTime();
    }

    public static Calendar toCalendar(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c;
    }

    public static Calendar toCalendar(String str, String pattern) {
        return toCalendar(toDate(str, pattern));
    }

    public static String toString(Date date, String pattern) {
        DateFormat df = new SimpleDateFormat(pattern);
        return df.format(date);
    }

    public static String toString(Calendar cal, String pattern) {
        DateFormat df = new SimpleDateFormat(pattern);
        return toString(toDate(cal), pattern);
    }
}
