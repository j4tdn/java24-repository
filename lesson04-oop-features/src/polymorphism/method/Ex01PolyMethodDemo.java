package polymorphism.method;

public class Ex01PolyMethodDemo {

	public static void main(String[] args) {
		// tìm sum 2 số nguyên
		sum(4, 6);

		// tìm sum 3 số nguyên
		sum(4, 6, 8);

		// tím sum n số nguyên
		int total = sum(4, 6, 8, 10, 12);
		System.out.println("total --> " + total);
		// tìm sum 2 số thực

	}

	// vars: numbers nhận 1 mảng int or list elements in cách nhau bởi dấu ,
	private static int sum(int... numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}

	private static int sum(int a, int b) {
		return a + b;
	}

	private static int sum(int a, int b, int c) {
		return a + b + c;
	}

	private static float sum(int a, float b) {
		return a + b;
	}

	@Override
	public String toString() {
		return "Ex01PolyMethodDemo#toString";
	}

}
