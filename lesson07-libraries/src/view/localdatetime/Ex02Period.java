package view.localdatetime;

//Su dung period de tim khoang thoi gian giua 2 moc local date

import java.time.LocalDate;
import java.time.Period;

public class Ex02Period {
    public static void main(String[] args) {
        LocalDate dateOfBirth = LocalDate.of(2003, 2,27);
        LocalDate now = LocalDate.now();

        if(dateOfBirth.isAfter(now)) {
            throw new IllegalArgumentException("StartDate must less then endDate");
        }

        Period period = Period.between(dateOfBirth, now);
        System.out.println(period);

        String dtDetails = optional(period.getDays(), "ngay") + optional(period.getMonths(), "thang") + optional(period.getYears(), "nam");
        System.out.println(dtDetails);
    }

    private static String optional(long value, String unit) {
        if(value == 0) return "";
        return value + " " + unit + " ";
    }
    private static String optionalEnd(long value, String unit) {
        if(value == 0) return "";
        return value + " " + unit;
    }
}
