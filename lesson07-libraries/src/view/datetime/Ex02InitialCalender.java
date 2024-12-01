package view.datetime;


import java.time.ZoneId;
import java.util.Calendar;
import java.util.TimeZone;

public class Ex02InitialCalender {
	public static void main(String[] args) {
		/*
		 * Calendar
		 * 
		 * UTC : Coordinated Universal Time (Thời gian tiêu chuẩn) 
		 */
		
		// Ngày đầu tuần --> phụ thuộc vào cái locale mà ngôn ngữ đang cấu hình 
		//locale(lang, country)
		
		System.out.println("default locale "+TimeZone.getDefault());
		
		TimeZone tz = TimeZone.getTimeZone("Europe/Madrid");
		TimeZone.setDefault(tz);
		
		// Lấy thời gian hiện tại
		Calendar c = Calendar.getInstance();
		System.out.println("Calendar c --> "+c);
		
		// Lấy thời gian với múi giờ(timezone)
		
		System.out.println("Múi giờ : "+TimeZone.getDefault());
		
		//Lấy tất cả các múi giờ mà ngôn ngữ hỗ trợ 
		String[] zoneIds = TimeZone.getAvailableIDs();
		System.out.println("Múi giờ ngôn ngữ hỗ trợ");
		for(String zoneId : zoneIds ) {
			System.out.println(zoneId);
		}
		
		//set default 
		c = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		System.out.println("c GMT --> "+c);
		
	}
}
