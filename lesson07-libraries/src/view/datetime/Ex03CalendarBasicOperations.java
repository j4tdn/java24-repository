package view.datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex03CalendarBasicOperations {

	public static void main(String[] args) {
		
		// Calendar: lưu 2 loại hằng số
		// 1. Lưu các chỉ số
		// DAY_OF_MONTH: chỉ số của phần tử trong mảng
		// YEAR: chỉ số của phần tử trong mảng
		
		// 2. Lưu những hằng số của thời gian
		// Tháng: 0-11 ==> 1-12
		// JANUARY, FEBRUARY
		// SUNDAY, MONDAY ...(1-7)
		Calendar c = Calendar.getInstance();
		c.set(Calendar.MONTH, Calendar.JULY);;
		
		System.out.println("thời gian hiện tại: " + c);
		
		System.out.println("\n===========\n");
		
		int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH) + 1;
		int year = c.get(Calendar.YEAR);
		
		int hour = c.get(Calendar.HOUR); // clock 12
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		String ap = c.get(Calendar.AM_PM) == 1 ? "PM" : "AM";
		
		System.out.printf("Ngày tháng năm: %s/%s/%s \n", dayOfMonth,month,year);
		System.out.printf("Giờ phút giây: %s:%s:%s %s \n", hour,minute,second,ap);
		
		int daysInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		int daysInYear = c.getActualMaximum(Calendar.DAY_OF_YEAR);
		
		System.out.println("Số ngày trong tháng " + month + " là: " + daysInMonth);
		System.out.println("Số ngày trong năm " + year + " là: " + daysInYear);
		
		System.out.println("\n===========\n");
		
		// Muốn in ra ở định dạng này kia thì không get ra ...
		// Format: KDL --> String không ảnh hưởng đến kết quả
		DateFormat df = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss EEEE");
		
		Date date = c.getTime();
		
		String formated = df.format(date);
		System.out.println("d.M.y --> " + formated);
		
		// hiện tại: 29/7/2024
		// ngày này năm sau là thứ mấy
		c.add(Calendar.YEAR, 1);
		formated = df.format(c.getTime());
		System.out.println("formatted after 1 year --> " + formated);
		
		int fdow = c.getFirstDayOfWeek();
		System.out.println("firstDayOfWeek --> " + fdow);
	}
	
}
