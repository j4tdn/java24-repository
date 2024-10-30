package bean;

public class Divisible57Others extends Divisible {

	public Divisible57Others(int[] numbers) {
		super(numbers);
	}

	@Override
	public int[] divisible() {
		int[] temporaryArray = new int[100];
		int count = 0;
		for (int number : numbers) {
			if (number % 5 == 0 && number % 7 == 0) {
				temporaryArray[count] = number;
				count++;
			} else if (number % 5 != 0 && number % 7 != 0) {
				temporaryArray[count] = number;
				count++;
			}
		}

		int[] finalArray = new int[count];
		System.arraycopy(temporaryArray, 0, finalArray, 0, count);

		return finalArray;
	}

	@Override
	public void print() {
		for (int i = 0; i < numbers.length; i++) {
			if (i == numbers.length - 1) {
				System.out.print(numbers[i] + "|");
			} else {
				System.out.print(numbers[i] + ",");
			}
		}

	}
}
