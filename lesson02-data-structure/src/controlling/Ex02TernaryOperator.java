package controlling;

import java.util.Random;

import utils.RandomUtils;

public class Ex02TernaryOperator {
	
	public static void main(String[] args) {
		
		/*
		 toán tử 3 ngôi: là cách làm khác của if else else if
		 sử dụng toán tử 3 ngôi trong 1 só th đơn giản đề làm gọn code 
		 
		 1. cho 2 số a,b tìm max của a b 
		 */
		
		Random rd = new Random();
		
		int a = rd.nextInt(10, 20);
		int b = rd.nextInt(10, 20);
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		int max = (a > b) ? a : b;
		
		System.out.println("Max -- > " + max);
		
		//2.
		double point = RandomUtils.generatePoint();
		
		String rank = point < 5 ? "Yếu"
				      : point < 6.5 ? "Trung bình "
				      : point < 8 ? "Khá"	
				      : "Giỏi";
		
		System.out.println("Xếp loại --> " + rank);
	}

}
