package exercises.datetime;

import java.util.Date;

import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex01 {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		if (!hadLove()) {
			System.exit(0);
		} 
		Calendar[] startAndEndDay = enterDay("dd/MM/yyyy HH:mm:ss");
		Calendar startDay = startAndEndDay[0];
		Calendar endDay = startAndEndDay[1];

		System.out.println("The date you started dating was " + getFirstDayOfDating(startDay));
		System.out.println("The relationship lasted " + getDuration(startDay, endDay));
		
	}
	
	private static Calendar[] enterDay(String pattern) {
		DateFormat df = new SimpleDateFormat(pattern);
		Calendar[] days = new Calendar[2];
		days[0] = Calendar.getInstance();
		days[1] = Calendar.getInstance();
		System.out.println("Enter day you started falling in love: dd/MM/yyyy HH:mm:ss");
		do {
			try {
				days[0].setTime(df.parse(sc.nextLine()));
				System.out.println("Are you in love or broken up ? 1 or 2");
				if (Integer.parseInt(sc.nextLine()) == 2) {
					days[1].setTime(df.parse(sc.nextLine()));
				}
				return days;
			} catch (ParseException e) {
				System.out.println("Error --> Please follow the pattern");
			}
		} while (true);
	}
	
	private static boolean hadLove() {
		System.out.println("Have you ever had girl friend ? \n Enter \'1' if you have");
		return Integer.parseInt(sc.nextLine()) == 1 ? true : false;
	}
	
	private static String getFirstDayOfDating(Calendar startDay) {
		DateFormat df = new SimpleDateFormat("EEEE", new Locale("vi", "VN"));
		return df.format(startDay.getTime());
	}
	
	private static String getDuration(Calendar startDay, Calendar endDay) {
		long start = startDay.getTimeInMillis();
		long end = endDay.getTimeInMillis();
		
		long duration = end - start;
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		duration -= TimeUnit.DAYS.toMillis(days);
		long hours = TimeUnit.MILLISECONDS.toHours(duration);
		duration -= TimeUnit.HOURS.toMillis(hours);
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		duration = duration - TimeUnit.MINUTES.toMillis(minutes);
		long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);
		long dayLeft;
		long years = 0;
		if (days / 365 > 0) {
			years = days / 365;
			dayLeft = days - years * 365;
		} else {
			dayLeft = days;
		}
		long months = dayLeft / 31;
		days = dayLeft - months * 31;
		return (years > 0 ? years + " năm, " : "") + months + " tháng , " + days + " ngày, " + hours + " giờ, " + minutes
				+ " phút, " + seconds + " giây";
	}
	
}
