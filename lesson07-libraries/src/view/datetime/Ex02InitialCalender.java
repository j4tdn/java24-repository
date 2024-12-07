package view.datetime;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class Ex02InitialCalender {

	public static void main(String[] args) {
		// Calender: Nhiều loại lịch(âm/dương)
		// Tại 1 thời điểm tạo nhiều calender thì giá trị nó chỉ
		// trả về thời gian hiện tại --> sử dụng singleton
		// chỉ cho phép tại ra 1 đối tượng duy nhất 
		
		// Ngày đàu tuần --> phụ thuộc vào cái locale mà ngôn ngữ đang cấu hình
		// locale(country, laguage): US_EN
		System.out.println("default locale " + TimeZone.getDefault());
		Locale.setDefault(Locale.of("vi", "VN"));
		
		TimeZone tz = TimeZone.getTimeZone("Europe/Berlin");
		TimeZone.setDefault(tz);
		
		Calendar c = Calendar.getInstance();
		System.out.println("calender c --> " + c);
		
		// lấy thời gian với múi giờ hệ thống
		// ZoneInfo[id="Asia/Saigon"]
		System.out.println("Múi giờ: " + TimeZone.getDefault());
		
		
		// lấy tất cả múi giờ mà ngôn ngữ hỗ trợ
		System.out.println("Múi giờ ngôn ngữ hỗ trợ");
		String[] zoneIds = TimeZone.getAvailableIDs();
		for (String zoneId:zoneIds) {
			System.out.println(zoneId);
		}
		
		c = Calendar.getInstance(TimeZone.getTimeZone("GTM"));
		System.out.println("c GTM --> " + c);
		
	}
	
}
