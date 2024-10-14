package viewbt;

import utils.IoUtils;
import static java.lang.Math.*; // import tất cả các static method, attribute của class Math

public class Ex02Power {
	
	public static void main(String[] args) {
		
		int n = IoUtils.inputNumber(0, 5, "Nhập n"); 
		
		System.out.println("Is power of 2 --> " + isPowerOf2(n));
	}
	
	/**
	 * n là lũy thừa của 2 khi 2^x = n, với x là 1 số nguyên
	 * ==> x = log(n)/log(2)
	 * kiểu tra nếu x là số nguyên ==> n là lũy thừa của 2
	 * 
	 * VD: n=8 --> x=3.0
	 *     n=4 --> x=2.0
	 *     n=7 --> x=2.828..
	 *     
	 * Math: class
	 * log, ceil, floor: static method    
	 * 
	 * Thay vì lấy Math.log, Math.ceil, Math.floor
	 * 
	 * --> import static cho class Math, sau đó dùng trực tiếp các hàm static của Math
	 * log, ceil, floor
	 */
	private static boolean isPowerOf2(int n) {
		double x = log(n) / log(2);
		return ceil(x) == floor(x);
	}
	
}