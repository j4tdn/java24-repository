package Structure.Array;

import java.util.Arrays;

public class Ex02Filter {
	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 5 ,6};
		int[] oddNumbers = findOfNumbers(numbers);
		System.out.println(Arrays.toString(oddNumbers));
	}
	private static int[] findOfNumbers(int[] numbers) {
		int[] oddElements = new int[numbers.length];
		int i=0;
		for(int n:numbers) {
			if(n%2==1) {
				oddElements[i] = n;
				i++;
			}
		}
		int[] result = new int[i];
		for(int j = 0; j < i; j++) {
			result[j] = oddElements[j];
		}
		return result;
	}
}
