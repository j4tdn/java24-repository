package view.datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import utils.DateTimeUtils;

public class Ex03 {

	public static void main(String[] args) {
		presentTimeOf("Asia/Shanghai");
		lastDayOfMonth();
		firstAndLastDay();
		presentWeek();
		addDay();
		dayExisted();

	}

	private static void presentTimeOf(String timeZone) {
		TimeZone tz = TimeZone.getTimeZone(timeZone);
		TimeZone.setDefault(tz);

		Calendar c = Calendar.getInstance();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date presentTime = DateTimeUtils.toDate(c);
		System.out.printf("Thời gian hiện tại của %s là: %s \n", timeZone, df.format(presentTime));
		System.out.println("=============================================");

	}

	private static void lastDayOfMonth() {
		Calendar c = Calendar.getInstance();
		System.out.printf("Ngày cuối cùng của tháng hiện tại: %s\n", c.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println("=============================================");
	}

	private static void firstAndLastDay() {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy EEEE");
		Calendar first = clone(Calendar.getInstance());
		first.add(Calendar.DAY_OF_MONTH, first.getFirstDayOfWeek() - first.get(Calendar.DAY_OF_WEEK));
		System.out.println("First day: " + df.format(first.getTime()));
		Calendar last = clone(first);
		last.add(Calendar.DAY_OF_MONTH, 6);
		System.out.println("Last day: " + df.format(last.getTime()));
		System.out.println("=============================================");

	}

	private static void presentWeek() {
		Calendar c = Calendar.getInstance();
		System.out.printf("Ngày hiện tại là tuần thứ %s trong năm \n", c.get(Calendar.WEEK_OF_YEAR));
		System.out.println("=============================================");
	}

	private static void addDay() {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy EEEE");
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, 20);
		System.out.printf("Sau 20 ngày: %s \n", df.format(c.getTime()));
		System.out.println("=============================================");
	}

	private static void dayExisted() {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập vào ngày tháng năm sinh (dd/MM/yyyy): ");
		String birth = ip.nextLine();

		Calendar c = Calendar.getInstance();
		Calendar dayOfBirth = DateTimeUtils.toCalendar(birth, "dd/MM/yyyy");

		long duration = c.getTimeInMillis() - dayOfBirth.getTimeInMillis();

		System.out.printf("Số ngày sống được: %s ngày\n", TimeUnit.MILLISECONDS.toDays(duration));
		System.out.println("=============================================");

	}

	private static Calendar clone(Calendar source) {
		Calendar target = Calendar.getInstance();
		target.setTimeInMillis(source.getTimeInMillis());

		return target;
	}
}
