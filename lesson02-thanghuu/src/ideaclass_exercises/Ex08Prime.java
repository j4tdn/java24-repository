package ideaclass_exercises;

import utils.IoUtils;
import utils.NumberUtils;

public class Ex08Prime {
	public static void main(String[] args) {
		int n = IoUtils.inputNumber(0, 5, "Nhapn (n > 0)");
		System.out.println("Kiểm tra số nguyên tố --> " + NumberUtils.isPrime(n));
	}
}
