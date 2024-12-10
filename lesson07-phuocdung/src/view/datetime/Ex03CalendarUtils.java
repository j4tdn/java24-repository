package view.datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Ex03CalendarUtils {

	public static void main(String[] args) {
		System.out.println("Các khu vực timezone hỗ trợ");

		String[] zoneIds = TimeZone.getAvailableIDs();
		for (String zoneId : zoneIds) {
			System.out.print(zoneId + ",");
		}
		System.out.println("");

		// 1. Xem thời giạn hiện tại ở khu vực bất kì
		currentTimeByRegion("Asia/Seoul");

		// 2. In ngày cuối cùng của tháng hiện tại
		Calendar c = Calendar.getInstance();
		getLastDayInMonth(c);

		// 3. Xem ngày đầu tiên và cuối cung của tuần hiện tại
		Calendar c1 = Calendar.getInstance();
		firstAndLastDaysOfWeek(c1);

		// 4. Xem ngày hiện tại đang ở tuần thứ mấy trong năm
		Calendar c2 = Calendar.getInstance();
		countWeeksOfYear(c2);

		// 5. Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy
		Calendar c3 = Calendar.getInstance();
		afterNDays(c3, 20);

		// 6. Nhập vao ngày tháng năm sinh. Kiểm tra xem bạn đã sống được bao nhiêu ngày
		Calendar c4 = Calendar.getInstance();
		countDays(c4, "12/06/1997");

	}

	private static void countDays(Calendar source, String dateAsString) {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Calendar c = Calendar.getInstance();

		try {
			Date date = dateFormat.parse(dateAsString);
			source.setTime(date);
		} catch (Exception e) {

		}
		
		long timeEnd = c.getTimeInMillis();
		long timeStart = source.getTimeInMillis();

		long days = (timeEnd - timeStart) / (24 * 60 * 60 * 1000) ;
		System.out.printf("Bạn đã sống được %s ngày ", days);
	}

	private static void afterNDays(Calendar source, int count) {
		source.add(Calendar.DAY_OF_YEAR, count);
		DateFormat dateFormat = new SimpleDateFormat("EEEE dd/MM/yyyy");
		System.out.printf("Sau %s ngày nữa là %s \n", count, dateFormat.format(source.getTime()));
	}

	private static void countWeeksOfYear(Calendar source) {
		System.out.println("Hôm nay đang ở tuần thứ " + source.get(Calendar.WEEK_OF_YEAR) + " trong năm");
	}

	private static Calendar clone(Calendar source) {
		Calendar target = Calendar.getInstance();
		target.setTimeInMillis(source.getTimeInMillis());
		return target;
	}

	private static void firstAndLastDaysOfWeek(Calendar source) {
		int diffence = source.get(Calendar.DAY_OF_WEEK) - source.getActualMinimum(Calendar.DAY_OF_WEEK);

		Calendar firstDaysOfWeek = clone(source);
		Calendar lastDaysOfWeek = clone(source);

		firstDaysOfWeek.add(Calendar.DAY_OF_WEEK, -diffence);
		lastDaysOfWeek.add(Calendar.DAY_OF_WEEK, 6 - diffence);

		DateFormat dateFormat = new SimpleDateFormat("EEE dd/MM/yyyy");

		System.out.println("Ngày đầu tiên của tuần hiện tại : " + dateFormat.format(firstDaysOfWeek.getTime()));
		System.out.println("Ngày cuối cùng của tuần hiện tại : " + dateFormat.format(lastDaysOfWeek.getTime()));

	}

	private static void currentTimeByRegion(String region) {
		TimeZone tz = TimeZone.getTimeZone(region);
		TimeZone.setDefault(tz);

		Calendar c = Calendar.getInstance();

		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		System.out.println(dateFormat.format(c.getTime()));
	}

	private static void getLastDayInMonth(Calendar source) {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		int currentDayInMonth = source.get(Calendar.DAY_OF_MONTH);
		int lastDayInMonth = source.getActualMaximum(Calendar.DAY_OF_MONTH);
		int difference = lastDayInMonth - currentDayInMonth;

		source.add(Calendar.DAY_OF_MONTH, difference);

		System.out.println("Ngày cuối cùng của tháng hiện tại : " + dateFormat.format(source.getTime()));
	}

}
