package view.localdatetime;

import java.time.LocalDate;
import java.time.Period;

import static utils.DateTimeUtils.*;

public class Ex02Period {
	
	// Sử dụng Period để tìm khoảng thời gian giữa 2 mốc LocalDate
	
	public static void main(String[] args) {
		
		LocalDate dateOfBirth = LocalDate.of(2022, 8, 6);
		LocalDate now = LocalDate.now();
		
		if (dateOfBirth.isAfter(now)) {
			throw new IllegalArgumentException("StartDate must less then EndDate.");	
		}
		
		Period period = Period.between(dateOfBirth, now);
		
		// P22Y3M19D
		// P3M19D
		
		System.out.println("Khoảng thời gian: " + period);
		
		String dtDetails = optional(period.getYears(), "năm")
				+ optional(period.getMonths(), "tháng")
				+ optionalEnd(period.getDays(), "ngày");
		
		System.out.println("Khoảng thời gian: " + dtDetails);
	}
	
	
	
	
	
}
