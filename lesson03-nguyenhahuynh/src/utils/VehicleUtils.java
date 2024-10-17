package utils;

public class VehicleUtils {
	public VehicleUtils() {
	}
	
	public static double calculateTax(int capacity, double cost) {
		if (capacity < 100) {
            return cost * 0.01;
        } else if (capacity <= 200) {
            return cost * 0.03;
        } else {
            return cost * 0.05;
        }
	}
	
}
