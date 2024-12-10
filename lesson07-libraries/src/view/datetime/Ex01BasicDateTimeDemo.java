package view.datetime;

import java.util.Date;

public class Ex01BasicDateTimeDemo {

	public static void main(String[] args) {
		
		//Lưu trữ: Date, Calendar
		
		//Múi giờ
		// ICT: Indochina time: giờ đông dương.
		
		//Mặc định: lấy theo thời gian, múi gừi của máy đang triển khai
		//có thể set múi giừ vào
		
		//Lấy ra thời gian hiện tại
		Date date = new Date();
		System.out.println("1. Date --> " + date);

		
		date = new Date(2024, 10, 20);
		System.out.println("2. Date arbitrary --> " + date);
		
		//Người: Ngày/tháng/năm
		//Máy tính: Mốc thời gian: epoch: 1.1.1970 6:0:0 UTC+0 GreenWich
		
		//Mốc thời gian sử dụng để +- 2 khoảng thời gian
		date = new Date(21600000);
		System.out.println("3. Date with ms --> " + date);
		
		
	}
	
}
