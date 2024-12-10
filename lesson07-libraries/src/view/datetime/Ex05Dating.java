package view.datetime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Ex05Dating {
    public static void main(String[] args) {

        Calendar start = toCalc("20/04/2020 10:20:30", "dd/MM/yyyy HH:mm:ss");
        Calendar now = Calendar.getInstance();

        long startInMs = start.getTimeInMillis();
        long endInMs = now.getTimeInMillis();
        long duration = endInMs - startInMs;

       long days = TimeUnit.MILLISECONDS.toDays(duration);
       long hours = TimeUnit.MILLISECONDS.toHours(duration - TimeUnit.DAYS.toMillis(days));
       long minutes = TimeUnit.MILLISECONDS.toMinutes(duration - TimeUnit.DAYS.toMillis(days) - TimeUnit.HOURS.toMillis(hours));
       long seconds = TimeUnit.MILLISECONDS.toSeconds(duration - TimeUnit.DAYS.toMillis(days) - TimeUnit.HOURS.toMillis(hours) - TimeUnit.MINUTES.toMillis(minutes));

        System.out.println(days);
        System.out.println(hours);
        System.out.println(minutes);
        System.out.println(seconds);


    }
    private static Calendar toCalc(String dateAsString, String pattern) {
        Calendar cal = Calendar.getInstance();
        DateFormat df = new SimpleDateFormat(pattern);
        try {
            Date date = df.parse(dateAsString);
            cal.setTime(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return cal;
    }
}
