package view.datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex03CalendarBaicOperations {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        System.out.println(year);
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);


        int ap = cal.get(Calendar.AM_PM);
        System.out.println(ap == Calendar.AM ? "AM" : "PM");

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy EEEE");
        int totalDayOfMonth = cal.getActualMaximum(Calendar.DAY_OF_YEAR);
        System.out.println(totalDayOfMonth);
        String formatedDmy = df.format(cal.getTime());
        System.out.println(formatedDmy);

        cal.add(Calendar.YEAR, +2);
        formatedDmy = df.format(cal.getTime());
        System.out.println(formatedDmy);

        int firstDayOfWeek=cal.getFirstDayOfWeek();
        System.out.println(firstDayOfWeek);
    }
}
