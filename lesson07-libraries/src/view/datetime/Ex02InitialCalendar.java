package view.datetime;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class Ex02InitialCalendar {
	
	public static void main(String[] args) {
		// Calendar: Nhiều loại lịch(âm/dương)
		// Tại một thời điểm tạo nhiều calendaer thì giá trị nó chỉ trả
		// về thời gian hiện tại --> sử dụng singleton pattern để
		// chỉ cho phép tạo ra 1 đối tượng duy nhất cho class
		
		// Ngày đầu tuần --> phụ thuộc vào cái locale mà ngôn ngữ đang cấu hình
		// locale(language, country): en_US
		
		System.out.println("default locale: " + Locale.getDefault());
		Locale.setDefault(new Locale("vi", "VN"));
		
		// ăn cho tất cả các calendar, date
		
		TimeZone tz = TimeZone.getTimeZone("Europe/Madrid");
		TimeZone.setDefault(tz);
		
		// lấy thời gian hiện tại
		// java.util.GregorianCalendar[time=1732888233122,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Bangkok",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2024,MONTH=10,WEEK_OF_YEAR=48,WEEK_OF_MONTH=5,DAY_OF_MONTH=29,DAY_OF_YEAR=334,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=50,SECOND=33,MILLISECOND=122,ZONE_OFFSET=25200000,DST_OFFSET=0]
		Calendar c = Calendar.getInstance();
		System.out.println("calendar c --> " + c);
		
		// lấy thời gian với múi giờ theo hệ thống
		// ZoneInfo[id="Asia/Bangkok"]
		System.out.println("Múi giờ: " + TimeZone.getDefault());
		
		/*
		 Có 3 cách chia múi giờ
		 + GMT +- x
		 + UTC +- x
		 + Zone theo khu vực/quốc gia
		 */
		
		// lấy tất cả các múi giờ mà ngôn ngữ hỗ trợ
		String[] zoneIds = TimeZone.getAvailableIDs();
		System.out.println("\nMúi giờ ngôn ngữ hỗ trợ");
		for (String zoneId: zoneIds) {
			System.out.println(zoneId);
		}
		
		c = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		System.out.println("c GMT --> " + c);
	}
	
}