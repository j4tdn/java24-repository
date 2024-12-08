package view.datetime;

import static utils.DateTimeUtils.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		String pattern = "dd.MM.yyyy";
		System.out.println("Nhập ngày(dd.MM.yyyy):");
		String str = ip.nextLine();

		Calendar c = toCalendar(str, pattern);

		aditionalFacts(c);

		ip.close();
	}

	private static void aditionalFacts(Calendar source) {
		
		DateFormat df = new SimpleDateFormat("dd.MM.yyyy EEEE", Locale.of("vi", "VN"));
		
		System.out.println("Ngày " + df.format(source.getTime()));
		
		System.out.println("Đây là ngày thứ " + source.get(Calendar.DAY_OF_YEAR) + " trong năm, còn lại "
				+ (source.getActualMaximum(Calendar.DAY_OF_YEAR) - source.get(Calendar.DAY_OF_YEAR)) + " ngày.");
		
		System.out.println("Đây là thứ " + source.get(Calendar.DAY_OF_WEEK) + " thứ " + countWeekday(source, Calendar.DAY_OF_YEAR) + " trong năm "
				+ source.get(Calendar.YEAR));
		
		System.out.println("Đây là thứ " + source.get(Calendar.DAY_OF_WEEK) + " thứ " + countWeekday(source, Calendar.DAY_OF_MONTH) + " trong tháng "
				+ (source.get(Calendar.MONTH)+1) + " năm " + source.get(Calendar.YEAR));
		
		System.out.println("Năm " + source.get(Calendar.YEAR) + " có " + source.getActualMaximum(Calendar.DAY_OF_YEAR) + " ngày");
		System.out.println("Tháng " + (source.get(Calendar.MONTH)+1) + " năm " + source.get(Calendar.YEAR) + " có " + source.getActualMaximum(Calendar.DAY_OF_MONTH) + " ngày");
	}

	private static int countWeekday(Calendar source, int field) {
		Calendar start = cloneAndSet(source, field, 1);
		Calendar end = clone(source);
		end.add(field, 1);
		int count = 0;

		for (Calendar c = start; c.before(end); c.add(field, 1)) {
			if (source.get(Calendar.DAY_OF_WEEK) == c.get(Calendar.DAY_OF_WEEK)) {
				count++;
			}
		}
		return count;
	}

	private static Calendar clone(Calendar source) {
		Calendar target = Calendar.getInstance();
		target.setTimeInMillis(source.getTimeInMillis());
		return target;
	}

	private static Calendar cloneAndSet(Calendar source, int field, int value) {
		Calendar target = Calendar.getInstance();
		target.setTimeInMillis(source.getTimeInMillis());
		target.set(field, value);
		return target;
	}
}
