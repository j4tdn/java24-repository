package view;

public class Ex04Throw {
	
	public static void main(String[] args) {
		System.out.println("th1 -->" + div(6,2));
		try {
			System.out.println("th2 -->" + div(6,0));
		}catch(ArithmeticException e){
			System.out.println(">> exp" + e.getMessage());
		}
	}
	private static int div(int num, int den) {
		if(den == 0) {
			throw new ArithmeticException("Please enter denominator");
		}
		return num/den;
	}

}
