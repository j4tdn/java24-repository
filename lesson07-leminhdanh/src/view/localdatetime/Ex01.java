package view.localdatetime;

import static utils.DateTimeUtils.*;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		LocalDateTime start;
		LocalDateTime end;
		System.out.print("Nhập ngày bắt đầu hẹn hò: ");
		String str1 = ip.nextLine();
		System.out.print("Nhập ngày chia tay(nếu có): ");
		String str2 = ip.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

		start = LocalDateTime.parse(str1, formatter);
		if (str2.isEmpty()) {
			end = LocalDateTime.now();
		} else {
			end = LocalDateTime.parse(str2, formatter);
		}

		System.out.println("Ngày bắt đầu hẹn hò là " + start.getDayOfWeek());

		Period period = Period.between(start.toLocalDate(), end.toLocalDate());
		Duration duration = Duration.between(start.toLocalTime(), end.toLocalTime());

		if (duration.isNegative()) {
			duration = duration.plusDays(1);
			period = period.plusDays(-1);
		}
		String dtDetails = optional(period.getYears(), "năm") + optional(period.getMonths(), "tháng")
				+ optional(period.getDays(), "ngày") + optional(duration.toHoursPart(), "giờ")
				+ optional(duration.toMinutesPart(), "phút") + optionalEnd(duration.toSecondsPart(), "giây");
		System.out.println(dtDetails);
	}
}
