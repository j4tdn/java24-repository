package view.localdatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Ex04 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2022, 06, 07);
		int count = 0;
		while (count <= 100) {
			if (date.getDayOfWeek() != DayOfWeek.SUNDAY && date.getDayOfWeek() != DayOfWeek.SATURDAY) {
				count++;
			}
			date = date.plusDays(1);
		}
		System.out.println("Ngày bàn giao sản phẩm là " + date);
	}
}
