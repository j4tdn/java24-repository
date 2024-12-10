package view.datetime8;

import static utils.DateTimeUtils.*;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		LocalDateTime endDate;
		System.out.print("Nhập ngày bắt đầu hẹn hò: ");
		String startDateCheck = sc.nextLine();
		LocalDateTime startDate = LocalDateTime.parse(startDateCheck,DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss"));
		System.out.print("Nhập ngày chia tay(không có hãy bỏ qua): ");
		String endDateCheck = sc.nextLine();
		
		if (endDateCheck.isEmpty()) {
			endDate = LocalDateTime.now();
		} else {
			endDate = LocalDateTime.parse(endDateCheck, DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss"));
		}
		
		Period period = Period.between(startDate.toLocalDate(), endDate.toLocalDate());
		Duration duration = Duration.between(startDate.toLocalTime(), endDate.toLocalTime());

		if (duration.isNegative()) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}
		String dtDetails = optional(period.getYears(), "năm") + optional(period.getMonths(), "tháng")
				+ optional(period.getDays(), "ngày") + optional(duration.toHoursPart(), "giờ")
				+ optional(duration.toMinutesPart(), "phút") + optionalEnd(duration.toSecondsPart(), "giây");
		System.out.println("Mối tình đã bắt đầu được " +dtDetails);
		sc.close();
	}
}
