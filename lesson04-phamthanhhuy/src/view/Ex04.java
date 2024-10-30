package view;

import java.time.LocalDate;

import bean.Director;
import bean.HeadOfDepartment;
import bean.Personel;
import bean.Staff;

public class Ex04 {
//	họ tên, ngày sinh, hệ số lương, tên đơn vị(phòng/ban), trưởng phòng

	public static void main(String[] args) {
		Personel d1 = new Director("Pham Thanh Huy", LocalDate.of(1984, 12, 30), 3d, 6d);
		Personel h1 = new HeadOfDepartment("Anbatukum", LocalDate.of(1956, 4, 7), 3d, 3d, "HipHop");
		Personel h2 = new HeadOfDepartment("Anbalow", LocalDate.of(1990, 3, 12), 3d, 3d, "NevaDie");
		Personel s1 = new Staff("Anba1", LocalDate.of(1990, 3, 12), 2d, "HipHop", h1);
		Personel s2 = new Staff("Anba2", LocalDate.of(1934, 5, 22), 2d, "HipHop", h1);
		Personel s3 = new Staff("Anba3", LocalDate.of(1943, 6, 22), 2d, "HipHop", h1);
		Personel s4 = new Staff("Anba4", LocalDate.of(1956, 5, 26), 2d, "NevaDie", h2);
		Personel s5 = new Staff("Anba5", LocalDate.of(1954, 5, 15), 2d, "NevaDie", h2);
		Personel s6 = new Staff("Anba6", LocalDate.of(1967, 7, 14), 2d, "NevaDie", h2);
		
		
	}

}
