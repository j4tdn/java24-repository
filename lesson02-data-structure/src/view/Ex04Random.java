package view;

import java.util.Random;

public class Ex04Random {
	
	public static void main(String[] args) {
		Random rd = new Random();
		
		int a = rd.nextInt();// [MIN_VALUE, MAX_VALUE] của int
		int b = rd.nextInt(20); //[0,20)
		int c = rd.nextInt(5,15);//[5,15)
		double d = rd.nextDouble(2.2d,9.9d);
		System.out.println("a --> " +a);
		System.out.println("b --> " +b);
		System.out.println("c --> " +c);
		System.out.println("d --> " +d);
		
		double e = Math.random();//[0,1) --> sô thực
		double f = Math.random()*3;//[0,3) --> sô thực
		// [8, 22) --> số thực
		double g = Math.floor((Math.random()*14))+8;
		System.out.println("e --> " +e);
		System.out.println("f --> " +f);
	}

}
