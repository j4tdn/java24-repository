package exc;

import java.util.Random;



public class Ex04 {
	public static void main(String[] args) {
		Random rd = new Random();
	 
		int a = rd.nextInt(10,21);
		int b = rd.nextInt(10,21);
		int c = rd.nextInt(10,21);
		int d = rd.nextInt(10,21);
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		System.out.println("d = "+d);
		long S = factorial(a) + factorial(b) + factorial(c) + factorial(d);
		System.out.print("Tổng giai thừa : "+ S);
		 
	}

	public static long factorial(int N) {
	        long n  = 1; 
	        for (int i = 1; i <= N; i++) {
	            n = i*n ; 
	        }
	        return n;
}
}