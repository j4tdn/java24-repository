package view.localdatetime;

import java.time.LocalDate;
import java.time.Period;

public class Ex02Period {

	//Sử dụng Period để tìm khoảng thời gian giữa 2 mốc LocalDate
	
	public static void main(String[] args) {
		
		LocalDate dateOfBirth = LocalDate.of(2003, 8, 17);
		LocalDate now = LocalDate.now();
		
		if (dateOfBirth.isAfter(now)) {
			throw new IllegalArgumentException("StartDate must less then EndDate.");
		}
		
		Period period = Period.between(dateOfBirth, now);
		
		System.out.println("Khoảng thời gian: " + period);
		
		String dtDetails = optional(period.getYears(), " nam ") + optional(period.getMonths(), " thang ") +  optionalEnd(period.getDays(), " ngay ");
		System.out.println("Khoang thoi gian: " + dtDetails);
	}
	
	private static String optional(long value, String unit) {
		if(value == 0) {
			return "";
		}
		return value + " " + unit + " ";
	}
	
	
	private static String optionalEnd(long value, String unit) {
		if(value == 0) {
			return "";
		}
		return value + " " + unit;
	}
	
}
