package viewbt;

import utils.IoUtils;
import utils.NumberUtils;

public class Ex08Prime {
	
	public static void main(String[] args) {
		int n = IoUtils.inputNumber(0, 5, "Nhập n(n>0)");
		System.out.println("Kiểm tra số nguyên tố --> " + NumberUtils.isPrime(n));
	}
	
}