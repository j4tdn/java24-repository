package view.datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import utils.DateTimeUtils;

public class Ex04 {

	public static void main(String[] args) {
		String date = "07.06.2022";
		DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
		
		Calendar start = DateTimeUtils.toCalendar(date, "dd.MM.yyyy");
		int count = 0;
		while(count<=100) {
			if(start.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY &&start.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
				count++;
			}
			start.add(Calendar.DATE, 1);
		}
		System.out.println("Ngày bàn giao sản phẩm cho khách là " + df.format(start.getTime()));
	}
	
}
