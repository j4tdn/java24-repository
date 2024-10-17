package utils;

import java.util.Scanner;

import bean.Vehicle;

public class VehicleUtils {
	
	public static void export(Vehicle[] vehicles) {
		System.out.printf("%-20s %-15s %-10s %15s %15s\n", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");

		for (Vehicle vehicle : vehicles) {
			System.out.printf("%-20s %-15s %-10s %15s %15s\n", vehicle.getOwnerName(), vehicle.getEngineCapacity(), vehicle.getEngineCapacity(), vehicle.getVehicleValue(), vehicle.caculateTax());

		}
	}

}
