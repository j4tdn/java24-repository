package inheritance.iinterface.afterjava8;

public interface Father {
	default void running() {
		System.out.println("Father#running ...");
	}
	default void cooking() {
		System.out.println("cooking bad");
	}
}
