package view.localdatetime;

import static utils.DateTimeUtils.optional;
import static utils.DateTimeUtils.optionalEnd;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex04LocalDateTime {
	
	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
		
		LocalDateTime start = LocalDateTime.parse("12.10.2018 12:03:23", formatter);
		LocalDateTime end = LocalDateTime.parse("15.10.2022 10:23:33", formatter);
		
		System.out.println("Bat dau: " + start);
		System.out.println("Ket thuc: " + end);
		
		Period period = Period.between(start.toLocalDate(), end.toLocalDate());
		Duration duration = Duration.between(start.toLocalTime(), end.toLocalTime());
		
		
		if(duration.isNegative()) {
			duration = duration.plusDays(1);
			period = period.plusDays(-1);
		}
		
		String dtDetails = optional(period.getYears(), "Nam") 
				+ optional(period.getMonths(), "thang") 
				+ optional(period.getDays(), "ngay") 
				+optional(duration.toHoursPart(), "giờ") 
				+ optional(duration.toMinutesPart(), "phút") 
				+ optionalEnd(duration.toSecondsPart(), "giây");
		System.out.println(dtDetails);
	}
	
}
