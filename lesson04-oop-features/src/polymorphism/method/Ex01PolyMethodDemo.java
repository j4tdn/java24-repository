package polymorphism.method;

public class Ex01PolyMethodDemo {
	public static void main(String[] args) {
		// Tìm tổng 2 sn
		sum(1,2);
		// Tổng 2 sn
		sum(1, 2, 3);
		// Tổng n sn
		sum(1, 2, 3, 4, 5);
	}
	// vars: numbers nhận 1 mảng int hoặc danh sách [0,n] các phần tử in cách nhau bởi dấu , 
	private static int sum(int... numbers) {
		int sum = 0;
		for(int number:numbers) {
			sum += number;
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
