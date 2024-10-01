package exercises;

import java.util.Random;

public class baitap4 {
	public static void main(String[] args) {
		/*
		  Viết chương trình tính tổng giải thừa của các số nguyên dương S = a! + b! + c! + d! 
		  Biết rằng a,b,c,d là các số nguyên ngẫu nhiên từ 10 đến 20 → [10, 20]
		 */
		Random rd = new Random();
		int a = rd.nextInt(10, 20);
		int b = rd.nextInt(10, 20);
		int c = rd.nextInt(10, 20);
		int d = rd.nextInt(10, 20);
		
		long ketQua = baitap3.tinhGiaiThua(a) +baitap3.tinhGiaiThua(b) +baitap3.tinhGiaiThua(c) +baitap3.tinhGiaiThua(d);
		System.out.println(ketQua);
	}
}
