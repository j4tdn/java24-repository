package view.localdatetime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import static utils.DateTimeUtils.*;

public class Ex04LocalDateTime {
	/*
	 * LocalDateTime + LocalDate --> Period + LocalTime --> Duration
	 * 
	 */

	public static void main(String[] args) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

		LocalDateTime start = LocalDateTime.parse("12.10.2018 23:10:10", formatter);
		LocalDateTime end = LocalDateTime.parse("06.12.2024 23:48:50", formatter);

		System.out.println("Bắt đầu: " + start);
		System.out.println("Kết thúc: " + end);

		// start > end validate

		// Viết chương trình tìm hiểu giữa 2 mốc thời gian
		// ? năm ? tháng ? ngày ? giờ ? phút ? giây

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

		System.out.println("Khoảng thời gian: " + dtDetail);

	}
}
