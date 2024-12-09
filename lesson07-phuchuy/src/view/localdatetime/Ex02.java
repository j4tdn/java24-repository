package view.localdatetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.WeekFields;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập thời gian: ");
		String time = ip.nextLine();
		weekDaysCal(time);

	}

	private static void weekDaysCal(String string) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		LocalDate lc = LocalDate.parse(string, df);
		WeekFields wf = WeekFields.ISO;

		System.out.printf("It is day number %s of the year, %s days left.\n", lc.getDayOfYear(),
				lc.lengthOfYear() - lc.getDayOfYear());

		System.out.printf("It is %s number %s out of %s in %s\n", lc.getDayOfWeek(), lc.get(wf.weekOfYear()),
				LocalDate.MAX.get(wf.weekOfYear()), lc.getYear());

		System.out.printf("It is %s number %s out of %s in %s %s \n", lc.getDayOfWeek(), lc.get(wf.weekOfMonth()),
				LocalDate.MAX.get(wf.weekOfMonth()) - 1, lc.getMonth(), lc.getYear());

		System.out.printf("Year %s has %s days \n", lc.getYear(), lc.lengthOfYear());

		System.out.printf("%s %s has %s days \n", lc.getMonth(), lc.getYear(), lc.lengthOfMonth());
	}

}
