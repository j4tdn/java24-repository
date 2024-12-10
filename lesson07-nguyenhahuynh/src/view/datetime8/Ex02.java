package view.datetime8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.WeekFields;
import java.util.Locale;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập ngày: (dd.MM.yyyy)");
		
        String dateInput = ip.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate date;
        
        try {
        	date = LocalDate.parse(dateInput, formatter);
        } catch (DateTimeParseException e) {
            System.out.println("Dữ liệu không hợp lệ! Vui lòng nhập đúng định dạng dd.MM.yyyy.");
            return;
        }
        
        int dayOfYear = date.getDayOfYear();
        boolean isLeapYear = date.isLeapYear();
        int daysInYear = isLeapYear ? 366 : 365;
        System.out.println("It is day number " + dayOfYear + " of the year, " + (daysInYear - dayOfYear) + " days left.");
        
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int weekOfYear = date.get(WeekFields.of(Locale.getDefault()).weekOfYear());
        int getYear = date.getYear();
        System.out.println("It is " + dayOfWeek + " number " + weekOfYear + " out of 52 in " + getYear + ".");
        
        int weekOfMonth = date.get(WeekFields.of(Locale.getDefault()).weekOfMonth());
        Month getMonth = date.getMonth();
        
        YearMonth yearMonth = YearMonth.of(getYear, getMonth);
        int daysInMonth = yearMonth.lengthOfMonth();
        int dayCount = 0;

        for (int day = 1; day <= daysInMonth; day++) {
            LocalDate date2 = LocalDate.of(getYear, getMonth, day);
            if (date2.getDayOfWeek() == dayOfWeek) {
                dayCount++;
            }
        }
        System.out.println("It is " + dayOfWeek + " number " + weekOfMonth + " out of " + dayCount + " in " + getMonth + " " + getYear + ".");
        
        System.out.println("Year " + getYear + " has " + daysInYear + " days.");

        int daysInMonth2 = date.lengthOfMonth();
        System.out.println(getMonth + " " + getYear + " has " + daysInMonth2 + " days.");
        
        ip.close();
	}
}
