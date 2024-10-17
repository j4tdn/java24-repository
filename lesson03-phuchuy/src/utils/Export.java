package utils;

import bean.Person;
import bean.SignUpVehicle;

public class Export {
	private static double tax(int cc, double price) {
		double tax = 0;
		if (cc < 100) {
			tax = price * 0.01;
		} else {
			if (cc <= 200) {
				tax = price * 0.03;
			} else {
				tax = price * 0.05;
			}
		}
		return tax;
	}

	public static void total(SignUpVehicle[] vehicles) {
		System.out.printf("%-20s %-20s %-20s %-20s %-20s %n", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá",
				"Thuế phải nộp");
		System.out.println(
				"==================================================================================================");
		for (SignUpVehicle vehicle : vehicles) {
			System.out.printf("%-20s %-20s %-20s %-20.2f %-20.2f %n", vehicle.getCustomer().getOwnerName(),
					vehicle.getVehicle().getType(), vehicle.getVehicle().getEngineDisp(),
					vehicle.getVehicle().getCost(),
					tax(vehicle.getVehicle().getEngineDisp(), vehicle.getVehicle().getCost()));

		}
	}

	public static void exportMatching(Person p1, Person p2) {
		System.out.printf("%-20s | %-20s | %-20s | %-20s | %n", "Họ và Tên", "Giới tính", "Địa chỉ",
				"Ngày tháng năm sinh");
		System.out
				.println("-------------------------------------------------------------------------------------------");
		System.out.printf("%-20s | %-20s | %-20s | %-20s | %n", p1.getName(), p1.getGender(), p1.getAddress(),
				p1.getBirth());
		System.out.printf("%-20s | %-20s | %-20s | %-20s | %n", p2.getName(), p2.getGender(), p2.getAddress(),
				p2.getBirth());
		System.out
				.println("-------------------------------------------------------------------------------------------");
		System.out.print("Sở thích chung: ");
		StringUtils.printCommonHobby();

	}
}
