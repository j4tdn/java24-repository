package view;

import java.util.Scanner;

import bean.Vehicle;
import utils.VehicleUtils;

public class Ex02 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Nhập số lượng xe: ");
		int n = Integer.parseInt(ip.nextLine()); 
		
		Vehicle[] vehicles = new Vehicle[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập thông tin cho xe thứ " + (i + 1) + ":");
			System.out.print("Nhập tên chủ xe: ");
			String name = ip.nextLine();
			System.out.print("Nhập loại xe: ");
			String typeVehicle = ip.nextLine();
			System.out.print("Nhập dung tích: ");
			int capacity = Integer.parseInt(ip.nextLine());
			System.out.print("Nhập trị giá: ");
			double cost = Double.parseDouble(ip.nextLine());
			vehicles[i] = new Vehicle(name, typeVehicle, capacity, cost);
			// VehicleUtils.calculateTax(capacity, cost);
		}
		
		System.out.printf("%-30s %-15s %-15s %-20s %-35s\n", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
		System.out.println("==================================================================================================");
		for (Vehicle vehicle : vehicles) {
			double tax = VehicleUtils.calculateTax(vehicle.getCapacity(), vehicle.getCost());
            System.out.printf("%-30s %-15s %-15d %-20.2f %-35.2f\n", 
                              vehicle.getName(), 
                              vehicle.getTypeVehicle(),
                              vehicle.getCapacity(), 
                              vehicle.getCost(), 
                              tax);
        }
		
		ip.close();
	}
}
