package polymorphism.object;

public class Square extends Shape{
	@Override
	void calcS() {
		System.out.println("Square#cals ... formula");
	}
	
	static void setBackgroud() {
		System.out.println("Square#Setbackgroud");
	}
}
