package view.datetime8;


import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		
		System.out.println("Nhập thời gian bắt đầu : ");
		String startDateInput = sc.nextLine();
		LocalDate startDate = LocalDate.parse(startDateInput, formatter);
		System.out.println("Nhập thời gian kết thúc : ");
		String endDateInput = sc.nextLine();
		LocalDate endDate;
		
		if(endDateInput.isEmpty()) {
			endDate = LocalDate.now();
		}else {
			endDate = LocalDate.parse(endDateInput, formatter);
		}
		
		Period period = Period.between(startDate, endDate);
        long totalDays = ChronoUnit.DAYS.between(startDate, endDate);
        long totalHours = totalDays * 24;
        long totalMinutes = totalHours * 60;
        long totalSeconds = totalMinutes * 60;

        
        System.out.println("Mối tình đã bắt đầu được:");
        System.out.println(period.getYears() + " năm, " + period.getMonths() + " tháng, " + period.getDays() + " ngày.");
        System.out.println("Tổng cộng: " + totalHours + " giờ, " + totalMinutes + " phút, " + totalSeconds + " giây.");

        sc.close();
	}
}
