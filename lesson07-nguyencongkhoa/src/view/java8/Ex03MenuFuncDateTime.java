package view.java8;

import static utils.UtilsDateTime.*;
import static utils.UtilsInput.*;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Ex03MenuFuncDateTime {

	private static LocalDate today;
	//private static Locale locale = new Locale("vi", "VN");
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.of("vi", "VI")); //=> dùng TimeZone.getDefault() | Locale.getDefault()
		today = LocalDate.now();
		while (true) {
			menu();
			int choice = inputInt("Enter your choice: ");
			nextLine();// enter input int, clear line if no parseInt
			switch (choice) {
			case 1:
				zoneDateTime();
				break;
			case 2:
				lastDayOfMonth();
				break;
			case 3:
				firstLastDayInWeek();
				break;
			case 4:
				currentAmountWeek();
				break;
			case 5:
				plusDay(22);
				break;
			case 6:
				dateOfBirth();
				break;
			case 7:
				System.out.println("Exiting..");
				return;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}

	private static void menu() {
		System.out.println("\n=================================== MENU ===================================");
		System.out.println("1. Xem thời gian hiện tại(dd/MM/yyy HH:mm:ss) ở khu vực bất kỳ.");
		System.out.println("2. In ngày cuối cùng của tháng hiện tại (dd/MM/yyyy).");
		System.out.println("3. Xem ngày đầu tiên và cuối cùng của tuần hiện tại.");
		System.out.println("4. Xem ngày hiện tại đang ở tuần thứ mấy trong năm.");
		System.out.println("5. Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy.");
		System.out.println("6. Nhập vào ngày tháng năm sinh. Kiểm tra xem bạn đã sống được bao nhiêu ngày.");
		System.out.println("7. Exit.");
	}

	// func1
	private static void zoneDateTime() {
		String zoneId = getValue("Nhập khu vực bạn muốn xem thời gian hiện tại (Ex: Asia/Ho_Chi_Minh): ");
		String pattern = "dd/MM/yyy HH:mm:ss";
		ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of(zoneId));
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		// zdt.format(dtf) <==> zdt.format(dtf) đều đúng, use depend on priority order && convenient when work w API
		System.out.println("Thời gian hiện tại (" + pattern + ") ở khu vực " + zoneId + " là: " + zdt.format(dtf));
	}

	// func2
	private static void lastDayOfMonth() {
		System.out.println("Ngày cuối cùng của tháng hiện tại (dd/MM/yyyy) là: " + today.lengthOfMonth());
	}

	// func3
	private static void firstLastDayInWeek() {
		if (today.getDayOfWeek().equals(DayOfWeek.MONDAY)) {
			System.out.println("Ngày đầu tiên của tuần hiện tại là: " + today.getDayOfMonth());
			System.out.println("Ngày cuối cùng của tuần hiện tại là: " + (today.getDayOfMonth() + 6));
		}
		if (today.getDayOfWeek().equals(DayOfWeek.TUESDAY)) {
			System.out.println("Ngày đầu tiên của tuần hiện tại là: " + (today.getDayOfMonth() - 1));
			System.out.println("Ngày cuối cùng của tuần hiện tại là: " + (today.getDayOfMonth() + 5));
		}
		if (today.getDayOfWeek().equals(DayOfWeek.WEDNESDAY)) {
			System.out.println("Ngày đầu tiên của tuần hiện tại là: " + (today.getDayOfMonth() - 2));
			System.out.println("Ngày cuối cùng của tuần hiện tại là: " + (today.getDayOfMonth() + 4));
		}
		if (today.getDayOfWeek().equals(DayOfWeek.THURSDAY)) {
			System.out.println("Ngày đầu tiên của tuần hiện tại là: " + (today.getDayOfMonth() - 3));
			System.out.println("Ngày cuối cùng của tuần hiện tại là: " + (today.getDayOfMonth() + 3));
		}
		if (today.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
			System.out.println("Ngày đầu tiên của tuần hiện tại là: " + (today.getDayOfMonth() - 4));
			System.out.println("Ngày cuối cùng của tuần hiện tại là: " + (today.getDayOfMonth() + 2));
		}
		if (today.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
			System.out.println("Ngày đầu tiên của tuần hiện tại là: " + (today.getDayOfMonth() - 5));
			System.out.println("Ngày cuối cùng của tuần hiện tại là: " + (today.getDayOfMonth() + 1));
		}
		if (today.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
			System.out.println("Ngày đầu tiên của tuần hiện tại là: " + (today.getDayOfMonth() - 6));
			System.out.println("Ngày cuối cùng của tuần hiện tại là: " + today.getDayOfMonth());
		}
	}

	// func4
	private static void currentAmountWeek() {
		int currentNumberWeekday = today.getDayOfYear() / 7 + 1;
		System.out.println("Ngày hiện tại đang ở tuần thứ " + currentNumberWeekday + " trong năm " + today.getYear());
	}

	// func5
	// plusDay.getDayOfWeek().toString() => DayOfWeek cannot return % => parse toString => use %d to format
	private static void plusDay(int amountOfDay) {
		LocalDate plusDay = today.plusDays(amountOfDay);
		System.out.printf("Sau %d ngày nữa là ngày %d.%d.%d, %s\n", amountOfDay, plusDay.getDayOfMonth(),
				plusDay.getDayOfMonth(), plusDay.getYear(), plusDay.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault()));
	}

	// func6
	private static void dateOfBirth() {
		while (true) {
			int year = validYear("Nhập năm sinh: ");
			int month = validMonth("Nhập tháng sinh: ");
			int day = validDay("Nhập ngày sinh: ");
			try {
				LocalDate dateOfBirth = LocalDate.of(year, month, day);
				Period period = Period.between(dateOfBirth, today);
				String dtDetails = optional(period.getYears(), "Year") + optional(period.getMonths(), "Month")
						+ optional(period.getDays(), "Day");
				System.out.println("Bạn đã sống được: " + dtDetails);
				break;
			} catch (DateTimeException e) {
				System.out.println("Ngày sinh nhật không hợp lệ (mm-DD-yyyy): " + day + "-" + month + "-" + year);
			}
		}
	}

}
