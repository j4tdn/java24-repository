package functionalinterface;

public class IntOddTest implements IntTest {

	@Override
	public boolean Test(int number) {
		return number % 2 != 0;
	}

}
