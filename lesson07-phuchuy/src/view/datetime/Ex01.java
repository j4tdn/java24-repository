package view.datetime;

import static utils.DateTimeUtils.toCalendar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Ex01 {
	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);

		System.out.print("Nhập thời gian quen nhau của 2 bạn: ");
		String datingTime = ip.nextLine();

		Calendar start = toCalendar(datingTime, "dd.MM.yyyy");

		System.out.print("Hiện tại 2 bạn còn quen nhau không ? (T/F) ");
		Boolean isStillDating = Boolean.parseBoolean(ip.nextLine());
		if (!isStillDating) {
			System.out.print("Ngày 2 bạn chia tay là: ");
			String brokeUpTime = ip.nextLine();
			Calendar broke = toCalendar(brokeUpTime, "dd.MM.yyyy");

			DateFormat df = new SimpleDateFormat("dd.MM.yyyy EEEE");
			System.out.println("Ngày bắt đầu hẹn hò: " + df.format(start.getTime()));
			durationOptional(start, broke);

		} else {
			Calendar now = Calendar.getInstance();

			DateFormat df = new SimpleDateFormat("dd.MM.yyyy EEEE");
			System.out.println("Ngày bắt đầu hẹn hò: " + df.format(start.getTime()));

			duration(start, now);

		}

		ip.close();

	}

	private static void duration(Calendar start, Calendar end) {
		long a = start.getTimeInMillis();
		long b = end.getTimeInMillis();

		long duration = b - a;

		long days = TimeUnit.MILLISECONDS.toDays(duration);

		duration = duration - TimeUnit.DAYS.toMillis(days);
		long hours = TimeUnit.MILLISECONDS.toHours(duration);

		duration = duration - TimeUnit.HOURS.toMillis(hours);
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);

		duration = duration - TimeUnit.MINUTES.toMillis(minutes);
		long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);

		System.out.printf("Mối tình đã bắt đầu được: %s ngày, %s giờ, %s phút, %s giây", days, hours, minutes, seconds);
	}

	private static void durationOptional(Calendar start, Calendar end) {
		long a = start.getTimeInMillis();
		long b = end.getTimeInMillis();

		long duration = b - a;

		long days = TimeUnit.MILLISECONDS.toDays(duration);

		System.out.printf("Mối tình đã bắt đầu được: %s ngày", days);
	}

}
