package view.datetime;

import java.util.Date;

public class Ex01InitialDate {

	public static void main(String[] args) {
		// Lưu trữ: Date, Calendar
		
		// ICT: Indochina time: giờ đông dương
		
		// Default: lấy time của máy đang triển khai
		// Có thể set múi giờ vào
		
		Date date = new Date();
		System.out.println("1. Date --> " + date);
		
		date = new Date(2024, 10, 20);
		System.out.println("2. Date arbitrary --> " + date);
		
		// Human: dd/MM/yyyy
		// Computer: Mốc thời gian: epoch: 1.1.1970 0:0:0 UTC+0 Greenwich
		
		// Mốc time use to +- 2 khoảng time
		date = new Date(21600000);
		System.out.println("3. Date w ms --> " + date);
	}
	
}
