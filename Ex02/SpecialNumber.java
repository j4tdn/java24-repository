package Ex02;

import java.util.Scanner;

public class SpecialNumber {

    // Hàm kiểm tra số đặc biệt
    public static boolean isSpecialNumber(int n) {
        // Tính tổng S của tất cả các số từ 1 đến n
        int sum = n * (n + 1) / 2;

        // Mảng chứa các số hoàn hảo
        int[] perfectNumbers = {6, 28, 496, 8128};

        // Kiểm tra nếu sum nằm trong mảng số hoàn hảo
        for (int perfectNumber : perfectNumbers) {
            if (sum == perfectNumber) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số nguyên n: ");
        int n = scanner.nextInt();

        if (isSpecialNumber(n)) {
            System.out.println(n + " là số đặc biệt.");
        } else {
            System.out.println(n + " không phải là số đặc biệt.");
        }

        scanner.close();
    }
}

