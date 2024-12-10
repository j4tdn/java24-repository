package view.datetime8;

import utils.DateTimeUtils;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String dateStart;
        String dateEnd;

        System.out.print("Nhập ngày bắt đầu hẹn hò dd/MM/yyyy HH:mm:ss: ");
        dateStart = ip.nextLine();
        System.out.print("Nhập ngày chia tay dd/MM/yyy HH:mm:ss: ");
        System.out.print("Nếu chưa chia tay vui lòng bỏ qua trường này!! ");
        dateEnd = ip.nextLine();

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime dateStartRel = DateTimeUtils.toLocalDateTime(dateStart, df);
        LocalDateTime dateEndRel = DateTimeUtils.toLocalDateTime(dateEnd, df);


        System.out.println(dateStartRel.format(df));
        System.out.println(dateEndRel.format(df));

        if (dateStartRel.isAfter(dateEndRel)) {
            throw new IllegalArgumentException("StartDate must less then EndDate.");
        }

        Period period = Period.between(dateStartRel.toLocalDate(), dateEndRel.toLocalDate());
        Duration duration = Duration.between(dateStartRel.toLocalTime(), dateEndRel.toLocalTime());

        if (duration.isNegative()) {
            duration = duration.plusDays(1);
            period = period.minusDays(1);
        }

        String dtDetails = DateTimeUtils.optional(period.getYears(), "năm")
                + DateTimeUtils.optional(period.getMonths(), "tháng")
                + DateTimeUtils.optional(period.getDays(), "ngày")
                + DateTimeUtils.optional(duration.toHoursPart(), "giờ")
                + DateTimeUtils.optional(duration.toMinutesPart(), "phút")
                + DateTimeUtils.optionalEnd(duration.toSecondsPart(), "giây");

        System.out.println("Khoảng thời gian: " + dtDetails);

        ip.close();
    }
}
