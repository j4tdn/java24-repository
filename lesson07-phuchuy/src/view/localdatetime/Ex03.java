package view.localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.WeekFields;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		presentTimeOf("Europe/London");
		lastDayOfMonth();
		firstAndLastDay();
		presentWeek();
		addDay();
		dayExisted();

	}

	private static void presentTimeOf(String timeZone) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		ZoneId zone = ZoneId.of(timeZone);

		LocalDateTime lc = LocalDateTime.now(zone);

		System.out.printf("Thời gian hiện tại của %s là: %s \n", timeZone, lc.format(dtf));
		System.out.println("=============================================");

	}

	private static void lastDayOfMonth() {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate lc = LocalDate.now();

		System.out.printf("Ngày cuối cùng của tháng hiện tại(%s): %s\n", lc.format(df), lc.lengthOfMonth());
		System.out.println("=============================================");
	}

	private static void firstAndLastDay() {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate lc = LocalDate.now();
		WeekFields wf = WeekFields.ISO;
		LocalDate first = lc.plusDays(wf.getFirstDayOfWeek().getValue() - lc.getDayOfWeek().getValue());
		LocalDate last = first.plusDays(5);

		System.out.printf("ngày đầu tiên của tuần: %s\n", first.format(df));
		System.out.printf("ngày cuối cùng của tuần: %s\n", last.format(df));
	}

	private static void presentWeek() {
		WeekFields wf = WeekFields.ISO;
		LocalDate lc = LocalDate.now();

		System.out.printf("Ngày hiện tại đang ở tuần thứ %s trong năm \n", lc.get(wf.weekOfYear()));
		System.out.println("=============================================");
	}

	private static void addDay() {
		LocalDate lc = LocalDate.now();

		System.out.printf("Sau 20 ngày: %s, %s \n", lc.plusDays(20), lc.getDayOfWeek());
		System.out.println("=============================================");
	}

	private static void dayExisted() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập vào ngày tháng năm sinh (dd/MM/yyyy): ");
		String birth = ip.nextLine();

		LocalDate birthDay = LocalDate.parse(birth, dtf);

		LocalDate now = LocalDate.now();

		Period p = Period.between(birthDay, now);

		System.out.printf("Số ngày sống được: %s năm %s tháng %s ngày\n", p.getYears(), p.getMonths(), p.getDays());
		System.out.println("=============================================");

	}

}
