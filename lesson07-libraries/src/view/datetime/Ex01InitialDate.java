package view.datetime;

import java.util.Date;

public class Ex01InitialDate {

	public static void main(String[] args) {
		// Lưu trữ: Date. Calendar

		// ICT: Indochina time (Gio` Dong Duong)

		// thời gian mặc định lấy theo múi giờ của máy đang triển khai, có thể thay đổi
		// múi giờ khác

		// tgian hien tai
		Date date = new Date();
		System.out.println("1. Date --> " + date);

		date = new Date(2024, 10, 20);
		System.out.println("2. Date arbitrary --> " + date);

		// Người: ngày / tháng/ năm: epoch: 1.1.1970 6:0:0 UCT_0 Greenwic

		//
		date = new Date(21600000);
		System.out.println("3. Date with ms --> " + date);

	}

}
