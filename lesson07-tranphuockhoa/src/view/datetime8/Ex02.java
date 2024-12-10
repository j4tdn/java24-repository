package view.datetime8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.WeekFields;
import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhập ngày(dd.MM.yyyy):");
		String inputDate = sc.nextLine();

		LocalDate date = LocalDate.parse(inputDate,DateTimeFormatter.ofPattern("dd.MM.yyyy"));
		
		System.out.println(date.getDayOfMonth() + " " + date.getMonth() + " " + date.getYear() + " is a " +  date.getDayOfWeek());
		
		System.out.println("Additional facts");
		
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
        
        sc.close();
	
	}
	
	
}