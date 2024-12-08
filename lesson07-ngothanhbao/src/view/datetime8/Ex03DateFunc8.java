package view.datetime8;

import static utils.DateTimeUtils.optional;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.IsoFields;
import java.util.Scanner;

public class Ex03DateFunc8 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhap khu vuc: ");
		String area = ip.nextLine();
		timeInZone(area);
		String pattern = "dd/MM/yyyy";
		lastDayInMonth(LocalDate.now(), pattern);
		firstAndLastDayOfWeek(LocalDate.now(), pattern);
		numberWeeksOfYear(LocalDate.now());
		dateAfter20Days(LocalDate.now(), pattern);
		
		try {
			System.out.print("Nhap ngay sinh: ");
			String dOB = ip.nextLine();
			dayOfBirth(dOB);
		} catch (IllegalArgumentException iae) {
			System.out.println(iae.getMessage());
		}
		ip.close();
	}

	public static void timeInZone(String zone) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		ZoneId zoneId = ZoneId.of(zone);
		LocalDateTime time = LocalDateTime.now(zoneId);
		System.out.println(dtf.format(time));
	}
		
	public static void lastDayInMonth(LocalDate source, String pattern) {
		LocalDate time = source.withDayOfMonth(source.lengthOfMonth());
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		System.out.println("Ngay cuoi thang: " + dtf.format(time));
	}
	
	public static void firstAndLastDayOfWeek(LocalDate source,String pattern) {
		LocalDate first = source.with(DayOfWeek.MONDAY);
		LocalDate last = source.with(DayOfWeek.SUNDAY);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		System.out.println("Ngay dau tuan la: " + dtf.format(first) + ", ngay cuoi tuan la: " + dtf.format(last));
	}
	
	public static void numberWeeksOfYear(LocalDate source) {
	    System.out.println("Tuan thu " + source.get(IsoFields.WEEK_OF_WEEK_BASED_YEAR) + " trong nam");
	}
	
	public static void dateAfter20Days(LocalDate source, String pattern) {
		LocalDate time = source.plusDays(20);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		System.out.println("Sau 20 ngay la ngay: " + dtf.format(time));
	}
	
	public static void dayOfBirth(String source) throws IllegalArgumentException{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate start = LocalDate.parse(source,dtf);
		LocalDate end = LocalDate.now();
		
		if(start.isAfter(end)) {
			throw new IllegalArgumentException("Nam sinh khong hop le");
		}
		Period period = Period.between(start, end);
		String dtDetails = optional(period.getYears(), "nam") + optional(period.getMonths(), "thang") + optional(period.getDays(), "ngay");
		
		System.out.println("Khoang thoi gian ton tai: " + dtDetails);
	}

}
