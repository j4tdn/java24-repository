package polymorphism.object;

public class Square extends Shape {
	
	@Override
	void calcS() {
		System.out.println("Square#cls ... formula");
	}
	void setBackground() {
		System.out.println("Background--Square");
		
	}
	
}
