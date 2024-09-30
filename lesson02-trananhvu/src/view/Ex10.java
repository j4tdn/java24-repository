package view;

import java.util.ArrayList;
import java.util.Random;

public class Ex10 {
	private static Random rd = new Random();
	private static ArrayList<Integer> arr = new ArrayList<Integer>();

	private static boolean isAlive(int n) {
		for (int i = 0; i < arr.size(); i++) {
			if (n == arr.get(i))
				return true;
		}
		return false;
	}

	private static void addElement() {
		int max = 30, min = 20, n;
		for (int i = 0; i < 5; i++) {
			do {
				n = rd.nextInt(min, max + 1);
			} while (isAlive(n));
			arr.add(n);
		}
	}

	public static void main(String[] args) {
		addElement();
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}
}
