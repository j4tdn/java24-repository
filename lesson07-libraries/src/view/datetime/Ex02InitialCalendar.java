package view.datetime;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class Ex02InitialCalendar {

	public static void main(String[] args) {
		// Calendar: Nhiều loại lịch (âm/dương)

		// Ngày đầu tuần --> phụ thuộc vào locale mà ngôn ngữ đang cấu hình
		// locale(language, country,): en_US

		System.out.println("default locale: " + Locale.getDefault());
		Locale.setDefault(new Locale("vi", "VN"));

		// Áp dụng cho tất cả các calendar, date

		TimeZone tz = TimeZone.getTimeZone("Europe/Kiev");
		TimeZone.setDefault(tz);

		Calendar c = Calendar.getInstance();
		System.out.println("calendar c --> " + c);

		// Lấy thời gian và múi giờ theo hệ thống
		// ZoneIfo[id = "Asia/Bangkok"]
		System.out.println("Múi giờ: " + TimeZone.getDefault());

		/*
		 * Có 3 cách chia múi giờ: 
		 * + GMT +- x
		 * + UTC +- x 
		 * + Zone theo khu vực/quốc gia
		 */

		// Lấy tất cả các múi giờ mà ngôn ngữ hỗ trợ
		String[] zoneIds = TimeZone.getAvailableIDs();
		System.out.println("\nMúi giờ ngôn ngữ hỗ trợ");
		for (String zoneId : zoneIds) {
			System.out.println(zoneId);
		}

		c = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		System.out.println("c GMT --> " + c);

	}

}
