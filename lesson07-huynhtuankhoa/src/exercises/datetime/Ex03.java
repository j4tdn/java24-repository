package exercises.datetime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class Ex03 {
	
	private static final DateFormat df = new SimpleDateFormat("dd/MM/yyyy", new Locale("vi", "VN"));
	
	public static void main(String[] args) {
		getCurrentTimeAt("Europe/Berlin");
		getLastDayOfCurrentMonth();
		getFirstAndLastDayOfCurrentWeek();
		getNumberOfWeekHasCurrentDay();
		getTheNext20Days();
		getNumberOfDaysYouHaveSurvived("10/07/2005");
	}
	
	private static void getCurrentTimeAt(String area) {
		Calendar c = Calendar.getInstance();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		df.setTimeZone(TimeZone.getTimeZone(area));
		System.out.println(df.format(c.getTime()));
	}
	
	private static void getLastDayOfCurrentMonth() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println(df.format(c.getTime()));
	}
	
	private static void getFirstAndLastDayOfCurrentWeek() {
		Calendar c = Calendar.getInstance();
		Calendar firstDay = clone(c);
		Calendar lastDay = clone(c);
		firstDay.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		lastDay.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
		System.out.println(df.format(firstDay.getTime()) + "\n" + df.format(lastDay.getTime()));
	}
	
	private static Calendar clone(Calendar source) {
		Calendar target = Calendar.getInstance();	
		target.setTimeInMillis(source.getTimeInMillis());
		return target;
	}
	
	private static void getNumberOfWeekHasCurrentDay() {
		Calendar c = Calendar.getInstance();
		Calendar fdoY = clone(c);
		fdoY.set(Calendar.DAY_OF_YEAR, 1);
		int count = 1;
		while (fdoY.before(c)) {
			fdoY.add(Calendar.DAY_OF_YEAR, 7);
			count++;
		}
		System.out.println(count);
	}
	
	private static void getTheNext20Days() {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy EEEE");
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_YEAR, 20);
		System.out.println(df.format(c.getTime()));
	}
	
	private static void getNumberOfDaysYouHaveSurvived(String dateOfBirth) {
		Calendar c = Calendar.getInstance();
		Calendar dob = clone(c);
		do {
			try {
				dob.setTime(df.parse(dateOfBirth));
				break;
			} catch (ParseException e) {
				e.printStackTrace();
			}
		} while (true);
		
		long cInMs = c.getTimeInMillis();
		long dobInMs = dob.getTimeInMillis();
		
		long duration = cInMs - dobInMs;
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		System.out.println(days);
	}
}
