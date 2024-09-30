package demonmain;

public class Ex03InternalClass {

	public static void main(String[] args) {
		System.out.println("Ex03InternalClass#main");
		System.out.println("----------------------");
		
		// 2 hoặc nhiều class trong cùng package, ko cần phải import
		Ex01TestMainMethod.expose();
		
		
		
		//Ex01TestMainMethod.closure();
	}
}
