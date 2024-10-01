package view;

import java.util.Random;

public class Ex04Random {
	public static void main(String[] args) {
		Random rd = new Random();
		
		int a = rd.nextInt(); // min max của int
		int b = rd.nextInt(20); // [0->20]
		int c = rd.nextInt(5,15); //[5,15]
		double d = rd.nextDouble(2.2d,9.9d);//[2.2->9.9]
		
		
		System.out.println("a-->" + a);
		System.out.println("b-->" + b);
		System.out.println("c-->" + c);
		System.out.println("d-->" + d);
		
		double e = Math.random();//0->1  số thực
		double f = Math.random()*10;//0->10  số thực		
		double g = Math.floor((Math.random() * 14 )) + 8;// 8,22 -->Số nguyên
		System.out.println("e-->" + e);
		System.out.println("f-->" + f);
		System.out.println("g-->" + g);
	}

}