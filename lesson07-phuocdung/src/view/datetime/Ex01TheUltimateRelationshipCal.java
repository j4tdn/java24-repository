package view.datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Ex01TheUltimateRelationshipCal {

	public static void main(String[] args) {
		Locale VIETNAM = Locale.of("vi", "VN");
		Scanner ip = new Scanner(System.in);
		String pattern = "dd/MM/yyyy HH:mm:ss";

		System.out.print("Nhập thời gian bắt đầu hẹn hò theo cú pháp " + pattern + " ");
		Calendar start = stringToCalendar(ip.nextLine(), pattern);

		System.out.print("Nếu còn hẹn hò nhập phím 1, nếu bạn đã chia tay vui lòng nhập thời gian theo cú pháp "
				+ pattern + " ");
		String endAsString = ip.nextLine();
		Calendar end = endAsString.equals("1") ? Calendar.getInstance() : stringToCalendar(endAsString, pattern);

		DateFormat df = new SimpleDateFormat("EEEE", VIETNAM);
		System.out.println("Ngày bắt đầu hẹn hò là: " + df.format(start.getTime()));

		long duration = end.getTimeInMillis() - start.getTimeInMillis();

		calcRelationship(duration);

		ip.close();

	}

	private static void calcRelationship(long duration) {
		long millisSecondsInYear = 365L * 24L * 60L * 60L * 1000L;
		long millisSecondsInMonth = 30L * 24L * 60L * 60L * 1000L;

		long years = duration / millisSecondsInYear;

		duration = duration - years * millisSecondsInYear;
		long months = duration / millisSecondsInMonth;

		duration = duration - months * millisSecondsInMonth;
		long days = TimeUnit.MILLISECONDS.toDays(duration);

		duration = duration - TimeUnit.DAYS.toMillis(days);
		long hours = TimeUnit.MILLISECONDS.toHours(duration);

		duration = duration - TimeUnit.HOURS.toMillis(hours);
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);

		duration = duration - TimeUnit.MINUTES.toMillis(minutes);
		long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);

		System.out.printf("Bạn đã hẹn hò được %s năm %s tháng %s ngày %s giờ %s phút %s giây ", years, months, days,
				hours, minutes, seconds);
	}

	private static Calendar stringToCalendar(String dateAsString, String pattern) {
		Calendar c = Calendar.getInstance();
		DateFormat df = new SimpleDateFormat(pattern);

		try {
			Date date = df.parse(dateAsString);
			c.setTime(date);

		} catch (Exception e) {
			System.out.print("Định dạng không hợp lệ, kết thúc chương trình");
			System.exit(0);
		}

		return c;
	}

}
