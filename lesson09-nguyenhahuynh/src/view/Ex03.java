package view;

import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) {
		Integer[] array = {8, 5, 9, 20};
		
		// Nếu e biết dùng lambda và sorting có sẵn e có thể viết ngắn gọi như bên dưới
		Arrays.sort(array, (a, b) -> level(a) - level(b));

        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(array));
	}
	
	public static int level(int a) {
		int s = 0;
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				s++;
			}
		}
		return s;
	}
}
