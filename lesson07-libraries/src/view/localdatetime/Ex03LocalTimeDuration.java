package view.localdatetime;

import java.time.Duration;
import java.time.LocalTime;

import static utils.DateTimeUtils.*;

public class Ex03LocalTimeDuration {
	
	public static void main(String[] args) {
		
		LocalTime lt1 = LocalTime.of(2, 12, 20);
		LocalTime lt2 = LocalTime.now();
		
//		if (dateOfBirth.isAfter(now)) {
//			throw new IllegalArgumentException("StartDate must less then EndDate.");
//		}
		
		System.out.println("lt1: " + lt1);
		System.out.println("lt2: " + lt2);
		
		Duration duration = Duration.between(lt1, lt2);
		
		System.out.println("khoang thoi gian" + duration);
		
		String dtDetails = optional(duration.toHoursPart(), null);
				
		System.out.println("Khoang thoi gian: " + dtDetails);
	}
	
}
