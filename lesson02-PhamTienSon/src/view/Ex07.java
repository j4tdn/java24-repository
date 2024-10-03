package view;

import java.util.Scanner;

public class Ex07 {
	
	 public static void main(String[] args) {
	        Scanner ip = new Scanner(System.in);
	        System.out.print("Nhập số tự nhiên N: ");
	        int N = ip.nextInt();
	        
	        if (N == 0) {
	            System.out.println("Số nhị phân của " + N + " là: 0");
	            return; 
	        }

	        String binary = ""; 
	        int n = N; 

	        while (n > 0) {
	            binary = (n % 2) + binary; 
	            n = n / 2;
	        }

	        System.out.println( " --> " + binary);
	    }
	}