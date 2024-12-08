package view.localdatetime;

import static util.DateTimeUtill.optional;
import static util.DateTimeUtill.optionalEnd;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex04LocalDateTime {

	/*
	 * LocalDateTime = LocalDate + LocalTime
	 */

	/*
	 * LocalDateTime 
	 * + LocalDate --> Period 
	 * + LocalTime --> Duration
	 */

	public static void main(String[] args) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

		LocalDateTime start = LocalDateTime.parse("12.10.2018 23:10:10", formatter);
		LocalDateTime end = LocalDateTime.parse("06.12.2024 21:48:50", formatter);

		System.out.println("Bắt đầu: " + start);
		System.out.println("Kết thúc: " + end);

		Duration duration = Duration.between(start.toLocalTime(), end.toLocalTime());
		Period period = Period.between(start.toLocalDate(), end.toLocalDate());
		
		// 6 năm 1 tháng 24 ngày -1 giờ -21 phút -20 giây
		
//		if(duration.isNegative()) {
//			duration = duration.plusDays(1);
//			period = period.minusDays(1);
//		}

		String dtDetail = optional(period.getYears(), "năm") + optional(period.getMonths(), "tháng")
				+ optional(period.getDays(), "ngày") + optional(duration.toHoursPart(), "giờ")
				+ optional(duration.toMinutesPart(), "phút") + optionalEnd(duration.toSecondsPart(), "giây");

		System.out.println("Khoảng thời gian: " + dtDetail);
	}
}