package view.localdatetime;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d M yyyy");

        System.out.print("Nhập ngày (d M yyyy): ");
        String dateString = scanner.nextLine();
        LocalDate date = LocalDate.parse(dateString, formatter);

        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println("Ngày " + dateString + " là " + dayOfWeek);

        System.out.println("\nThông tin bổ sung:");
        System.out.println("- Đây là ngày thứ " + date.getDayOfYear() + " trong năm.");
        System.out.println("- Còn " + (365 - date.getDayOfYear()) + " ngày nữa là hết năm.");
        System.out.println("- Đây là thứ " + dayOfWeek.getValue() + " trong tuần.");
        System.out.println("- Tháng " + date.getMonthValue() + " năm " + date.getYear() + " có " + date.lengthOfMonth() + " ngày.");

        scanner.close();
    }
}