package view.localdatetime;

import static utils.DateTimeUtils.optional;
import static utils.DateTimeUtils.optionalEnd;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

        System.out.print("Nhập ngày bắt đầu hẹn hò (định dạng dd.MM.yyyy HH:mm:ss): ");
        String startDateInput = scanner.nextLine();
        System.out.print("Nhập ngày chia tay (nếu có, định dạng dd.MM.yyyy HH:mm:ss, để trống nếu chưa chia tay): ");
        String endDateInput = scanner.nextLine();

        LocalDateTime startDate = LocalDateTime.parse(startDateInput, formatter);
        LocalDateTime endDate = endDateInput.isEmpty() ? LocalDateTime.now() : LocalDateTime.parse(endDateInput, formatter);

        System.out.println("\nNgày bắt đầu hẹn hò: " + startDate.format(formatter));

        Period period = Period.between(startDate.toLocalDate(), endDate.toLocalDate());
        Duration duration = Duration.between(startDate.toLocalTime(), endDate.toLocalTime());

        if (duration.isNegative()) {
            duration = duration.plusDays(1);
            period = period.minusDays(1);
        }

        String timeDetails = optional(period.getYears(), "năm")
                + optional(period.getMonths(), "tháng")
                + optional(period.getDays(), "ngày")
                + optional(duration.toHoursPart(), "giờ")
                + optional(duration.toMinutesPart(), "phút")
                + optionalEnd(duration.toSecondsPart(), "giây");

        System.out.println("\nThời gian đã trải qua: " + timeDetails);
    }
}