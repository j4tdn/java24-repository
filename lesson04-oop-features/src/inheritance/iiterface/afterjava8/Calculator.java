package inheritance.iiterface.afterjava8;

import java.time.LocalDateTime;

public interface Calculator {
	
	// abstract method
	int calculate();
	
	// from java8 --> normal method: default, static
	default void start() {
		log();
		System.out.println("Start calculation ...");
	}
	
	static void finish() {
		log();
		System.out.println("Finish calculation at + " + LocalDateTime.class);
	}
	// from java9 --> normal method: private
	
	private void log() {
		System.out.println("User >>> logging");
	}
}
