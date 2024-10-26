package view;

public class Ex01StackFinal {

	// Toán tử = hoặc động ở STACK
	// Final là Final ở STACK
	
	public static void main(String[] args) {
		int a = 5;
		final int b = 10;
		int c = 15;
		
		a = b;
//		b = c; final STACK không thể dùng toán tử =
		c = a;
		
		System.out.println("a ---->" + a);
		System.out.println("b ---->" + b);
		System.out.println("c ---->" + c);
	}
	
}
	