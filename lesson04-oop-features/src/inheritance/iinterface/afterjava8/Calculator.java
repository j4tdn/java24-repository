package inheritance.iinterface.afterjava8;

import java.time.LocalDateTime;

public interface Calculator {
	int calculate();
	
	default void start() {
		log();
		System.out.println("Start calculation ...");
	}
	 static void finish() {
		 System.out.println("Finish calculation at + "+ LocalDateTime.now());
	 }
	 
	 private void log() {
		 System.out.println("User >>> logging");
	 }
}
