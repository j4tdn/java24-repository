package polymorphism.method;

public class Ex01PolyMethodDemo {
	public static void main(String[] args) {

	}

	private static int sum(int... numbers) {
		int sum = 0;
		for (int i : numbers) {
			sum += i;
		}
		return sum;
	}

	private static int sum(int n1, int n2) {
		return n1 + n2;
	}

	private static float sum(float n1, float n2) {
		return n1 + n2;
	}

	private static int sum(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Ex01PolyMethodDemo#toString";
	}
}
