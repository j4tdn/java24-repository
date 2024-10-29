package inheritance.iinterface;

public class Circle implements Shape {

	@Override
	public void calcS() {
		System.out.println("Circle#calcS ... Implementation");

	}

	@Override
	public void setBoder() {
		System.out.println("1px");
	}
}
