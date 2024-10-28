package functionalinterface;

// impl class 
public class InOddTest implements IntTest {

	@Override
	public boolean test(int number) {
		return number % 2 != 0;
	}

}
