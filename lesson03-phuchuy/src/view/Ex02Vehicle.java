package view;

import bean.Customer;
import bean.SignUpVehicle;
import bean.Vehicle;
import utils.Export;

public class Ex02Vehicle {

	public static void main(String[] args) {
		final Customer c1 = new Customer("Nguyễn Phúc Huy");
		final Customer c2 = new Customer("Trần Anh Vũ");
		final Customer c3 = new Customer("Lê Minh Danh");

		final Vehicle v1 = new Vehicle("Sirius", 115, 23000000d);
		final Vehicle v2 = new Vehicle("Exciter", 150, 32000000d);
		final Vehicle v3 = new Vehicle("SuperCub50", 50, 16000000d);

		final SignUpVehicle s1 = new SignUpVehicle(c1, v1);
		final SignUpVehicle s2 = new SignUpVehicle(c2, v2);
		final SignUpVehicle s3 = new SignUpVehicle(c3, v3);

		final SignUpVehicle[] signup = { s1, s2, s3 };
		Export.total(signup);

	}
}
