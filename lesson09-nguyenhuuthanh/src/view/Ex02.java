package view;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		String[] ip = {"01a2b3456cde478","aa6b546c6e22h","aa6b326c6e22h"};
		
		int[] results = getLargestValNumber(ip);
		sort(results);
		System.out.print("--> Kết quả : ");
		for(int i = 0; i < results.length; i++) {
			System.out.print(results[i]);
			if(i < results.length - 1) {
				System.out.print(" ");
			}
		}
		
	}
	
	// Bài làm tốt
	// Cố gắng đặt tên biến hợp lý hơn là ổn em hi
	private static int[] getLargestValNumber(String[] inputs) {
		int[] maxNum = new int[inputs.length];
		
		for(int i = 0; i < inputs.length; i++) {
			int max = getValMaxNumber(inputs[i]);
			maxNum[i] = max;
		}
		return maxNum;
	}
	
	// Tốt
	private static int getValMaxNumber(String input) {
		String[] inputs = input.split("[a-z]+");
		if(inputs.length == 0) {
			return 0;
		}
		int max = Integer.MIN_VALUE;
		for(String in : inputs) {
			if(!in.isEmpty()) {
				int num = Integer.parseInt(in);
				max = Math.max(num, max);
			}
		}
		return max;
	}
	
	private static void sort(int[] inputs ) {
		Arrays.sort(inputs);

	}
	
}





















