package view.datetime;

import java.util.Date;

public class Ex01InitialDate {

	public static void main(String[] args) {
		// Lưu trữ: Date, Calendar

		// Múi giờ
		// ICT: Indochina time: giờ Đông Dương

		// Mặc định: lấy theo thời gian, múi giờ hiện tại của máy
		// Có thể set múi giờ vào

		// Lây ra thời gian hiện tại
		Date date = new Date();
		System.out.println("1. Date --> " + date);

		date = new Date(2024, 10, 20);
		System.out.println("1. Date arbitrary --> " + date);

		// Người: Ngày/Tháng/Năm
		// Máy tính: Mốc thời gian: Epoch 1.1.1970 6:0:0 UTC+) Greenwich time

		// Mốc thười gian sử dụng để +- 2 khoảng thời gian
		date = new Date(21600000);
		System.out.println("3. Date with ms --> " + date);
		
	}

}
