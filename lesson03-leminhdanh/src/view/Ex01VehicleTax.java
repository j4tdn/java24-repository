package view;

import bean.Vehicle;

public class Ex01VehicleTax {
	public static void main(String[] args) {
		final Vehicle v1 = new Vehicle("Nguyen Thu Loan", "Future Neo", 100, 35000000);
		final Vehicle v2 = new Vehicle("Le Minh Tinh", "Ford Ranger", 3000, 250000000);
		final Vehicle v3 = new Vehicle("Nguyen Minh Triet", "Landscape", 1500, 1000000000);
		
		System.out.printf("%-20s %-20s %-15s %20s %20s\n", "ten chu xe", "loai xe", "dung tich", "tri gia", "thue phai nop");

		System.out.println("=====================================================================================================");
		v1.export();
		v2.export();
		v3.export();
	}
}
