package exercises.datetime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import exception.DateSyntaxException;

public class Ex02 {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Calendar date = enterDay();
		printFacts(date);
	}
	
	private static Calendar enterDay() {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Calendar c = Calendar.getInstance();
		int day;
		int month;
		int year;
		do {
			try {
				System.out.println("Enter day: ");
				validateDay(day = Integer.parseInt(sc.nextLine()));
				System.out.println("Enter month: ");
				validateMonth(month = (Integer.parseInt(sc.nextLine())));
				System.out.println("Enter year: ");
				validateYear(year = Integer.parseInt(sc.nextLine()));
				String date = ((day > 0 ? "" + day: "0" + day) + "/" + month + "/" + year);
				c.setTime(df.parse(date));
				return c;
			} catch (DateSyntaxException e) {
				System.out.println("Error! " + e.getMessage() + " Please enter again: ");
			} catch (ParseException e) {
				System.out.println(e.getMessage());
			} catch (NumberFormatException e) {
				System.out.println(e.getMessage());
			}
		} while (true);
	}
	
	private static void printFacts(Calendar c) {
		DateFormat df = new SimpleDateFormat("dd MMMM yyyy");
		DateFormat df1 = new SimpleDateFormat("EEEE");
		DateFormat df2 = new SimpleDateFormat("MMMM");
		int year = c.get(Calendar.YEAR);
		int[] daysInYear = countDayInYear(c);
		int doy = c.get(Calendar.DAY_OF_YEAR);
		int[] daysInMonth = countDayInMonth(c);
		System.out.println(df.format(c.getTime()) + " is a " + df1.format(c.getTime()) + "\nAdditional Facts");
		System.out.println("It is day number " + doy + " of the year, " + (getTotalDaysInYear(year) - doy) + " days left");
		System.out.println("It is " + df1.format(c.getTime()) + " number " + daysInYear[0] + " out of " + daysInYear[1] + " in " + c.get(Calendar.YEAR));
		System.out.println("It is " + df1.format(c.getTime()) + " number " + daysInMonth[0] + " out of " + daysInMonth[1] + " in " + df2.format(c.getTime()) + " " + c.get(Calendar.YEAR));
		System.out.println("Year " + year + " has " + getTotalDaysInYear(year) + " days");
		System.out.println(df2.format(c.getTime()) + " " + year + " has " + c.getActualMaximum(Calendar.DAY_OF_MONTH) + " days");
	}
	
	private static int getTotalDaysInYear(int year) {
		GregorianCalendar gc = new GregorianCalendar();
		return gc.isLeapYear(year) ? 366 : 365;
	}
	
	private static Calendar clone(Calendar calendar) {
		Calendar target = Calendar.getInstance();
		target.setTimeInMillis(calendar.getTimeInMillis());
		return target;
	}
	
	private static int[] countDayInYear(Calendar c) {
		//Calendar start = cloneAndSet(c, 1, 0);
		//Calendar end = cloneAndSet(c, 31, 11);
		Calendar start = Calendar.getInstance();
		Calendar end = Calendar.getInstance();
		start.set(Calendar.DAY_OF_MONTH, 1);
		start.set(Calendar.MONTH, 0);
		start.set(Calendar.YEAR, 2024);
		end.set(Calendar.DAY_OF_MONTH, 31);
		end.set(Calendar.MONTH, 11);
		end.set(Calendar.YEAR, 2024);
		return count(c, start, end);
	}
	
	private static Calendar cloneAndSet(Calendar source, int day, int month) {
		Calendar target = Calendar.getInstance();
		target.setTimeInMillis(source.getTimeInMillis());
		target.set(Calendar.DAY_OF_MONTH, day);
		target.set(Calendar.MONTH, month);
		return target;
	}
	
	private static int[] count(Calendar c, Calendar start, Calendar end) {
		int[] days = new int[2];
		int count = 0;
		boolean check = false;
		for (Calendar i = clone(start); i.before(end);) {
			if (check) {
				if (i.getTimeInMillis() == c.getTimeInMillis()) {
					days[0] = count;
				} else {
					i.add(Calendar.DAY_OF_MONTH, 7);
					count++;
				}
				continue;
			}
			if (i.get(Calendar.DAY_OF_WEEK) == c.get(Calendar.DAY_OF_WEEK)) {
				System.out.println(i.get(Calendar.DAY_OF_MONTH));
				System.out.println(c.get(Calendar.DAY_OF_WEEK));
				i.add(Calendar.DAY_OF_MONTH, 7);
				check = true;
				count++;
				continue;
			}
			i.add(Calendar.DAY_OF_MONTH, 1);
		}
		days[1] = count;
		return days;
	}
	
	private static int[] countDayInMonth(Calendar c) {
		int month = c.get(Calendar.MONTH);
		System.out.println(month);
		//Calendar start = cloneAndSet(c, 1, month);	
		//Calendar end = cloneAndSet(c, c.getActualMaximum(month), month);
		Calendar start = Calendar.getInstance();
		Calendar end = Calendar.getInstance();
		start.set(Calendar.DAY_OF_MONTH, 1);
		start.set(Calendar.MONTH, month);
		start.set(Calendar.YEAR, 2024);
		end.set(Calendar.DAY_OF_MONTH, 31);
		end.set(Calendar.MONTH, month);
		end.set(Calendar.YEAR, 2024);
		return count(c, start, end);
		
	}
	
	private static void validateDay(int day) throws DateSyntaxException {
		if (day < 1 || day > 32) {
			throw new DateSyntaxException("Day must be in range [1, 31]");
		}
	}
	
	private static void validateMonth(int month) throws DateSyntaxException {
		if (month < 0 || month > 13) {
			throw new DateSyntaxException("Month must be in range [1, 12]");
		}
	}
	
	private static void validateYear(int year) throws DateSyntaxException {
		if (year < 1799 || year > 2025) {
			throw new DateSyntaxException("Day must be in range [1800, 2024]");
		}
	}
	

}
