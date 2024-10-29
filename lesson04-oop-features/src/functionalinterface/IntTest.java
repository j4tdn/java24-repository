package functionalinterface;
@FunctionalInterface
public interface IntTest {
	
	boolean test(int number);
	
	default void log() {
		System.out.println("login");
	}

}
