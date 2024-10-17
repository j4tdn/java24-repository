package view;

public class Ex05Symetric {

	public static void main(String[] args) {
		
	}
	
	public static boolean isSymetricNumber(int number) {
		return number == getSymetriNumber(number);
	}
	
	private static int getSymetriNumber(int number) {
		int reversed = 0;
		
		while(number != 0) {
			int modePart = number % 10;
			reversed = reversed * 10 + modePart;
			number = number / 10;
		}
		return reversed;
		}
		
		
}
