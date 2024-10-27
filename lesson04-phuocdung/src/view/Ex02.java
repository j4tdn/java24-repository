package view;

public class Ex02 {
	
	public static void main(String[] args) {
		int[] numbers = {12,21,25,19,32,35,49,10,33,1,18};
		
		System.out.println(chiaHetCho7(numbers));
	}
	
	public static int[] chiaHetCho7(int[] numbers) {
		int[] targetNumbers = new int[4];
		
		for(int i = 0; i < numbers.length;) {
			if(numbers[i] % 7 == 0) {
				targetNumbers[i] = numbers[i];
				i++;
			}
		}
		return targetNumbers;
	}

}
