package view.datetime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Ex05Dating {
	
	public static void main(String[] args) {
		
		Calendar start = toCalc("20.04.2020 10:20:30", "dd.MM.yyyy HH:mm:ss");
		Calendar now = Calendar.getInstance();
		
		//tim khoang thoi gian giua start va now (start < now)
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println("Bat dau: " + df.format(start.getTime()));
		System.out.println("Hien tai: " + df.format(now.getTime()));
		
		long startInMs = start.getTimeInMillis();
		long endInMs = now.getTimeInMillis();
		
		long duration = endInMs - startInMs;
		
		System.out.println("So ms = " + duration + "(ms)");
		
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		
		duration = duration - TimeUnit.DAYS.toMillis(days);
		long hours = TimeUnit.MILLISECONDS.toHours(duration);
		
		duration = duration - TimeUnit.HOURS.toMillis(hours);
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		
		duration = duration - TimeUnit.MINUTES.toMillis(minutes);
		long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);
		
		System.out.printf("Khoang thoi gian: %s ngay, %s gio, %s phut, %s giay,", days, hours, minutes, seconds);
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
