package exercise;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int attempts = 0;

        while (attempts < 5) {
            System.out.print("Nhap so nguyen duong it nhat 2 chu so: ");
            String input = scanner.nextLine();
            if (isDigit(input)) {
                number = Integer.parseInt(input);
                if (number >= 2) {
                    System.out.println(number + " la so nguyen to: " + isPrime(number));
                    break; 
                } else {
                    System.out.println("so phai lon hon hoac bang 2 2.");
                }
            } else {
                System.out.println("du lieu khong hop le! vui long nhap lai.");
            }
            attempts++;
        }

        if (attempts == 5) {
            System.out.println("da qua so lan nhap toi da.");
        }
        scanner.close();
    }
    public static boolean isPrime(int n) {//nt
        if (n <= 1) return false; 
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false; 
        }
        return true; 
    }
    public static boolean isDigit(String n) {//chuoi
        if (n == null ) {
            return false;  } 
        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i); 
            if (ch < '0' || ch > '9') {
                return false; 
            }
        }

        return true; 
    }
}
    






