package view.localdatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.IsoFields;
import java.util.Locale;
import java.util.Scanner;

public class Ex03 {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2003, 03, 17);
		currentTime();
		lastDayOfMonth(date);
		firstAndLastDayOfWeek(date);
		currentWeekOfYear(date);
		after20Days(date);
		daysOld();
	}

	private static void currentTime() {
		System.out.print("Nhập múi giờ:");
		String timeZone = ip.nextLine();
		LocalDateTime date = LocalDateTime.now(ZoneId.of(timeZone));
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss", Locale.of("vi", "VN"));
		System.out.println("Thời gian hiện tại là " + date.format(formatter));
	}

	private static void lastDayOfMonth(LocalDate date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy", Locale.of("vi", "VN"));

		date = date.withDayOfMonth(date.lengthOfMonth());

		System.out.println("Ngày cuối cùng của tháng là ngày " + date.format(formatter));
	}

	private static void firstAndLastDayOfWeek(LocalDate date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy", Locale.of("vi", "VN"));

		LocalDate firstDay = date.with(DayOfWeek.MONDAY);
		LocalDate lastDay = date.with(DayOfWeek.SUNDAY);

		System.out.println("Ngày đầu tiên trong tuần là ngày " + firstDay.format(formatter));
		System.out.println("Ngày cuối cùng trong tuần là ngày " + lastDay.format(formatter));
	}
	
	private static void currentWeekOfYear(LocalDate date) {
		System.out.println("Hiện tại đang là tuần thứ " + date.get(IsoFields.WEEK_OF_WEEK_BASED_YEAR) + " trong năm");
	}
	
	private static void after20Days(LocalDate date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy", Locale.of("vi", "VN"));
		LocalDate after20Days = date.withDayOfYear(date.getDayOfYear()+20);
		System.out.println("Sau 20 ngày nữa là ngày " + after20Days.format(formatter));
	}
	
	private static void daysOld() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy", Locale.of("vi", "VN"));
		System.out.print("Nhập ngày sinh của bạn: ");
		String date = ip.nextLine();
		LocalDate dayOfBirth = LocalDate.parse(date, formatter);
		LocalDate now = LocalDate.now();
		Period period = Period.between(dayOfBirth, now);
		int days = period.getYears()*365 + period.getMonths()*30 + period.getDays();
		System.out.println("Bạn đã sống được " + days + " ngày");
	}
}
