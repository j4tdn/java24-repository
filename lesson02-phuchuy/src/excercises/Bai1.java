package excercises;

import untils.Input;

public class Bai1 {
	public static int checkMultipileOf2(int n) {
		if (n % 2 == 0) {
			System.out.println("N la boi so cua 2");
		} else {
			System.out.println("N khong phai la boi so cua 2");
		}
		return n;
	}

	public static void main(String[] args) {
		int n = Input.inputData();
		checkMultipileOf2(n);
	}
}
