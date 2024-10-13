package view;

public class Ex04StaticMethodDemo {
	private int val ;
	public Ex04StaticMethodDemo (int val) {
		this.val= val;
		
	}
	public static void main(String[] args) {
		int x1= 12;
		int x2 = 8;
		System.out.println("Sum --> "+Ex04StaticMethodDemo.sum(x1, x2));
		
		Ex04StaticMethodDemo o1 = new Ex04StaticMethodDemo(5);
		System.out.println("n! = "+ o1.fact());
		
		Ex04StaticMethodDemo o2 = new Ex04StaticMethodDemo(5);
		System.out.println("n! = "+ o2.fact());
		
		
		Ex04StaticMethodDemo o3 = new Ex04StaticMethodDemo(6);
		System.out.println("n! = "+ o3.fact());
		 
	
	}
	//hàm này chỉ thuộc 
	//tham số truyền vào a , b
	private static int sum (int a , int b) {
		return a + b ;
	}
	
	
	//hàm để non static 
	//tosTring , getter ,setter,
	//Viết hàm tihs n! yêu cầu non - static
	
	private  int fact() {
		int init = this.val;
		int result = init;
		while(init > 1 ) {
			init -- ;
			result *= init;
		}
		return result;
		

	}
}
