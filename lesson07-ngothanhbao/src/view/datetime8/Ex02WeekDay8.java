package view.datetime8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex02WeekDay8 {

	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM yyyy 'is a ' EEEE");
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("'It is' EEEE 'number' ");
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("MMMM yyyy 'has' ");
		LocalDate localDate = LocalDate.of(1995, 9, 25);
		System.out.println(dtf.format(localDate));
		int total = LocalDate.MAX.getDayOfYear();
		int dayLeft = total - localDate.getDayOfYear();
		System.out.println("It is day number " + localDate.getDayOfYear() + " of the " + total + ", " + dayLeft + " days left");
		System.out.println(dtf2.format(localDate) + amountWeekDays(localDate, true) + " out of " + amountWeekDaysMax(localDate, true) + " in " + localDate.getYear());
		System.out.println(dtf2.format(localDate) + amountWeekDays(localDate, false) + " out of " + amountWeekDaysMax(localDate, false) + " in " + localDate.getYear());	
		int dayInYear = localDate.lengthOfYear();
		System.out.println("Year "+ localDate.getYear() + " has " + dayInYear + " days");
		System.out.println(dtf3.format(localDate) + localDate.lengthOfMonth() + " days");
	}
	
	private static int amountWeekDays(LocalDate source, boolean isYear) {
	    LocalDate start = null;
	    LocalDate end = null;
	    if (isYear) {
	        start = source.withDayOfYear(1); 
	        end = source.withDayOfYear(source.getDayOfYear());
	        end = end.plusDays(1); 
	    } else {
	        start = source.withDayOfMonth(1); 
	        end = source.withDayOfMonth(source.getDayOfMonth()); 
	        end = end.plusDays(1); 
	    }

	    int count = 0;
	    while (start.isBefore(end)) {
	        if (source.getDayOfWeek() == start.getDayOfWeek()) {
	            count++;
	        }
	        start = start.plusDays(1);
	    }
	    return count;
	}
	
	private static int amountWeekDaysMax(LocalDate source, boolean isYear) {
	    LocalDate start = null;
	    LocalDate end = null;
	    if (isYear) {
	        start = source.withDayOfYear(1); 
	        end = source.withDayOfYear(source.lengthOfYear());
	        end = end.plusDays(1); 
	    } else {
	        start = source.withDayOfMonth(1); 
	        end = source.withDayOfMonth(source.lengthOfMonth()); 
	        end = end.plusDays(1); 
	    }

	    int count = 0;
	    while (start.isBefore(end)) {
	        if (source.getDayOfWeek() == start.getDayOfWeek()) {
	            count++;
	        }
	        start = start.plusDays(1);
	    }
	    return count;
	}


}
