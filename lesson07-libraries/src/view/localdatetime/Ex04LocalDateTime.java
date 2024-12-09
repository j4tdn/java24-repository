package view.localdatetime;

import static utils.DateTimeUtils.optional;
import static utils.DateTimeUtils.optionalEnd;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex04LocalDateTime {

	public static void main(String[] args) {
		DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

		LocalDateTime start = LocalDateTime.parse("12.10.2018 23:10:10", dtFormatter);
		LocalDateTime end = LocalDateTime.parse("08.12.2024 21:48:50", dtFormatter);

		System.out.println("Start: " + start);
		System.out.println("End: " + end);

		Period period = Period.between(start.toLocalDate(), end.toLocalDate());
		Duration duration = Duration.between(start.toLocalTime(), end.toLocalTime());
		
		if (duration.isNegative()) {
			duration  = duration.plusDays(1);
			period = period.minusDays(1);
		}
		
		String dtDetails = optional(period.getYears(), "năm") 
				+ optional(period.getMonths(), "tháng")
				+ optional(period.getDays(), "ngày") 
				+ optional(duration.toHoursPart(), "giờ") 
				+ optional(duration.toMinutesPart(), "phút")
				+ optionalEnd(duration.toSecondsPart(), "giây");
		System.out.println("Khoảng thời gian: " + dtDetails);
	}

}
