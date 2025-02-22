package view;

public class Ex04StaticMethodDemo {
	private int val;
	
	 public Ex04StaticMethodDemo(int val) {
		this.val = val;
	}
	public static void main(String[] args) {
		 int x1= 12;
		 int x2 = 8;

		System.out.println("sum  --> " + Ex04StaticMethodDemo.sum(x1, x2));
		
		Ex04StaticMethodDemo o1 = new Ex04StaticMethodDemo(5);
		System.out.println("\n n! = " + o1.fact());
		Ex04StaticMethodDemo o2 = new Ex04StaticMethodDemo(5);
		System.out.println("\n n! = " + o2.fact());
		Ex04StaticMethodDemo o3 = new Ex04StaticMethodDemo(6);
		System.out.println("\n n! = " + o3.fact());
		
		
		
		
		
	}
	 // hàm này phụ thuộc vào tham số truyền vào a,b không phụ thuộc vào đối tượng đang gọi
	 //--> Nên là static method
	private static int sum(int a, int b) {
		 return a + b;
	 }
	//hàm nên để non-static
	//toString, getter, setter
	//Viết Hàm tính n! yêu cầu hàm đó là hàm non static
	
	private int fact() {
		int init = this.val;
		int result = init; 
		while(init > 1) {
			init--;
			result *= init;
		}
		return result;
		
	}
	 
	 

}
