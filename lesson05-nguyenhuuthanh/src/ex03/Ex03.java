package ex03;

public class Ex03 {
	public static void main(String[] args) {

	}
	
	public static int maxNum(int[] numbers) {
		int max = 0;
		for (int number: numbers) {
			if (max < number) {
				max = number;
			}
		}
		return max;
	}
	
	
}
