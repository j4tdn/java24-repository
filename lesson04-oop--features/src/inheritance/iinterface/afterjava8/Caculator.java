package inheritance.iinterface.afterjava8;

import java.time.LocalDateTime;

public interface Caculator {
	
	// abstract method
	int calculate();
	
	// from java8 --> normal method: default, static
	default void start() {
		log();
		System.out.println("star calculation ...");
	}
	static void finish() {
		System.out.println("finish calculation at + "+ LocalDateTime.now());
	}
	
	// from java8 --> normal method: private
	private void log() {
		System.out.println("user >> logging");
	}
	

}
