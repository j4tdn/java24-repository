package selfexercise;
/*
 * Hoán đổi giá trị 2 số
 */
public class passParamViaMethod {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		b = swapTrick(a, a = b);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
	}
	
	
	public static int swapTrick(int a, int b) {
		return a;
	}
}
