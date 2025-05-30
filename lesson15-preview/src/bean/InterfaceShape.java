package bean;

public interface InterfaceShape {
	// mặc định --> public static final
	int b = 10;
	
	default void test() {
		// b = 20;
	}
}
