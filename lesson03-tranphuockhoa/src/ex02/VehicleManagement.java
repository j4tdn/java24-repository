package ex02;

import java.util.Scanner;

public class VehicleManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehicle[] vehicles = null;
        int vehicleCount = 0;
        boolean exit = false;

        while (!exit) {
            
            System.out.println("1. Nhap thong tin va tao N doi tuong xe");
            System.out.println("2. Xuat bang ke khai tien thue truoc ba cua cac xe");
            System.out.println("3. Thoat chuong trinh");
            System.out.print("Hay dua ra mot lua chon: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Nhap so luong xe: ");
                    int n = sc.nextInt();
                    sc.nextLine();
                    vehicles = new Vehicle[n];
                    vehicleCount = n;

                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhap thong tin xe thu " + (i + 1) + ":");
                        System.out.print("Ten chu xe: ");
                        String owner = sc.nextLine();
                        System.out.print("Loai xe: ");
                        String type = sc.nextLine();
                        System.out.print("Dung tich: ");
                        int cylinderCapacity = sc.nextInt();
                        System.out.print("Tri gia xe: ");
                        double price = sc.nextDouble();
                        sc.nextLine();
                        vehicles[i] = new Vehicle(owner, type, cylinderCapacity, price);
                    }
                    break;
                case 2:
					System.out.printf("%-20s || %-15s || %15s || %15s || %15s\n", "Ten chu xe", "Loai xe", "Dung tich",
							"Tri gia", "Thue phai nop");
					System.out.println("================================================================================================");

					Vehicle defaultVehicle1 = new Vehicle("Nguyen Thu Loan", "Future Neo", 100, 35000000.0);
					Vehicle defaultVehicle2 = new Vehicle("Le Minh Tinh", "Ford Ranger", 3000, 250000000.0);
					Vehicle defaultVehicle3 = new Vehicle("Nguyen Minh Triet", "Landscape", 1500, 1000000000.0);

                    System.out.println(defaultVehicle1);
                    System.out.println(defaultVehicle2);
                    System.out.println(defaultVehicle3);

                    if (vehicles != null) {
                        for (Vehicle vehicle : vehicles) {
                            System.out.println(vehicle);
                        }
                    }
                    break;
                case 3:
                    exit = true;
                    System.out.println("Chuong trinh ket thuc");
                    break;
                default:
                    System.out.println("Lua chon khong hop le, vui long chon lai");
                    break;
            }
        }

        sc.close();
    }
}
