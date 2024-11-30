package view;

import java.sql.Time;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class Ex02InitialCalendar {
	
	public static void main(String[] args) {
		// Calendar: Nhiều loại lịch (âm/dương)
		// Tại một thời điểm tạo nhiều calendar thì giá trị nó chỉ trả
		// về thời gian hiện tại --> sử dụng singleton pattern để
		// chỉ cho phép tạo ra 1 đối tượng duy nhất cho class
		
		// ăn cho tất cả các calendar, date
		
		TimeZone tz = TimeZone.getTimeZone("Europe/Madrid");
		TimeZone.setDefault(tz);
		
		// Ngày đầu tuần --> phụ thuộc vào cái locale và ngôn ngữ đang cấu hình
		// locale(country, language):US_EN
		
		System.out.println("default locale: " + Locale.getDefault());
		Locale.setDefault(Locale.of("vi","VN"));
		
		// lấy thời gian hiện tại
		Calendar c = Calendar.getInstance();
		System.out.println("calendar c --> " + c);
		
		// lấy thời gian với múi giờ theo hệ thống
		// ZoneInfo[id="Asia/Saigon"		
		System.out.println("Múi giờ: " + TimeZone.getDefault());
		
		/*
		 Có 3 cách chia múi giờ
		 + GMT +- x
		 + UTC +- x --> xem lại video đoạn giải thích cái này
		 + Zone theo khu vực/quốc gia
		 */
		
		// lấy tất cả các múi giờ mà ngôn ngữ hỗ trợ
		String[] zoneIds = TimeZone.getAvailableIDs();
		System.out.println("\n Múi giờ ngôn ngữ hỗ trợ");
		for (String zoneId : zoneIds) {
			System.out.println(zoneId);
		}
		
		c = Calendar.getInstance(TimeZone.getTimeZone("GMT")); // Xem lại video chỗ này
		System.out.println("c GMT --> " + c);
		
		// setDefault
	}

}
