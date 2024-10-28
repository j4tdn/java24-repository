package inheritance.iinterface;

public class Circle implements Shape {

	@Override
	public void calcS() {
		System.out.println("Circle#cals ... implement");
	}
	
	@Override
	public void setBorder() {
		System.out.println("1px");
	}
}
