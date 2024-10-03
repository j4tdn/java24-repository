package view;

import java.util.Random;

public class Ex04Random {
	
	public static void main(String[] args) {
		
		Random rd = new Random();
		
		int a = rd.nextInt();
		System.out.println("a--> " + a);
		
		int b = rd.nextInt(20);
		System.out.println("b--> " + b);
		
		int c = rd.nextInt(5, 15);
		System.out.println("c --> " + c);
		
		double d = rd.nextDouble(2.2d, 9.9d);
		System.out.println("d--> " + d);
		
		double e = Math.random();
		System.out.println("e--> " + e);//[0,1)
		
		double f = Math.random() * 10;
		System.out.println("f--> " + f);
		
		double g = Math.floor((Math.random() * 14) + 8);
		System.out.println("g--> " + g);
	}

}
