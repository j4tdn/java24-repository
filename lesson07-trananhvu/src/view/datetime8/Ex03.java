package view.datetime8;

import utils.DateTimeUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class Ex03 {
    private static final DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private static String timeByRegion(String country) {
        LocalDateTime now = LocalDateTime.now(ZoneId.of(country));
        return now.format(df);
    }

    private static String lastDayOfMonth() {
        LocalDate localDate = LocalDate.now();
        int lastDayOfMonth = localDate.lengthOfMonth();
        localDate = localDate.withDayOfMonth(lastDayOfMonth);
        return localDate.format(df);
    }

    private static String firstALastDayOfWeek() {
        String firstALastDayOfWeek;
        LocalDate localDate = LocalDate.now();
        int dayOfWeek = localDate.getDayOfWeek().getValue();
        if (dayOfWeek == 7) {
            localDate = localDate.plusDays(-6);
        } else {
            localDate = localDate.plusDays(1 - dayOfWeek);
        }
        firstALastDayOfWeek = localDate.format(df);

        localDate = localDate.plusDays(6);

        return firstALastDayOfWeek + " " + localDate.format(df);
    }

    private static String weekOfYear() {
        LocalDate localDate = LocalDate.now();
        WeekFields weekFields = WeekFields.of(Locale.getDefault());
        int weekOfYear = localDate.get(weekFields.weekOfYear());
        return weekOfYear + "";
    }
    private static String twentyDaysLeft() {
        LocalDate localDate = LocalDate.now();
        localDate = localDate.plusDays(20);
        return localDate.format(df);
    }

    private static long daysAlive(String dateOfBirth) {
        LocalDate localDate = DateTimeUtils.toLocalDate(dateOfBirth, "dd/MM/yyyy");
        LocalDate now = LocalDate.now();
        long totalDays = ChronoUnit.DAYS.between(localDate, now);
        return totalDays;
    }

    public static void main(String[] args) {
        System.out.println(timeByRegion("Asia/Ho_Chi_Minh"));
        System.out.println(lastDayOfMonth());
        System.out.println(firstALastDayOfWeek());
        System.out.println(weekOfYear());
        System.out.println(twentyDaysLeft());
        System.out.println(daysAlive("27/02/2003"));

    }
}
