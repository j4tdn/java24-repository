package view.datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Ex04Exercises {

	public static void main(String[] args) {
		Locale VN = Locale.of("vi", "vn");
		Calendar c = Calendar.getInstance();
		Date date = c.getTime();

		// c.set(Calendar.YEAR, 2024);

		// 1. Kiểm tra năm hiện tại có phải là năm nhuận không
		int year = c.get(Calendar.YEAR);
		System.out.println(year);
		System.out.println("Có phải là năm nhuận không --> " + isLeapYear(year));

		// 2. Ngày hiện tại là ngày thứ mấy, in ra ngày theo tiếng việt
		int dow = c.get(Calendar.DAY_OF_WEEK);
		DateFormat df = new SimpleDateFormat("EEEE", VN);
		System.out.println("Hôm nay là thứ --> " + df.format(date));

		// 3. In thông các ngày trong tháng, tuần hiện tại
		// dd/MM/yyyy week_day
		c.set(Calendar.DAY_OF_MONTH, 18);
		printDaysInMonth(c);
		printDaysInWeek(c);

		// 4. Đếm xem trong tháng có bao nhiêu ngày chủ nhật và in ra
		Calendar[] sundays = getSundays(c);
		System.out.println("Số ngày chủ nhật --> " + sundays.length);
		df = new SimpleDateFormat("dd/MMMM/yyyy EEEE");
		for (Calendar sunday : sundays) {
			System.out.println(df.format(sunday.getTime()));
		}

	}

	private static Calendar[] getSundays(Calendar source) {
		Calendar start = cloneAndSet(source, Calendar.DAY_OF_MONTH, 1);
		Calendar end = cloneAndSet(source, Calendar.DAY_OF_MONTH, source.getActualMaximum(Calendar.DAY_OF_MONTH));
		end.add(Calendar.DAY_OF_MONTH, 1);

		Calendar[] target = new Calendar[5];
		int count = 0;

		for (Calendar c = start; c.before(end);) {
			if (c.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				target[count++] = clone(c);
				c.add(Calendar.DAY_OF_MONTH, 7);
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
		System.out.println("\n Các ngày trong tuần hiện tại --> {");
		printDaysInrange(start, end);
	}

	private static void printDaysInMonth(Calendar source) {
		Calendar start = cloneAndSet(source, Calendar.DAY_OF_MONTH, 1);
		Calendar end = cloneAndSet(source, Calendar.DAY_OF_MONTH, source.getActualMaximum(Calendar.DAY_OF_MONTH));
		end.add(Calendar.DAY_OF_MONTH, 1);
		System.out.println("\n Các ngày trong tháng hiện tại --> {");
		printDaysInrange(start, end);

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

	private static void printDaysInrange(Calendar startInclusive, Calendar endExclusive) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy EEEE");
		for (Calendar c = startInclusive; c.before(endExclusive); c.add(Calendar.DAY_OF_MONTH, 1)) {
			System.out.println(" +" + df.format(c.getTime()));
		}
		System.out.println("}");
	}

	private static boolean isLeapYear(int year) {
		GregorianCalendar gc = new GregorianCalendar();
		return gc.isLeapYear(year);
	}

}
