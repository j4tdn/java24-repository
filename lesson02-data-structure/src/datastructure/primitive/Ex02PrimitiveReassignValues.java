package datastructure.primitive;

public class Ex02PrimitiveReassignValues {

	public static void main(String[] args) {
		
		int a = 11;
		int b = 22;
		int c = 55;
		
		float f1 = 88.247f;
		float f2 = 99.726f;
		
		System.out.printf("a(%s) b(%s) c(%s) f1(%s)	f2(%s)\n\n", a, b, c, f1, f2);
		// Toán tử '=' 100% hoạt động ở STACK ( lấy giá trị ở STACk gán cho nhau )	
		// VT = VP: Lấy giá trị của VP gán cho vế trái
		a = 123; // lấy 123 gán cho a 
		b = c; 
		a = c;
		
		f1 = a; // gán KDL có phạm vi nhỏ hơn -> lớn hơn thì ok 
		b = (int)f2; // ngược lại; có vấn đề
		// trường VP có giá trị lớn hơn KDL của VT cho phép --> giá trị bị lỗi
	}
	
	
	
}
