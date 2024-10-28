package polymorphism.method;

public class Ex01PolyMethodDemo {
	public static void main(String[] args) {

		// Tìm tổng 2 số nguyên
		sum(3, 6);
		// Tìm tổng 3 số nguyên
		sum(3, 6, 9);
		// Tìm tổng n số nguyên
		int total = sum(2, 4, 8, 10, 11);
		System.out.println("total: " + total);
		// Tìm tổng 2 số thực

		// vars: numbers nhận
		// 1 mảng ỉnt
		// hoặc danh sách [0,n] các phần tử in các nhau bởi dấu ,
	}

	private static int sum(int... numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}

	private static int sum(int n1, int n2) {
		return n1 + n2;
	}

	private static int sum(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}

	private static float sum(float n1, float n2) {
		return n1 + n2;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Ex01PolyMethođemo#toString";
	}
}
