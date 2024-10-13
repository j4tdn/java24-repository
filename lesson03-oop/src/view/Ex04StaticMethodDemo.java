package view;

public class Ex04StaticMethodDemo {
	
	private int val;
	
	public Ex04StaticMethodDemo(int val) {
		this.val = val;
	}
	
	public static void main(String[] args) {

		int x1 = 12;
		int x2 = 8;
		
		System.out.println("sum from o1 -> " + Ex04StaticMethodDemo.sum(x1, x2));
		
		Ex04StaticMethodDemo o1 = new Ex04StaticMethodDemo(5);
		System.out.println("factorial of 5 --> " + o1.fac());
		
		Ex04StaticMethodDemo o2 = new Ex04StaticMethodDemo(6);
		System.out.println("\nfactorial of 5 --> " + o2.fac());
	}
	
	// hàm này chỉ phụ thuộc vào tham số truyền vào a, b 
	// mà ko phụ thuộc vào obj đang gọi --> static
	
	private static int sum(int a, int b) {
		return a + b;
	}
	
	// Hàm nên để non-static -> phụ thuộc vào obj đang gọi
	// toString, getter setter
	// viết hàm tính n! ycau non-static
	
	private int fac() {
		int init = this.val;
		int sum = init;
		while (init > 1) {
			init--;
			sum *= init;
		}
		return sum;
	}
	
}
