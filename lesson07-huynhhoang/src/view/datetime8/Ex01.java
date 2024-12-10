package view.datetime8;

import static utils.DateTimeUtils.optional;
import static utils.DateTimeUtils.optionalEnd;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		
		System.out.println("Nhập thời gian bắt đầu hẹn hò của 2 người.");
		String datingTime = sc.nextLine();
		LocalDate time = LocalDate.parse(datingTime, formatter);
		
		System.out.println("Hien tai cac ban con quen nhau ko? neu co nhan true neu sai thi false");
		boolean isStillLove = Boolean.parseBoolean(sc.nextLine());
		if(!isStillLove) {
			System.out.print("Ngày 2 bạn chia tay là: ");
			String brokeUpTime = sc.nextLine();

			LocalDate farewellDay = LocalDate.parse(brokeUpTime, formatter);
			
			duration(time, farewellDay);
		}else {
			LocalDate now = LocalDate.now();
			duration(time, now);
		}
		System.out.println("Ngày hẹn hò vào: " + time.getDayOfWeek());
		
	}

	private static void duration(LocalDate start, LocalDate end) {
		Period p = Period.between(start, end);

		String dtDetails = optional(p.getYears(), "năm") + optional(p.getMonths(), "tháng")
				+ optionalEnd(p.getDays(), "Ngày");
		System.out.println("Khoảng thời gian: " + dtDetails);
	}

}
