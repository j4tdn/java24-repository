package view.datetime;

import java.nio.channels.Pipe.SourceChannel;
import java.security.PrivateKey;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Ex04Exercises {
	public static void main(String[] args) {
		
		Locale VIETNAM = new Locale("vi","VN");
		Calendar c = Calendar.getInstance(VIETNAM);
		Date date = c.getTime();
		
		c.set(Calendar.DAY_OF_MONTH, 18);
		
		//1. Kiểm tra năm hiện tại có phải năm nhuận không
		
		int year = c.get(Calendar.YEAR);
		System.out.println("Năm hiện tại : "+year);
		System.out.println("Có phải năm nhuận không "+isLeapYear(year));
		
		
		
		//2. Ngày hiện tại là ngày thứ mấy, in ra ngày theo tiếng Việt 
		
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("Hôm nay là thứ --> "+dayOfWeek);
		
		DateFormat df = new SimpleDateFormat("EEEE",VIETNAM);
		System.out.println("Hôm nay là thứ(chuỗi) --> "+df.format(date));
		
		//3. In thông tin các ngày trong tháng, tuần hiện tại 
	
		//4. Đếm xem trong tháng có bao nhiêu ngày chủ nhật và in ra
	}
	
	private static Calendar[] getSundays(Calendar source) {
		Calendar start = cloneAndSet(source, Calendar.DAY_OF_MONTH, 1);
		Calendar end = cloneAndSet(source, Calendar.DAY_OF_MONTH, source.getActualMaximum(Calendar.DAY_OF_MONTH));
		end.add(Calendar.DAY_OF_MONTH, 1);
		
		Calendar[] target = new Calendar[5];
		int count = 0;
		
		boolean found1stSunday = false;
		
		for (Calendar c = start; c.before(end); ) {
			if (found1stSunday) {
				target[count++] = clone(c);
				c.add(Calendar.DAY_OF_MONTH, 7);
				continue;
			}
			if (c.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				target[count++] = clone(c);
				c.add(Calendar.DAY_OF_MONTH, 7);
				found1stSunday = true;
				continue;
			}
			c.add(Calendar.DAY_OF_MONTH, 1);
		}
		
		return Arrays.copyOfRange(target, 0, count);
	}
	
	private static void printDaysInWeek(Calendar source) {
		Calendar start = clone(source);
		start.add(Calendar.DAY_OF_MONTH, start.getFirstDayOfWeek() - start.get(Calendar.DAY_OF_WEEK));
		Calendar end = clone(start);
		end.add(Calendar.DAY_OF_MONTH, 7);
		System.out.println("Các ngày trong tuần hiện tại --> {");
		printDaysInRange(start, end);
	}
	
	private static void printDaysInMonth(Calendar source) {
		Calendar start = cloneAndSet(source, Calendar.DAY_OF_MONTH, 1);
		Calendar end = cloneAndSet(source, Calendar.DAY_OF_MONTH, 
				source.getActualMaximum(Calendar.DAY_OF_MONTH));
		end.add(Calendar.DAY_OF_MONTH, 1);
		
		System.out.println("\nCác ngày trong tháng hiện tại --> {");
		printDaysInRange(start, end);
	}
	
	private static void printDaysInRange(Calendar startInclusive, Calendar endExclusive) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy EEEE");
		for(Calendar c = startInclusive; c.before(endExclusive); c.add(Calendar.DAY_OF_MONTH,1)) {
			System.out.println("	+ "+df.format(c.getTime()));
		}
		System.out.println("}");
	}
	
	private static Calendar clone(Calendar source) {
		Calendar target = Calendar.getInstance();
		target.setTimeInMillis(source.getTimeInMillis());
		return target;
	}
	
	private static Calendar cloneAndSet(Calendar source, int field, int value) {
		Calendar target = Calendar.getInstance();
		target.setTimeInMillis(source.getTimeInMillis());
		target.set(field, value);
		return target;
	}
	
	// Hàm kiểm tra năm nhuận
	private static boolean isLeapYear(int year) {
		GregorianCalendar gc  = new GregorianCalendar();
		return gc.isLeapYear(year);
	}
}
