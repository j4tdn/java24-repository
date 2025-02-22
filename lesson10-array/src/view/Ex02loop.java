package view;

public class Ex02loop {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4 };

		// for index

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();

		// for each
		for (int number : numbers) {
			System.out.print(number + " ");
		}
	}

}
