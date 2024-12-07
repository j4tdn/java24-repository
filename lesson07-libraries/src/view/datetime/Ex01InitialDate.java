package view.datetime;

import java.util.Date;

public class Ex01InitialDate {

	public static void main(String[] args) {
		//Lưu trự: Date, Calender
		
		// ICT: Indochina time: giờ đông dương
		
		//mặc định: lấy theo thời gian, múi giờ của máy đang triển khai
		// có thể set múi giờ vào
		
		Date date = new Date();
		System.out.println("1. Date --> " + date);
		
		date = new Date(200, 11, 23);
		System.out.println("1. Date arbitrary --> " + date);
		
		// mốc thời gian: epoch: 1.1.1970 0.0.0 UTC+0 Greenwich
		// mốc thời gian sử dụng để +- 2 khoảng thời gian
		date = new Date(21600000);
		System.out.println("3. Date with ms --> " + date);
		
	}
	
}
