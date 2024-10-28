package polymorphism.object;

public class Shape {

	 void calcS() {
		System.out.println("Shape#calcS");
	}
	
	private void clear() {
		System.out.println("Shape#clear");
	}
	
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.clear();
		
		Shape s1 = new Square();
		s1.clear();
	}
	
}