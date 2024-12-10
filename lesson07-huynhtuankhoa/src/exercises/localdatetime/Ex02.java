package exercises.localdatetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Enter Day by pattern: dd/MM/yyyy");
		LocalDate date = LocalDate.parse("10/07/2005", dtf);
		
		System.out.println(date.getDayOfMonth() + " " + date.getMonth() + " " + date.getYear() + " is a " + date.getDayOfWeek().toString());
		
		System.out.println("It is day number " + date.getDayOfYear() + " of the year, " +
							(date.lengthOfYear() - date.getDayOfYear()) + " days left.");
		
		System.out.println("It is " + date.getDayOfWeek().toString() + " number " + 
						countDaysInYear(date)[0] + " out of " + countDaysInYear(date)[1] + 
						" in " + date.getYear());
		
		System.out.println("It is " + date.getDayOfWeek().toString() + " number " + 
						countDaysInMonth(date)[0] + " out of " + countDaysInMonth(date)[1] + 
						" in " + date.getMonth() + " " + date.getYear());
		
		System.out.println("Year " + date.getYear() + " has " + date.lengthOfYear() + " days");
		
		System.out.println(date.getMonth() + " " + date.getYear() + " has " + date.lengthOfMonth() + " days");
	}	
	
	private static int[] countDaysInYear(LocalDate d) {
		int count = 0;
		boolean isFound = false;
		int[] days = new int[2];
		LocalDate firstDayOfYear = LocalDate.of(d.getYear(), 1, 1);
		LocalDate lastDayOfYear = LocalDate.of(d.getYear(), 12, 31);
		for (LocalDate ld = firstDayOfYear; !ld.isAfter(lastDayOfYear);) {
			if ((ld.plusDays(7)).isAfter(lastDayOfYear)) {
				break;
			}
			if (isFound) {
				if (ld.isEqual(d)) {
					days[0] = count;
				}
				ld = ld.plusDays(7);
				count++;
				continue;
			}
			if (ld.getDayOfWeek() == d.getDayOfWeek()) {
				count++;
				isFound = true;
				continue;
			}
			ld = ld.plusDays(1);
		}
		days[1] = count;
		return days;
	}
	
	private static int[] countDaysInMonth(LocalDate d) {
		int count = 0;
		boolean isFound = false;
		int[] days = new int[2];
		LocalDate firstDayOfMonth = LocalDate.of(d.getYear(), d.getMonthValue(), 1);
		LocalDate lastDayOfMonth = LocalDate.of(d.getYear(), d.getMonthValue(), d.lengthOfMonth());
		for (LocalDate ld = firstDayOfMonth; !ld.isAfter(lastDayOfMonth);) {
			if ((ld.plusDays(7)).isAfter(lastDayOfMonth)) {
				break;
			}
			if (isFound) {
				if (ld.isEqual(d)) {
					days[0] = count;
				}
				ld = ld.plusDays(7);
				count++;
				continue;
			}
			if (ld.getDayOfWeek() == d.getDayOfWeek()) {
				count++;
				isFound = true;
				continue;
			}
			ld = ld.plusDays(1);
		}
		days[1] = count;
		return days;
	}
}
