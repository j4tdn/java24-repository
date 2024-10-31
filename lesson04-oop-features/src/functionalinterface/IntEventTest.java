package functionalinterface;

public class IntEventTest implements IntTest{

	@Override
	public boolean test(int number) {
		// TODO Auto-generated method stub
		return number % 2 == 0;
	}
}
