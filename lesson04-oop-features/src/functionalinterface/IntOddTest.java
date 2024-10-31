package functionalinterface;

public class IntOddTest implements IntTest {

	@Override
	public boolean test(int number) {
		// TODO Auto-generated method stub
		return number % 2 != 0;
	}
}
