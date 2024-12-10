package view.datetime;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class Ex02InitialCalendar {
	
	public static void main(String[] args){
		// Calendar: Nhiều loại lịch(âm,dương)
		
		System.out.println("default locale: " + Locale.getDefault());
		Locale.setDefault(Locale.of("vi", "Vn"));
		
		TimeZone tz = TimeZone.getTimeZone("America/New_York");
		TimeZone.setDefault(tz);
		
		//lấy thời gian hiện tại
		Calendar c = Calendar.getInstance();
		System.out.println("calendar c --> " + c);
		
		// lấy thời gian với múi giờ theo hệ thống
		System.out.println("múi giờ: " + TimeZone.getDefault());
		
		// lấy tất cả cấc múi giờ mà ngôn ngữ hỗ trợ
		String[] zoneIds = TimeZone.getAvailableIDs();
		System.out.println("\n Múi giờ ngôn ngữ hỗ trợ");
		for (String zoneId: zoneIds) {
			System.out.println(zoneId);
		}
		
		c = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		System.out.println("c GMT --> " + c);
	}

}

