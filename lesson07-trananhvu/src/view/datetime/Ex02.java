package view.datetime;

import utils.DateTimeUtils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        String str;
        System.out.print("Nhập ngày tháng năm dd/MM/yyyy: ");
        str = ip.nextLine();
        String pattern = "dd/MM/yyyy";
        Calendar cal = DateTimeUtils.toCalendar(str, pattern);
        Calendar cal2 = DateTimeUtils.toCalendar(str, pattern);

        if (cal != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("MMMM");
            int year = cal.get(Calendar.YEAR);
            String month = sdf.format(cal.getTime());

            if(cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                cal2.add(Calendar.DAY_OF_MONTH, -6);
            } else {
                cal2.add(Calendar.DAY_OF_MONTH, cal.getFirstDayOfWeek() - cal.get(Calendar.DAY_OF_WEEK));
            }

            int dayOfYear = cal.get(Calendar.DAY_OF_YEAR);

            int dayOfYearLeft = cal.getActualMaximum(Calendar.DAY_OF_YEAR) - dayOfYear;

            System.out.println(cal);
            System.out.println(cal2);
            int totalMonday = cal.getActualMaximum(Calendar.WEEK_OF_YEAR);

            int monthOfYear = cal2.get(Calendar.WEEK_OF_YEAR);

            int weekOfMonth = cal.getActualMaximum(Calendar.WEEK_OF_MONTH);

            int mondayOfMonth = cal2.get(Calendar.WEEK_OF_MONTH);

            int totalDayOfYear = cal2.getActualMaximum(Calendar.DAY_OF_YEAR);

            int totalDayOfMonth = cal2.getActualMaximum(Calendar.DAY_OF_MONTH);

            System.out.printf("It is day number %s of the year, %s days left", dayOfYear, dayOfYearLeft);
            System.out.printf("\nIt is Monday number %s out of %s in %s", monthOfYear,totalMonday, year);
            System.out.printf("\nIt is Monday number %s out of %s in %s %s", mondayOfMonth,weekOfMonth, month, year);
            System.out.printf("\nYear %s has %s days", year,totalDayOfYear);
            System.out.printf("\n%s has %s days", month,totalDayOfMonth);

        }

        ip.close();
    }
}
