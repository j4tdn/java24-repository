package view;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Ex01TURC {

	public static void main(String[] args) {

		Locale lc = Locale.of("vi", "VN");
		Locale.setDefault(lc);
		Calendar start = toCalc("01/03/2022");
		Calendar now = Calendar.getInstance();

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy EEEE");

		System.out.println("Bắt đầu --> " + df.format(start.getTime()));
		System.out.println("Hiện tại --> " + df.format(now.getTime()));

		long time = now.getTimeInMillis() - start.getTimeInMillis();
		System.out.println(TimeUnit.MILLISECONDS.toDays(time));

	}

	private static Calendar toCalc(String dayAsString) {
		Calendar c = Calendar.getInstance();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

		try {
			Date date = df.parse(dayAsString);
			c.setTime(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return c;

	}

	private static Calendar clone(Calendar source) {
		Calendar target = Calendar.getInstance();
		source.setTimeInMillis(source.getTimeInMillis());
		return source;
	}

}
