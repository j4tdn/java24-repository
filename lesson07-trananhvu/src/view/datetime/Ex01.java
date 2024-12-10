package view.datetime;

import utils.DateTimeUtils;

import java.util.Calendar;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Ex01 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String dateStart;
        String dateEnd;

        System.out.print("Nhập ngày bắt đầu hẹn hò dd/MM/yyyy: ");
        dateStart = ip.nextLine();
        System.out.print("Nhập ngày chia tay dd/MM/yyy: ");
        System.out.print("Nếu chưa chia tay vui lòng bỏ qua trường này!! ");
        dateEnd = ip.nextLine();

        String pattern = "dd/MM/yyyy HH:mm:ss";
        Calendar dateStartRel = DateTimeUtils.toCalendar(dateStart, pattern);
        Calendar dateEndRel = DateTimeUtils.toCalendar(dateEnd, pattern);
        if (dateEndRel == null) dateEndRel = Calendar.getInstance();

        System.out.println(dateStartRel);
        System.out.println(dateEndRel);

        if (dateStartRel.after(dateEndRel)) {
            throw new IllegalArgumentException("StartDate must less then EndDate.");
        }

        long startInMs = dateStartRel.getTimeInMillis();
        long endInMs = dateEndRel.getTimeInMillis();

        long duration = endInMs - startInMs;

        long days = TimeUnit.MILLISECONDS.toDays(duration);

        duration = duration - TimeUnit.DAYS.toMillis(days);
        long hours = TimeUnit.MILLISECONDS.toHours(duration);

        duration = duration - TimeUnit.HOURS.toMillis(hours);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);

        duration = duration - TimeUnit.MINUTES.toMillis(minutes);
        long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);

        long years = dateEndRel.get(Calendar.YEAR) - dateStartRel.get(Calendar.YEAR);

        long months = (dateEndRel.get(Calendar.MONTH) - dateStartRel.get(Calendar.MONTH));
        if (months < 0) {
            years -= 1;
            months += 12;
        }

        days = dateEndRel.get(Calendar.DATE) - dateStartRel.get(Calendar.DATE);
        if (days < 0) {
            months -= 1;
            days += dateStartRel.getMaximum(Calendar.DAY_OF_MONTH);
        }

        System.out.printf("Khoảng thời gian: %s năm,%s tháng, %s ngày, %s giờ, %s phút, %s giây", years, months, days, hours, minutes, seconds);

        ip.close();
    }
}
