package view.datetime8;

import java.time.Duration;
import java.time.Period;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static utils.DateTimeUtils.*;

public class Ex01 {
	
	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập ngày bắt đầu hẹn hò: (dd.MM.yyyy HH:mm:ss)");

        String startDateInput = ip.nextLine();
        LocalDateTime startDate = LocalDateTime.parse(startDateInput, DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss"));

        System.out.print("Nhập ngày chia tay (nếu chưa chia tay nhấn Enter): ");
        String endDateInput = ip.nextLine();
        LocalDateTime endDate;
        
        if (endDateInput.isEmpty()) {
            endDate = LocalDateTime.now();
        } else {
            endDate = LocalDateTime.parse(endDateInput, DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss"));
        }
        
		Period period = Period.between(startDate.toLocalDate(), endDate.toLocalDate());
		Duration duration = Duration.between(startDate.toLocalTime(), endDate.toLocalTime());

		if (duration.isNegative()) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}
		
		String dtDetails = optional(period.getYears(), "năm")
				+ optional(period.getMonths(), "tháng")
				+ optional(period.getDays(), "ngày")
				+ optional(duration.toHoursPart(), "giờ")
				+ optional(duration.toMinutesPart(), "phút")
				+ optionalEnd(duration.toSecondsPart(), "giây");
		
		System.out.println("Mối tình đã kéo dài: " + dtDetails);
		
		ip.close();
	}
}
