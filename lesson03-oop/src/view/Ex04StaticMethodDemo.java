package view;

public class Ex04StaticMethodDemo {
	
	private int val;
	
	public Ex04StaticMethodDemo(int val) {
		this.val = val;
	}
	
	
	public static void main(String[] args) {
		int x1 = 12;
		int x2 = 8;
		Ex04StaticMethodDemo o1 = new Ex04StaticMethodDemo(6);
		
		
		System.out.println("Sum ---->" + Ex04StaticMethodDemo.sum(x1, x2));
		
		System.out.println("Sum ----> " + o1.fact());
	}
	
	// Hàm này phụ thuộc vào tham số truyền vào	không phụ thuộc vào đối tượng đang gọi
	// ---> nên là static method
	
	
	private static int sum(int a,int b) {
		return a + b;
	}

	
	// Hàm nên để non static
	// toString, getter, setter
	// Hàm tính n! yêu cầu non-static
	private int fact() {
		int init = this.val;
		int result = init;
		while (init > 1) {
			init--;
			result *= init;
		}
		return result;
	}
	
}
