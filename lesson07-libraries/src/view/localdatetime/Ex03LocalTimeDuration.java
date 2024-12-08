package view.localdatetime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.Period;

import static util.DateTimeUtill.*;

public class Ex03LocalTimeDuration {

	public static void main(String[] args) {

		LocalTime lt1 = LocalTime.of(2, 12, 20);
		LocalTime lt2 = LocalTime.now();

		System.out.println("lt1: " + lt1);
		System.out.println("lt2: " + lt2);

		Duration duration = Duration.between(lt1, lt2);

		System.out.println("Khoảng thời gian: " + duration);

		String dtDetail = optional(duration.toHoursPart(), "giờ") + optional(duration.toMinutesPart(), "phút")
				+ optionalEnd(duration.toSecondsPart(), "giây");

		System.out.println("Khoảng thời gian: " + dtDetail);

	}

}
