package datastructure.primitive;

public class Ex02PrimitiveReassignValues {
	public static void main(String[] args) {
		int a = 11;
		int b = 22;
		int c = 55;

		float f1 = 88.257f;
		float f2 = 99.726f;
		long l3 = Integer.MAX_VALUE + 1; // 777l;
		System.out.printf("a(%s) b(%s) c(%s) f1(%s) f2(%s)\n\n", a, b, c, f1, f2);
		// Toán tử = 100% hoạt động ở STACK(lấy giá trị của biết STACK gán cho nhau)
		// VT = VP : Lấy giá trị ở VP gán về cho VT
		a = 123;
		b = c;
		a = c;

		f1 = a; // gán kiểu dữ liệu có phậm vi nhỏ hơn -> lớn hơn ==> ok
		b = (int) f2; // ngược lại : có vấn đề
		c = (int) l3; // trường hợp vế phải lớn hơn KDL vế trái cho phép -> giá trị bị lỗi
		System.out.printf("a(%s) b(%s) c(%s) f1(%s) f2(%s)\n\n", a, b, c, f1, f2);
	}
}