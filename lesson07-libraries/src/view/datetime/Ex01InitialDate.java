package view.datetime;

import java.util.Date;

public class Ex01InitialDate {
	
	public static void main(String[] args) {
		// Lưu trữ: Date, Calendar
		
		// Múi giờ
		// ICT: Indochina time: giờ đông dương
		
		// Mặc định: lấy theo thời gian, múi giờ của máy đang triển khai
		// Có thể set múi giờ vào
		
		// Lấy ra thời gian hiện tại
		Date date = new Date();
		System.out.println("1. Date now --> " + date);
		
		date = new Date(2024, 10, 20);
		System.out.println("2. Date arbitrary --> " + date);
		
		// Người: Ngày/Tháng/Năm
		// Máy tính: Mốc thời gian: epoch: 1.1.1970 6:0:0 UTC+0 Greenwich
		
		// mốc thời gian sử dụng để +- 2 khoảng thời
		date = new Date(21600000);
		System.out.println("3. Date with ms --> " + date);
	}
	
}
