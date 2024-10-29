package bean;

public class DivisibleBy7 extends Divisible {

	public DivisibleBy7(int[] numbers) {
		super(numbers);
	}

	@Override
	public int[] divisible() {
		int[] temporaryArray = new int[100];
		int count = 0;
		for (int number : numbers) {
			if (number % 7 == 0 && number % 5 != 0) {
				temporaryArray[count] = number;
				count++;
			}
		}

		int[] finalArray = new int[count];
		System.arraycopy(temporaryArray, 0, finalArray, 0, count);

		return finalArray;
	}
}
