package view.datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import utils.DateTimeUtils;

public class Ex04 {

	public static void main(String[] args) {
		String date = "07.06.2022";
		workDays(date);

	}

	private static void workDays(String date) {
		Calendar c = DateTimeUtils.toCalendar(date, "dd.MM.yyyy");
		DateFormat df = new SimpleDateFormat("dd.MM.yyyy EEEE");

		int workDays = 0;
		while (workDays < 111) {
			if (c.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY && c.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
				workDays++;

			}

			c.add(Calendar.DATE, 1);
		}
		System.out.println("Ngày bàn giao sản phẩm: " + df.format(c.getTime()));

	}

}
