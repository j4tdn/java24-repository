package datastructurehomework;

import java.util.Random;

public class Ex10Print5NumberNoOverlap {
	public static void main(String[] args) {
		
		Random rd = new Random();
		int a = rd.nextInt(20,30);
		int b,c,d,e;
		
		while(true) {
		 b = rd.nextInt(20,30);
			if(b == a) {
				continue;
			}
			break;
		}
		
		while(true) {
			c = rd.nextInt(20,30);
			if(c == a || c == b) {
				continue;
			}
			break;
		}
		
		while(true) {
			d = rd.nextInt(20,30);
			if(d == a || d == b || d == c) {
				continue;
			}
			break;
		}
		
		while(true) {
			e = rd.nextInt(20,30);
			if(e == d || e == c || e == b || e == a) {
				continue;
			}
			break;
		}
		System.out.println("5 số ngẫu nhiên lần lượt là " + a + "," + b + "," + c + "," + d + "," + e);
	}

}
