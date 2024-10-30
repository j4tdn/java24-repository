package view;

import java.util.Random;
import java.util.Scanner;

public class Ex02 {
	public static int[][] arrange(int[] array) {
		int[] result = new int[array.length];
		int[] index = new int[3];
		int start = 0;
		int end = array.length - 1;

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 7 == 0 && array[i] % 5 != 0) {
				result[start] = array[i];
				start++;
			}
		}
		index[0] = start;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 7 != 0 && array[i] % 5 != 0) {
				result[start] = array[i];
				start++;
			}
			if (array[i] % 7 == 0 && array[i] % 5 == 0) {
				result[start] = array[i];
				start++;
			}
		}

		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i] % 5 == 0 && array[i] % 7 != 0) {
				result[end] = array[i];
				end--;
			}
		}
		index[1] = end;

		return new int[][] { result, index };
	}

	public static void output(int[][] array) {
		for (int i = 0; i < array[0].length; i++) {
			if (i == array[1][0] - 1) {
				System.out.print(array[0][i] + "|");
				continue;
			}
			if (i == array[1][1]) {
				System.out.print(array[0][i] + "|");
				continue;
			}
			System.out.print(array[0][i]);
			if (i == array[0].length - 1)
				break;
			else
				System.out.print(",");
		}
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		Random rd = new Random();
		System.out.print("nhap n: ");
		Integer n = Integer.parseInt(ip.nextLine());
		int[] arrays = new int[n];
		for (int i = 0; i < n; i++) {
			arrays[i] = rd.nextInt(5, 101);
		}
		output(arrange(arrays));
		ip.close();
	}
}
