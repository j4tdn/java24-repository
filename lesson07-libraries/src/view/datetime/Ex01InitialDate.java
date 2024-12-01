package view.datetime;

import java.util.Date;

public class Ex01InitialDate {
	public static void main(String[] args) {
		// Lưu trữ: Date, Calender
		
		//ICT: Indochina time(giờ đông dương)
		
		// 
		
		Date date = new Date();
		System.out.println("1. Date --> "+date);
		
		date = new Date(2024,10,20);
		System.out.println("2. Date --> "+date);
		
		// Người : Ngày tháng năm 
		// Máy tính : Mốc thời gian : epoch : 1.1.1970 0:0:0 UTC+0 GreenWich
		
		// Mốc thời gian để +- 2 khoản thơf gian 
		date = new Date(21600000);
		System.out.println("3. Date --> "+date);
		
	}
}
