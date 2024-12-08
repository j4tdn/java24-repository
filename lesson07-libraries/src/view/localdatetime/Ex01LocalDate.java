package view.localdatetime;

import java.time.LocalDate;
import java.time.Month;

public class Ex01LocalDate {
	/*
	 * Khởi tạo đối tượng --> new Class() --> constructor --> getInstance -->
	 * singleton, factory pattern --> --> build pattern
	 */
	public static void main(String[] args) {
		LocalDate date1 = LocalDate.now();
		System.out.println("date1: " + date1);

		LocalDate date2 = LocalDate.of(2024, Month.OCTOBER, 28);
		System.out.println("date2: " + date2);

		// with --> object
		// item.with(1)
		// --> TH1: cập nhập item đang gọi
		// --> TH2: tạo đt mới với giá trị item cũ và thêm set 1 vào

		LocalDate date3 = LocalDate.now();
		// Nếu muốn thay đổi giá trị, mặc định with sẽ tạo đối tượng mới
		date3 = date3.withYear(2026).withDayOfMonth(18).withMonth(1).plusDays(25).plusYears(1);
		System.out.println(date3);

	}

}
