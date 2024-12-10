package view.datetime8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.WeekFields;
import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		try {
			System.out.println("Vui lòng nhập ngày tháng ");
			String time = sc.nextLine();
					
			LocalDate ld = LocalDate.parse(time,formatter);
			int year = ld.getYear();
			DayOfWeek dayOfWeek	= ld.getDayOfWeek();
			 // Số thứ tự của ngày trong năm
			int dayOfYear = ld.getDayOfYear();
			
			// Số ngày còn lại trong năm
			int daysLeftInYear = ld.lengthOfYear() -dayOfYear;
			

            // Số thứ tự tuần trong năm
            int weekOfYear = ld.get(WeekFields.of(Locale.getDefault()).weekOfYear());
			
            int totalWeeks = ld.get(WeekFields.of(Locale.getDefault()).weekOfYear());

            // Số thứ tự ngày trong tháng
            int dayOfMonth = ld.getDayOfMonth();

            // Số ngày trong tháng
            int daysInMonth = ld.lengthOfMonth();
            
            int totalDay = ld.getDayOfYear();
            
            System.out.printf("It is day number %s of the year, %s days left.\n",dayOfYear,
            		daysLeftInYear);

    		System.out.printf("It is  number %d out of %d in %d\n", weekOfYear, totalWeeks,year);

    	
    		System.out.printf("Year %d has %d days \n", year, totalDay);

    		System.out.printf("%s %d has %d days \n", dayOfWeek,year,daysInMonth);
		} catch (Exception e) {
            System.out.println("Ngày nhập không hợp lệ. Vui lòng thử lại.");

		}
	}
}
