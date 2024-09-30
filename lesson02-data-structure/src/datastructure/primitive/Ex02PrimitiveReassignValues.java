package datastructure.primitive;

public class Ex02PrimitiveReassignValues {
	public static void main(String[] args) {
		int a = 11;
		int b = 22;
		int c = 55;
		
		float f1 = 88f;
		float f2 = 99f;
		
		System.out.printf("a(%s) b(%s) c(%s) f1(%s) f2(%s) ", a, b, c, f1 ,f2);
		
		a = 123;
		b = c;
		a = c;
		
		f1 = a;
		b = (int)f2;
		System.out.printf("a(%s) b(%s) c(%s) f1(%s) f2(%s) ", a, b, c, f1 ,f2);
	}
}
