package view;


public class Ex04StaticMethodDemo {
	private int val;
	public Ex04StaticMethodDemo(int val) {
		this.val = val;
	}
	public static void main(String[] args) {
		int x1 = 12; 
		int x2 = 8;
		int n = 7;
		System.out.println("Sum from 01 -->"+Ex04StaticMethodDemo.sum(x1, x2));
		
		Ex04StaticMethodDemo o1 = new Ex04StaticMethodDemo(5);
		System.out.println(""+o1.fact());
	
	}
	
	// Hàm này chỉ phụ thuộc vào tham số truyền vào a,b không phuj thuộc vào đối tượng đang gọi
	//--> Nên là static method
	

	
	private static int sum(int a, int b) {
		return a+b;
	}
	
	// Hàm nên để non-static
	//toString, getter, setter
	
	// Viết hàm tình n! nhưng hàm đó là non-static
	
	private int fact() {
		int init = this.val;
		int result =init;
		while(init>1) {
			init--;
			result*=init;
		}
		return result;
	}
}


