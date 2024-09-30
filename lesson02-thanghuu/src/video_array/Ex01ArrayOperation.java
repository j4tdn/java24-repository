package video_array;

public class Ex01ArrayOperation {
	public static void main(String[] args) {
		// index: 0 1 2 3 4 5
		int[] numbers = new int[6];
		numbers[3] = 25;
		
		//System.out.println("Index 3: "+ numbers[3]);
		//forindex
		for(int i = 0;i < numbers.length; i++) {
			System.out.println("Value at index "+ i + ": "+ numbers[i]);
		}
		
		//foreach
		for(int number : numbers) {
			System.out.println("Number:  "+ number);
		}
		
		System.out.println("\n=========\n");
		String[] sequences = {"hello", "hi", "welcome"};
		System.out.println("length: "+ sequences.length);
		for(String sequence : sequences) {
			System.out.println(sequence);
		}
	}
}
