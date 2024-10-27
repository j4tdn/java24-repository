package inheritance.iinterface.afterjava8;

import java.time.LocalDateTime;

public interface Calculator {

	// abstract method
	int calculate();
	
	// from java 8 --> normal method: default, static
	// a/m default là public
	default void start() {
		log();
		System.out.println("Start calculation ...");
	}
	
	static void finish() {
		System.out.println("Finish calculation at +  " + LocalDateTime.now());
	}
	
	// from java 9 --> normal method: private
	private void log() {
		System.out.println("User >>> logging");
	}
}
