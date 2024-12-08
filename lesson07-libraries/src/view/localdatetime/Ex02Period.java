package view.localdatetime;

import static utils.LocalDateTimeUtils.optional;
import static utils.LocalDateTimeUtils.optionalEnd;

import java.time.LocalDate;
import java.time.Period;

public class Ex02Period {

	// Sử dụng Period để tìm khoảng tgian giữa 2 mốc LocalDate

	public static void main(String[] args) {

		LocalDate dateOfBirth = LocalDate.of(2003, 12, 6);
		LocalDate now = LocalDate.now();

		if (dateOfBirth.isAfter(now)) {
			throw new IllegalArgumentException("StartDate must less than nowDate");
		}

		Period period = Period.between(dateOfBirth, now);

		System.out.println("Khoảng thời gian: " + period);

		String dtDetails = optional(period.getYears(), "Năm") + optional(period.getMonths(), "Tháng")
				+ optionalEnd(period.getDays(), "Ngày");
		System.out.println("Khoảng thời gian: " + dtDetails);

	}

}
