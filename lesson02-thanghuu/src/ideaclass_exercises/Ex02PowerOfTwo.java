package ideaclass_exercises;

import static java.lang.Math.*;
import utils.IoUtils;

public class Ex02PowerOfTwo {
	public static void main(String[] args) {
		int n = IoUtils.inputNumber(0, 5, "Nhap n");
		
		System.out.println("Is power of 2 --> " + isPowerOf2(n));
	}

	
	private static boolean isPowerOf2(int n) {
		double x = x = log(n) / log(2);
		return ceil(x) == floor(x);
	}
}	
