package view.datetime;

import java.util.Date;
import java.util.Scanner;
import static utils.DateTimeUtils.*;

public class Ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập thời gian bắt đầu hẹn hò : ");
		String startDateInput = sc.nextLine();
		
		Date startDate = toDate(startDateInput, "dd.MM.yyyy");
		
		
        System.out.print("Nhập thời gian chia tay : ");
        Date endDate;
        String endDateInput = sc.nextLine();

        if (endDateInput.isEmpty()) {
            endDate = new Date();
        } else {
            endDate = toDate(endDateInput, "dd.MM.yyyy");
        }

        long diffInMillis = endDate.getTime() - startDate.getTime();
        
        long diffInSeconds = diffInMillis / 1000;
        long diffInMinutes = diffInSeconds / 60;
        long diffInHours = diffInMinutes / 60;
        long diffInDays = diffInHours / 24;
        int years = (int) (diffInDays / 365);
        diffInDays %= 365;
        int months = (int) (diffInDays / 30);
        int days = (int) (diffInDays % 30);
        
        System.out.println("Mối tình đã bắt đầu được : ");
        System.out.println(years + " năm, " + months + " tháng, " + days + " ngày.");
        System.out.println("Tổng cộng: " + diffInHours + " giờ, " + diffInMinutes + " phút, " + diffInSeconds + " giây.");

        sc.close();
	}
	
	
}
