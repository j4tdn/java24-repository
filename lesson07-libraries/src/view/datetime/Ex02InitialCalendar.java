package view.datetime;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class Ex02InitialCalendar {

	public static void main(String[] args) {
		// Calendar: nhiều loại lịch(âm/ dương)
		// Tại 1 thời điểm tạo nhiều calendar thì value chỉ return current time
		
		System.out.println("Default locale: " + Locale.getDefault());
		
		Locale.setDefault(Locale.of("vi", "VN"));
		
		TimeZone tz = TimeZone.getTimeZone("Europe/Madrid");
		TimeZone.setDefault(tz);
		
		Calendar c = Calendar.getInstance();
		System.out.println("Calendar --> " + c);
		
		// lấy time vs múi giờ theo hệ thống
		System.out.println("Múi giờ: " + TimeZone.getDefault());
		
		/* có 3 cách chia múi giờ:
		 + GMT +- x
		 + UTC +- x
		 + Zone theo area/ country
		 */
		
		// lấy all múi giờ mà language support
		String[] zoneIds = TimeZone.getAvailableIDs();
		System.out.println("\nMúi giờ ngôn ngữ hỗ trợ: ");
		for (String zoneId : zoneIds) {
			System.out.println(zoneId);
		}
		
		c = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		System.out.println("c GMT --> " + c);
		
		
	}
	
}
