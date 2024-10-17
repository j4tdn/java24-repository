package ex03;

import java.util.Random;
import java.util.Scanner;

public class Ex03 {
    
    public static void main(String[] args) {
    	
        Scanner ip = new Scanner(System.in);
        
        System.out.print("Nhap so hang: ");
        int hang = ip.nextInt();
        
        System.out.print("Nhap so cot: ");
        int cot = ip.nextInt();
        
        int[][] mang2chieu = new int[hang][cot];
        Random rd = new Random();
        
        System.out.println("Ma tran ngau nhien: ");
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                mang2chieu[i][j] = rd.nextInt(0, 99);
                System.out.print(mang2chieu[i][j] + " ");
            }
            System.out.println();
        }
        
        boolean kt = false;
        for (int i = 0; i < hang; i++) { 
            int min = mang2chieu[i][0];
            int d = 0;
            for (int j = 1; j < cot; j++) {
                if (mang2chieu[i][j] < min) {
                    min = mang2chieu[i][j];
                    d = j;
                }
            }
            
            boolean thu = true;
            for (int k = 0; k < hang; k++) {
                if (mang2chieu[k][d] > min) {
                    thu = false;
                    break;
                }
            }
            
            if (thu) {
                kt = true;
                System.out.println("Phan tu yen ngua: mang2chieu[" + i + "][" + d + "] = " + min);
            }
        }
        
        if (!kt) {
            System.out.println("Khong co");
        }
        
        ip.close();
    }
}
