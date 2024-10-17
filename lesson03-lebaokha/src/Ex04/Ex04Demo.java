package Ex04;

import java.time.LocalDate;

public class Ex04Demo {

	public static void main(String[] args) {
		Human h1 = new Human("Le Bao Kha", "Nam", "Vinh Long", 
				new String[] { "Da bong", "Da cau"},
				LocalDate.of(2001, 04, 22)
		);
		
		Human h2 = new Human("Lưu Thị Lệ", "Nữ", "Trà Vinh", 
				new String[] { "Nhảy dây", "Chụp hình"},
				LocalDate.of(2001, 12, 23)
		);
		
		System.out.println(h1);
		System.out.println(h2);
		
		if (h1.getGender()!=h2.getGender()) {
		    System.out.println("Có thể tìm hiểu nhau <3");
		} else {
		    System.out.println("Trùng giới tính rồi !!!");
		}
	}
}
