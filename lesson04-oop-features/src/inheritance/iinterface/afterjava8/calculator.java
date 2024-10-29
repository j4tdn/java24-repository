package inheritance.iinterface.afterjava8;

import java.time.LocalDateTime;

public interface calculator {
	
	//abstract method
	int calculate();
	
	//from 
	default void start() {
		log();
		System.out.println("start calculation ...");
	}
	
	static void finish() {
		System.out.println("Finish calculation at " + LocalDateTime.now());
	}
	
	private void log() {
		System.out.println("user >>> logging");
	}
	
	

}
