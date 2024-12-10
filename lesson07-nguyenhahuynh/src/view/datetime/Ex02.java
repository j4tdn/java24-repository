package view.datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Nhập ngày: (dd.MM.yyyy)");

        String dateInput = ip.nextLine();
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");

        Date date;
        try {
            date = formatter.parse(dateInput);
        } catch (ParseException e) {
            System.out.println("Dữ liệu không hợp lệ! Vui lòng nhập đúng định dạng dd.MM.yyyy.");
            ip.close();
            return;
        }

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);
        boolean isLeapYear = calendar.getActualMaximum(Calendar.DAY_OF_YEAR) > 365;
        int daysInYear = isLeapYear ? 366 : 365;

        System.out.println("It is day number " + dayOfYear + " of the year, " + (daysInYear - dayOfYear) + " days left.");

        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        String dayOfWeekStr = new SimpleDateFormat("EEEE", Locale.getDefault()).format(date);
        int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
        int getYear = calendar.get(Calendar.YEAR);

        System.out.println("It is " + dayOfWeekStr + " number " + weekOfYear + " out of 52 in " + getYear + ".");

        int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);
        int getMonth = calendar.get(Calendar.MONTH) + 1;
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        Calendar tempCalendar = Calendar.getInstance();
        tempCalendar.set(Calendar.YEAR, getYear);
        tempCalendar.set(Calendar.MONTH, getMonth - 1);
        tempCalendar.set(Calendar.DAY_OF_MONTH, 1);

        int dayCount = 0;
        while (tempCalendar.get(Calendar.MONTH) == getMonth - 1) {
            if (tempCalendar.get(Calendar.DAY_OF_WEEK) == dayOfWeek) {
                dayCount++;
            }
            tempCalendar.add(Calendar.DAY_OF_MONTH, 1);
        }

        System.out.println("It is " + dayOfWeekStr + " number " + weekOfMonth + " out of " + dayCount + " in " + new SimpleDateFormat("MMMM", Locale.getDefault()).format(date) + " " + getYear + ".");

        System.out.println("Year " + getYear + " has " + daysInYear + " days.");
        System.out.println(new SimpleDateFormat("MMMM", Locale.getDefault()).format(date) + " " + getYear + " has " + daysInMonth + " days.");

        ip.close();
    }
}
