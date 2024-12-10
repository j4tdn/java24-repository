package view.datetime;

import java.util.Date;
import java.util.Scanner;

import static utils.DateTimeUtils.*;

public class Ex01 {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập ngày bắt đầu hẹn hò: (dd.MM.yyyy)");
		String startDateInput = ip.nextLine();
		
		Date startDate = toDate(startDateInput, "dd.MM.yyyy");
		
        System.out.println("startDate: " + startDate);
		
        System.out.print("Nhập ngày chia tay (nếu chưa chia tay nhấn Enter): ");
        Date endDate;
        String endDateInput = ip.nextLine();

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
        
        System.out.println("Mối tình đã kéo dài: ");
        System.out.println(years + " năm, " + months + " tháng, " + days + " ngày.");
        System.out.println("Tổng cộng: " + diffInHours + " giờ, " + diffInMinutes + " phút, " + diffInSeconds + " giây.");

        ip.close();
	}
}
