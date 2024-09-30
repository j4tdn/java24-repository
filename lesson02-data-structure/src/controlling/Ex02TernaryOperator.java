package controlling;

import java.util.Random;

import utils.RandomUtils;

public class Ex02TernaryOperator {

	public static void main(String[] args) {
		
		/*
		 Toán tử 3 ngôi: Cách làm khác của if else else if
		 Sử dụng tt3n trong 1 số trường hợp đơn giản để làm gọn code
		 
		 (exp) ? (statement1) : (statement2);
		 (exp) ? (returned_data1) : (returned_data2);
		 
		 Câu 1: Cho 2 số a, b, Tìm max của a, b
		 
		 Câu 2: Random điểm của 1 hs [0.0, 10.0]
		 Được kqua, làm tròn 1 chữ số (up, down, commercial)
		 + [0, 5): Yếu
		 + [5, 6.5): TB
		 + [6.5, 8): Khá
		 + [8, 10): Giỏi
		 */
		
		Random rd = new Random();
		
		int a = rd.nextInt(10, 20);
		int b = rd.nextInt(10, 20);
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
//		int max;
//		if (a > b) {
//			max = a;
//		} else {
//			max = b;
//		}
		
		int max = (a > b) ? a : b;
		System.out.println("max --> " + max);
		
		double point = RandomUtils.generatePoint();
		String rank = point < 5 ? "Yếu"
				   : point < 6.5 ? "Trung bình"
						   : point < 8 ? "Khá" : "Giỏi";
		System.out.println("Xếp loại --> " + rank);
	}
}
