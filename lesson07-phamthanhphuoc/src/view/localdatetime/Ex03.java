package view.localdatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Ex03 utilities = new Ex03();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChọn chức năng:");
            System.out.println("1. Xem thời gian hiện tại");
            System.out.println("2. In ngày cuối cùng của tháng hiện tại");
            System.out.println("3. Xem ngày đầu tiên và cuối cùng của tuần hiện tại");
            System.out.println("4. Xem ngày hiện tại đang ở tuần thứ mấy trong năm");
            System.out.println("5. Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy");
            System.out.println("6. Tính số ngày bạn đã sống");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    utilities.showCurrentTime();
                    break;
                case 2:
                    utilities.showLastDayOfMonth();
                    break;
                case 3:
                    utilities.showStartAndEndOfWeek();
                    break;
                case 4:
                    utilities.showCurrentWeekNumber();
                    break;
                case 5:
                    utilities.showDateAfter20Days();
                    break;
                case 6:
                    utilities.calculateDaysLived();
                    break;
                case 0:
                    System.out.println("Kết thúc chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

    public void showCurrentTime() {
        System.out.println("Thời gian hiện tại: " 
            + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
    }

    public void showLastDayOfMonth() {
        LocalDate today = LocalDate.now();
        System.out.println("Ngày cuối cùng của tháng: "
            + today.withDayOfMonth(today.lengthOfMonth()).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

    public void showStartAndEndOfWeek() {
        LocalDate today = LocalDate.now();
        LocalDate startOfWeek = today.with(DayOfWeek.MONDAY);
        LocalDate endOfWeek = today.with(DayOfWeek.SUNDAY);
        System.out.println("Ngày đầu tuần: " 
            + startOfWeek.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Ngày cuối tuần: "
            + endOfWeek.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

    public void showCurrentWeekNumber() {
        LocalDate today = LocalDate.now();
        int weekNumber = today.get(java.time.temporal.WeekFields.ISO.weekOfYear());
        System.out.println("Ngày hôm nay ở tuần thứ " + weekNumber + " trong năm");
    }

    public void showDateAfter20Days() {
        LocalDate today = LocalDate.now();
        LocalDate after20Days = today.plusDays(20);
        DayOfWeek dayOfWeek = after20Days.getDayOfWeek();
        System.out.println("Sau 20 ngày nữa là ngày " 
            + after20Days.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) 
            + ", thứ " + dayOfWeek.name());
    }

    public void calculateDaysLived() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ngày sinh (dd/MM/yyyy): ");
        LocalDate birthDate = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        long daysLived = java.time.temporal.ChronoUnit.DAYS.between(birthDate, LocalDate.now());
        System.out.println("Bạn đã sống được " + daysLived + " ngày.");
    }
}
