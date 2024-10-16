package ex02_manage_vehicle_purchase_registration;

import Utilities.Utils;

public class ManageVehiclePurchaseRegistration {

	public static void main(String[] args) {
		while (true) {
			int choice = menuView();
			switch (choice) {
			case 1:
				initializeInforVehicle();
				break;
			case 2:
				printInforVehicle();
				break;
			case 3:
				System.out.println("Exit..");
				return;
			default:
				System.out.println("Invalid choice. Please enter again!!");
			}
		}
	}

	private static int menuView() {
		System.out.println("\n==========Manage vehicle purchase registration==========");
		System.out.println("1. Nhập thông tin và tạo N đối tượng xe.");
		System.out.println("2. Xuất bảng kê khai tiền thuế trước bạ của các xe.");
		System.out.println("3. Thoát chương trình.");
		System.out.print("Enter your choice: ");
		return Utils.inputIntegerLimit(1, 3);
	}

	private static Vehicle[] vehicles;

	private static void initializeInforVehicle() {
		Vehicle v1 = new Vehicle("Nguyễn Thu Loan", "Future Neo", 100, 35000000d);
		Vehicle v2 = new Vehicle("Lê Minh Tính", "Ford Ranger", 3000, 250000000d);
		Vehicle v3 = new Vehicle("Nguyễn Minh Triết", "Landscape", 1500, 1000000000d);
		vehicles = new Vehicle[] { v1, v2, v3 };
	}

	private static void printInforVehicle() {
		System.out.printf("\n %-30s %-20s %-20s %-20s %-17s", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá",
				"Thuế phải nộp");
		System.out.println(
				"\n==============================================================================================================");
		for (Vehicle v : vehicles) {
			System.out.println(v);
		}
	}

}
