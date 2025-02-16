package view;

public class Ex02Loop {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5 };
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println("\n");
		
		for (int number: numbers) {
			System.out.print(number + " ");
		}

	}

}