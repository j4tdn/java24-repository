package view;

public class Ex02ValidNumbers {

	public static void main(String[] args) {
		int[] numbers = { 5, 10, 7, 14, 23, 34, 55 };
		String first = "";
		String end = "";
		String mid = "";
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 7 == 0) {
				first += numbers[i] + ", ";
			} else if (numbers[i] % 5 == 0) {
				end += numbers[i] + ", ";
			} else {
				mid += numbers[i] + ", ";
			}

		}
		System.out.println(first + "| " + mid + "| " + end);
	}
}
