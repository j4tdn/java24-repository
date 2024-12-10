package view.datetime;

import static utils.DateTimeUtils.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Ex01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calendar startDate = inputDate(scanner, "Nhập thời gian quen nhau của 2 bạn (dd.MM.yyyy): ");

        boolean isStillDating = inputBoolean(scanner, "Hiện tại 2 bạn còn quen nhau không? (T/F): ");

        if (isStillDating) {
            handleOngoingRelationship(startDate);
        } else {
            Calendar endDate = inputDate(scanner, "Nhập ngày 2 bạn chia tay(nếu có) (dd.MM.yyyy): ");
            handleEndedRelationship(startDate, endDate);
        }

        scanner.close();
    }

    private static Calendar inputDate(Scanner scanner, String prompt) {
        System.out.print(prompt);
        String input = scanner.nextLine();
        return toCalendar(input, "dd.MM.yyyy");
    }

    private static boolean inputBoolean(Scanner scanner, String prompt) {
        System.out.print(prompt);
        String input = scanner.nextLine();
        return Boolean.parseBoolean(input.trim());
    }

    private static void handleOngoingRelationship(Calendar startDate) {
        Calendar now = Calendar.getInstance();
        printStartDate(startDate);
        printDuration(startDate, now, false);
    }

    private static void handleEndedRelationship(Calendar startDate, Calendar endDate) {
        printStartDate(startDate);
        printDuration(startDate, endDate, true);
    }

    private static void printStartDate(Calendar startDate) {
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy EEEE");
        System.out.println("Ngày bắt đầu hẹn hò: " + dateFormat.format(startDate.getTime()));
    }

    private static void printDuration(Calendar start, Calendar end, boolean isOptional) {
        long durationMillis = end.getTimeInMillis() - start.getTimeInMillis();
        long days = TimeUnit.MILLISECONDS.toDays(durationMillis);

        if (isOptional) {
            System.out.printf("Mối tình đã kéo dài: %s ngày%n", days);
        } else {
            long remainingMillis = durationMillis - TimeUnit.DAYS.toMillis(days);
            long hours = TimeUnit.MILLISECONDS.toHours(remainingMillis);

            remainingMillis -= TimeUnit.HOURS.toMillis(hours);
            long minutes = TimeUnit.MILLISECONDS.toMinutes(remainingMillis);

            remainingMillis -= TimeUnit.MINUTES.toMillis(minutes);
            long seconds = TimeUnit.MILLISECONDS.toSeconds(remainingMillis);

            System.out.printf("Mối tình đã kéo dài: %s ngày, %s giờ, %s phút, %s giây%n", days, hours, minutes, seconds);
        }
    }
}
