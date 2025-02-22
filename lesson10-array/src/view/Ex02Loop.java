package view;

public class Ex02Loop {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		
		// for index
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i] + " ");
		}
		System.out.println("\n");
		
		// for each
		for (int number: numbers) {
			System.out.println(number + " ");
		}
	}
}
