package view.localdatetime;

import static utils.DateTimeUtils.optional;
import static utils.DateTimeUtils.optionalEnd;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy");

		System.out.print("Nhập thời gian quen nhau của 2 bạn: ");
		String datingTime = ip.nextLine();

		LocalDate lc = LocalDate.parse(datingTime, df);

		System.out.print("Hiện tại 2 bạn còn quen nhau không ? (T/F) ");
		Boolean isStillDating = Boolean.parseBoolean(ip.nextLine());
		if (!isStillDating) {
			System.out.print("Ngày 2 bạn chia tay là: ");
			String brokeUpTime = ip.nextLine();

			LocalDate broke = LocalDate.parse(brokeUpTime, df);

			duration(lc, broke);

		} else {
			LocalDate now = LocalDate.now();
			duration(lc, now);

		}
		System.out.println("Ngày hẹn hò vào: " + lc.getDayOfWeek());
	}

	private static void duration(LocalDate start, LocalDate end) {
		Period p = Period.between(start, end);

		String dtDetails = optional(p.getYears(), "năm") + optional(p.getMonths(), "tháng")
				+ optionalEnd(p.getDays(), "ngày");

		System.out.println("Khoảng thời gian: " + dtDetails);

	}

}
