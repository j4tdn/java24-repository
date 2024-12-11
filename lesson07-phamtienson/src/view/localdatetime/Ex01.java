package view.localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import static utils.DateTimeUtils.*;

public class Ex01 {

    public static void main(String[] args) {
       
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.println("Nhập ngày giờ bắt đầu hẹn hò (dd/MM/yyyy HH:mm:ss):");
        String startDateInput = new java.util.Scanner(System.in).nextLine();

        System.out.println("Nhập ngày giờ chia tay (nếu đã chia tay):");
        String endDateInput = new java.util.Scanner(System.in).nextLine();

        LocalDateTime start = toLocalDateTime(startDateInput, formatter);
        LocalDateTime end;
        
        if (endDateInput.isEmpty()) {
            end = LocalDateTime.now(); 
        } else {
            end = toLocalDateTime(endDateInput, formatter);
        }
        
        String[] daysOfWeekVietnamese = {"Chủ Nhật", "Thứ Hai", "Thứ Ba", "Thứ Tư", "Thứ Năm", "Thứ Sáu", "Thứ Bảy"};
        int dayOfWeek = start.getDayOfWeek().getValue();
        System.out.println("Ngày bắt đầu hẹn hò là: " + daysOfWeekVietnamese[dayOfWeek % 7]);

        Period period = Period.between(start.toLocalDate(), end.toLocalDate());
        Duration duration = Duration.between(start.toLocalTime(), end.toLocalTime());
        
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
        
    }
}
