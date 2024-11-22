package view;

public class Ex04Throw {

	public static void main(String[] args) {
		// th1: calidated
		System.out.println("th1 --> " + div( 3, 1));
		// th2 : non validation
		try {
		System.out.println("th2 --> "+ div(3, 0));
		} catch (ArithmeticException ae) {
			System.out.println(">> exp -->" + ae.getMessage());
		}
	}
	
	private static int div(int num, int den) {
		if(den == 0) {
			throw new ArithmeticException("Please enter denominator != 0");
		}
		return num/den;
	}
}
