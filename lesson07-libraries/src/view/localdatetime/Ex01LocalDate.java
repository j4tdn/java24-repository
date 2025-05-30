package view.localdatetime;

import java.time.LocalDate;
import java.time.Month;

public class Ex01LocalDate {
	
	/*
	 LocalDate: hỗ trợ ngày tháng năm
	          : pattern mặc định: yyyy-MM-dd
	  
	 Để khởi tạo 1 đối tượng
	 --> new Class() --> constructor
	 --> getInstance --> singleton, factory pattern
	 -->             --> builder pattern
	 */
	
	public static void main(String[] args) {
		LocalDate date1 = LocalDate.now();
		System.out.println("date1: " + date1);
		
		// LocalDate.of(2024, 10, 28);
		LocalDate date2 = LocalDate.of(2024, Month.OCTOBER, 28);
		System.out.println("date2: " + date2);
		
		// setter --> void
		// item.setId(1) --> set id=1 vào trong item
		
		// with --> object
		// item.withId(1)
		// --> TH1: cập nhật vào item đang gọi
		// --> TH2: tạo đối tượng mới chứa tất cả các giá trị của item cũ và
		//          thêm set 1 vào
		
		LocalDate date3 = LocalDate.now();
		
		System.out.println("date3 --> " + date3);
		
		date3 = date3.withYear(2016)
						.withDayOfMonth(18)
						.withMonth(2)
						.plusDays(12);
		
		System.out.println("date3 --> " + date3);
				
	}
	
}
