package exercises.localdatetime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex01 {
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime startDay = LocalDateTime.parse("02/02/2022 14:30:00", dtf);
		LocalDateTime endDay = LocalDateTime.parse("04/04/2024 02:30:00", dtf);
		//System.out.println("Have you in love or broken up");
		//if (Integer.parseInt(sc.nextLine()) == 2) {
		//	endDay = enterDay();
		//}
		System.out.println(startDay.getDayOfWeek().toString());
		Period period = Period.between(startDay.toLocalDate(), endDay.toLocalDate());
		Duration duration = Duration.between(startDay.toLocalTime(), endDay.toLocalTime());
		
		if(duration.isNegative()) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}
		
		System.out.println(period.getYears() + " years " + period.getMonths() + " months " + period.getDays() + " days " +
						   duration.toHoursPart() + " hours " + duration.toMinutesPart() + " minutes " + duration.toMillisPart() + " seconds");
		
	}

}
