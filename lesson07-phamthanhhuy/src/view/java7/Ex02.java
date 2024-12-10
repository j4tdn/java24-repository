package view.java7;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

import utils.DateTimeUtils;

public class Ex02 {

	private static Locale VIETNAM = new Locale("vi", "VN");

	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {

		// 12.10.2003
		System.out.print("Nhập ngày: ");
		String day = ip.nextLine();

		Calendar cal = DateTimeUtils.toCalendar(day, "dd.MM.yyyy");

		DateFormat df = new SimpleDateFormat("dd.MM.yyyy", VIETNAM);
		String fomarttedDay = df.format(cal.getTime());

		DateFormat dfDayOfWeek = new SimpleDateFormat("EEEE", VIETNAM);

		System.out.println("Ngày " + fomarttedDay + " là " + dfDayOfWeek.format(cal.getTime()));

		int year = cal.get(Calendar.YEAR);

		System.out.println("Năm " + year + " có " + cal.getActualMaximum(Calendar.DAY_OF_YEAR) + " ngày.");

		int month = cal.get(Calendar.MONTH) + 1;

		System.out.println(
				"Tháng " + month + " năm " + year + " có " + cal.getActualMaximum(Calendar.DAY_OF_MONTH) + " ngày");

		Calendar[] daysOfWeek = getDayofWeek(cal);
		int positionOfDayOfWeek = 0;
		for (int i = 0; i < daysOfWeek.length; i++) {
			if (daysOfWeek[i].get(Calendar.DAY_OF_MONTH) == cal.get(Calendar.DAY_OF_MONTH)) {
				positionOfDayOfWeek = i + 1;
				break;
			}
		}

		System.out.println("Ngày " + dfDayOfWeek.format(cal.getTime()) + " là ngày " + dfDayOfWeek.format(cal.getTime())
				+ " thứ " + positionOfDayOfWeek + "/" + daysOfWeek.length + " của tháng ");

		int theDayLeft = cal.getActualMaximum(Calendar.DAY_OF_YEAR) - cal.get(Calendar.DAY_OF_YEAR);
		System.out.println("Ngày này là ngày thứ " + cal.get(Calendar.DAY_OF_YEAR) + " trong năm, còn lại " + theDayLeft
				+ " ngày");
	}

	private static Calendar[] getDayofWeek(Calendar source) {
		Calendar start = cloneAndSet(source, Calendar.DAY_OF_MONTH, 1);
		Calendar end = cloneAndSet(source, Calendar.DAY_OF_MONTH, source.getActualMaximum(Calendar.DAY_OF_MONTH));
		end.add(Calendar.DAY_OF_MONTH, 1);

		Calendar[] target = new Calendar[5];
		int count = 0;

		boolean found1stDayOfWeek = false;

		for (Calendar c = start; c.before(end);) {
			if (found1stDayOfWeek) {
				target[count++] = clone(c);
				c.add(Calendar.DAY_OF_MONTH, 7);
				continue;
			}
			if (c.get(Calendar.DAY_OF_WEEK) == source.get(Calendar.DAY_OF_WEEK)) {
				target[count++] = clone(c);
				c.add(Calendar.DAY_OF_MONTH, 7);
				found1stDayOfWeek = true;
				continue;
			}
			c.add(Calendar.DAY_OF_MONTH, 1);
		}
		return Arrays.copyOfRange(target, 0, count);
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

	private static boolean isLeapyear(int year) {
		GregorianCalendar gc = new GregorianCalendar();
		return gc.isLeapYear(year);
	}
}
