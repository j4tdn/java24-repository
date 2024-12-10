package view.datetime8;

import utils.DateTimeUtils;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.WeekFields;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        String str;
        System.out.print("Nhập ngày tháng năm dd/MM/yyyy: ");
        str = ip.nextLine();
        String pattern = "dd/MM/yyyy";
        LocalDate localDate = DateTimeUtils.toLocalDate(str, pattern);

        int year = localDate.getYear();
        int month = localDate.getMonthValue();

        int dayOfYear = localDate.getDayOfYear();
        int lengthOfyear = localDate.lengthOfYear();
        int dayOfYearLeft = lengthOfyear - dayOfYear;

        int dayOfWeek = localDate.getDayOfWeek().getValue();

        if(dayOfWeek == 7) {
            localDate = localDate.plusDays(-6);
        } else {
            localDate = localDate.plusDays(1-dayOfWeek);
        }

        WeekFields weekFields = WeekFields.of(Locale.getDefault());
        int weeksInYear = localDate.withDayOfYear(1).get(weekFields.weekOfYear()) == 1 ? 52 : 53;
        int weekOfYear = localDate.get(weekFields.weekOfYear());

        int weekOfMonth = localDate.get(weekFields.weekOfMonth());

        LocalDate lastDayOfMonth = localDate.withDayOfMonth(localDate.lengthOfMonth());

        // Lấy số tuần của ngày cuối tháng trong tháng
        int weeksInMonth = lastDayOfMonth.get(weekFields.weekOfMonth());

        int DayInYear = lastDayOfMonth.lengthOfYear();

        int DayInMonth = lastDayOfMonth.lengthOfMonth();

        System.out.printf("It is day number %s of the year, %s days left", dayOfYear, dayOfYearLeft);
        System.out.printf("\nIt is Monday number %s out of %s in %s", weekOfYear,weeksInYear, year);
        System.out.printf("\nIt is Monday number %s out of %s in %s %s", weekOfMonth,weeksInMonth, month, year);
        System.out.printf("\nYear %s has %s days", year,DayInYear);
        System.out.printf("\n%s has %s days", month,DayInMonth);

    }
}
