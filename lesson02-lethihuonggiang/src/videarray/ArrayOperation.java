package videarray;

public class ArrayOperation {
	public static void main(String[] args) {
		int[] numbers = new int[6];
		numbers[3]=25;
		
		//System.out.println("index 3: " +  numbers[3]);
		
		//forindex : chỉ số
		for(int i = 0; i < numbers.length; i++) {
			System.out.println("value at index " + i + ": " + numbers[i]);
		}
		System.out.println("================");
		//foraech
		for(int number : numbers) {
			System.out.println("number: " +  number);
		}
		System.out.println("================");
		String[] sequences = {"hello","hi","welcome"};
		System.out.println("length: " + sequences.length);
		for(String sequence:sequences) {
			System.out.println(sequence);
		}
	}

}
