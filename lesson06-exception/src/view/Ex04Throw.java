package view;

public class Ex04Throw {
	
	public static void main(String[] args) {
		// Hàm xử lí phép chia số nguyên cơ bản
		
		// th1: validated
		System.out.println("th1 --> " + div(6, 2));
		
		// th2: non-validation
		try {
			System.out.println("th2 --> " + div(6,0));
		} catch (Exception e) {
			System.out.println(">> exp --> " + e.getMessage());
		}
		
		
	}
	
	private static int div(int num, int den ) throws Exception{
		// dong code num/den sẽ bị exception khi den là 0
		if(den == 0) {
			throw new ArithmeticException("Please enter denominator != 0");
		}
		
		return num/den;
	}
	
		
}
