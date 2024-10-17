package ex02;

import java.util.Scanner;
public class MainVehicle {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Vehicle[] vehicles = new Vehicle[100]; 
	        int vehicleCount = 0;  

	        boolean exit = false; 
	        while (!exit) {
	        	System.out.println("\n==========Vui lòng chọn chức năng==========");
	    		System.out.println("1. Nhập thông tin và tạo N đối tượng xe.");
	    		System.out.println("2. Xuất bảng kê khai tiền thuế trước bạ của các xe.");
	    		System.out.println("3. Thoát chương trình.");
	    		System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine(); 

	            switch (choice) {
	                case 1:
	           
	                    System.out.println("Nhập thông tin chi tiết về xe " + (vehicleCount + 1) + ":");
	                    System.out.print("Tên Chủ Xe: ");
	                    String name = scanner.nextLine();
	                    System.out.print("Loại Xe: ");
	                    String type = scanner.nextLine();
	                    System.out.print("Dung Tích: ");
	                    double price = scanner.nextDouble();
	                    System.out.print("Trị Giá: ");
	                    int engineCapacity = scanner.nextInt();
	                    vehicleCount++;  
	                    break;

	                case 2:
	                	Vehicle v1 = new Vehicle("Nguyễn Thu Loan", "Future Neo", 100, 35000000);
	            		Vehicle v2 = new Vehicle("Lê Minh Tính", "Ford Ranger", 3000, 250000000);
	            		Vehicle v3 = new Vehicle("Nguyễn Minh Triết", "Landscape", 1500, 1000000000);
	            		vehicles = new Vehicle[] { v1, v2, v3 };
	            		

	            		 System.out.printf("\n%-20s %-15s %-10s %-15s %-17s\n", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
	            			
	            		System.out.println(
	            				"\n====================================================================================");
	            		for (Vehicle Vehicle : vehicles) {
	            			System.out.println(Vehicle);
	            		}
	                    break;

	                case 3:
	             
	                    System.out.println("Đã thoát ứng dụng.");
	                    exit = true;
	                    break;

	                default:
	                    System.out.println("Tùy chọn không hợp lệ! Vui lòng chọn một tùy chọn hợp lệ.");
	                    break;
	            }
	        }

	        scanner.close();
	    }
}
