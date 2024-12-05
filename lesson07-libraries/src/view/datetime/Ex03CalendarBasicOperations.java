package view.datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Ex03CalendarBasicOperations {

	public static void main(String[] args) {
		/*
		 
		 Calendar: lưu 2 loại const
		 
		 1. Lưu chỉ số
		 DAY_OF_MONTH: chỉ số của phần tử trong mảng
		 YEAR: chỉ số của phần tử trong mảng
		 
		 2. Lưu những hằng số của thời gian
		 Tháng: 0-11 ==> 1-12
		 */
		
		Calendar c = Calendar.getInstance();
		
		c.set(Calendar.MONTH, Calendar.NOVEMBER);
		
		System.out.println("Current time: " + c);
		
		System.out.println("\n===================\n");
		
		int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH) + 1;
		int year = c.get(Calendar.YEAR);
		System.out.printf("Date Month Yar: %s/%s/%s\n", dayOfMonth, month, year);
		
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int secound = c.get(Calendar.SECOND);
		String ap = c.get(Calendar.AM_PM) == 1 ? "PM" : "AM";
		
		System.out.printf("Hour Minute Secound: %s:%s:%s %s\n", hour, minute, secound, ap);
		
		// số ngày trong tháng
		int daysInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("Số ngày trong tháng " + month + " là: " + daysInMonth);
		
		System.out.println("\n===================\n");
		
		Locale vnLocale = Locale.of("vi", "VN");
		// Locale vnLocale = new Locale("vi", "VN");
		
		Date date = c.getTime();
		// Format: KDL --> String ko ảnh hưởng result
		DateFormat df = new SimpleDateFormat("dd.MM.yyyy EEEE HH:mm:ss", vnLocale);	
		String formatedDmy = df.format(date);
		System.out.println("Formatted --> " + formatedDmy);
		
		// ngày này năm sau là thứ mấy
		c.add(Calendar.YEAR, 1);
		
		formatedDmy = df.format(c.getTime());
		System.out.println("Formatted after 1 year --> " + formatedDmy);
	}
	 
}
