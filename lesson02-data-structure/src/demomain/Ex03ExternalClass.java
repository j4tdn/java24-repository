package demomain;

public class Ex03ExternalClass {

	
	public static void main(String[] args) {
		System.out.println("Ex03ExternalClass#main");
		System.out.println("----------------------");
		// các class trong cùng 1 package thì k cần phải import vào
		Ex01TestMainMethod.expose();
		//Ex01TestMainMethod.closure(); --> private
	}
	
}
