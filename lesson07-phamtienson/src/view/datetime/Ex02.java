package view.datetime;

import java.util.Calendar;
import java.util.Scanner;
import utils.DateTimeUtils;

public class Ex02 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.println("Nhập ngày, tháng, năm (dd/MM/yyyy):");
        String dateInput = ip.nextLine();

        Calendar date = DateTimeUtils.toCalendar(dateInput, "dd/MM/yyyy");

      
        String[] daysOfWeek = {"Chủ Nhật", "Thứ Hai", "Thứ Ba", "Thứ Tư", "Thứ Năm", "Thứ Sáu", "Thứ Bảy"};
        int dayOfWeek = date.get(Calendar.DAY_OF_WEEK);
        System.out.println("1. Đây là " + daysOfWeek[dayOfWeek - 1]);

        int dayOfYear = date.get(Calendar.DAY_OF_YEAR);
        int daysInYear = date.getActualMaximum(Calendar.DAY_OF_YEAR);
        int daysRemaining = daysInYear - dayOfYear;
        System.out.println("2. Đây là ngày thứ " + dayOfYear + " trong năm, còn lại " + daysRemaining + " ngày.");

        int totalWeekdays = 0;
        for (int i = 1; i <= daysInYear; i++) {
            Calendar tempDate = Calendar.getInstance();
            tempDate.set(Calendar.DAY_OF_YEAR, i);
            if (tempDate.get(Calendar.DAY_OF_WEEK) == dayOfWeek) {
                totalWeekdays++;
            }
        }
        System.out.println("3. Đây là " + daysOfWeek[dayOfWeek - 1] + " lần thứ " + totalWeekdays + " trong tổng số " + totalWeekdays + " " + daysOfWeek[dayOfWeek - 1] + " của năm.");

        int totalWeekdaysInMonth = 0;
        int dayInMonth = date.get(Calendar.DAY_OF_MONTH);
        for (int i = 1; i <= dayInMonth; i++) {
            Calendar tempDate = Calendar.getInstance();
            tempDate.set(date.get(Calendar.YEAR), date.get(Calendar.MONTH), i);
            if (tempDate.get(Calendar.DAY_OF_WEEK) == dayOfWeek) {
                totalWeekdaysInMonth++;
            }
        }
        System.out.println("4. Đây là " + daysOfWeek[dayOfWeek - 1] + " lần thứ " + totalWeekdaysInMonth + " trong tháng " + (date.get(Calendar.MONTH) + 1));

        System.out.println("5. Năm nay có " + daysInYear + " ngày.");

        int daysInMonth = date.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("6. Tháng này có " + daysInMonth + " ngày.");
    }
}
