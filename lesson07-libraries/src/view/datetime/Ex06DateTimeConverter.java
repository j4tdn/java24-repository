package view.datetime;
import utils.DateTimeUtils;

import static utils.DateTimeUtils.*;
import java.util.Calendar;
import java.util.Date;

public class Ex06DateTimeConverter {
    private static String pattern = "dd.MM.YYYY";
    private static String inputString = "12.10.2008";
    private static Date inputDate = new Date(123456);
    private static Calendar inputCalendar = Calendar.getInstance();

    public static void main(String[] args) {

        System.out.println("date --> string: " + DateTimeUtils.toString(inputDate, pattern));
        System.out.println("cal --> string: " + DateTimeUtils.toString(inputCalendar, pattern));

        System.out.println("\n===========================================\n");

        System.out.println("string --> date: " + toDate(inputString, pattern));
        System.out.println("cal --> date: " + toDate(inputCalendar));

        System.out.println("\n===========================================\n");

        System.out.println("string --> calendar: " + toCalendar(inputString, pattern));
        System.out.println("date --> calendar: " + toCalendar(inputDate));
    }
}
