package view;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Ex02WeekDayCal {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy EEEE");
		Date date = c.getTime();
		System.out.println(df.format(date));
		int dOY = c.get(Calendar.DAY_OF_YEAR);
		int dayLeft = 365 - dOY;
		System.out.println("So ngay trong nam: " + dOY + " con lai " + dayLeft +" Ngay");
		
		int numMondayInMonth = getMondayInMonth(c);
		System.out.println("It is monday number " + numMondayInMonth);
		
		if(isLeapYear(c.get(Calendar.YEAR))) {
			System.out.println("Year " + c.get(Calendar.YEAR) + " has 366 days");
		}else {
			System.out.println("Year " + c.get(Calendar.YEAR) + " Has 365 days");
		}
		DateFormat df2 = new SimpleDateFormat("MMMM yyyy 'has' ");
		System.out.println(df2.format(date) + c.getActualMaximum(Calendar.DAY_OF_MONTH) + " days");
	}
	
	private static int getMondayInMonth(Calendar source) {
		Calendar start = cloneAndSet(source, Calendar.DAY_OF_MONTH, 1);
		int mondayCount = 0;
		while (start.get(Calendar.MONTH) == source.get(Calendar.MONTH)) {
			if(start.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY) {
				mondayCount++;
				if (start.get(Calendar.DAY_OF_MONTH) == source.get(Calendar.DAY_OF_MONTH)) {
					return mondayCount;
				}
			}
			start.add(Calendar.DAY_OF_MONTH, 1);
		}
		return 0;
	}
	
	private static Calendar cloneAndSet(Calendar source, int field, int value) {
		Calendar target = Calendar.getInstance();
		target.setTimeInMillis(source.getTimeInMillis());
		target.set(field, value);
		return target;
	}
	

	
	private static boolean isLeapYear(int year) {
		GregorianCalendar gc = new GregorianCalendar();
		return gc.isLeapYear(year);
	}
}
