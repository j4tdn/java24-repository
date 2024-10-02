package exercises;

import java.util.Arrays;
import java.util.Random;

public class baitap10 {
	// Viết chương trình in ra 5 số nguyên ngẫu nhiên từ 20 đến 30 → [20, 30]
	
	
	public static void main(String[] args) {
		int[] numbers = Random();
		System.out.println(Arrays.toString(numbers));
	}

	// Random 5 so khong trung nhau
	private static int[] Random() {
		Random rd = new Random();
		int[] numbers = new int[5];

		for (int i = 0; i < 5; i++) {
			do {
				numbers[i] = rd.nextInt(20, 31);
				if (trunglap(numbers, i)) {
					continue;
				} else
					break;

			} while (true);
		}
		return numbers;
	}

	// Kiem tra co trung lap khong
	// dung --> true, sai --> false
	private static boolean trunglap(int[] numbers, int i) {
		for (int j = 0; j < i; j++) {
			if (i == 0)
				break;
			if (numbers[i] == numbers[j]) {
				return true;
			}
		}
		return false;
	}
}
