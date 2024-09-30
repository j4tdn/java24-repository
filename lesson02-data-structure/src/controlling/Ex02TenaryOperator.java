package controlling;

import java.util.Random;

import utils.RandomUtils;

public class Ex02TenaryOperator {
	public static void main(String[] args) {
		/*
		 * Toán tử 3 ngôi
		 * 
		 * 
		 * câu 1: cho 2 số a, b.Tìm max của a, b
		 */

		Random rd = new Random();
		int a = rd.nextInt(10, 20);
		int b = rd.nextInt(10, 20);

		System.out.println("a = " + a);
		System.out.println("b = " + b);

		int max = (a > b) ? a : b;

		System.out.println("max = " + max);

		double point = RandomUtils.generatePoint();
		String rank = point < 5 ? "yếu" : point < 6.5 ? "trung Bình" : point < 8 ? "Khá" : "giỏi";
		System.out.println("Xếp loại -->" + rank);
	}
}
