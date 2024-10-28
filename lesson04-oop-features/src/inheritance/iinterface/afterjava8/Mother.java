package inheritance.iinterface.afterjava8;

public interface Mother {
	
	default void playBadminton() {
		System.out.println("Mother#playBadminton ...");
	}
	
	default void cooking() {
		System.out.println("Mother#cooking bad");
	}
	
}