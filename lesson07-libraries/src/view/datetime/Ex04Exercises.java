package view.datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.zip.CheckedOutputStream;

public class Ex04Exercises {

	public static void main(String[] args) {

		Locale VIETNAM = new Locale("vi", "VN");
		Calendar c = Calendar.getInstance(); // locale --> fdow
		Date date = c.getTime();

		// 1. Kiểm tra năm hiện tại có phải là năm nhuận không

		int year = c.get(Calendar.YEAR);
		System.out.println("Nam hien tai: " + year);
		System.out.println("co phai la nam nhuan khong --> " + isLeapYear(year));

		// 2. Ngày hiện tại là ngày thứ mấy, in ra ngày theo tiếng việt
		System.out.println("===================");
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("Hom nay la thu (So) --> " + dayOfWeek);

		DateFormat df = new SimpleDateFormat("EEEE", VIETNAM);
		System.out.println("Hom nay la thu (chuoi) --> " + df.format(date));

		// 3. In thông tin các ngày trong thang, tuần hiện tại
		// "dd/MM/yyyy" week_day
		System.out.println("===================");
		printDaysInMonth(c);
		printDaysInWeek(c);

		// 4. Đếm xem trong tháng có bao nhiêu ngày chủ nhật và in ra
		Calendar[] sundays = getSundays(c);
		System.out.println("So ngay chu nhat --> " + getSundays(c).length);
		
		
	}
	
	
	private static Calendar[] getSundays(Calendar source) {
		Calendar start = cloneAndSet(source, Calendar.DAY_OF_MONTH, 1);
		Calendar end = cloneAndSet(source, Calendar.DAY_OF_MONTH, source.getActualMaximum(Calendar.DAY_OF_MONTH));
		end.add(Calendar.DAY_OF_MONTH, 1);
		
		Calendar[] target = new Calendar[5];
		int count = 0;
		
		for(Calendar c = start; c.before(end); ) {
			if(c.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				target[count++] = c;
				c.add(Calendar.DAY_OF_MONTH, 7);
				continue;
			}
			c.add(Calendar.DAY_OF_MONTH, 1);
		}
		return Arrays.copyOfRange(target, 0, count);
	}

	// c = 18.12.2024
	private static void printDaysInMonth(Calendar source) {
		Calendar start = cloneAndSet(source, Calendar.DAY_OF_MONTH, 1);
		Calendar end = cloneAndSet(source, Calendar.DAY_OF_MONTH, source.getActualMaximum(Calendar.DAY_OF_MONTH));
		end.add(Calendar.DAY_OF_MONTH, 1);

		System.out.println("Cac ngay trong thang hien tai --> {");
		printDaysInRange(start, end);
	}

	// c = 18.12.2024
	private static void printDaysInWeek(Calendar source) {
		Calendar start = clone(source);
		start.add(Calendar.DAY_OF_MONTH, start.getFirstDayOfWeek() - start.get(Calendar.DAY_OF_WEEK));

		Calendar end = clone(start);
		end.add(Calendar.DAY_OF_MONTH, 7);

		System.out.println("Cac ngay trong tuan hien tai --> {");
		printDaysInRange(start, end);
	}

	private static void printDaysInRange(Calendar startInclusive, Calendar endExclusive) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy EEEE");

		for (Calendar c = startInclusive; c.before(endExclusive); c.add(Calendar.DAY_OF_MONTH, 1)) {
			System.out.println("     +   " + df.format(c.getTime()));
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

	private static boolean isLeapYear(int year) {
		GregorianCalendar gc = new GregorianCalendar();
		return gc.isLeapYear(year);
	}

}
