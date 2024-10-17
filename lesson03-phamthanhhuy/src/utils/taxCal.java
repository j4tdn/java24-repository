package utils;

import java.util.Scanner;

import bean.Customers;
import bean.Vehicles;

public class taxCal {
		
	public static double Taxx(Customers cus) {
		double tax = 0; 
		Vehicles veh =  cus.getVehicle();
		
		if(veh.getCost()<100) {
			 tax = veh.getCost()*0.01;
		}
		if(veh.getCost()>100 && veh.getCost()<200) {
			 tax = veh.getCost()*0.03;
		}
		if(veh.getCost()>200) {
			 tax = veh.getCost()*0.05;
		}
		
		return tax;
	
	}
	
}
