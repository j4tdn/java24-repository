package view.datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Ex05Dating {

	public static void main(String[] args) {

		Calendar start = toCalc("25/11/2024 10:20:30", "dd/MM/yyyy HH:mm:ss");
		Calendar now = Calendar.getInstance();
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println("Bắt đầu: " + df.format(start.getTime()));
		System.out.println("Kết thúc: " + df.format(now.getTime()));
		// Tìm khoảng thời gian giữa start và now (start < now)
		
		long startInMs = start.getTimeInMillis();
		long endInMs = now.getTimeInMillis();
		
		long duration = endInMs - startInMs;
		
		System.out.println("Số ms = " + duration + " (ms)");
		
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		
		duration = duration - TimeUnit.DAYS.toMillis(days);
		long hours = TimeUnit.MILLISECONDS.toHours(duration);
		
		duration = duration - TimeUnit.HOURS.toMillis(hours); 
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		
		duration = duration - TimeUnit.MINUTES.toMillis(minutes);
		long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);
		
		System.out.printf("%s ngày, %s giờ, %s phút, %s giây", days, hours, minutes, seconds);

	}

	// calendar --> getTime() --> date --> format() --> string
	private static Calendar toCalc(String dateAsString, String pattern) {
		Calendar c = Calendar.getInstance();
		DateFormat df = new SimpleDateFormat(pattern);
		try {
			Date date = df.parse(dateAsString);
			c.setTime(date);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return c;
	}

}
