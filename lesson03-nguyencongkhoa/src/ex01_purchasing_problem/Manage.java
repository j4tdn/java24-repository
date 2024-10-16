package ex01_purchasing_problem;

import java.time.LocalDateTime;

public class Manage {

	public static void main(String[] args) {
		Customer c1 = new Customer("KH1", "Adem", "123", "New York");
		Customer c2 = new Customer("KH2", "Eva", "234", "New York");

		Device d1 = new Device("SS10+", "Android", "Black", 620d);
		Device d2 = new Device("SS20U", "Android", "Black", 840d);
		Device d3 = new Device("IP4", "IOS", "Black", 280d);
		Device d4 = new Device("IP12", "IOS", "Black", 880d);
		Device d5 = new Device("WP8", "Android", "Black", 560d);
		
		//620 * 3 + 880 * 5 + 560
		Order o1 = new Order(c1,
				new DeviceDetail[] { new DeviceDetail(d1, 3), new DeviceDetail(d4, 5), new DeviceDetail(d2, 1) },
				LocalDateTime.of(2024, 5, 8, 10, 10, 10));
		//280 * 3 + 560
		Order o2 = new Order(c2, new DeviceDetail[] { new DeviceDetail(d3, 2), new DeviceDetail(d5, 1), },
				LocalDateTime.of(2024, 5, 7, 20, 10, 12));
		// 880 
		Order o3 = new Order(c2, new DeviceDetail[] { new DeviceDetail(d4, 1), },
				LocalDateTime.of(2024, 5, 8, 9, 28, 32));

		// depend on val of each Obj -> non
		System.out.println("Order 1: " + o1.export());
		System.out.println("Order 2: " + o2.export());
		System.out.println("Order 3: " + o3.export());
	}
}
