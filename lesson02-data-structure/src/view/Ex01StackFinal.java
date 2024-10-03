package view;

public class Ex01StackFinal {

	public static void main(String[] args) {
		int a = 5;
		final int b = 10;
		int c = 15;
		
		a = b;
		//b = c;
		c = a;
	    
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	
	}
}
