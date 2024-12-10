package view.datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Ex04Exercises {
    public static void main(String[] args) {
        Locale VIETNAM = Locale.of("vi", "VN");
        DateFormat df = new SimpleDateFormat("EEEE", VIETNAM);
        DateFormat dfAll = new SimpleDateFormat("dd/MM/yyyy EEEE  F");

        Calendar cal = Calendar.getInstance();
        boolean isLeapYear = isLeapYear(cal.get(Calendar.YEAR));
//        cal.set(Calendar.YEAR, 2020);
        System.out.println(isLeapYear);

        String formatedDmy = dfAll.format(cal.getTime());
        System.out.println(formatedDmy);

        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        int firstDayOfWeek = cal.get(Calendar.DAY_OF_WEEK_IN_MONTH);
        int totalDayOfWeek = cal.getActualMaximum(Calendar.DAY_OF_WEEK)+1;

        System.out.println("=======================================");
        Calendar cal2 = Calendar.getInstance();
        for(int day = 1; day < cal.getActualMaximum(Calendar.DAY_OF_MONTH) + 1; day++) {
            cal2.set(Calendar.DAY_OF_MONTH, day);
            System.out.println(dfAll.format(cal2.getTime()));

        }

        System.out.println("=======================================");
        Calendar cal3 = Calendar.getInstance();
        for (int day = dayOfMonth - dayOfWeek + firstDayOfWeek; day < totalDayOfWeek; day++) {
            cal3.set(Calendar.DAY_OF_MONTH, day);
            System.out.println(dfAll.format(cal3.getTime()));
        }

        System.out.println("=======================================");
        int countSunday = 0;
        Calendar cal4 = Calendar.getInstance();
        cal4.set(Calendar.MONTH, 2);
        for(int day = 1; day < cal.getActualMaximum(Calendar.DAY_OF_MONTH) + 1; day++) {
            cal4.set(Calendar.DAY_OF_MONTH, day);
            if(cal4.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                countSunday++;
                System.out.println(dfAll.format(cal4.getTime()));
            }
        }
        System.out.println(countSunday);

        System.out.println("=======================================");


    }

    private static boolean isLeapYear(int year) {
        GregorianCalendar gc = new GregorianCalendar();
        return gc.isLeapYear(year);
    }
}
