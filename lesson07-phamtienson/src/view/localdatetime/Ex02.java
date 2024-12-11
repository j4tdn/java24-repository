package view.localdatetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import utils.DateTimeUtils;

public class Ex02 {

    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Scanner ip = new Scanner(System.in);
        System.out.println("Nhập ngày (dd/MM/yyyy):");
        String dateInput = ip.nextLine();

        LocalDate date = DateTimeUtils.toLocalDate(dateInput, formatter);

        String[] daysOfWeekVietnamese = {"Chủ Nhật", "Thứ Hai", "Thứ Ba", "Thứ Tư", "Thứ Năm", "Thứ Sáu", "Thứ Bảy"};
        int dayOfWeek = date.getDayOfWeek().getValue();
        System.out.println("Ngày trong tuần: " + daysOfWeekVietnamese[dayOfWeek % 7]);

        int dayOfYear = date.getDayOfYear();
        LocalDate endOfYear = LocalDate.of(date.getYear(), Month.DECEMBER, 31);
        long daysRemaining = date.until(endOfYear).getDays();

        System.out.println("Ngày thứ " + dayOfYear + " trong năm, còn " + daysRemaining + " ngày nữa đến hết năm");

        int countOfWeekdayInYear = 0;
        LocalDate firstDayOfYear = LocalDate.of(date.getYear(), 1, 1);
        LocalDate lastDayOfYear = LocalDate.of(date.getYear(), 12, 31);

        for (LocalDate day = firstDayOfYear; !day.isAfter(lastDayOfYear); day = day.plusDays(1)) {
            if (day.getDayOfWeek().getValue() == dayOfWeek) {
                countOfWeekdayInYear++;
            }
        }

        System.out.println("Thứ " + daysOfWeekVietnamese[dayOfWeek % 7] + " lần thứ " + countOfWeekdayInYear + " trong năm");

        int daysInYear = date.lengthOfYear();
        int daysInMonth = date.getMonth().length(date.isLeapYear());
        System.out.println("Tổng số ngày trong năm: " + daysInYear);
        System.out.println("Tổng số ngày trong tháng: " + daysInMonth);
    }
}
