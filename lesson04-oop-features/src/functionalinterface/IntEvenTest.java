package functionalinterface;

public class IntEvenTest implements IntTest {

	@Override
	public boolean Test(int number) {
		return number % 2 == 0;
	}

}
