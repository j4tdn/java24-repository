package view.datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Ex02WeekdayCal {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();		
		DateFormat df = new SimpleDateFormat("dd MMMM yyyy 'is a' EEEE");
		c.set(1995, 8, 25);
		Date date = c.getTime();
		System.out.println(df.format(date));
		int dayOfYear = c.get(Calendar.DAY_OF_YEAR);
		int dayLeft = 365 - dayOfYear;
		System.out.println("Additional facts: ");
		System.out.println("It is day number " + dayOfYear + " of the year " + dayLeft + " left");
		
		
		Calendar mondays[] = getMondays(c, false);
		Calendar AmountMon[] = getMondays(c,true);
		System.out.println("It is monday number " + mondays.length + " out of " + AmountMon.length + " in " + c.get(Calendar.YEAR));
		
		int numMondayInMonth = getMondayInMonth(c);
		System.out.println("It is monday number " + numMondayInMonth);
		
		if(isLeapYear(c.get(Calendar.YEAR))) {
			System.out.println("Year " + c.get(Calendar.YEAR) + " has 366 days" );
		} else {
			System.out.println("Year " + c.get(Calendar.YEAR) + " has 365 days" );
		}
		DateFormat df2 = new SimpleDateFormat("MMMM yyyy 'has' ");
		System.out.println(df2.format(date) + c.getActualMaximum(Calendar.DAY_OF_MONTH) + " days");
		
		
	}

	private static Calendar[] getMondays(Calendar source, boolean fullYear) {
		Calendar start = cloneAndSet(source, Calendar.DAY_OF_YEAR, 1);
		Calendar end;

		if (fullYear) {
			end = cloneAndSet(source, Calendar.DAY_OF_YEAR, source.getActualMaximum(Calendar.DAY_OF_YEAR));
		} else {
			end = cloneAndSet(source, Calendar.DAY_OF_YEAR, source.get(Calendar.DAY_OF_YEAR));
		}
		end.add(Calendar.DAY_OF_YEAR, 1);

		Calendar[] target = new Calendar[53];
		int count = 0;


		for (Calendar c = start; c.before(end);) {
			if (c.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY) {
				target[count++] = clone(c);
				c.add(Calendar.DAY_OF_YEAR, 7);
			} else {
				c.add(Calendar.DAY_OF_YEAR, 1);
			}
		}

		return Arrays.copyOfRange(target, 0, count);
	}

	private static int getMondayInMonth(Calendar source) {
		Calendar start = cloneAndSet(source, Calendar.DAY_OF_MONTH, 1);
		int mondayCount = 0;

		while (start.get(Calendar.MONTH) == source.get(Calendar.MONTH)) {
			if (start.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY) {
				mondayCount++;
				if (start.get(Calendar.DAY_OF_MONTH) == source.get(Calendar.DAY_OF_MONTH)) {
					return mondayCount;
				}
			}
			start.add(Calendar.DAY_OF_MONTH, 1);
		}

		return 0;
	}

	private static Calendar clone(Calendar source) {
		Calendar target = Calendar.getInstance(); // now
		target.setTimeInMillis(source.getTimeInMillis());
		return target;
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
