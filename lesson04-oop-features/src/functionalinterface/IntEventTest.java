package functionalinterface;

public class IntEventTest implements IntTest {
	@Override
	public boolean test(int number) {
		return number % 2 == 0;
	};
}
