package polymorphism.method;

public class Ex01PolyMethodDemo {

	public static void main(String[] args) {
		// tìm tổng 2 số nguyên
		sum(3, 6);
		// tìm tổng 3 số nguyên
		// tìm tổng n số nguyên
		sum(new int[] { 2, 4, 5, 7, 9 });
		sum(2, 3, 4, 5, 6);
		// Tìm tổng 2 số thực
	}

	// vars
	// 1 mảng int
	// hoặc danh sách các phần tử in cách nhau bởi dấu ,
	private static int sum(int... numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum = sum + number;
		}
		return sum;
	}

	// hàm ko phụ thuộc vào đối tượng đang gọi thì là static
	private static float sum(float n1, float n2) {
		return n1 + n2;
	}

	private static int sum(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}

	@Override
	public String toString() {
		return "Ex01PolyMethodDemo#toString";
	}

}
