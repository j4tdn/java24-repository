package demomain;

public class Ex03ExternalClass {

	public static void main(String[] args) {
		System.out.println("Ex03ExternalClass#main");
		System.out.println("----------------------");
		
//		2/n class trong cùng package, không cần import
		Ex01TestMainMethod.expose();
		
//		Ex01TestMainMethod.closure(); private
	}
}
