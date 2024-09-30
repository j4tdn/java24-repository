package controlling;

import java.util.Random;
import java.util.Scanner;

import utils.RandomUtils;

public class Ex02TernaryOperator {
	
	public static void main(String[] args) {
		/*
		 Toan tu 3 ngoi: cach lam khac cua if else else if
		 use T/O trong 1 so case don gian de gon code
		 */
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int a = rand.nextInt(10, 20);
		int b = rand.nextInt(10, 20);
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		//int max = (a > b) ? a : b;
		//System.out.println("Max --> " + max );
		
		System.out.println("So lon nhat la " + (a > b ? "a = " +  a : "b = " + b));
		
		double point = RandomUtils.generationPoint();
		// more readable
		String rank = point < 5 ? "Yeu"
					: point < 6.5 ? "Trung Binh"
					: point < 8 ? "Kha" : "Gioi";
		System.out.println("Xep loai: " + rank);
		
		sc.close();
	
	}
	
}
