package inheritance.iinterface.afterjava8;

public interface Mother {
	default void playBadminton() {
		System.out.println("Mother#PlayBadminton ...");
	}
	default void cooking() {
		System.out.println("Father#cooking bad");
	}
}
