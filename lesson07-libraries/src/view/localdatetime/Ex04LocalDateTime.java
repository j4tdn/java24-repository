package view.localdatetime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex04LocalDateTime {

	public static void main(String[] args) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

		LocalDateTime start = LocalDateTime.parse("12.10.2018 10:10:10", formatter);
		LocalDateTime end = LocalDateTime.parse("06.12.2024 21:48:50", formatter);

		System.out.println("Bat dau: " + start);
		System.out.println("Ket thuc: " + end);

		// viet ct timf hieu giua 2 moc thoi gian

		Period period = Period.between(start.toLocalDate(), end.toLocalDate());
		Duration duration = Duration.between(start.toLocalTime(), end.toLocalTime());

		if (duration.isNegative()) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}

	}

}
