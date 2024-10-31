package polymorphism.method;

public class Ex01PolyMethodDemo {

	public static void main(String[] args) {
		// Tìm tổng 2 số nguyên
		System.out.println(sum(2, 3));
		// Tìm tổng 3 số nguyên
		System.out.println(sum(2, 3, 5));
		// Tìm tổng n số nguyên
		System.out.println(sum(2, 3, 5, 10, 25, 5));
		System.out.println(sum(new int[] { 2, 5, 7, 5 }));

	}

	// vars: numbers nhận
	// 1 mảng int
	// hoặc dnah sách [0,n] các phần tử in cách nhau bởi dấu ,
	private static int sum(int... numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum = sum + number;
		}
		return sum;
	}

	private static float sum(float n1, float n2) {
		return n1 + n2;
	}

	private static int sum(int n1, int n2) {
		return n1 + n2;
	}

	// Trùng tên khác số lượng tham số
	private static int sum(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}
	
	@Override
	//override method
	public String toString() {
		return "Ex01PolyMethodDemo#toString";
	}
}
