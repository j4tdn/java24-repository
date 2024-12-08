package view.localdatetime;

import static utils.LocalDateTimeUtils.optional;
import static utils.LocalDateTimeUtils.optionalEnd;

import java.time.Duration;
import java.time.LocalTime;

public class Ex03LocalTimeDuration {

	public static void main(String[] args) {

		LocalTime lt1 = LocalTime.of(1, 12, 11);
		LocalTime lt2 = LocalTime.now();

		System.out.println("Time 1: " + lt1);
		System.out.println("Time 2: " + lt2);

		// toHour -> 19h
		// toHourPart --> 19h nhưng sẽ lấy phần giờ trong 19H20M20S

		// toMinute --> sẽ đổi thành tổng số phút -> 19*60p + 20p = 1160p
		// toMinutePart --> lấy 20m

		Duration duration = Duration.between(lt1, lt2);
		System.out.println("Khoảng thời gian: " + duration);

		String dtDetails = optional(duration.toHoursPart(), "Giờ") + optional(duration.toMinutesPart(), "Phút")
				+ optionalEnd(duration.toSecondsPart(), "Giây");

		System.out.println("Khoảng thời gian: " + dtDetails);
	}

}
