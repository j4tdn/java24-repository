package view.datetime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("Thời gian hiện tại: " + sdf.format(new Date()));
    }

    public void showLastDayOfMonth() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Ngày cuối cùng của tháng: " + sdf.format(calendar.getTime()));
    }

    public void showStartAndEndOfWeek() {
        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Ngày đầu tuần: " + sdf.format(calendar.getTime()));

        calendar.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        System.out.println("Ngày cuối tuần: " + sdf.format(calendar.getTime()));
    }

    public void showCurrentWeekNumber() {
        Calendar calendar = Calendar.getInstance();
        int weekNumber = calendar.get(Calendar.WEEK_OF_YEAR);
        System.out.println("Ngày hôm nay ở tuần thứ " + weekNumber + " trong năm");
    }

    public void showDateAfter20Days() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, 20);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dateAfter20Days = sdf.format(calendar.getTime());

        SimpleDateFormat dayOfWeekFormat = new SimpleDateFormat("EEEE");
        String dayOfWeek = dayOfWeekFormat.format(calendar.getTime());

        System.out.println("Sau 20 ngày nữa là ngày " + dateAfter20Days + ", thứ " + dayOfWeek);
    }

    public void calculateDaysLived() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ngày sinh (dd/MM/yyyy): ");
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date birthDate = sdf.parse(scanner.nextLine());
            Date currentDate = new Date();

            long diffInMillis = currentDate.getTime() - birthDate.getTime();
            long daysLived = diffInMillis / (1000 * 60 * 60 * 24);

            System.out.println("Bạn đã sống được " + daysLived + " ngày.");
        } catch (Exception e) {
            System.out.println("Định dạng ngày không hợp lệ. Vui lòng nhập lại.");
        }
    }
}
