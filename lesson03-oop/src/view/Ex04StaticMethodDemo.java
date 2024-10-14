package view;

public class Ex04StaticMethodDemo {

	private int val;

	public Ex04StaticMethodDemo(int val) {
		this.val = val;
	}

	public static void main(String[] args) {
		int x1 = 12;
		int x2 = 13;
		System.out.println("Sum --> " + sum(x1, x2));
		Ex04StaticMethodDemo o1 = new Ex04StaticMethodDemo(5);
		System.out.println(o1.fact());
		Ex04StaticMethodDemo o2 = new Ex04StaticMethodDemo(6);
		System.out.println(o2.fact());
		Ex04StaticMethodDemo o3 = new Ex04StaticMethodDemo(5);
		System.out.println(o3.fact());

	}

	private static int sum(int a, int b) {
		return a + b;
	}

	private int fact() {
		int n = this.val;
		int gt = n;
		while (n > 1) {
			n--;
			gt *= n;
		}
		return gt;
	}

}
