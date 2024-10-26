package polymorphism.method;

public class Ex01PolyMethodDemo {

	public static void main(String[] args) {
		// Tìm tổng 2 số nguyên
		sum(3, 6);
		// Tìm tổng 3 số nguyên
		sum(2, 5, 8);
		// Tìm tổng n số nguyên
		int total = sum(2, 5, 8, 7, 2, 3);
		System.out.println(total);		
		// Tìm tổng 2 số thực
		
	}

	// vars: numbers nhận 1 mảng int hoặc danh sách các phần từ in cách nhau bởi
	// dấu,
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

	private static int sum(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}
	
	@Override
	public String toString() {
		return "Ex01PolyMethodDemo#toString";
	}

}
