package view.java8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
	// 12/10/2003

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		DateTimeFormatter formatted = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formattedDayOfWeek = DateTimeFormatter.ofPattern("EEEE", new Locale("vi", "VN"));

		System.out.print("Nhập ngày (dd/MM/yyyy): ");
		LocalDate theDay = LocalDate.parse(ip.nextLine(), formatted);

		System.out.println("Ngày " + theDay.format(formatted) + " là ngày " + theDay.format(formattedDayOfWeek));

		System.out.println("Là ngày thứ " + theDay.getDayOfYear() + " trong năm, còn lại "
				+ (theDay.lengthOfYear() - theDay.getDayOfYear()) + " ngày");

		int countWeekDayInMonth = 0;
		LocalDate firstDayOfMonth = LocalDate.of(theDay.getYear(), theDay.getMonth(), 1);

		while (firstDayOfMonth.getDayOfWeek() != theDay.getDayOfWeek()) {
			firstDayOfMonth = firstDayOfMonth.plusDays(1);
		}

		while (!firstDayOfMonth.isAfter(theDay)) {
			countWeekDayInMonth++;
			firstDayOfMonth = firstDayOfMonth.plusDays(7);
		}

		int maxWeekDayInMonth = countWeekDayInMonth;
		while (!firstDayOfMonth.isAfter(LocalDate.of(theDay.getYear(), theDay.getMonth(), theDay.lengthOfMonth()))) {
			maxWeekDayInMonth++;
			firstDayOfMonth = firstDayOfMonth.plusDays(7);
		}

		System.out.println("Ngày " + theDay.format(formatted) + " là ngày " + theDay.format(formattedDayOfWeek)
				+ " thứ " + countWeekDayInMonth + "/" + maxWeekDayInMonth + " trong tháng");

		int countWeekDayInYear = 0;
		LocalDate firstDayOfYear = LocalDate.of(theDay.getYear(), 1, 1);

		while (firstDayOfYear.getDayOfWeek() != theDay.getDayOfWeek()) {
			firstDayOfYear = firstDayOfYear.plusDays(1);
		}

		while (!firstDayOfYear.isAfter(theDay)) {
			countWeekDayInYear++;
			firstDayOfYear = firstDayOfYear.plusDays(7);
		}

		int maxWeekDayInYear = countWeekDayInYear;
		while (!firstDayOfYear.isAfter(LocalDate.of(theDay.getYear(), 12, 31))) {
			maxWeekDayInYear++;
			firstDayOfYear = firstDayOfYear.plusDays(7);
		}

		System.out.println("Ngày " + theDay.format(formatted) + " là ngày " + theDay.format(formattedDayOfWeek)
				+ " thứ " + countWeekDayInYear + "/" + maxWeekDayInYear + " trong năm");

		System.out.println("Năm " + theDay.getYear() + " có " + theDay.lengthOfYear() + " ngày");

		DateTimeFormatter formattedMonthYear = DateTimeFormatter.ofPattern("MM/yyyy", new Locale("vi", "VN"));
		System.out.println("Tháng " + theDay.format(formattedMonthYear) + " có " + theDay.lengthOfMonth() + " ngày");
	}
}
