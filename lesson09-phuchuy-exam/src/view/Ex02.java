package view;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		//01a2b3456cde478
		System.out.println(getMaxValidNum("01a2b3456cde478"));
		
	}
	// Cho n xau chuoi
	// Tim gia tri hop le, lon nhat trong moi xau roi xap xep theo tt tang dan`
	
	private static Integer getMaxValidNum(String s) {
		String[] tokens = s.split("\\D+");
		if (tokens.length == 0) {
		}
		return null;}
		private static int[] getMaxValidNumber(String[] seqs) {
			int[] numbers = new int[seqs.length];
			int count = 0;
			
			for (String seq : seqs) {
				Integer maxNum = getMaxValidNum(seq);
				if (maxNum != null) {
					numbers[count++]= maxNum;
				}
			}
			return Arrays.copyOfRange(numbers, 0, count) ;
			
		}
		}
		
			
		
		
		//D: cat nhung phan tu kh phai la so
		/*
		 * int max = Integer.MIN_VALUE;{ for (String token: tokens) { if (
		 * !token.isEmpty() ) { max = Math.max(max, Integer.parseInt(token)); } } return
		 * max; } }
		 */