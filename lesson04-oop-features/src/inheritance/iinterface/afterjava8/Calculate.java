package inheritance.iinterface.afterjava8;

import java.time.LocalDateTime;

public interface Calculate {
	// abstract method
	int calculate();
	
	// from java8 --> normal method: default, static
	// access modifier mặc định là public
	default void start() {
		System.out.println("Start calculation ...");
	}
	
	static void finish() {
		System.out.println("Finish calculation at + " + LocalDateTime.now());
	}
	
	// from java9 --> normal method: private
	private void log() {
		System.out.println("User >>> logging");
	}
}
