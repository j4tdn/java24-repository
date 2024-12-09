package view.datetime;

import static utils.DateTimeUtils.toCalendar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import utils.DateTimeUtils;

public class Ex02 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập ngày (dd.MM.yyyy): ");
		String date = ip.nextLine();
		System.out.println("================================");
		weekdayCalculator(date);

	}

	private static void weekdayCalculator(String string) {
		Calendar c = toCalendar(string, "dd.MM.yyyy");
		DateFormat df = new SimpleDateFormat("EEEE");
		DateFormat df1 = new SimpleDateFormat("MMMMM yyyy");
		Date date = DateTimeUtils.toDate(c);
		Date month = DateTimeUtils.toDate(c);

		System.out.printf("It is day number %s of the year, %s days left.\n", c.get(Calendar.DAY_OF_YEAR),
				c.getActualMaximum(Calendar.DAY_OF_YEAR) - c.get(Calendar.DAY_OF_YEAR));

		System.out.printf("It is %s number %s out of %s in %s\n", df.format(date), c.get(Calendar.WEEK_OF_YEAR),
				c.getActualMaximum(Calendar.WEEK_OF_YEAR), c.get(Calendar.YEAR));

		System.out.printf("It is %s number %s out of %s in %s \n", df.format(date),
				c.get(Calendar.DAY_OF_WEEK_IN_MONTH), c.getActualMaximum(Calendar.DAY_OF_WEEK_IN_MONTH),
				df1.format(month));

		System.out.printf("Year %s has %s days \n", c.get(Calendar.YEAR), c.getActualMaximum(Calendar.DAY_OF_YEAR));

		System.out.printf("%s has %s days \n", df1.format(month), c.getActualMaximum(Calendar.DAY_OF_MONTH));
	}

}
