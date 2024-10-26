package demomain;

import java.util.Random;

public class Ex10Random {
	private static Random rd = new Random();
	public static void main(String[] args) {
		//int[] numbers= gene();
		System.out.println("");
	}
	public static int[] gene(int len, int minInclusive, int maxExclusive) {
		if(len > maxExclusive - minInclusive) {
			System.out.println("Yeu cau khong hop le");
			return new int[] {};
		}
		int[] numbers = new int[len];
		int i =0 ;
		while(i < numbers.length) {
			int newVal = rd.nextInt(minInclusive,maxExclusive);
			//if(!ex)
		}
		return numbers;
	}
}
