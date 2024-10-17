package Ex02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Vehicle[] danhsachXe = nhapDanhSachXe();
        
        System.out.printf("%-15s %-15s %-15s %-15s %-15s%n", "Chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế");
        System.out.println("============================================================================");

        for (Vehicle xe : danhsachXe) {
            double Thue = 0;
            
            if (xe.getDungTich() < 100) {
                Thue = xe.getGia() * 0.01;
            } else if (xe.getDungTich() <= 200) {
                Thue = xe.getGia() * 0.03;
            } else {
                Thue = xe.getGia() * 0.05;
            }
            
            System.out.printf("%-15s %-15s %-15d %-15.2f %-15.2f%n", 
                              xe.getTenChuXe(), xe.getLoaiXe(), xe.getDungTich(), 
                              xe.getGia(), Thue);
        }
    }

    public static Vehicle[] nhapDanhSachXe() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong xe (n): ");
        int n = Integer.parseInt(scanner.nextLine());
        Vehicle[] danhSachXe = new Vehicle[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin xe thu " + (i + 1) + ":");
            System.out.print("Nhap ten chu xe: ");
            String tenChuXe = scanner.nextLine();

            System.out.print("Nhap loai xe: ");
            String loaiXe = scanner.nextLine();

            System.out.print("Nhap dung tich xe: ");
            long dungTich = Long.parseLong(scanner.nextLine());

            System.out.print("Nhap gia xe: ");
            double gia = Double.parseDouble(scanner.nextLine());

            danhSachXe[i] = new Vehicle(tenChuXe, loaiXe, dungTich, gia);
        }

        scanner.close();
        return danhSachXe;
    }
}
