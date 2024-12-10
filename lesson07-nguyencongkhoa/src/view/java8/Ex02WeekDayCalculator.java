package view.java8;

import static utils.UtilsInput.*;

import java.time.DateTimeException;
import java.time.LocalDate;

public class Ex02WeekDayCalculator {

	private static LocalDate date;	
	
	public static void main(String[] args) {
		date();
		//date = LocalDate.of(1995, 2, 28);
		
		System.out.println(date.getDayOfMonth() + " " + date.getMonth() + " " + date.getYear() + " is a " +  date.getDayOfWeek());
		System.out.println("Additional facts");
		
		// getDaysOfCurrentYear use lengthOfYear() || ==> isLeap() ? 366 : 365	
		System.out.printf("* It is day number %d of the year, %d days left.", date.getDayOfYear(), (date.lengthOfYear() - date.getDayOfYear()));
		
		/* luôn luôn ngày hiện tại đã có sẵn là 1, nếu từ ngày 1-6 trong tuần / 7 == 0 
		 	=> vô lí => phải + 1 để nó bất cứ ngày nào đã khởi tạo sẵn value = 1
		 	-> tương tự số lượng ngày thì đã có sẵn ngày khởi tạo
		 	-> 1 năm không nhuận luôn luôn thừa 1 ngày: 365 = 7 * 52 + 1
		 		=> nếu ngày bắt đầu đầu năm 01.01.YYYY là CN thì năm đó có 53 ngày CN 	*/
		int currentNumberWeekday = date.getDayOfYear() / 7 + 1;
		int amountOfWeekday = currentNumberWeekday + (date.lengthOfYear() - date.getDayOfYear()) / 7;
		System.out.println("\n* It is " + date.getDayOfWeek() + " number " + currentNumberWeekday + " out of " + amountOfWeekday + " in " + date.getYear());
		
		/* tương tự, khởi tạo sẵn thứ là 1, cứ trôi 7 ngày sẽ cnt++
		 	==> max tương tự, lấy giá trị vừa đếm + vào giá trị trôi 7 ngày
		 	chẳng hạn hiện tại là 21.02.1995 thì có sẵn number 3 of ?, khi + 7 = 28 ==> tăng cnt = 4	*/
		int currentWeekdayInMonth;
		int cntNumber = 1;
		for (int i = 1; i <= 4; i++) {
			if (i * 7 < date.getDayOfMonth()) {
				cntNumber++;
			}
		}
		int cntMax = cntNumber;
		for (int i = 1; i <= 4; i++) {
			if (date.getDayOfMonth() + i * 7 <= date.lengthOfMonth()) {
				cntMax++;
			}
		}
		
		System.out.println("* It is " + date.getDayOfWeek() + " number " + cntNumber + " out of " + cntMax + " in " + date.getMonth() + " " + date.getYear());
		
		System.out.printf("* Year %d has %d days.", date.getYear(), date.lengthOfYear());
		
		System.out.println("\n* " + date.getMonth() + " " + date.getYear() + " has " + date.lengthOfMonth() + " days.");
	}
	
	private static void date() {
		while (true) {
			int year = validYear("Enter year: ");
			int month = validMonth("Enter month: ");
			int day = validDay("Enter day: ");
			try {
				date = LocalDate.of(year, month, day);
				break;
			} catch (DateTimeException e) {
				System.out.println("Invalid Date (mm-DD-yyyy): " + day + "-" + month + "-" + year);
			}
		}
	}
	
}
