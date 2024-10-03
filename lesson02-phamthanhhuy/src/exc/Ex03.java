package exc;

import java.util.Scanner;

public class Ex03 {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập số nguyên dương N: ");
	        int number = scanner.nextInt();
	        
	        if (number < 0) {
	            System.out.println("Không hợp lệ");
	        } else {
	            long giaithua = factorial(number);
	            System.out.println("Giai thừa của " + number + " là: " + giaithua);
	        }

	
	    }

	    
	    public static long factorial(int N) {
	        long n  = 1; 
	        for (int i = 1; i <= N; i++) {
	            n = i*n ; 
	        }
	        return n;
	    
	}
}
