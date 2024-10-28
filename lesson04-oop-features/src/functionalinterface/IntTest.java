package functionalinterface;


@FunctionalInterface
public interface IntTest {
	
	
	//abstract method
	boolean test(int number);
	
	default void log() {
		System.out.println("logging");
	}
}
