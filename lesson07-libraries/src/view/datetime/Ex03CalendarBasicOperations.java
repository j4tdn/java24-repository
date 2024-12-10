package view.datetime;

import java.util.Calendar;

public class Ex03CalendarBasicOperations {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		System.out.println("Thoi gian hien tai: " + c);
		
		int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
		int year = c.get(Calendar.YEAR);
	}
	
}
