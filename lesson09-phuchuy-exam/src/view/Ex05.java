package view;

public class Ex05 {
	private static final int MAX_LENGTH = 9999;
	public static void main(String[] args) {
		//24
		//44 
		System.out.println(isHappyNumber(24));
	}

	private static boolean isHappyNumber(int number) {
		
		int[] storage = new int[MAX_LENGTH];
		int count = 0;
		while (true) {
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
	//236 -> 2^2 + 3^2 + 6^2
	private static int sumOfSquares (int number) {
		int sum = 0;
		
		// 236 chia du 10 = 6 -> 6^2
		// 236 chia 10 = 23 -> quay lai vong lap 
		// 23 chia du 10 = 3 -> 3^2
		// 23 chia 10 = 2 -> quay lai vong lap 
		while (number !=0) {
			int mod = number %10;
			sum += Math.pow(mod, 2);
			number = number / 10;
			
		}
		return sum;
	}
	private static void log(int number) {
		String nrAsText = String.valueOf(number);
		for (int i = 0; i < nrAsText.length();i++) {
			System.out.print(nrAsText.charAt(i) +"^2");
			if (i != nrAsText.length() -1) { //check xem i có phải là phần tử cuối cùng ko, nếu ko thì cộng với dấu " + "
				System.out.print(" + ");
			}
			else {
				System.out.print(" = " + sumOfSquares(number) + "\n");
				
			}
			
			
		}
	}
	
	private static boolean isExist(int givenNr, int[] numbers, int count) {
		for (int i = 0; i< numbers.length;i++) {
			if (givenNr == numbers[i]) {
				return true;
			}
		}
		return false;
		
	}
}
