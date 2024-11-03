package ex02;

import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Ex02 {
	
	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		
		System.out.print("S = ");
		int s = ip.nextInt();
		
		System.out.print("n = ");
		int n = ip.nextInt();
		
		System.out.println(isSpecialNumber(n,s));
		
		ip.close();
	}
	
	private static boolean isSpecialNumber(int n, int s) {
		if (n < 1) {
			return false;
		}
		
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		
		return sum == s;
	}
}
