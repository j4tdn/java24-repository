package demomain;

public class Ex03ExternalClass {
	
	public static void main(String[] args) {
		System.out.println("Ex03ExternalClass");
		System.out.println("-----------------");
		
		//2 hoặc nhiều class trong cung package ko cần import
		Ex01TestMainMethod.expose();
		
		//Ex01TestMainMethod.closure(); private
		Ex02TestPublicClass.xuat();
		dcm();
	}
	 public static void dcm() {
		 System.out.println("DCM ngu vl");
	 }

}
