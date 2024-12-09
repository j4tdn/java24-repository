package view.localdatetime;

import java.time.LocalDate;
import java.time.Period;

import static utils.DateTimeUtils.*;

public class Ex02Period {

	// use period to find khoảng time betweeen 2 mốc LocalDate

	public static void main(String[] args) {
		LocalDate dateOfBirth = LocalDate.of(204, 12, 6);
		LocalDate now = LocalDate.now();

		if (dateOfBirth.isAfter(now)) {
			throw new IllegalArgumentException("StartDate must less than EndDate!!");
		}

		Period period = Period.between(dateOfBirth, now);

		System.out.println("khoảng thời gian: " + period);

		String dtDetails = optional(period.getYears(),"năm") 
							+ optional(period.getMonths(), "tháng") 
								+  optionalEnd(period.getDays(), "ngày");
		System.out.println("Khoảng thời gian: " + dtDetails);
	}

	
}
