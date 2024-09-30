package datastructure.primitive;

public class Ex02PrimitiveReassignValues {

	public static void main(String[] args) {
		int a = 11;
		int b = 22;
		int c = 55;
		
		float f1 = 88f;
		float f2 = 99f;
		long l3 = Integer.MAX_VALUE + 1;
		
		System.out.printf("a(%s) b(%s) c(%s) f1(%s) f2(%s)", a, b, c, f1, f2);
		
		
		//Toán tử bằng (=) 100% hd ở STACK
		
		b = (int)f2; // không thể gán kiểu float cho int
		c = (int)l3; // trường hợp vp lớn hơn vế trái;
		
	}
	
}
