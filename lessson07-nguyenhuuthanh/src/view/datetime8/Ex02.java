package view.datetime8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    
        System.out.println("Nhập ngày (dd.MM.yyyy): ");
        String dateInput = sc.nextLine();

        LocalDate date;
        try {
            date = LocalDate.parse(dateInput, formatter);
        } catch (Exception e) {
            System.out.println("Sai định dạng, nhập lại.");
            sc.close();
            return;
        }

    
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int dayOfYear = date.getDayOfYear();
        boolean isLeapYear = date.isLeapYear();
        int totalDaysInYear = isLeapYear ? 366 : 365;
        int remainingDays = totalDaysInYear - dayOfYear;

        int weekOfMonth = (date.getDayOfMonth() - 1) / 7 + 1;
        YearMonth yearMonth = YearMonth.of(date.getYear(), date.getMonth());
        int daysInMonth = yearMonth.lengthOfMonth();

        int totalOccurrencesOfDayInMonth = demThuTrongThang(date, dayOfWeek);

    
        System.out.println("\n===============================================");
        System.out.println("   Ngày " + date.getDayOfMonth() + " " + layTenThang(date.getMonthValue()) 
                + " " + date.getYear() + " là " + dayOfWeek.getDisplayName(TextStyle.FULL, new Locale("vi", "VN")));
        System.out.println("===============================================");
        System.out.println("Thông tin thêm:");
        System.out.println(" - Đây là ngày thứ " + dayOfYear + " của năm, còn " + remainingDays + " ngày nữa.");
        System.out.println(" - Đây là " + dayOfWeek.getDisplayName(TextStyle.FULL, new Locale("vi", "VN")) 
                + " thứ " + weekOfMonth + " trong tổng số " + totalOccurrencesOfDayInMonth 
                + " lần trong tháng " + layTenThang(date.getMonthValue()) + " " + date.getYear() + ".");
        System.out.println(" - Năm " + date.getYear() + " có " + totalDaysInYear + " ngày.");
        System.out.println(" - Tháng " + layTenThang(date.getMonthValue()) + " " + date.getYear() 
                + " có " + daysInMonth + " ngày.");

        sc.close();
    }

    
    private static int demThuTrongThang(LocalDate date, DayOfWeek targetDay) {
        int count = 0;
        LocalDate firstDayOfMonth = date.withDayOfMonth(1);
        LocalDate lastDayOfMonth = date.withDayOfMonth(date.lengthOfMonth());

        while (!firstDayOfMonth.isAfter(lastDayOfMonth)) {
            if (firstDayOfMonth.getDayOfWeek() == targetDay) {
                count++;
            }
            firstDayOfMonth = firstDayOfMonth.plusDays(1);
        }
        return count;
    }

    
    private static String layTenThang(int thang) {
        String[] thangVN = {
                "Tháng Một", "Tháng Hai", "Tháng Ba", "Tháng Tư", "Tháng Năm", "Tháng Sáu",
                "Tháng Bảy", "Tháng Tám", "Tháng Chín", "Tháng Mười", "Tháng Mười Một", "Tháng Mười Hai"
        };
        return thangVN[thang - 1];
    }
}
