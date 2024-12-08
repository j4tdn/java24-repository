package view.localdatetime;

import static utils.LocalDateTimeUtils.optional;
import static utils.LocalDateTimeUtils.optionalEnd;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex04LocalDateTime {

	/*
	 * LocalDateTime: +LocalDate +LocalTime
	 */
	public static void main(String[] args) {

		DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
		DateTimeFormatter dtFormatter1 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		LocalDate date = LocalDate.parse("12.11.2021", dtFormatter1);
		LocalDateTime start = LocalDateTime.parse("12.10.2018 10:10:10", dtFormatter);
		LocalDateTime end = LocalDateTime.parse("06.12.2024 02:22:50", dtFormatter);

		System.out.println(date);

		System.out.println("Bắt đầu: " + start);
		System.out.println("Kết thúc: " + end);

		// viết ctrinh tìm tài hiệu giữa 2 mốc tgian
		// ? năm ? tháng ? ngày ? giờ ? phút ? giây

		Period period = Period.between(start.toLocalDate(), end.toLocalDate());

		// Duration có thể bị âm -> kiểm tra
		Duration duration = Duration.between(start.toLocalTime(), end.toLocalTime());

		if (duration.isNegative()) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}

		String dtDetails = optional(period.getYears(), "năm") + optional(period.getMonths(), "tháng")
				+ optional(period.getDays(), "ngày") + optional(duration.toHoursPart(), "giờ")
				+ optional(duration.toMinutesPart(), "phút") + optionalEnd(duration.toSecondsPart(), "giây");
		System.out.println(dtDetails);

	}

}
