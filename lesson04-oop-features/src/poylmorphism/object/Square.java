package poylmorphism.object;

public class Square extends Shape {
	@Override
	void calcS() {
		System.out.println("Square#calcS...formula");
	}

	void setBackGround() {
		System.out.println("Square#setBackGround");
	}
}
