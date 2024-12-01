package view.datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Ex03CalendarBasicOperations {
	public static void main(String[] args) {
		/*
		 Calendar : Lưu 2 dạng hằng số
		 
		 1.
		 DAY_OF_MONTH : Chỉ số của phần tử trog mảng 
		 YEAR : Chỉ số của phần từ trong mảng
		 
		 2. Lưu những hằng số của thời gian 
		 Tháng: 0-11 ==> 1-12
		 JANUARY, FEBRUARY
		 SUNDAY, MONDAY(1-7)
		 */
		
		
		
		Calendar c = Calendar.getInstance();
		
		System.out.println("Thời gian hiện tại : "+c);
		
		System.out.println("\n=====================\n");
		
		int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH)+1;
		int year = c.get(Calendar.YEAR);
		int hour = c.get(Calendar.HOUR);// clock 12
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		String ap = c.get(Calendar.AM_PM) == 1 ? "PM" : "AM";
		
		
		System.out.printf("Ngày tháng năm : %s/%s/%s\n",dayOfMonth,month,year);
		System.out.printf("Giờ phút giây : %s:%s:%s %s\n",hour,minute,second,ap);
		
		// Lấy số ngày trong tháng
		int daysInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		int daysInYear = c.getActualMaximum(Calendar.DAY_OF_YEAR); // Trả về ngày trong năm hiện tại
		//int daysInYear = c.get(Calendar.DAY_OF_YEAR); --> Trả về ngày thứ mấy trong năm
		
		System.out.println("Số ngày trong tháng "+month+" là "+daysInMonth);
		System.out.println("Số ngày trong năm "+year+" là "+daysInYear);
		
		// In tiếng việt 
		Locale vnLocale = new Locale("vi","VN");
		
		//Muốn in ra ở định dạng này kia thì không get ra 
		//Format: Chuyển từ KDL gì đó sang String mà không ảnh hướng đến kết quả
		DateFormat df = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss a EEEE", vnLocale);
		
		//Chuyển đổi Date - Calendar
		Date date = c.getTime();
		String formated = df.format(date);
		System.out.println("formated --> "+formated);
		
		//Hàm tìm ngày này năm sau là thứ mấy
		c.add(Calendar.YEAR,1);
		formated = df.format(c.getTime());
		System.out.println("formated after 1 year --> "+formated);
	}
}
