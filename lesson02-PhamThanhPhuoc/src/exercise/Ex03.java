package exercise;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong N: ");
        int N = Integer.parseInt(scanner.nextLine()); 
        System.out.println(N + "! = " + factorial(N)); 
        scanner.close();
    }
    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

