package view;

public class Ex02 {
	public static void main(String[] args) {
		int[] numbers = {2,3,5,1,6};
		System.out.println(getMissingNumber(numbers));
	}
	public static int getMissingNumber(int[] numbers) {
		int result = 1;
		do {
			int count = 0;
			for (int i = 0; i < numbers.length;i++) {
				if(result != numbers[i]) {
					count++;
				}
			}
			if(count == numbers.length)
				return result;
			result++;
		} while (result < (numbers.length + 1));
		
		return result;
	}
}
