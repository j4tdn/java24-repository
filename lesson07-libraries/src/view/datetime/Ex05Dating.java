package view.datetime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Ex05Dating {

	public static void main(String[] args) {
		Calendar start = toCalc("20/10/2024 10:20:30", "dd/MM/yyyy HH:mm:ss");
		Calendar now = Calendar.getInstance();
		
		long startInMs = start.getTimeInMillis();
		long endInMs = start.getTimeInMillis();
		
		long duration = endInMs - startInMs;
		
		System.out.println("Số ms = " + duration + "(ms)");
		
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		System.out.println("Số ngày = " + days);
		
		duration = duration - TimeUnit.DAYS.toMillis(days);
		long hours = TimeUnit.MILLISECONDS.toHours(duration);
		
		duration = duration - TimeUnit.HOURS.toMillis(hours);
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		
		duration = duration - TimeUnit.MINUTES.toMillis(minutes);
		long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);
		
		System.out.println("%");
		
		
	}
	
	private static Calendar toCalc(String dateAsString, String pattern) {
		Calendar c = Calendar.getInstance();
		DateFormat df = new SimpleDateFormat(pattern);
		try {
			Date date = df.parse(dateAsString);
			c.setTime(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return c;
	}
}
