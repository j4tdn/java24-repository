package view;

import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) {
		Integer[] array = {8, 5, 9, 20};
		
		Arrays.sort(array, (a, b) -> {
            int levelA = level(a);
            int levelB = level(b);
            if (levelA == levelB) {
                return a - b;
            }
            return levelA - levelB;
        });

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
