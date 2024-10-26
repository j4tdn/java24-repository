package inheritance.iinterface;

public class Ex01InheritanceInterfaceDemo {
	public static void main(String[] args) {
		Shape shape1 = new Shape() {
			
			@Override
			public void calcS() {
				// TODO Auto-generated method stub
				
			}
		};
		
		shape1.calcS();
		Shape shape2 = new Circle();
		shape2.calcS();
		Square square1 = new Square();
		
		
	}
}
