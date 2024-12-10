package view.datetime;

import utils.DateTimeUtils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Ex03 {
    private static final SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

    private static String timeByRegion(String country, String language) {
        Calendar cal = Calendar.getInstance();
        Locale locale = Locale.of(country, language);
        Locale.setDefault(locale);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return sdf.format(cal.getTime());
    }

    private static String lastDayOfMonth() {
        Calendar cal = Calendar.getInstance();
        int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        cal.set(Calendar.DAY_OF_MONTH, lastDay);
        return df.format(cal.getTime());
    }

    private static String firstALastDayOfWeek() {
        Calendar cal = Calendar.getInstance();
        String firstALastDayOfWeek;
        if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
            cal.add(Calendar.DAY_OF_MONTH, -6);
        } else {
            cal.add(Calendar.DAY_OF_MONTH, cal.getFirstDayOfWeek() - cal.get(Calendar.DAY_OF_WEEK) + 1);
        }
        firstALastDayOfWeek = df.format(cal.getTime());
        cal.add(Calendar.DAY_OF_MONTH, 6);
        firstALastDayOfWeek += " " + df.format(cal.getTime());
        return firstALastDayOfWeek;
    }

    private static String weekOfYear() {
        Calendar cal = Calendar.getInstance();
        return cal.get(Calendar.WEEK_OF_YEAR) + "";
    }

    private static String twentyDaysLeft() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, 20);
        return df.format(cal.getTime());
    }

    private static long daysAlive(String dateOfBirth) {
        Calendar cal = DateTimeUtils.toCalendar(dateOfBirth, "dd/MM/yyyy");
        Calendar now = Calendar.getInstance();
        long startInMs = cal.getTimeInMillis();
        long endInMs = now.getTimeInMillis();
        long duration = endInMs - startInMs;
        long days = TimeUnit.MILLISECONDS.toDays(duration);
        return days;
    }

    public static void main(String[] args) {
        System.out.println(timeByRegion("vn", "vi"));
        System.out.println(lastDayOfMonth());
        System.out.println(firstALastDayOfWeek());
        System.out.println(weekOfYear());
        System.out.println(twentyDaysLeft());
        System.out.println(daysAlive("27/02/2003"));
    }


}
