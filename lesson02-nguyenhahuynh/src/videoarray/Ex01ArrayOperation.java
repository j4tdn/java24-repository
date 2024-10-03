package videoarray;

public class Ex01ArrayOperation {
	
	public static void main(String[] args) {
		int[] numbers = new int[6];
		numbers[3] = 25;
		
		// for index
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Value at index " + i + ": " + numbers[i]);
		}
		
		System.out.println("=================");
		
		// for each
		for (int number: numbers) {
			System.out.println("number: " + number);
		}

		System.out.println("=================");
		String[] sequences = {"hello", "hi", "welcome"};
		System.out.println("length: " + sequences.length);
		for (String sequence: sequences) {
			System.out.println(sequence);
		}
	}
}
