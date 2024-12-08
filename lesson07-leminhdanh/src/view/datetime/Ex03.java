package view.datetime;

import static utils.DateTimeUtils.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import utils.DateTimeUtils;

public class Ex03 {
	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		currentTime(c);
		lastDayOfMonth(c);
		firstAndLastDayOfWeek(c);
		currentWeekOfYear(c);
		after20Days(c);
		daysOld();
	}
	
	
	private static void currentTime(Calendar c) {
		System.out.print("Nhập múi giờ:");
		String timeZone = ip.nextLine();
		c = Calendar.getInstance(TimeZone.getTimeZone(timeZone));
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println("Thời gian hiện tại là " + df.format(c.getTime()));
	}
	
	private static void lastDayOfMonth(Calendar c) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Calendar date =  DateTimeUtils.cloneAndSet(c, Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		System.out.println("Ngày cuối cùng của tháng là " + df.format(date.getTime()));
	}
	
	private static void firstAndLastDayOfWeek(Calendar c) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		int firstDay = c.getFirstDayOfWeek();
		Calendar first = DateTimeUtils.cloneAndSet(c, Calendar.DAY_OF_WEEK, firstDay);
		String firstDayOfWeek = df.format(first.getTime());
	 	Calendar last =  DateTimeUtils.cloneAndSet(c, Calendar.DAY_OF_WEEK, firstDay + 6);
		String lastDayOfWeek = df.format(last.getTime());
		System.out.println("Ngày đầu tiên của tuần hiện tại là " + firstDayOfWeek);
		System.out.println("Ngày cuối cùng của tuần hiện tại là " + lastDayOfWeek);
	}
	
	private static void currentWeekOfYear(Calendar c) {
		System.out.println("Hiện tại đang là tuần thứ " + c.get(Calendar.WEEK_OF_YEAR) + " trong năm");
	}
	
	private static void after20Days(Calendar c) {
		c.add(Calendar.DAY_OF_YEAR, 20);
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy EEEE");
		String day = df.format(c.getTime());
		System.out.println("Sau 20 ngày nữa là ngày " + day);
	}
	
	private static void daysOld() {
		System.out.print("Nhập ngày tháng năm sinh(dd.MM.yyyy): ");
		String str = ip.nextLine();
		String pattern = "dd.MM.yyyy";
		Calendar birthday = toCalendar(str, pattern);
		Calendar now = Calendar.getInstance();
		
		long duration = now.getTimeInMillis() - birthday.getTimeInMillis();
		
		long daysOld = TimeUnit.MILLISECONDS.toDays(duration);
		System.out.println("Bạn đã sống được " + daysOld + " ngày");
	}
}
