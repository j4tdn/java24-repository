package demomain;

public class Ex03ExternalClass {
	
	public static void main(String[] args) {
		System.out.println("Ex03ExternalClass#main");
		System.out.println("-----------------");
		
		Ex01TestMainMethod.expose();
		// Ex01TestMainMethod.closure(); private
		new Ex01TestMainMethod().nsTest();
	}
}