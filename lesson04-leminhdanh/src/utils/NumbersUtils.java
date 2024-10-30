package utils;

public class NumbersUtils {
	public static int levelOfNumber(int n) {
		int level = 1;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				level++;
			}
		}
		return level;
	}

	public static int[] arrangeNumber(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (levelOfNumber(arr[i]) < levelOfNumber(arr[j])) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
}
