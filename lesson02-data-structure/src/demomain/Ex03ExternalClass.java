package demomain;

public class Ex03ExternalClass {
	
	public static void main(String[] args) {
		System.out.println("Ex03ExternalClass#main");
		System.out.println("------------------");
		
		//2 hoac nhieu class trong cung 1 package khong can phai import
		Ex01TestMainMethod.expose();
		new Ex01TestMainMethod().nsTest(); // tao doi tuong
		//Ex01TestMainMethod.closure(); do dang private
	}
	
	

}
