package view;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		String[] seqs = { "aa6b546c6e22h", "aa6b326c6e22h", "bb278xx98ytus1" };
		
		int[] numbers = getMaxValidNrs(seqs);
		
		// Tạm thời dùng để sắp xếp tăng dùng
		Arrays.sort(numbers);
		
		System.out.println("Số hợp lệ lớn nhất --> " + Arrays.toString(numbers));
	}

	private static int[] getMaxValidNrs(String[] seqs) {
		int[] numbers = new int[seqs.length];
		int count = 0;

		for (String seq : seqs) {
			Integer maxNr = getMaxValidNr(seq);
			if (maxNr != null) {
				numbers[count++] = maxNr;
			}
		}

		return Arrays.copyOfRange(numbers, 0, count);
	}

	// Cho N xâu chuỗi
	// Tìm giá trị hợp lệ, lớn nhất trong mỗi xâu rồi sắp xếp tăng dần

	private static Integer getMaxValidNr(String s) {
		String[] tokens = s.split("\\D+");
		if (tokens.length == 0) {
			return null;
		}
		int max = Integer.MIN_VALUE;
		for (String token : tokens) {
			if (!token.isEmpty()) {
				max = Math.max(max, Integer.parseInt(token));
			}
		}
		return max;
	}

}
