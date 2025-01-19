package view;

public class Ex05 {
	
	private static final int MAX_LENGTH = 9999;
	
	public static void main(String[] args) {
		int number = 24;
		
		if (isHappyNumber(number)) {
			System.out.println("--> " + number + " là số hạnh phúc");
		} else {
			System.out.println("--> " + number + " là số không hạnh phúc");
		}
		
	}
	
	
	private static boolean isHappyNumber(int number) {
		int[] storage = new int[MAX_LENGTH];
		int count = 0;
		
		while(true) {
			log(number);
			
			number = sumOfSquares(number);
			
			if (number == 1) {
				return true;
			}
			
			if (isExist(number, storage, count)) {
				return false;
			}
			
			storage[count++] = number;
			
		}
	}
	
	private static boolean isExist(int givenNr, int[] numbers, int count) {
		for (int i = 0; i < count; i++) {
			if (givenNr == numbers[i]) {
				return true;
			}
		}
		return false;
	}
	
	private static int sumOfSquares(int number) {
		int sum = 0;
		while (number != 0) {
			int mod = number % 10;
			sum += mod * mod;
			number /= 10;
		}
		return sum;
	}
	
	// number = "42"
	private static void log(int number) {
		String nrAsText = String.valueOf(number);
		for (int i = 0; i < nrAsText.length(); i++) {
			System.out.print(nrAsText.charAt(i) + "^2");
			if (i != nrAsText.length() - 1) {
				System.out.print(" + ");
			} else {
				System.out.print(" = ");
			}
		}
		System.out.print(sumOfSquares(number) + "\n");
	}
	
}
