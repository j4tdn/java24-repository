package view.datetime;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class Ex02InitialCalendar {

	public static void main(String[] args) {
		// Ngày đầu tuần --> phụ thuộc vào locale mà ngôn ngữ đang cấu hình
		// locale(language, country): en_US
		
		System.out.println("default locale: " + Locale.getDefault());
		Locale.setDefault(new Locale("vi", "VN"));
		
		TimeZone tz = TimeZone.getTimeZone("Europe/Madrid");
		TimeZone.setDefault(tz);
		
		// Lấy thời gian hiện tại
		// java.util.GregorianCalendar[time=1732888237940,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Saigon",offset=25200000,dstSavings=0,useDaylight=false,transitions=10,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2024,MONTH=10,WEEK_OF_YEAR=48,WEEK_OF_MONTH=5,DAY_OF_MONTH=29,DAY_OF_YEAR=334,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=50,SECOND=37,MILLISECOND=940,ZONE_OFFSET=25200000,DST_OFFSET=0]
		Calendar c = Calendar.getInstance();
		System.out.println("calendar c --> " + c);
		
		// lấy thời gian với múi giờ theo OS
		System.out.println("múi giờ: " + TimeZone.getDefault());
		
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
