package view;

import bean.Vehicle;
import utils.VehicleUtils;

public class Ex02 {
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("Nguyen thi thu loan", "Future Neo", 100, 35000000);
		Vehicle v2 = new Vehicle("Lê Minh Tính", "Ford Ranger", 3000, 250000000);
		Vehicle v3 = new Vehicle("Lê Minh Tính", "Ford Ranger", 1500, 1000000000);
		Vehicle[] vehicles = {v1,v2,v3};
		VehicleUtils.export(vehicles);
		
	}
}
