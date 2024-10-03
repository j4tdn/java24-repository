package excercises;

import untils.InputFilter2;

public class Bai6 {

	public static void main(String[] args) {
		int a = InputFilter2.inputData();
		int b = InputFilter2.inputData();
		int c = InputFilter2.inputData();
		if (a > b && a > c) {
			System.out.println("Max: " + a);
		}
		if (b > a && b > c) {
			System.out.println("Max: " + b);
		}
		if (c > a && c > b) {
			System.out.println("Max: " + c);
		}
		if (a < b && a < c) {
			System.out.println("Min: " + a);
		}
		if (b < a && b < c) {
			System.out.println("Min: " + b);
		}
		if (c < b && c < a) {
			System.out.println("Min: " + c);
		}

	}
}
