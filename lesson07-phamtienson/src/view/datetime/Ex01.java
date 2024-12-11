package view.datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import utils.DateTimeUtils;

public class Ex01 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println("Nhập ngày giờ bắt đầu hẹn hò (dd/MM/yyyy HH:mm:ss):");
        String startDateInput = ip.nextLine();

        System.out.println("Nhập ngày giờ chia tay (nếu đã chia tay):");
        String endDateInput = ip.nextLine();

        Calendar start = DateTimeUtils.toCalendar(startDateInput, "dd/MM/yyyy HH:mm:ss");
        Calendar end;

        if (endDateInput.isEmpty()) {
            end = Calendar.getInstance(); 
        } else {
            end = DateTimeUtils.toCalendar(endDateInput, "dd/MM/yyyy HH:mm:ss");
        }

        String[] daysOfWeek = {"Chủ Nhật", "Thứ Hai", "Thứ Ba", "Thứ Tư", "Thứ Năm", "Thứ Sáu", "Thứ Bảy"};
        int dayOfWeek = start.get(Calendar.DAY_OF_WEEK);
        System.out.println("Ngày bắt đầu hẹn hò là: " + daysOfWeek[dayOfWeek - 1]);

        long duration = end.getTimeInMillis() - start.getTimeInMillis();

        long years = TimeUnit.MILLISECONDS.toDays(duration) / 365;
        duration -= TimeUnit.DAYS.toMillis(years * 365);

        long months = TimeUnit.MILLISECONDS.toDays(duration) / 30;
        duration -= TimeUnit.DAYS.toMillis(months * 30);

        long days = TimeUnit.MILLISECONDS.toDays(duration);
        duration -= TimeUnit.DAYS.toMillis(days);

        long hours = TimeUnit.MILLISECONDS.toHours(duration);
        duration -= TimeUnit.HOURS.toMillis(hours);

        long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
        duration -= TimeUnit.MINUTES.toMillis(minutes);

        long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);

        System.out.printf("Mối tình đã kéo dài: %d năm, %d tháng, %d ngày, %d giờ, %d phút, %d giây.\n",
                    years, months, days, hours, minutes, seconds);
    } 

}
