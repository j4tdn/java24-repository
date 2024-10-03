package exercise;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 0, attempts = 0;

        while (attempts < 5) {
            System.out.print("Nhap so nguyen duong N: ");
            try {
                N = Integer.parseInt(scanner.nextLine());
                if (N > 0) break;
            } catch (Exception e) {
                System.out.println("khong hop le , hay thu lai");
            }
            attempts++;
        }
        if (N > 0) {
            System.out.println(isPowerOfTwo(N));
        } else {
            System.out.println("Da vuoc qua lan thu toi da");
        }
        scanner.close();
    }
    public static boolean isPowerOfTwo(int n) {
        return (n > 0) && ((n & (n - 1)) == 0);
    }
}
