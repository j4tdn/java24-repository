package controlling;



import java.util.Random;

import utils.RandomUtils;

public class Ex02TernaryOperator {

	public static void main(String[] args) {

		/*
		 * Toán tử 3 ngôi: Các làm khác của if else else if Sử dụng toán tử 3 ngôi trong
		 * 1 số trường hợp "đơn giản" để làm gọn code
		 * 
		 * (exp) ? (statement1) : (statement2) (exp) ? (returned_data1) :
		 * (returned_data2)
		 * 
		 * Câu 1: Cho 2 số a,b. Tìm max
		 * 
		 * Câu 2: Random điểm của 1 bạn học sinh nằm trong [0.0, 10.0] Được kết quả làm
		 * tròn 1 chữ số (up, down, commercial) Nếu điểm: + [0,5) : Yếu + [5, 6.5) : TB
		 * + [6.5,8) : Khá + [8,10): Giỏi
		 */

		Random rd = new Random();

		int a = rd.nextInt(10, 20);
		int b = rd.nextInt(10, 20);

		System.out.println("a = " + a);
		System.out.println("b = " + b);

		int max = (a > b) ? a : b;

		double point = RandomUtils.generatePoint();
	 
		String rank;
		rank = point < 5 ? "Yếu" : point < 6.5 ? "TB" : point < 8 ? "Khá" : "Giỏi";

		System.out.println("Xếp loại: " + rank);

	}

}
