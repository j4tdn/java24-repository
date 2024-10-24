package polymorphism.method;

public class Ex01PolyMethodDemo {
	public static void main(String[] args) {
		
	}
	
	//vars
	private static int sum(int... numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}
	
	private static float sum(float a, float b) {
		return a + b;
	}
	private static int sum(int a, int b) {
		return a + b;
	}
	private static int sum(int a, int b, int c) {
		return a + b + c;
	}
	
	 @Override
	public String toString() {
		 return "Ex01PolyMethodDemo#toString";
	}
	
}
