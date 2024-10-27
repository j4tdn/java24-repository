package inheritance.iinterface.afterjava8;

public interface Mother {
	
	default void playBadmintion() {
		System.out.println("Mother#playBadminton ...");
	}
	
	default void cooking() {
		System.out.println("Father#cooking ...bad");
	}

}
