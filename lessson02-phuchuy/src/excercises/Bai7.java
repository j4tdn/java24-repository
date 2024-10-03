package excercises;

import untils.Input;

public class Bai7 {

	public static void main(String args[]) {

		int n = Input.inputData();
		StringBuilder binary = new StringBuilder();
		while (n > 0) {
			binary.insert(0, n % 2);
			n /= 2;
		}
		System.out.println("Binary: " + binary);
	}
}
