package bean;

public abstract class AbstractShape {
		
	int a = 5;
	
	public AbstractShape() {
		
	}
	
	void m1() {
		a = 10;
	}
	
	protected abstract void m2();
	
}
