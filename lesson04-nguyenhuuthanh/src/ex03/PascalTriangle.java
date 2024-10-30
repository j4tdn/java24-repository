package ex03;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();

        for (int i = 1; i < n; i++) { 
            int value = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print("  "+value);
                value = value * (i - j) / (j + 1);
            }
            System.out.println("  ");
        }
    
    }
}

