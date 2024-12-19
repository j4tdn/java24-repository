package view.localdatetime;

import java.time.Duration;
import java.time.LocalTime;

import static utils.DateTimeUtils.*;

public class Ex03LocalTimeDuration {
	
	public static void main(String[] args) {
		
		LocalTime lt1 = LocalTime.of(2, 12, 20);
		LocalTime lt2 = LocalTime.now();
		
		
		System.out.println("lt1: " + lt1);
		System.out.println("lt2: " + lt2);
		Duration duration = Duration.between(lt1, lt2);
		System.out.println("Khoang thoi gian: " + duration);
		
		
		String dtDetails = optional(duration.toHoursPart(), "gio")
							+ optional(duration.toMinutesPart(), "phut")
							+ optionalEnd(duration.toSecondsPart(), "giay");
		System.out.println("Khong thoi gian: " + dtDetails);
		
	}
	
}
