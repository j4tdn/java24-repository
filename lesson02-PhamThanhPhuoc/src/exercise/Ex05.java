package exercise;

import java.util.Scanner;

public class Ex05 {
    public static int reverseNumber(int N) {
        int reversedNumber = 0; 
        while (N > 0) {
            int number = N % 10; 
            reversedNumber = reversedNumber * 10 + number; 
        }
        return reversedNumber;
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String N;
        while (true) {
            System.out.print("Nhap so nguyen duong co it nhat 2 chu so: ");
            N = ip.nextLine();
            if (N.matches("\\d{2,}")) {
                break; 
            } else {
                System.out.println("khong hop le! vui long nhap lai ");
            }
        }
        int number = Integer.parseInt(N);
        int reversed = reverseNumber(number);
        if (number == reversed) {
            System.out.println(N + " la so doi xung => True");
        } else {
            System.out.println(N + " khong phai la so doi xung => False");
        }
        
        ip.close(); 
    }
}
