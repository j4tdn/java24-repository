package polymorphism.method;

public class Ex01PolyMethodDemo {

	public static void main(String[] args) {
		// Tong 2 so
		int total = sum(1, 2, 3, 4, 5, 6);

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

	// vars: numbers nhận
	// 1 mảng int
	// hoặc danh sách [0,n] các phân tử int cách nhau dấu chấm phẩy
	private static int sum(int... numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum = sum + number;
		}
		return sum;
	}

	@Override
	public String toString() {
		return "Ex01PolyMethodDemo#toString";
	}
	
	
	
}
