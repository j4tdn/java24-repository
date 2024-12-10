package utils;

import java.util.Scanner;

public class UtilsInput {
	
	private UtilsInput() {
	}
	
	private static Scanner sc = new Scanner(System.in);

	public static String getValue(String input) {
        System.out.print(input);
        while (true) {
            String result = sc.nextLine();
            if (!result.isEmpty()) {
                return result;
            } else {
                System.out.print("Input cannot be empty. Please enter again: ");
            }
        }
    }
	
	public static void nextLine() {
		sc.nextLine();
	}
	
	public static int inputInt(String input) {
		while (true) {
			System.out.print(input);
			int data = sc.nextInt();
			try {
				return data;
			} catch (NumberFormatException nfe) {
				System.out.println("The input data must be a positive integer!!");
			}
		}
	}
	
	public static int validYear(String input) {
		while (true) {
			int year = inputInt(input);
			if (year > 0) {
				return year;
			} else {
				System.out.println("Year must be greater than 0!!");
			}
		}
	}
	
	public static int validMonth(String input) {
		while (true) {
			int month = inputInt(input);
			if (month >= 1 && month <= 12) {
				return month;
			} else {
				System.out.println("Month must be between 1-12!!");
			}
		}
	}
	
	public static int validDay(String input) {
		while (true) {
			int day = inputInt(input);
			if (day >= 1 && day <= 31) {
				return day;
			} else {
				System.out.println("Day must be between 1-31!!");
			}
		}
	}
	
	public static int validHour(String input) {
		while (true) {
			int hour = inputInt(input);
			if (hour >= 0 && hour <= 23) {
				return hour;
			} else {
				System.out.println("Hour must be between 0-23!!");
			}
		}
	}
	
	public static int validMinute(String input) {
		while (true) {
			int hour = inputInt(input);
			if (hour >= 0 && hour <= 59) {
				return hour;
			} else {
				System.out.println("Minute must be between 0-59!!");
			}
		}
	}
	
	public static int validSecond(String input) {
		while (true) {
			int second = inputInt(input);
			if (second >= 0 && second<= 59) {
				return second;
			} else {
				System.out.println("Second must be between 0-59!!");
			}
		}
	}
}
