package datastructure.primitive;

public class Ex02PrimitiveReassignValues {
	
	public static void main(String[] args) {
		int a = 11;
		int b = 22;
		int c = 55;
		
		float f1 = 88f;
		float f2 = 99f;
		long l3 = Integer.MAX_VALUE + 1;
		System.out.printf("a(%s) b(%s) c(%s) f1(%s) f2(%s)\n", a, b, c, f1, f2);
		//Toán tử = 100% hoạt động ở STACK (lấy value của biến ở STACK gán cho nhau)
		a = 123;
		b = c;
		a = c;
		
		f1 = a; //gán KDL có phạm vi nhỏ hơn -> lớn hơn => ok
		b = (int)f2; //ngược lại: có vấn đề
		c =(int)l3;// VP có val > VT cho phép => val tràn
		
		System.out.printf("a(%s) b(%s) c(%s) f1(%s) f2(%s)\n", a, b, c, f1, f2);
		
	}
}
