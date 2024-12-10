package view.datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat formatter = new SimpleDateFormat("d M yyyy");

        System.out.print("Nhập ngày (d M yyyy): ");
        String dateString = scanner.nextLine();
        Date date;
        try {
            date = formatter.parse(dateString);
        } catch (ParseException e) {
            System.out.println("Định dạng ngày không hợp lệ.");
            return;
        }

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        String dayOfWeekName = getDayOfWeekName(dayOfWeek);

        System.out.println("Ngày " + dateString + " là " + dayOfWeekName);

        System.out.println("\nThông tin bổ sung:");
        System.out.println("- Đây là ngày thứ " + calendar.get(Calendar.DAY_OF_YEAR) + " trong năm.");
        System.out.println("- Còn " + (365 - calendar.get(Calendar.DAY_OF_YEAR)) + " ngày nữa là hết năm.");
        System.out.println("- Đây là thứ " + dayOfWeek + " trong tuần.");
        System.out.println("- Tháng " + (calendar.get(Calendar.MONTH) + 1) + " năm " + calendar.get(Calendar.YEAR) + " có " + calendar.getActualMaximum(Calendar.DAY_OF_MONTH) + " ngày.");

        scanner.close();
    }

    private static String getDayOfWeekName(int dayOfWeek) {
        switch (dayOfWeek) {
            case Calendar.SUNDAY:
                return "Chủ Nhật";
            case Calendar.MONDAY:
                return "Thứ Hai";
            case Calendar.TUESDAY:
                return "Thứ Ba";
            case Calendar.WEDNESDAY:
                return "Thứ Tư";
            case Calendar.THURSDAY:
                return "Thứ Năm";
            case Calendar.FRIDAY:
                return "Thứ Sáu";
            case Calendar.SATURDAY:
                return "Thứ Bảy";
            default:
                return "Không xác định";
        }
    }
}