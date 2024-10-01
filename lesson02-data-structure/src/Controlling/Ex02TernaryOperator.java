package Controlling;

import java.util.Random;

import utils.Ex01RandomUtils;

public class Ex02TernaryOperator {

	public static void main(String[] args) {
		/*
		 * Toan tu 3 ngoi: Cach lam khac cua if else else if Su dung trong 1 so truong
		 * hop "don gian" de lam gon code
		 *
		 * Cach dung: (exp) ? state1 : state2 ; (exp) ? returned_data1 : returned_data2
		 * ; Cau 1: cho 2 so a,b. Tim max cau a,b
		 */
		Random rd = new Random();

		int a = rd.nextInt(10, 20);
		int b = rd.nextInt(10, 20);

		System.out.println("a= " + a);
		System.out.println("b= " + b);

		int max = (a > b) ? a : b;
		System.out.println("Max= " + max);
		double point = Ex01RandomUtils.generatePoint();
		String rank = point < 5 ? "yeu" : point < 6.5 ? " Trung Binh" : point < 8 ? " Kha" : "Gioi";
		System.out.println("Xep Loai: " + rank);

	}
}
