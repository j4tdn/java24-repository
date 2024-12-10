package view;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Ex01DateTime {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Thoi gian bat dau: ");
		String startDate = ip.nextLine();
		System.out.println("Thoi gian chia tay:");
		String endDate = ip.nextLine();
		isBreakUp(endDate);
		Calendar start = toCal(startDate, "dd/MM/yyyy");
		Calendar now = toCal(endDate, "dd/MM/yyyy");

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss EEEE");
		System.out.println("Ngay bat dau: " + df.format(start.getTime()));
		System.out.println("Ngay ngay hien tai: " + df.format(now.getTime()));

		long startInMs = start.getTimeInMillis();
		long endInMs = now.getTimeInMillis();

		long duration = endInMs - startInMs;

		long days = TimeUnit.MILLISECONDS.toDays(duration);

		duration = duration - TimeUnit.DAYS.toMillis(days);
		long hours = TimeUnit.MILLISECONDS.toHours(duration);

		duration = duration - TimeUnit.HOURS.toMillis(hours);
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);

		duration = duration - TimeUnit.MINUTES.toMillis(minutes);
		long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);

		int years = now.get(Calendar.YEAR) - start.get(Calendar.YEAR);
		int months = now.get(Calendar.MONTH) - start.get(Calendar.MONTH);
		int day = now.get(Calendar.DAY_OF_MONTH) - start.get(Calendar.DAY_OF_MONTH);

		if (day < 0) {
			months--;
			now.add(Calendar.MONTH, -1);
			day += now.getActualMaximum(Calendar.DAY_OF_MONTH);
		}

		if (months < 0) {
			years--;
			months += 12;
		}
		
		System.out.printf("Nam %s Thang %s Ngay %s gio %s phut %s giay %s", years, months, day, hours, minutes,
				seconds);

		ip.close();
	}

	public static Calendar toCal(String dateAsString, String pattern) {
		Calendar c = Calendar.getInstance();
		DateFormat df = new SimpleDateFormat(pattern);
		try {
			Date date = df.parse(dateAsString);
			c.setTime(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}

	public static void isBreakUp(String dateAsString) {
		Calendar c = Calendar.getInstance();
		if (dateAsString.isEmpty()) {
			c = Calendar.getInstance();
		} else {
			c = toCal(dateAsString, "dd/MM/yyyy");
		}
	}
}
