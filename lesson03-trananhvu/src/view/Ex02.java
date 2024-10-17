package view;

import bean.Customer;
import bean.Register;
import bean.Vehicle;
import utils.RegisterUtils;

public class Ex02 {
	public static void main(String[] args) {
		Customer c1 = new Customer("KH1", "Tran Anh Vu", "0909090909", "Hue");
		Customer c2 = new Customer("KH2", "Vu Anh Tran", "0808080808", "Da Nang");
		Customer c3 = new Customer("KH3", "Anh Vu Tran", "0606060606", "Da Nang");
		Customer c4 = new Customer("KH4", "Tun", "5050505050", "Da Nang");
		Customer c5 = new Customer("KH5", "Anh Vu", "0404040404", "Da Nang");
		Customer c6 = new Customer("KH6", "Tran Vu", "0303030303", "Da Nang");

		Vehicle v1 = new Vehicle("Sirius", 120, 23000000d);
		Vehicle v2 = new Vehicle("Audi", 2000, 3000000000d);
		Vehicle v3 = new Vehicle("Merc", 2500, 2000000000d);
		Vehicle v4 = new Vehicle("Future", 150, 32000000d);
		Vehicle v5 = new Vehicle("Wave", 100, 20000000d);
		Vehicle v6 = new Vehicle("Air Blade", 200, 40000000d);

		Register r1 = new Register(c1, v1);
		Register r2 = new Register(c2, v2);
		Register r3 = new Register(c3, v3);
		Register r4 = new Register(c4, v4);
		Register r5 = new Register(c5, v5);
		Register r6 = new Register(c6, v6);

		RegisterUtils.export(new Register[] { r1, r2, r3, r4, r5, r6 });
	}
}
