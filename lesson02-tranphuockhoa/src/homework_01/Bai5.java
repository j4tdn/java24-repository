package homework_01;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0, c = 0;

        a = kiemTraSoNguyenDuong("Nhap a (0 <= a < 100): ", sc);
        b = kiemTraSoNguyenDuong("Nhap b (0 <= b < 100): ", sc);
        c = kiemTraSoNguyenDuong("Nhap c (0 <= c < 100): ", sc);

        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));

        System.out.println("So lon nhat la: " + max);
        System.out.println("So nho nhat la: " + min);

        sc.close();
    }

    public static int kiemTraSoNguyenDuong(String message, Scanner sc) {
        int number = 0;
        boolean validInput = false;
        int attempts = 0;

        while (!validInput && attempts < 5) {
            System.out.print(message);
            String input = sc.nextLine();
            number = kiemTraGiaTri(input);

            if (number != -1) {
                validInput = true;
            } else {
                System.out.println("Loi: Nhap khong hop le. Vui long nhap lai.");
                attempts++;
            }
        }

        if (!validInput) {
            System.out.println("Ban da nhap sai qua 5 lan. Chuong trinh ket thuc.");
            System.exit(0);
        }

        return number;
    }

    public static int kiemTraGiaTri(String input) {
        try {
            int number = Integer.parseInt(input);
            if (number >= 0 && number < 20) {
                return number;
            } else {
                return -1;
            }
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}
