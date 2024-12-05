package view.datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Ex03CalendarBasicOperations {

	public static void main(String[] args) {
		/*
		 * Calendar int[] fields ...
		 * 
		 * year setYear getYear
		 * 
		 * Calendar: lưu 2 loại hằng số:
		 * 
		 * 1. Lưu những chỉ số
		 * 
		 * DAY_OF_MONTH: chỉ só của phần tử trong mảng YEAR: chỉ số của phần tử trong
		 * mảng
		 * 
		 * 2. Lưu những hằng số của thời gian Tháng: 0-11 ==> 1-12 JANUARY, FEBRUARY
		 * SUNDAY, MONDAY (1-7)
		 */

		// Nếu muón lấy để tính toán thì mới lấy ra
		Calendar c = Calendar.getInstance();
		// c.set(Calendar.MONTH, Calendar.JULY);
		System.out.println(c);

		int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;

		System.out.printf("%s/%s/%s \n", dayOfMonth, month, year);

		int hour = c.get(Calendar.HOUR); // clock 12
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		String ap = c.get(Calendar.AM_PM) == 1 ? "PM" : "AM";

		System.out.printf("%s:%s:%s %s\n", hour, minute, second, ap);

		// Số ngày trong tháng
		int daysInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("Số ngày trong tháng " + month + " là " + daysInMonth);

		Locale vnLocale = Locale.of("vi", "VN");
		// Muốn in ra ở định dạng này kia thì ko get ra ...
		// Format: KDL --> String ko ảnh hưởng kq
		DateFormat df = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss EEEE", vnLocale);

		Date date = c.getTime();
		String formartedDmy = df.format(date);
		System.out.println("d.M.y --> " + formartedDmy);
		// hiện tại 29.07.2024
		// ngày này năm sau là thứ mấy ?
		c.add(Calendar.YEAR, 1);
		formartedDmy = df.format(c.getTime());
		System.out.println("Formatted after 1 year --> " + formartedDmy);

		int fdow = c.getFirstDayOfWeek();
		System.out.println("first day --> " + fdow);

		// Số ngày trong năm hiện tại
		System.out.println(c.getActualMaximum(Calendar.DAY_OF_YEAR));
		// Ngày thứ mấy trong năm
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
	}

}
