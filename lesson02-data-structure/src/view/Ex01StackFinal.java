package view;

public class Ex01StackFinal {

	// Toán từ = hoạt động ở STACK
	// Final là final ở STACK+
	
	public static void main(String[] args) {
		int a =5;
		final int b = 10;
		int c =15;
		
		a = b;
		// b = c; final STACK ko thể dùng toán tử =
		c = a;
		System.out.println("a --> "+ a);
		System.out.println("b --> "+ b);
		System.out.println("c --> "+ c);
	}
}
