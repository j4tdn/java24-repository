package datastructure.primitive;

public class Ex02PrimitiveReassignValues {
	
	public static void main(String[] args) {
		
		int a = 11;
		int b = 22;
		int c = 55;
		
		float f1 = 88f;
		float f2 = 99f;
		long l3 = 777l;
		
		System.out.printf("a(%s) b(%s) c(%s) f1(%s) f2(%s)\n\n", a, b, c, f1, f2);
		
		// Toán tử = 100% hoạt động ở STACK (lấy giá trị của biến ở STACK gán cho nhau)
		// Ve trai = Ve phai: Lay gia tri cua ve phai gan cho ve trai	
		
		a = 123; 
		b = c; 
		a = c;	
		
		f1 = a; // Gán KDL có pham vi nhỏ hơn -> lớn hơn thì ok
		b = (int)f2; // Ngược lại thì có vấn đề (phải ép kiểu)
	    c = (int)l3; 
	    // trường hợp vế phải có giá trị lớn hơn KDL của vế trái cho phép thì giá trị sẽ lỗi
		
		System.out.printf("a(%s) b(%s) c(%s) f1(%s) f2(%s)\n\n", a, b, c, f1, f2);	
	}

}
	