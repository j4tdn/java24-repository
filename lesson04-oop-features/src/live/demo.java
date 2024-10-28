package live;

import java.time.LocalDate;

public class demo {
	public static void main(String[] args) {

		Profile d1 = new Director("Giam doc A", LocalDate.of(1985, 1, 5), 3.2d, 1.2d);
		HeadQuarter h1 = new HeadQuarter("Truong p 1", LocalDate.of(1990, 12, 12), 2.8d, 1.0d, "May Giat");
		HeadQuarter h2 = new HeadQuarter("Truong p 2", LocalDate.of(1999, 1, 1), 2.8d, 1.0d, "Ban ui");
		Profile e1 = new Employee("Nhan vien 1", LocalDate.of(2003, 10, 20), 2.2d, "May giat", h1);

		Profile e2 = new Employee("Nhan vien 2", LocalDate.of(2003, 8, 12), 2.2d, "Ban ui", h2);
		Profile e3 = new Employee("Nhan vien 3", LocalDate.of(2003, 1, 22), 2.2d, "Ban ui", h2);
		Profile e4 = new Employee("Nhan vien 4", LocalDate.of(2003, 5, 3), 2.2d, "Mat Giat", h1);
		Profile e5 = new Employee("Nhan vien 5", LocalDate.of(2003, 6, 4), 2.2d, "Mat Giat", h1);
		Profile e6 = new Employee("Nhan vien 6", LocalDate.of(2003, 7, 14), 2.2d, "Mat Giat", h1);

		System.out.println(d1);
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		System.out.println(e5);
		System.out.println(e6);

	}
}
