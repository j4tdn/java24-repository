package view.datetime;

import java.io.ObjectInputStream.GetField;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Ex04Exercises {

	public static void main(String[] args) {
		Locale VIETNAM = Locale.of("vi", "VN");
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2021);
		
		
		
		// 1. Kiểm tra năm hiện tại có phải năm nhuận hay không
		
		int year = c.get(Calendar.YEAR);
		System.out.println("Năm hiện tại --> " + year);
		System.out.println("Có phải là năm nhuận không --> " + isLeapYear(year));
		
		
		// 2. Ngày hiện tại là ngày thứ mấy, in ra ngày theo tiếng việt
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		// c.set(Calendar.DAY_OF_MONTH, 23);
		System.out.println("Ngày hiện tại là thứ --> " + dayOfWeek);
		
		int date = c.get(Calendar.DAY_OF_MONTH);
		DateFormat df = new SimpleDateFormat("EEEE", VIETNAM);
		System.out.println("Hôm nay là thứ(chuỗi) --> " + df.format(date));
		
		
		// 3. In thông tin các ngày trong tháng, tuần hiện tại
		// dd/MM/yyyy week_day
		printDaysInWeek(c);
		
		// 4.
		Calendar[] sundays = getSundays(c);
		System.out.println("Số ngày chủ nhật --> " + sundays.);
		
	}
	
	private static Calendar[] getSundays(Calendar source) {
		Calendar start = cloneAndSet(source, Calendar.DAY_OF_MONTH, 1);
		Calendar end = cloneAndSet(source, Calendar.DAY_OF_MONTH, source.getActualMaximum(Calendar.DAY_OF_WEEK));
		end.add(Calendar.DAY_OF_MONTH, 1);
		
		Calendar[] target = new Calendar[5];
		int count = 0;
		
		boolean foundIsSunday = false;
		
		for (Calendar c = start; c.before(end); ) {
			if(foundIsSunday) {
				target[count++] = clone(c);
				c.add(Calendar.DAY_OF_MONTH,7);
				continue;
			}
			
			if(c.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				target[count++] = clone(c);
				c.add(Calendar.DAY_OF_MONTH,7);
				foundIsSunday = true;
				continue;
			}
			c.add(Calendar.DAY_OF_MONTH,1);
		}
	}
	
	private static void printDaysInWeek(Calendar source) {
		Calendar start = clone(source);
		start.add(Calendar.DAY_OF_MONTH, start.getFirstDayOfWeek() - start.get(Calendar.DAY_OF_WEEK));
		
		Calendar end = clone(start);
		end.add(Calendar.DAY_OF_MONTH,7);
		
		System.out.println("\n Các ngày trong tuần hiện tại --> {" );
		printDayInRange(start, end);
	
	}
	
	private static void printDaysInMonth(Calendar source) {
		Calendar start  = cloneAndSet(source,Calendar.DAY_OF_MONTH,1);
		Calendar end  = cloneAndSet(source,Calendar.DAY_OF_MONTH);
		
		
		end.add(Calendar.DAY_OF_MONTH,7);
		
		System.out.println("\n Các ngày trong tuần hiện tại --> {" );
		printDayInRange(start, end);
	
	}
	
	private static void printDayInRange(Calendar startInclusive, Calendar endExclusive) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy EEEE");
		for(Calendar c = startInclusive; c.before(endExclusive); c.add(Calendar.DAY_OF_MONTH,1)) {
			System.out.println("  + " + df.format(c.getTime()));
		}
		System.out.println("}");
	}
	
	private static Calendar clone (Calendar source) {
		Calendar target = Calendar.getInstance();
		target.setTimeInMillis(source.getTimeInMillis());
		return target;
	}
	
	private static Calendar cloneAndSet(Calendar source, int field, int value ) {
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
