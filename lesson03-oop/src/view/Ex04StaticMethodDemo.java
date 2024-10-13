package view;

public class Ex04StaticMethodDemo {
	private int val;

	public Ex04StaticMethodDemo(int val) {
		this.val = val;
	}

	public static void main(String[] args) {
		int x1 = 12;
		int x2 = 8;

		// Ex04StaticMethodDemo o1 = new Ex04StaticMethodDemo();
		System.out.println("Tong la: " + Ex04StaticMethodDemo.sum(x1, x2)); // dùng sum không cũng dc

		Ex04StaticMethodDemo o1 = new Ex04StaticMethodDemo(5);
		System.out.println("\nn!: " + o1.fact());

		Ex04StaticMethodDemo o2 = new Ex04StaticMethodDemo(4);
		System.out.println("\nn!: " + o2.fact());

		Ex04StaticMethodDemo o3 = new Ex04StaticMethodDemo(3);
		System.out.println("\nn!: " + o3.fact());

	}

	// Hàm này chỉ phụ thuộc thuộc vào
	// tham số truyền vào a,b, ko phụ thuộc vào đối tượng đang gọi
	// --> nên sử dụng static
	private static int sum(int a, int b) {
		return a + b;
	}

	// Hàm nên để non-static
	// toString, getter, setter
	// Viết hàm tính n! yêu cầu non-static

	private int fact() {
		int i = this.val;
		int result = i;
		while (i > 1) {
			i--;
			result *= i;
		}
		return result;

	}

}
