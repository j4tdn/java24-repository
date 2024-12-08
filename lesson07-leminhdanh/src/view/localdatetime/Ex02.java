package view.localdatetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		System.out.print("Nhập ngày(dd.MM.yyyy):");
		String str = ip.nextLine();
		//String str = "30.06.2020";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy",Locale.of("vi", "VN"));
		LocalDate date = LocalDate.parse(str, formatter);
		
		aditionalFacts(date);
	}
	
	private static void aditionalFacts(LocalDate d) {
		
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd.MM.yyyy EEEE",Locale.of("vi", "VN"));
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("EEEE",Locale.of("vi", "VN"));
		DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("MM yyyy",Locale.of("vi", "VN"));
		System.out.println("Ngày " + d.format(formatter1));
		
		System.out.println("Đây là ngày thứ " + d.getDayOfYear() + ", còn lại " + (d.lengthOfYear()-d.getDayOfYear()) + " ngày");
		System.out.println("Đây là " + d.format(formatter2) + " thứ " + countWeekdayOfYear(d) + " trong năm " + d.getYear());
		System.out.println("Đây là " + d.format(formatter2) + " thứ " + countWeekdayOfMonth(d) + " trong tháng " + d.format(formatter3));
		System.out.println("Năm " + d.getYear() + " có " + d.lengthOfYear() + " ngày");
		System.out.println("Tháng " + d.format(formatter3) + " có " + d.lengthOfMonth() + " ngày");
	}
	
	private static int countWeekdayOfYear(LocalDate date) {
		LocalDate start = date.withDayOfYear(1);
		LocalDate end = date.withDayOfYear(date.getDayOfYear());
		end = end.plusDays(1);
		int count = 0;
		while(start.isBefore(end)) {
			if(date.getDayOfWeek() == start.getDayOfWeek())  {
				count++;
			}
			start = start.plusDays(1);
		}
		return count;
	}
	private static int countWeekdayOfMonth(LocalDate date) {
		LocalDate start = date.withDayOfMonth(1);
		LocalDate end = date.withDayOfMonth(date.getDayOfMonth());
		end = end.plusDays(1);
		int count = 0;
		while(start.isBefore(end)) {
			if(date.getDayOfWeek() == start.getDayOfWeek())  {
				count++;
			}
			start = start.plusDays(1);
		}
		return count;
	}
}
