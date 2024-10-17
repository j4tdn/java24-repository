package view;

import bean.Customers;
import bean.Vehicles;
import utils.taxCal;

public class Ex02 {

	public static void main(String[] args) {

		Vehicles v1 = new Vehicles("Exiter", 150, 50000d);
		Vehicles v2 = new Vehicles("Sirius", 50, 25000d);
		Vehicles v3 = new Vehicles("Sonic", 300, 75000d);

		Customers c1 = new Customers("Pham Thanh Huy", v1);
		Customers c2 = new Customers("Pham Huy Thanh", v2);
		Customers c3 = new Customers("Thanh Huy Pham", v3);

		System.out.printf("%-20s %-20s %-15s %-10s %-10s\n", "Tên khách hàng", "Loại xe", "Dung tích", "Trị Giá",
				"Thuế phải nộp");
		System.out.println("===================================================================================");
		System.out.printf("%-20s %-20s %-15s %-10s %-10s\n", c1.getName(), c1.getVehicle().getName(),
				c1.getVehicle().getXilanh(), c1.getVehicle().getCost(), taxCal.Taxx(c1));
		System.out.printf("%-20s %-20s %-15s %-10s %-10s\n", c2.getName(), c2.getVehicle().getName(),
				c2.getVehicle().getXilanh(), c2.getVehicle().getCost(), taxCal.Taxx(c2));
		System.out.printf("%-20s %-20s %-15s %-10s %-10s\n", c3.getName(), c3.getVehicle().getName(),
				c3.getVehicle().getXilanh(), c3.getVehicle().getCost(), taxCal.Taxx(c3));

	}

}
