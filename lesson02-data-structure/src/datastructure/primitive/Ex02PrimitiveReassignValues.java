package datastructure.primitive;

public class Ex02PrimitiveReassignValues {
	public static void main(String[] args) {
		int a = 11;
		int b = 22;
		int c = 55;
		
		float f1 = 88f;
		float f2 = 99f;
		long l3 = 777l;
		
		System.out.printf("a(%s) b(%s) c (%s) f1(%s) f2(%s)" , a, b, c, f1, f2	);
		
		// Toán tử = 100% hoạt động ở STACK ( lấy giá trị của biến ở STACK gán cho nhau )
		// VT = VP: Lấy giá trị của vế phải gán cho vế trái
		a = 123;	
		b = c;
		a = c;
		
		f1 = a; // gán kiểu dữ liệu có phạm vi nhỏ hơn -> lớn hơn  ==> ok
		b = (int)f2; // ngược lại: có vấn đề
		c = (int)l3; //trường hợp VP có giá trị lớn hơn KDL của VT cho phép --> giá trị bị lỗi
		
	}
}
