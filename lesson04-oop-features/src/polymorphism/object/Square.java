package polymorphism.object;

public class Square extends Shape{
	
	@Override
	void CalcS() {
		System.out.println("Square#CalcS .... Formula");
	}
	
	void setBackGround() {
		System.out.println("BackGroundColor#Square");
	}
	
}
