package exercise;

import java.text.DecimalFormat;
import java.util.Scanner;

import bean.Customer;

public class Ex02 {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("How many customers do you wanna create ?");
		int num = Integer.parseInt(sc.nextLine());
		Customer[] customers = new Customer[num];
        for (int i = 0; i < num; i++) {
        	System.out.println("Customer " + (i+1));
        	customers[i] = createNewCustomer();
        }
        for (Customer customer: customers) {
        	customer.setTax(customer.getCapacity(), customer.getPrice());
        }
        
        DecimalFormat df = new DecimalFormat("###0.00");

        String format = " %-20s  %-15s  %-10s  %-20s  %-20s \n";
        System.out.printf(" %-20s  %-15s  %-10s  %-20s  %-20s \n", 
                          "Owner", "Model", "Capacity", "Price", "Tax");
        System.out.println("===========================================================================================");
        for (Customer customer: customers) {
        	System.out.printf(format, customer.getName(), customer.getModel(), customer.getCapacity(), 
                     df.format(customer.getPrice()), df.format(customer.getTax()));
        }
       
    }
	private static Customer createNewCustomer() {
		System.out.println("Enter customer name: ");
		String name = sc.nextLine();
		System.out.println("Enter model of vehicle: ");
		String model = sc.nextLine();
		System.out.println("Enter capacity of vehicle: ");
		int capa = Integer.parseInt(sc.nextLine());
		System.out.println("Enter price of vehicle: ");
		long price = Long.parseLong(sc.nextLine());
		return new Customer(name, model, capa, price);
	}
}