package view.datetime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class Ex03DateFunc {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhap khu vuc: ");
		String area = ip.nextLine();
		timeInZone(area, "dd/MM/yyyy HH:mm:ss");
		printLastDayOfMonth(Calendar.getInstance());
		firstDayAndLast(Calendar.getInstance());
		numberWeekOfYear(c);
		dateAfter20Days(c, "dd/MM/yyyy EEEE");
		Calendar birthDate = null;
		try {
			birthDate = toCalc("17/05/2004", "dd/MM/yyyy");
			dayOfBirth(birthDate);
		} catch (IllegalArgumentException iae) {
			System.out.println(iae.getMessage());
		}
		ip.close();
	}

	public static void timeInZone(String timeZone, String pattern) {
		
		Calendar c = Calendar.getInstance(TimeZone.getTimeZone(timeZone));
		DateFormat df = new SimpleDateFormat(pattern);
		System.out.println("Thời gian hiện tại ở khu vực " + timeZone + " --> " + df.format(c.getTime()));

	}

	public static void printLastDayOfMonth(Calendar source) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Calendar end = cloneAndSet(source, Calendar.DAY_OF_MONTH, source.getActualMaximum(Calendar.DAY_OF_MONTH));

		System.out.println("Ngày cuối cùng trong tháng --> " + df.format(end.getTime()));

	}

	public static void firstDayAndLast(Calendar source) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Calendar first = cloneAndSet(source, Calendar.DAY_OF_WEEK, 1);
		Calendar last = cloneAndSet(source, Calendar.DAY_OF_WEEK, source.getActualMaximum(Calendar.DAY_OF_WEEK));

		System.out.println("Ngày đầu tuần là: " + df.format(first.getTime()) + " || " + " Ngày cuối tuần là: "
				+ df.format(last.getTime()));
	}

	public static void numberWeekOfYear(Calendar source) {
		Calendar c = Calendar.getInstance();
		System.out.println("Đây là tuần thứ " + c.get(Calendar.WEEK_OF_YEAR) + " of "
				+ c.getActualMaximum(Calendar.WEEK_OF_YEAR) + " trong năm " + c.get(Calendar.YEAR));

	}

	public static void dateAfter20Days(Calendar source, String pattern) {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, 20);
		DateFormat df = new SimpleDateFormat(pattern);
		System.out.println("Sau 20 ngày nữa là ngày: " + df.format(c.getTime()));
	}

	public static void dayOfBirth(Calendar dOb) {
		Calendar bornDate = dOb;
		Calendar now = Calendar.getInstance();
		
		if(bornDate.after(now)) {
			throw new IllegalArgumentException("Ngay sinh khong hop le !!!!");
		} else {
			long start = bornDate.getTimeInMillis();
			long end  = now.getTimeInMillis();
			
			long duration = end - start;
			long days = TimeUnit.MILLISECONDS.toDays(duration);
			System.out.println("Bạn đã sống được " + days + " ngày");
		}
		

	}

	private static Calendar toCalc(String dateAsString, String pattern) {
		Calendar c = Calendar.getInstance();
		DateFormat df = new SimpleDateFormat(pattern);
		try {
			Date date = df.parse(dateAsString);
			c.setTime(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return c;
	}

	private static Calendar cloneAndSet(Calendar source, int field, int value) {
		Calendar target = Calendar.getInstance();
		target.setTimeInMillis(source.getTimeInMillis());
		target.set(field, value);
		return target;
	}

}
