package datastructure.primitive;

public class Ex02PrimitiveReassignValues {
	
	public static void main(String[] args) {
		
		int a = 11;
		int b = 22;
		int c = 55;
		
		float f1 = 88.257f;
		float f2 = 99.726f;
		long l3 = Integer.MAX_VALUE;//777l;
		
		System.out.printf("a(%s) b(%s) c(%s) f1(%s) f2(%s)\n\n", a, b, c, f1, f2);
		
		// Toán tử = 100% hoặc động ở STACK (Lấy giá trị của biến ở STACK gán cho nhau)
		// VT = VP: lấy giá trị của VP gán cho vế trái
		
		a = 123; //a =123
		b = c; // b = 55
		a = c;// a = 55
		
		f1 = a; // gán KDL có phạm vi nhỏ hơn --> cho KDL có phạm vi lớn hơn ==> OK
		b = (int)f2; // ngược lại: có vấn đề
		c = (int)l3; // trường hợp vế phải có giá trị ớn hơn KDL của VT cho phép ==> Giá trị sẽ bị lùi  
		
		System.out.printf("a(%s) b(%s) c(%s) f1(%s) f2(%s)", a, b, c, f1, f2);
	}

}
