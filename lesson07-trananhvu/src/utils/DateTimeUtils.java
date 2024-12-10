package utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Calendar;
import java.util.Date;

public class DateTimeUtils {
    private DateTimeUtils() {
    }

    public static LocalDate toLocalDate(String str, String pattern) {
        LocalDate localDate = LocalDate.now();
        try {
            localDate = LocalDate.parse(str, DateTimeFormatter.ofPattern(pattern));
        }catch (DateTimeParseException e) {
            e.printStackTrace();
        }
        return localDate;
    }

    public static LocalDateTime toLocalDateTime(String str, DateTimeFormatter pattern) {
        LocalDateTime localDateTime = LocalDateTime.now();
        try {
             localDateTime = LocalDateTime.parse(str ,pattern);
        } catch (DateTimeParseException e) {
           e.printStackTrace();
        }
        return localDateTime;
    }

    public static Date toDate(String str, String pattern) {
        Date date = null;
        DateFormat df = new SimpleDateFormat(pattern);
        df.setLenient(false);
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
        Date date = toDate(str, pattern);
        if(date == null) return null;
        return toCalendar(date);
    }

    public static String toString(Date date, String pattern) {
        DateFormat df = new SimpleDateFormat(pattern);
        return df.format(date);
    }

    public static String toString(Calendar cal, String pattern) {
        DateFormat df = new SimpleDateFormat(pattern);
        return toString(toDate(cal), pattern);
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
}