package view.localdatetime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Ex01TheUltimateRelationshipCal {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		String pattern = "dd/MM/yyyy HH:mm:ss";

		System.out.println("Nhập thời gian bắt đầu hẹn hò");
		LocalDateTime start = stringToLDT(ip.nextLine(), pattern);

		System.out.println("Nhập thời gian kết thúc nếu đã chia tay, nếu chưa chia tay nhập 1");
		String endAsString = ip.nextLine();
		LocalDateTime end = endAsString.equals("1") ? LocalDateTime.now() : stringToLDT(endAsString, pattern);

		System.out.println("Thứ trong tuần bắt đầu hẹn hò: " + start.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("vi")));
		
		Period period = Period.between(start.toLocalDate(), end.toLocalDate());
		Duration duration = Duration.between(start.toLocalTime(), end.toLocalTime());

		if (duration.isNegative()) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}

		String dtDetail = optional(period.getYears(), "năm") 
						+ optional(period.getMonths(), "tháng")
						+ optional(period.getDays(), "ngày") 
						+ optional(duration.toHoursPart(), "giờ")
						+ optional(duration.toMinutesPart(), "phút")
						+ optionalEnd(duration.toSecondsPart(), "giây");

		System.out.println("Mối tình đã bắt đầu được : " + dtDetail);
		
		ip.close();

	}
	
	public static String optional(long value, String unit) {
		if (value == 0) {
			return "";
		}
		return value + " " + unit + " ";
	}

	public static String optionalEnd(long value, String unit) {
		if (value == 0) {
			return "";
		}
		return value + " " + unit;
	}

	private static LocalDateTime stringToLDT(String string, String pattern)  {
		DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern(pattern);
		LocalDateTime target = LocalDateTime.parse(string, dateTimeFormat);
		return target;
	}

}
