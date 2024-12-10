package view.java8;

import static utils.DateTimeUtils.optional;
import static utils.DateTimeUtils.optionalEnd;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Ex01 {

    private static Scanner ip = new Scanner(System.in);

    public static void main(String[] args) {

        // 12/10/2003 10:34:50
        DateTimeFormatter formatterWithTime = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss", new Locale("vi", "VIETNAM"));
        DateTimeFormatter formatterVietNam = DateTimeFormatter.ofPattern("EEEE", new Locale("vi", "VIETNAM"));

        System.out.print("Bạn có đang hẹn hò (y/n): ");
        String status = ip.nextLine();
        LocalDateTime datingDay = null;

   
            if (status.equals("y")) { 
                System.out.print("Nhập ngày hẹn hò (dd/MM/yyyy HH:mm:ss): ");
                datingDay = LocalDateTime.parse(ip.nextLine(), formatterWithTime);
            } else {
                System.out.print("Nhập ngày chia tay (dd/MM/yyyy HH:mm:ss): ");
                datingDay = LocalDateTime.parse(ip.nextLine() , formatterWithTime);
            }

            System.out.println("Ngày được nhập: " + datingDay);
            System.out.println("Ngày bắt đầu là ngày " + datingDay.format(formatterVietNam));
            
            LocalDateTime now = LocalDateTime.now();
            Duration duration = Duration.between(datingDay.toLocalTime(), now.toLocalTime());
            Period period = Period.between(datingDay.toLocalDate(), now.toLocalDate());
            
            String dtDetail = optional(period.getYears(), "năm") + optional(period.getMonths(), "tháng")
			+ optional(period.getDays(), "ngày") + optional(duration.toHoursPart(), "giờ")
			+ optional(duration.toMinutesPart(), "phút") + optionalEnd(duration.toSecondsPart(), "giây");

	System.out.println("Đến bây giờ đã trôi qua: " + dtDetail);
       
         
    }
}
