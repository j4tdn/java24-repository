package view;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b;
        
        try {
            System.out.print("Nhap a: ");
            a = Double.parseDouble(sc.nextLine());
            
            if (a == 0) {
                System.out.println("a phai khac 0!");
                return;
            }
            
            System.out.print("Nhap b: ");
            b = Double.parseDouble(sc.nextLine());
            
            double x = -b / a;
            System.out.println("x = " + x);
            
        } catch (Exception e) {
            System.out.println("Nhap sai dinh dang!");
        }
        
        sc.close();
    }
}