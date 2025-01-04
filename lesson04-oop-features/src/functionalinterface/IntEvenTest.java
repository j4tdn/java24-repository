package functionalinterface;

// impl class
public class IntEvenTest implements IntTest {
	
	public boolean test(int number) {
		return number % 2 == 0;
	}
	
}