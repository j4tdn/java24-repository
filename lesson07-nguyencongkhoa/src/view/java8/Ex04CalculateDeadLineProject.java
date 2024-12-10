package view.java8;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Ex04CalculateDeadLineProject {

	private static LocalDate[] holidays;
	private static LocalDate startDate = LocalDate.of(2022, 6, 7);
	private static int durationDay = 110;
	
	public static void main(String[] args) {
		importHolidays();
		calDeadlineProject();
	}

	private static void importHolidays() {
		holidays = new LocalDate[] { LocalDate.of(2022, 1, 1), // Tet DL
				LocalDate.of(2022, 4, 10), // GTHV
				LocalDate.of(2022, 4, 30), // GPMN
				LocalDate.of(2022, 5, 1), // QTLD
				LocalDate.of(2022, 9, 2), // QK
				LocalDate.of(2022, 9, 3) }; // dateAfterQK
	}
	
	private static void calDeadlineProject() {
		LocalDate currentDay = startDate;
		LocalDate deadlineWithoutDayOff = startDate.plusDays(durationDay);
		int cntDayOff = 0;
		while (!currentDay.equals(deadlineWithoutDayOff)) {
			// if weekend -> not work, if holiday -> not work
			if (isWeekend(currentDay) || isHolidays(currentDay)) {
				cntDayOff++;
//				System.out.printf("\nngày nghỉ: %d-%d", currentDay.getDayOfMonth(),
//						currentDay.getMonthValue());
			}
			// festival && weekend duplicated ==> complementary day
			if (isWeekend(currentDay) && isHolidays(currentDay)) {
				cntDayOff++;
//				System.out.printf("\nngày nghỉ: %d-%d", currentDay.getDayOfMonth(),
//						currentDay.getMonthValue());
			}
			currentDay = currentDay.plusDays(1);
		}
//		System.out.println("Số lượng ngày nghỉ là: " + cntDayOff);
//		System.out.printf("\nDealine kh tính nghỉ %d-%s\n", startDate.plusDays(110).getDayOfMonth(), startDate.plusDays(110).getMonth().toString());
		startDate = startDate.plusDays(durationDay + cntDayOff - 1);//startday tính là 1 rồi. phải trừ 1 sau khi + để tránh thừa
		System.out.printf("Ngày %d-%d-%d nhóm A sẽ phải bàn giao sản phẩm cho khách hàng B.", startDate.getDayOfMonth(), startDate.getMonthValue(), startDate.getYear());
	}
	
	private static boolean isHolidays(LocalDate holiday) {
		for (LocalDate feast : holidays) {
			if (feast.equals(holiday)) {
				return true;
			}
		}
		return false;
	}
	
	private static boolean isWeekend(LocalDate date) {
		DayOfWeek dayOfWeek = date.getDayOfWeek();
		return dayOfWeek.equals(DayOfWeek.SATURDAY) || dayOfWeek.equals(DayOfWeek.SUNDAY);
	}
	
}
