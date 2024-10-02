package Structure.Array;

public class Ex01ArrayOperation {
	public static void main(String[] args) {
		
		int[] numbers = new int [6];
		numbers[3] = 25;
		
		//forindex
		for(int i = 0; i < numbers.length; i++) {
			System.out.println("value ai index " + i + ": " + numbers[i]);
		}
		
		//foreach
		for(int number : numbers) {
			System.out.println("numbers: " + number);
		}
		System.out.println("================");
		String[] sequences = {"hello", "hi", "welcome"};
		System.out.println("length: " + sequences.length);
		for(String sequence: sequences) {
			System.out.println(sequence);
		}
		
		
		
	}
}
