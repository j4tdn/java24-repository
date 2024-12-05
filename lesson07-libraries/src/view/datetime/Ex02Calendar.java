package view.datetime;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class Ex02Calendar {

	public static void main(String[] args) {
		// Calendar: Nhiều loại lịch âm/ dương
		// Tại thời điểm tạo hniều calendar thì giá trị nó chỉ trả về tgian hiện tại
		// --> nên dùng singelton pattern để cho phép tạo ra 1 đói tượng duy nhất cho
		// class

		// Ngày đầu tuần --> phụ th uộc vào ấci locale mà ngôn ngữ đang cấu hình
		// locale(language, country): en_US

		System.out.println("default locale: " + Locale.getDefault());
		Locale.of("vi", "VN");

		// lấy thời gian hiện tại
		Calendar c = Calendar.getInstance();
		System.out.println("Calendar c --> " + c);

		// lấy thời gian với time zone cũng ăn theo hệ thống
		// set timezone default
		TimeZone tz = TimeZone.getTimeZone("Europe/Madrid");
		TimeZone.setDefault(tz);

		System.out.println("múi giờ: " + TimeZone.getDefault());

		// Lấy tất cả múi giờ mà ngôn ngữ hỗ trợ
		String[] zoneIds = TimeZone.getAvailableIDs();
		System.out.println("Múi giờ ngôn ngữ hỗ trợ: ");
		for (String zoneId : zoneIds) {
			System.out.println(zoneId);

			/*
			 * Có 3 cách chia múi giờ:
			 * 
			 * GMT +- x
			 * 
			 * UTC +- x
			 * 
			 * Zone theo khu vực
			 * 
			 */

		}
		c = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		System.out.println(c);

	}
}
