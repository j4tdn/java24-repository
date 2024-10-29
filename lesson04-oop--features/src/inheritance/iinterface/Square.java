package inheritance.iinterface;

public class Square implements Shape {

	@Override
	public void calcS() {
		System.out.println("Square#calcS ... implementation");
	}
	
	
	@Override
	public void setBoder() {
		System.out.println("3px");
	}
}
