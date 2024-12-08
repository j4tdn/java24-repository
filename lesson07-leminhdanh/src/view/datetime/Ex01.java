package view.datetime;

import static utils.DateTimeUtils.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Ex01 {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập ngày bắt đầu hẹn hò:");
		String str1 = ip.nextLine();
		System.out.print("Nhập ngày chia tay(nếu có):");
		String str2 = ip.nextLine();

		String pattern = "dd.MM.yyyy";

		Date start = toDate(str1, pattern);
		Date end = null;
		if (str2 != "") {
			end = toDate(str2, pattern);
		} else {
			end = new Date();
		}

		Calendar c1 = toCalendar(start);
		Calendar c2 = toCalendar(end);
		
		DateFormat df = new SimpleDateFormat("dd.MM.yyyy EEEE");

		System.out.println("Ngày bắt đầu hẹn hò là " + df.format(c1.getTime()));
		long duration = c2.getTimeInMillis() - c1.getTimeInMillis();
		long days = TimeUnit.MILLISECONDS.toDays(duration);

		duration = duration - TimeUnit.DAYS.toMillis(days);
		long hours = TimeUnit.MILLISECONDS.toHours(duration);

		duration = duration - TimeUnit.HOURS.toMillis(hours);
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);

		duration = duration - TimeUnit.MINUTES.toMillis(minutes);
		long secons = TimeUnit.MILLISECONDS.toSeconds(duration);
		System.out.printf("Mối tình đã bắt đầu được: %s ngày, %s giờ, %s phút, %s giây", days, hours, minutes, secons);
	}

}
