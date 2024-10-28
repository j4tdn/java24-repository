package inheritance.iinterface.afterjava8;

public interface Mother {
	default void badminton() {
		System.out.println("Mother#bedminton");
	}
	default void cooking() {
		System.out.println("cooking bad");
	}
}
