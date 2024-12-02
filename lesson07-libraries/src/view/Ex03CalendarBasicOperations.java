package view;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Ex03CalendarBasicOperations {

	public static void main(String[] args) {
		/*
		 * Calendar int[] fields ... {2024, 10}
		 * 
		 * private static final int YEAR = 0;
		 * 
		 * set(0, 2024); --> set(YEAR, 2024) set(1, 10) --> set(MONTH, 10)
		 * 
		 * get(0) --> get(YEAR) get(1)
		 * 
		 * year setYear getYear
		 * 
		 * 
		 * Calendar: lưu 2 loại hằng số
		 * 
		 * 1. Lưu các chỉ số DAY_OF_MOHTH: chỉ số của phần tử trong mảng YEAR: chỉ số
		 * của phần tử trong mảng
		 * 
		 * 2. Lưu những hàng số của thời gian Tháng: 0-11 ==> 1-12 JANUARY, FEBRUARY
		 * SUNDAY, MONDAY ...(1-7)
		 */
		Calendar c = Calendar.getInstance();
		c.set(Calendar.MONTH, Calendar.JULY);

		System.out.println("Thời gian hiện tại: " + c);

		System.out.println("\n=============\n");

		// Nếu muốn lấy ra để đi tính toán thì mới lấy ra

		int dayOfMoth = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH) + 1;
		int year = c.get(Calendar.YEAR);

		int hour = c.get(Calendar.HOUR); // clock 12
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		String ap = c.get(Calendar.AM_PM) == 1 ? "PM" : "AM";

		System.out.printf("Ngày tháng năm %s/%s/%s\n", dayOfMoth, month, year);
		System.out.printf("Giờ phút giây  %s:%s:%s\n", hour, minute, second, ap);

		// số ngày trong tháng
		int daysInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH); // Xem lại
		int daysInYear = c.getActualMaximum(Calendar.DAY_OF_YEAR);

		System.out.println("Số ngày trong tháng " + month + " là " + daysInMonth);
		System.out.println("Số ngày trong năm " + year + " là " + daysInYear);

		System.out.println("\n=============\n");

		Locale.setDefault(Locale.of("vi", "VN"));

		// Muốn in ra ở định dạng này kia thì không get ra ...
		// Format: KDL --> String không ảnh hưởng kết quả
		DateFormat df = new SimpleDateFormat("dd.MM.yyyy  HH:mm:ss EEEE");

		Date date = c.getTime();

		String formated = df.format(date);

		System.out.println("formated --> " + formated);

		// hiện tại: 29.07.2024
		// ngày này năm sau là thứ mấy
		c.add(Calendar.YEAR, 1);
		formated = df.format(c.getTime());
		System.out.println("foramtted after 1 year --> " + formated);

		int fdow = c.getFirstDayOfWeek();
		System.out.println("firstDayOfWeek --> " + fdow);
	}

}
