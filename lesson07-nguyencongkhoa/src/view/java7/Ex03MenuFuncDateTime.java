package view.java7;

import static utils.UtilsDateTime.*;
import static utils.UtilsInput.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class Ex03MenuFuncDateTime {

	private static Calendar c = Calendar.getInstance();
	//private static Locale locale = new Locale("vi", "VN");
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.of("vi", "VI")); //=> dùng TimeZone.getDefault() | Locale.getDefault()
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
			case 3://bug
				//firstLastDayInWeek();
				break;
			case 4:
				currentAmountWeek();
				break;
			case 5:
				plusDay(20);
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
		TimeZone tz = TimeZone.getTimeZone(zoneId);
		TimeZone.setDefault(tz);
		
		DateFormat df = new SimpleDateFormat(pattern);
		// có thể dùng Calendar  sdf.format(calendar.getTime())
		Date now = new Date();
		System.out.println("Thời gian hiện tại (" + pattern + ") ở khu vực " + zoneId + " là: " + df.format(now));
	}

	// func2
	private static void lastDayOfMonth() {
		System.out.println("Ngày cuối cùng của tháng hiện tại (dd/MM/yyyy) là: " + c.getActualMaximum(Calendar.DAY_OF_MONTH));
	}

//	// func3
//	private static void firstLastDayInWeek() {
//		Calendar firstDayOfWeek = c;
//		firstDayOfWeek.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
//		Calendar lastDayOfWeek = c;
//		lastDayOfWeek.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
//		System.out.println("Ngày đầu tiên của tuần hiện tại: " + firstDayOfWeek.get(Calendar.DAY_OF_MONTH));
//		System.out.println("Ngày cuối cùng của tuần hiện tại: " + lastDayOfWeek.get(Calendar.DAY_OF_MONTH));
//	}

	// func4
	private static void currentAmountWeek() {
		int currentNumberWeekday = c.get(Calendar.DAY_OF_YEAR) / 7 + 1;
		System.out.println("Ngày hiện tại đang ở tuần thứ " + currentNumberWeekday + " trong năm " + c.get(Calendar.YEAR));
	}

	// func5
	// plusDay.getDayOfWeek().toString() => DayOfWeek cannot return % => parse toString => use %d to format
	private static void plusDay(int amountOfDay) {
		Calendar plusDay = Calendar.getInstance();
		plusDay.add(Calendar.DAY_OF_MONTH, amountOfDay);
		System.out.printf("Sau %d ngày nữa là ngày %d.%d.%d, %s\n", amountOfDay, plusDay.get(Calendar.DAY_OF_MONTH),
				plusDay.get(Calendar.MONTH), plusDay.get(Calendar.YEAR), getDayOfWeek(plusDay));
	}

	// func6
	private static void dateOfBirth() {
		int year = validYear("Enter year: ");
		int month = validMonth("Enter month: ");
		int day;
		while (true) {
			day = validDay("Enter day: ");
			if (validDate(year, month, day)) {
				break;
			} else {
				System.out.println("Invalid day in month. Please enter again!!");
			}
		}
		Calendar start = Calendar.getInstance();
		start.set(year, month - 1, day);
		calDurationDating(start, c);
	}

}
