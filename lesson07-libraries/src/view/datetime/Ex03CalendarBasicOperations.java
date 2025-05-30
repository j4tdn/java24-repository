package view.datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Ex03CalendarBasicOperations {
	
	public static void main(String[] args) {
		/*
		 Calendar
		 int[] fields ... {2024, 10}
		 
		 private static final int YEAR = 0;
		 
		 set(0, 2024); --> set(YEAR, 2024)
		 set(1, 10)    --> set(MONTH, 10)
		 
		 get(0) --> get(YEAR)
		 get(1)
		 
		 year
		 setYear
		 getYear
		 
		 
		 Calendar: lưu 2 loại hằng số
		 
		 1. Lưu các chỉ số
		 DAY_OF_MOHTH: chỉ số của phần tử trong mảng
		 YEAR: chỉ số của phần tử trong mảng
		 
		 2. Lưu những hàng số của thời gian
		 Tháng: 0-11 ==> 1-12
		 JANUARY, FEBRUARY
		 SUNDAY, MONDAY ...(1-7)
		 
		 */
		
		
		Locale.setDefault(Locale.FRANCE);
		
		Calendar c = Calendar.getInstance();
		c.set(Calendar.MONTH, Calendar.JULY);
		
		// YEAR=2024,MONTH=10,WEEK_OF_YEAR=48,WEEK_OF_MONTH=5,DAY_OF_MONTH=29,DAY_OF_YEAR=334,DAY_OF_WEEK=6
		System.out.println("Thời gian hiện tại: " + c);
		
		System.out.println("\n==========\n");
		
		// Nếu muốn lấy ra để đi tính toán thì mới mới lấy ra
		
		int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH) + 1;
		int year = c.get(Calendar.YEAR);
		
		int hour = c.get(Calendar.HOUR); // clock 12
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		String ap = c.get(Calendar.AM_PM) == 1 ? "PM" : "AM";
		
		System.out.printf("Ngày tháng năm: %s/%s/%s\n", dayOfMonth, month, year);
		System.out.printf("Giờ phút giây: %s:%s:%s %s \n", hour, minute, second, ap);
		
		// số ngày trong tháng
		int daysInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		int daysInYear = c.getActualMaximum(Calendar.DAY_OF_YEAR);
		
		System.out.println("Số ngày trong tháng " + month + " là " + daysInMonth);
		System.out.println("Số ngày trong năm " + year + " là " + daysInYear);
		
		System.out.println("\n==========\n");
		
		// Muốn in ra ở định dạng này kia thì ko get ra ...
		// Format: KDL --> String ko ảnh hưởng kết quả
		Locale vnLocale = new Locale("vi", "VN");
		DateFormat df = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss EEEE", vnLocale);
		Date date = c.getTime();
		String formated = df.format(date);
		System.out.println("formatted --> " + formated);
		
		// hiện tại: 29.07.2024
		// ngày nay năm sau là thứ mấy
		c.add(Calendar.YEAR, 1);
		formated = df.format(c.getTime());
		System.out.println("formatted after 1 year --> " + formated);
		
		int fdow = c.getFirstDayOfWeek();
		System.out.println("firstDayOfWeek --> " + fdow);
	}
	
}
