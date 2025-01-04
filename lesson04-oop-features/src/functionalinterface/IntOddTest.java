package functionalinterface;

// impl class
public class IntOddTest implements IntTest {
	
	@Override
	public boolean test(int number) {
		return number % 2 != 0;
	}
	
}