package view.datetime8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;


public class Ex04 {
    public static void main(String[] args) {
        String[] holidaysVietnam = {"01.01", "22.01", "10.03", "30.04", "01.05", "02.09"};
        LocalDate localDate = LocalDate.now();
        localDate = localDate.withYear(2022).withMonth(6).withDayOfMonth(7);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM");
        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd.MM");

        int count = 1;

        while (count < 110) {
            if (localDate.getDayOfWeek().getValue() == 7 || localDate.getDayOfWeek().getValue() == 6) {
                count--;
            }
            if (Arrays.asList(holidaysVietnam).contains(sdf.format(localDate))) {
                count--;
            }
            count++;
            localDate = localDate.plusDays(1);
        }
        System.out.println(df.format(localDate));
    }
}
