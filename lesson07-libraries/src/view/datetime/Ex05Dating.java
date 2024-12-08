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
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println("bắt đầu: " + df.format(start.getTime()));
		System.out.println("Hiện tại: " + df.format(now.getTime()));
		

		// Tìm khoản thời gian giữa start và now

		long startInMs = start.getTimeInMillis();
		long nowInMs = now.getTimeInMillis();

		long duration = nowInMs - startInMs;

		System.out.println("Số mls = " + duration);

		long days = TimeUnit.MILLISECONDS.toDays(duration);

		duration = duration - TimeUnit.DAYS.toMillis(days);
		long hours = TimeUnit.MILLISECONDS.toHours(duration);

		duration = duration - TimeUnit.HOURS.toMillis(hours);
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);

		duration = duration - TimeUnit.MINUTES.toMillis(minutes);
		long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);

		System.out.printf("%s ngày, %s giờ, %s phút, %s giây", days, hours, minutes, seconds);

	}

	private static Calendar toCalc(String dateAsString, String pattern) {
		Calendar c = Calendar.getInstance();
		DateFormat df = new SimpleDateFormat(pattern);
		Date date;
		try {
			date = df.parse(dateAsString);
			c.setTime(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}

}
