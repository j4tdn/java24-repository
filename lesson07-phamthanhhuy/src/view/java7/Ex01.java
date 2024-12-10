package view.java7;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import utils.DateTimeUtils;

public class Ex01 {

	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {


		System.out.print("Bạn có đang hẹn hò (y/n): ");
		String status = ip.nextLine();
		String datingDay = null;

		if (status.equals("y")) {
			System.out.print("Nhập ngày hẹn hò: ");
			datingDay = ip.nextLine();
		}
		else {
			System.out.print("Nhập ngày chia tay: ");
			datingDay = ip.nextLine();
		}

		Calendar cal = DateTimeUtils.toCalendar(datingDay, "dd/MM/yyyy HH:mm:ss");
		Calendar now = Calendar.getInstance();
		
		long calInMs = cal.getTimeInMillis();
		long nowInMs = now.getTimeInMillis();
		
		long duration = nowInMs - calInMs;
		
		long days = TimeUnit.MILLISECONDS.toDays(duration);

		duration = duration - TimeUnit.DAYS.toMillis(days);
		long hours = TimeUnit.MILLISECONDS.toHours(duration);

		duration = duration - TimeUnit.HOURS.toMillis(hours);
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);

		duration = duration - TimeUnit.MINUTES.toMillis(minutes);
		long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);

		
		Locale VIETNAM = new Locale("vi", "VN");

		DateFormat df = new SimpleDateFormat("EEEE", VIETNAM);

		System.out.println("==> Là ngày " + df.format(cal.getTime()) + " trong tuần");
		System.out.printf("Mối tình đã bắt đầu được %s ngày, %s giờ, %s phút, %s giây", days, hours, minutes, seconds);

	}
}