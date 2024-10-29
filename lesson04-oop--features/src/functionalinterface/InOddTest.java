package functionalinterface;

public class InOddTest implements InTest {
	@Override
	public boolean test(int number) {
		
		return number % 2 == 1;
	}
}
