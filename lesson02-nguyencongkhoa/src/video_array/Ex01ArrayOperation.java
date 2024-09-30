package video_array;

public class Ex01ArrayOperation {

	public static void main(String[] args) {
		// idx: 0 1 2 3  4 5
		// val: 0 0 0 25 0 0
		int [] numbers = new int[6];
		numbers[3] = 25;
		
		//System.out.println("Index 3: " + numbers[3]);
		
		//for idx
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Value at index " + i + ": " + numbers[i]);
		}
		
		//for each
		for (int num : numbers) {
			System.out.println("number: " + num);
		}
		
		System.out.println("\n===============\n");
		String[] sequences = {"hello", "hi", "welcome"};
		System.out.println("length: " + sequences.length);
		for (String seq : sequences) {
			System.out.println(seq);
		}
	}
	
}
