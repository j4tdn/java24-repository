package view;

public class Ex04StaticMethodDemo {
	private int n;

	public Ex04StaticMethodDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Sum -->" + Ex04StaticMethodDemo.sum(27, 2));

		Ex04StaticMethodDemo ex1 = new Ex04StaticMethodDemo();
		ex1.n = 5;
		Ex04StaticMethodDemo ex2 = new Ex04StaticMethodDemo();
		ex2.n = 10;
		System.out.println(ex1.factorial());
		System.out.println(ex2.factorial());

	}

	private static int sum(int a, int b) {
		return a + b;
	}

	private long factorial() {
		long fac = 1;
		for (int i = 2; i <= n; i++) {
			fac *= i;
		}
		return fac;
	}
}
