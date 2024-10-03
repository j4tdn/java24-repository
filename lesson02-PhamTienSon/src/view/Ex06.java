package view;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int a, b, c;
  //Làm thiêu yêu cầu      
        System.out.print("Nhập số nguyên nhỏ hơn 20 a =  ");
        a = ip.nextInt();
                
        System.out.print("Nhập số nguyên nhỏ hơn 20 b= ");
        b = ip.nextInt();
                
        System.out.print("Nhập c: ");
        c = ip.nextInt();
               

        // Tìm số lớn nhất và nhỏ nhất
        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);

        // In kết quả
        System.out.println("Số lớn nhất là " + max);
        System.out.println("Số nhỏ nhất là " + min);

        ip.close();
    }
}