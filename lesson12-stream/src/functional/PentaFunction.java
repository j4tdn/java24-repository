package functional;

public interface PentaFunction<X, Y, M, N, R> {
	 R apply (X x, Y y, M m, N n);
}
