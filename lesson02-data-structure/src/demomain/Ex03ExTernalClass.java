package demomain;

public class Ex03ExTernalClass {
	
	public static void main(String[] args) {
		System.out.println("Ex03TernalClass");
		System.out.println(("--------------"));
		
		// 2/n class trong cùng package	, không cần import
		Ex01TestMainMethod.expose();
		new Ex01TestMainMethod().nsTest();
		
		// Ex01TestMainMethod.closure(); private
	}

}
