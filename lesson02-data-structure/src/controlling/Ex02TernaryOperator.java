package controlling;

import java.util.Random;

import util.RandomUtils;

public class Ex02TernaryOperator {
	
	public static void main(String[] args) {
		
		/*
		 * Toán tử 3 ngôi: Cách làm khác của if else else if
		 * Sử dụng tt3n trong 1 số TH "đơn giản" để làm gọn code
		 */
		
		/*
		 * Câu 1: Cho 2 số a, b. Tìm max của a,b
		 */
		
		Random rd = new Random();
		
		int a = rd.nextInt(10,20);
		int b = rd.nextInt(10,20);
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		int max = (a > b) ? a : b;
		System.out.println("max --> " + max);
		
		double point = RandomUtils.generatePoint();
		String rank = point < 5 ? "Yếu"
				  		: point < 6.5 ? "Trung Bình"
						: point < 8 ? "Khá" : "Giỏi";
		System.out.println("Xếp loại --> " + rank);
	}
}
