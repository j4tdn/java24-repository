package view.localdatetime;

import java.time.LocalDate;
import java.time.Period;
import static utils.DateTimeUtils.*;

public class Ex02Period {
	
	// Sử dụng period để tìm khoảng thời gian giữa 2 mốc LocalDate
	
	public static void main(String[] args) {
		LocalDate dateOfBirth = LocalDate.of(2003, 3, 14);
		LocalDate now = LocalDate.now();
		
		if (dateOfBirth.isAfter(now)) {
			throw new IllegalArgumentException("StartDate must less then EndDate.");
		}
		
		Period period = Period.between(dateOfBirth, now);
		System.out.println("khoang thoi gian:" + period);
		
		String dtDetails = optional(period.getYears(), "Nam") + optional(period.getMonths(), "thang") + optionalEnd(period.getDays(), "ngay") ;
		System.out.println("khoang thoi gian:" + dtDetails);
	}
	
}
