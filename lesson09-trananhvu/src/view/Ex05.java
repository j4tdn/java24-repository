package view;

import java.util.Scanner;

public class Ex05 {

    private static long isHappyNumber(long n) {
        long sum = 0;
        while (n != 0) {
            long temp = n % 10;
            sum += temp * temp;
            n = n / 10;
        }
        if (sum == 1) return sum;
        return isHappyNumber(sum);
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Nhap so nguyen n: ");
        long n = ip.nextLong();
        try {
            long res = isHappyNumber(n);
            if (res == 1) {
                System.out.println("La so hanh phuc");
            }
        } catch (StackOverflowError e) {
            System.out.println("Ko phai so hanh phuc");
        }
    }
}
