package controlling;

import java.util.Random;

import utils.RandomUtils;

public class Ex02TernaryOperator {

	public static void main(String[] args) {
		
		/*
		 Toan tu 3 ngoi: Cach lam khac cua if else .... else if
		 Sử dụng toán tử 3 ngôi trong TH "Đơn giản" để làm gọn code
		 
		 (exp)? (statement1) : (statement2);
		 (exp)? (return_data1) : (return_data2);
		 
		 
		 Câu 1: Cho a,b. tìm Max của a,b
		 */
		
		Random rd = new Random();
		
		int a = rd.nextInt(10,20);
		int b = rd.nextInt(10,20);
		
		System.out.println("a ----> " + a);
		System.out.println("b ----> " + b);
		
		int max = 0;
		if(a > b) {
			max = a;
		} else {
			max = b;
		}
		
		System.out.println("Max cua ,b: " + max);
		
		double point = RandomUtils.generatePoint();
		String rank = (point < 5) ? "Yeu"
				  : point < 6.5 ? "TB"
						        : point < 8 ? "Kha"
						        		    :"Gioi";
		System.out.println("Xep loai ---> " + rank);
	}
	
}
