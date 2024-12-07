package view.localdatetime;

import java.time.Duration;
import java.time.LocalTime;
import static utils.DateTimeUtils.*;

public class Ex03LocalTimeDuration {
	
	public static void main(String[] args) {
		LocalTime lt1 = LocalTime.of(2, 12, 12);
		LocalTime lt2 = LocalTime.now();
		
		Duration duration = Duration.between(lt1, lt2);
		
		String dtDetails = optional(duration.toHoursPart(), "giờ") 
				+ optional(duration.toMinutesPart(), "phút") 
				+ optionalEnd(duration.toSecondsPart(), "giây");
		System.out.println("Khoảng thời gian: " + dtDetails);
	}
}
