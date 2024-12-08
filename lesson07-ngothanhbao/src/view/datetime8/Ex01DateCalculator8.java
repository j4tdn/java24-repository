package view.datetime8;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import static utils.DateTimeUtils.*;
public class Ex01DateCalculator8 {

	public static void main(String[] args) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime startDating = LocalDateTime.parse("12/12/2020 20:30:40",dtf);
		LocalDateTime now = LocalDateTime.parse("08/12/2024 14:16:20", dtf);
		try {
			datingTime(startDating, now);
		} catch (IllegalArgumentException iae) {
			System.out.println(iae.getMessage());
		}
	}
	
	public static void datingTime(LocalDateTime startDating, LocalDateTime now) {
		LocalDateTime start = startDating;
		LocalDateTime toNow = now;
		
		if(start.isAfter(toNow) ) {
			throw new IllegalArgumentException("Ngay bat dau hen ho khong hop le !!!");
		}
		
		Period period = Period.between(start.toLocalDate(), toNow.toLocalDate());
		Duration duration = Duration.between(start.toLocalTime(), toNow.toLocalTime());
		
		if(duration.isNegative()) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}
		
		String dtDetails = optional(period.getYears(), "nam") 
				+ optional(period.getMonths(), "thang")
				+ optional(period.getDays(), "ngay")
				+ optional(duration.toHoursPart(), "gio") 
				+ optional(duration.toMinutesPart(), "phut") 
				+ optionalEnd(duration.toSecondsPart(), "giay");
		
		System.out.println("Thời gian hẹn hò: " + dtDetails);

		
	}

}
