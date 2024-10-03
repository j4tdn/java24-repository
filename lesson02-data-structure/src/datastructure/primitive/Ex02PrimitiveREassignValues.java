package datastructure.primitive;

public class Ex02PrimitiveREassignValues {
	
	public static void main(String[] args) {
		
		int a = 11;
		int b = 22;
		int c = 55;
		
		long l3 = Integer.MAX_VALUE ;//777l;
		
		float f1 = 88.45453f;
		float f2 = 99.8787f;
		
		System.out.printf("a(%s) b(%s) c(%s) f1(%s) f2(%s)\n\n", a, b, c, f1, f2);
		
		a = 123;
		b = c;
		a = c;
		
		f1 = a;
		b = (int)f2;
		
		c = (int)l3;
		
		System.out.printf("a(%s) b(%s) c(%s) f1(%s) f2(%s)\n\n", a, b, c, f1, f2);
	}

}
