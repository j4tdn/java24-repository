package view.java7;

import static utils.UtilsInput.*;

import java.util.Calendar;
import static utils.UtilsDateTime.*;

public class Ex02WeekDayCalculator {

	private static Calendar c = Calendar.getInstance();

	public static void main(String[] args) {
		//date();
		c.set(1995, 9-1, 25);
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DAY_OF_MONTH);
		String dayOfWeek = getDayOfWeek(c);
		String monthS = getMonthName(c);
		int lengthOfYear = c.getActualMaximum(Calendar.DAY_OF_YEAR);
		int lengthOfMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		int dayOfYear = c.get(Calendar.DAY_OF_YEAR);
		int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
		
		System.out.printf("%d %s %d is a %s\n", day, monthS, year, dayOfWeek);
		System.out.println("Additional facts");
		
		System.out.printf("* It is day number %d of the year, %d left\n", c.get(Calendar.DAY_OF_YEAR), (lengthOfYear - c.get(Calendar.DAY_OF_YEAR)));
		
		int currentNumberWeekday = dayOfYear / 7 + 1;
		int amountOfWeekday = currentNumberWeekday + (lengthOfYear - dayOfYear) / 7;
		System.out.println("* It is " + dayOfWeek + " number " + currentNumberWeekday + " out of " + amountOfWeekday + " in " + year);
		
		int cntNumber = 1;
		for (int i = 1; i <= 4; i++) {
			if (i * 7 < dayOfMonth) {
				cntNumber++;
				
				
			}
		}
		int cntMax = cntNumber;
		for (int i = 1; i <= 4; i++) {
			if (dayOfMonth + i * 7 <= lengthOfMonth) {
				cntMax++;
			}
		}
		
		System.out.println("* It is " + dayOfWeek + " number " + cntNumber + " out of " + cntMax + " in " + month + " " + year);
		
		System.out.printf("* Year %d has %d days\n", year, lengthOfYear);
		
		System.out.printf("* %s %d has %d days", monthS, year, lengthOfMonth);
		
	}

//	private static void date() {
//		while (true) {
//			int year = validYear("Enter year: ");
//			int month = validMonth("Enter month: ");
//			int day = validDay("Enter day: ");
//			while (true) {
//				day = validSecond("Enter day: ");
//				if (validDate(year, month - 1, day)) {
//					break;
//				} else {
//					System.out.println("Invalid day in month. Please enter again!!");
//				}
//			}
//			c.set(year, month, day);
//
//		}
//	}
}
