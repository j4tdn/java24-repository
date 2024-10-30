package exercise;

import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		int[][] arr = new int[5][6];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 2; j++) {
				if (j == 0 || j == i + 1) {
					arr[i][j] = 1;
				} else if (j > 0 && j < i + 2){
					arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
				}
			}
		}
		
		for(int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {
				if (arr[i][j] == 0) {
					System.out.print(" ");
				} else {
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
}
