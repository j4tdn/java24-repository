package view.localdatetime;

import java.time.LocalDate;
import java.time.Period;

import static util.DateTimeUtill.*;

public class Ex02Period {

	// Sử dụng period để tìm khoản thời gian giữa 2 mốc LocalDate

	public static void main(String[] args) {

		LocalDate dateOfBirth = LocalDate.of(2022, 11, 17);
		LocalDate now = LocalDate.now();

		if (dateOfBirth.isAfter(now)) {
			throw new IllegalArgumentException("StartDate must left then EndDate.");
		}

		Period period = Period.between(dateOfBirth, now);

		// P22Y3M19D

		System.out.println("Khoảng thời gian: " + period);

		String dtDetails = optional(period.getYears(), "năm") + optional(period.getMonths(), "tháng")
				+ optionalEnd(period.getDays(), "ngày");

		System.out.println("Khoảng thời gian: " + dtDetails);

	}
}
