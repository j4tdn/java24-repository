package view.datetime;

import java.util.Calendar;
import java.util.TimeZone;

public class Ex02InitialCalendar {

	public static void main(String[] args) {
		
		
		//Ngày đầu tuần --> phụ thuộc vào cái locale mà ngôn ngữ đang cấu hình
		// locale(language, country): "vi", "VN"
		
		
		/*
		 Có 3 cách chia múi giờ
		 + GMT +- x
		 + UTC +- x
		 + Zone theo khu vực/quốc gia 
		 */
		
		
		Calendar c = Calendar.getInstance();
		System.out.println("Calendar c --> " + c);
		
		//Lấy thời gian với múi giờ theo hệ thống
		System.out.println("múi giờ: " + TimeZone.getDefault());
		
		//Lấy tất cả các múi giờ mà ngôn ngữ hỗ trợ
		String[] zoneIds = TimeZone.getAvailableIDs();
		System.out.println("\nMui gio ngon ngu ho tro: ");
		for (String zoneId : zoneIds) {
			System.out.println(zoneId);
		}
		
		
		
	}
	
}
