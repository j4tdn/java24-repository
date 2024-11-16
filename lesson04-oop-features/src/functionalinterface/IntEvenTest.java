package functionalinterface;

// impl class
public class IntEvenTest implements IntTest {
	
	@Override
	public boolean test(int number) {
		return number % 2 == 0;
	}
	
}	