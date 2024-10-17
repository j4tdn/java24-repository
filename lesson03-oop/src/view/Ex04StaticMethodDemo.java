package view;

public class Ex04StaticMethodDemo {
	
	private int val;
	

	public Ex04StaticMethodDemo(int val) {
		super();
		this.val = val;
	}

	public static void main(String[] args) {
		
		int x1 = 12;
		int x2 =8;
		
		System.out.println("Sum --> " + Ex04StaticMethodDemo.sum(x1,x2));
		
		
		Ex04StaticMethodDemo o1 = new Ex04StaticMethodDemo(5);
		System.out.println("\n!= " + o1.giaiThua() );
		
		Ex04StaticMethodDemo o2 = new Ex04StaticMethodDemo(5);
		System.out.println("\n!= " + o2.giaiThua()) );
		
		Ex04StaticMethodDemo o3 = new Ex04StaticMethodDemo(6);
		System.out.println("\n!= " + o3.giaiThua() );
		
	}
	
	// Hàm này chỉ phụ thuộc vào tham số truyền vào a, b 
	// không phụ thuộc vào đối tượng đang gọi
	// --> nên là static method
	
	private static int sum(int a, int b) {
		return a+b;
	}
	
	// Hàm nên để non static
	// toString, getter, setter
	// Viết hàm tính n! yêu cầu non static
	
	private int giaiThua() {
		int init = this.val;
		int result = init;
		for(int i=0; i<init; i++) {
			result = init*(init-1);	
		}
		return result;
	}
}
