package exercises;


public class Ex04 {

	public static void main(String[] args) {
		double a = Math.floor(Math.random() * 11) + 10;
        double b = Math.floor(Math.random() * 11) + 10;
        double c = Math.floor(Math.random() * 11) + 10;
        double d = Math.floor(Math.random() * 11) + 10;
        
		int a1 = (int) a;
		int b1 = (int) b;
		int c1 = (int) c;
		int d1 = (int) d;
		long sum = Ex03.factorial(a1) + Ex03.factorial(b1) + Ex03.factorial(c1) + Ex03.factorial(d1);
		System.out.println("Tổng giai thừa của S là: " + sum);
	}
}
