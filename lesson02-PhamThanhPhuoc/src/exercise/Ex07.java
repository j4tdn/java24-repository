package exercise;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        while (true) {
            System.out.print("nhap so tu nhien N: ");
            try {
                n = Integer.parseInt(scanner.nextLine()); 
                if (n >= 0) { 
                    break;
                } else {
                    System.out.println("vui long nhap so tu nhien >= 0.");
                }
            } catch (Exception e) {
                System.out.println("du lieu nhap vao phai la so nguyen! vui long nhap lai.");
            }
        }
        System.out.println("so thap phan cua " + n + " la: " + Binary(n));    
        scanner.close();
    }
    
    public static String Binary(Integer n) {
        if (n == 0) { // Xử lý trường hợp số 0
            return "0"; 
        }
        
        String binary = ""; 
        while (n > 0) {
            int remainder = n % 2;  
            binary = remainder + binary;
            n = n / 2;  
        }
        return binary;  
    }
}
