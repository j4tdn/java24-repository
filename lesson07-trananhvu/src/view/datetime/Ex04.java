package view.datetime;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;

public class Ex04 {
    public static void main(String[] args) {
        String[] holidaysVietnam = {"01.01", "22.01", "10.03", "30.04", "01.05", "02.09"};
        Calendar cal = Calendar.getInstance();
        Calendar dayEndTask = Calendar.getInstance();

        cal.set(2022, Calendar.JUNE, 7);
        dayEndTask.set(2022, Calendar.JUNE, 7);

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM");
        int count = 1;

        while (count < 110) {
            if (dayEndTask.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY || dayEndTask.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
                count--;
            }
            if (Arrays.asList(holidaysVietnam).contains(sdf.format(dayEndTask.getTime()))) {
                count--;
            }
            count++;
            dayEndTask.add(Calendar.DATE, 1);
        }
        System.out.println(sdf.format(dayEndTask.getTime()));
    }
}
