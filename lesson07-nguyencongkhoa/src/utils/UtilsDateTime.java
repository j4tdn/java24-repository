package utils;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class UtilsDateTime {
	
	private UtilsDateTime() {
	}
	
	public static String optional(long value, String unit) {
		if (value == 0) {
			return "";
		}
		return value + " " + unit + " ";
	}
	
	public static String optionalEnd(long value, String unit) {
		if (value == 0) {
			return "";
		}
		return value + " " + unit;
	}
	
	public static boolean validDate(int year, int month, int day) {
		int[] daysInMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (isLeapYear(year)) {
			daysInMonth[2] = 29;
		} // vì utils đã kiểm tra trước ngày > 0 rồi
		return day <= daysInMonth[month];
	}

	public static boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 100 != 0 && year % 4 == 0);
	}
	
	public static void calDurationDating(Calendar start, Calendar end) {
		long startInMs = start.getTimeInMillis();
		long endInMs = end.getTimeInMillis();
		
		long duration = endInMs - startInMs;
		
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		
		duration = duration - TimeUnit.DAYS.toMillis(days);
		long hours = TimeUnit.MILLISECONDS.toHours(duration);
		
		duration = duration - TimeUnit.HOURS.toMillis(hours);
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		
		duration = duration - TimeUnit.MINUTES.toMillis(minutes);
		long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);
		
		System.out.printf("Khoảng thời gian: %s ngày, %s giờ, %s phút, %s giây", days, hours, minutes, seconds);
	}
	
	public static String getDayOfWeek(Calendar cal) {
	    switch (cal.get(Calendar.DAY_OF_WEEK)) {
	        case 1:
	            return "Sunday";
	        case 2:
	            return "Monday";
	        case 3:
	            return "Tuesday";
	        case 4:
	            return "Wednesday";
	        case 5:
	            return "Thursday";
	        case 6:
	            return "Friday";
	        case 7:
	            return "Saturday";
	        default:
	            return "Unknown";
	    }
	}

	public static String getMonthName(Calendar cal) {
	   // java7 (0 = January, 11 = December)
	    switch (cal.get(Calendar.MONTH)) {
	        case 0:
	            return "January";
	        case 1:
	            return "February";
	        case 2:
	            return "March";
	        case 3:
	            return "April";
	        case 4:
	            return "May";
	        case 5:
	            return "June";
	        case 6:
	            return "July";
	        case 7:
	            return "August";
	        case 8:
	            return "September";
	        case 9:
	            return "October";
	        case 10:
	            return "November";
	        case 11:
	            return "December";
	        default:
	            return "Unknown";
	    }
	}
	
}
