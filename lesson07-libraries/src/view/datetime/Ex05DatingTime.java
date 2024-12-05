package view.datetime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Ex05DatingTime {
	public static void main(String[] args) {

		Calendar start = toCalc("01/03/2022 16:30:00", "dd/MM/yyyy HH:mm:ss");
		Calendar now = Calendar.getInstance();

		// Tìm khoảng thời gian giữa start và now ( start < now )

		// duration 7285mm --> 7m -> 2dm -> 8cm -> 5cm

		long startInMs = start.getTimeInMillis();
		long endInMs = now.getTimeInMillis();

		long duration = endInMs - startInMs;
		System.out.println("Số ms = " + duration + "(ms)");

		long days = TimeUnit.MILLISECONDS.toDays(duration);
		System.out.println("Số ngày = " + days);

		duration = duration - TimeUnit.DAYS.toMillis(days);
		long hours = TimeUnit.MILLISECONDS.toHours(duration);

		duration = duration - TimeUnit.HOURS.toMillis(hours);
		long minute = TimeUnit.MILLISECONDS.toMinutes(duration);

		duration = duration - TimeUnit.MINUTES.toMillis(minute);
		long second = TimeUnit.MILLISECONDS.toSeconds(duration);

		System.out.printf("%s ngày, %s giờ, %s phút, %s giây", days, hours, minute, second);

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
