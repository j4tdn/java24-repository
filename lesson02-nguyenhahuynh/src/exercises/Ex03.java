package exercises;

public class Ex03 {

	public static void main(String[] args) {
		int n = checkN.input();
		System.out.println("Giai thừa của " + n + " là: " + factorial(n));
	}
	
	public static long factorial(int n) {
		long sum = 1;
		for (int i = 2; i <= n; i++) {
			sum *= i;
		}
		return sum;
	}
}
