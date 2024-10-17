package utils;

import bean.Register;

public class RegisterUtils {
	private RegisterUtils() {
		// TODO Auto-generated constructor stub
	}

	public static void export(Register[] registers) {
		System.out.printf("%-20s %-20s %10s %20s %20s\n", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá",
				"Thuế phải nộp");
		System.out.println(
				"==================================================================================================");
		for (Register register : registers) {
			System.out.printf("%-20s %-20s %10d %20.2f %20.2f\n", register.getCustomer().getName(),
					register.getVehicle().getModel(), register.getVehicle().getCapacity(),
					register.getVehicle().getCost(), register.getVehicle().getTax());
		}
	}
}
