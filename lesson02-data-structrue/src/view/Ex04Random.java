package view;

import java.util.Random;

public class Ex04Random {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int a = rand.nextInt(); //[MIN_VALUE, MAX_VALUE] cua int
		int b = rand.nextInt(20); //[0, 20)
		int c = rand.nextInt(5, 15); // [5,15)
		double d = rand.nextDouble(2.23124d, 21.32332d);
		
		System.out.println("a --> " + a);
		System.out.println("b --> " + b);
		System.out.println("c --> " + c);
		System.out.printf("d --> %.4f", d);
		
		System.out.println("\n==================\n");
		
		double e = Math.random(); //[0, 1) -> so thuc
		double f = Math.random()*10; // [0, 10) -> so thuc
		
		double g = Math.floor(Math.random() * 14) + 8;
		
		System.out.println("e --> " + e);
		System.out.println("f --> " + f);
		System.out.println("g --> " + g);
	}
	
}
