package inheritance.iinterface;

public class Ex01InheritanceInterfaceDemo {
	
	public static void main(String[] args) {
		
		Shape shape1 = new Shape() {
			
			@Override
			public void calcS() {
				System.out.println("Circle#calcS ... implementation");
			}
		};
		shape1.calcS();
			
	}	
}


