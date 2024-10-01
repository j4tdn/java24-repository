package view;

import java.util.Scanner;

public class Ex03IoScanner {

	public static void main(String[] args) {
		// Scanner: Nhập xuất
		// THam số system.in: nhập từ bàn phím

		Scanner ip = new Scanner(System.in);
		// nextLine:
		// + Nhập giá trị --> Enter => lấy giá trị gán về biến
		// + Ko Nhập --> Enter => lấy giá trị rỗng "" gán về biến
		// ==> Kết thúc nhập Enter --> Clear Enter khỏi vùng nhớ tạm
		// !nextLine:
		// + Nhập giá trị --> Enter => Lấy giá trị gán về biến
		// + ko Nhập --> Enter => ko làm gì
		// ==> Kết thúc nhập Enter --> Ko clear Enter khỏi vùng nhớ tạm
		// => Ko Clear Enter: khi đến câu lệnh tiếp theo sẽ khiến cho máy hiểu là mình
		// đã bấm Enter
		// ( giống kiểu hàng chờ, trong hàng chờ này có Enter đang đợi dc thực thi) nên
		// đối khi đến lệnh tiếp theo thì sẽ bị trôi lệnh

		System.out.print("Nhập MaMH= ");
		String id = ip.nextLine();

		System.out.print("Nhập TenMH= ");
		String name = ip.nextLine();

		System.out.print("Nhập SoLuong= ");
		int amount = Integer.parseInt(ip.nextLine());
		// ở đây sẽ bị tồn đọng Enter ( nếu ko clear thì nextLine tiếp theo máy sẽ tự
		// hiểu là ta đã nhấn Enter)
		// Fix bằng cách thêm ip.nextLine khác để clear Enter (C1)
		System.out.print("Nhap MoTa ");
		String desc = ip.nextLine();

		System.out.printf("MaMH= %s \n" + "TenMH= %s \n" + "SoLuong= %s \n" + "Mota= %s", id, name, amount, desc);

	}
}
