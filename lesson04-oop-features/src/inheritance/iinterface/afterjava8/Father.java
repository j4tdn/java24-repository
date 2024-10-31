package inheritance.iinterface.afterjava8;

public interface Father {
	default void running() {
		System.out.println("Fathher#running ...");
	}
	
	default void cooking() {
		System.out.println("");
	}

}
