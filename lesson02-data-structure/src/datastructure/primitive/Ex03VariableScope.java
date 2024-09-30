package datastructure.primitive;

public class Ex03VariableScope {
	
	private static int g1 = 100;
	public static int g2 = 200;
	
	public static void main(String[] args) {
		char a1 = 'A';
		
		System.out.println("g1 --> " + g1);
		System.out.println("g2 --> " + g2);
		
		{
			char a11 = 'W';
			System.out.printf("a11(%s)", a11);
		}
		
		System.out.printf("a1(%s)", a1);
		
		test01(a1);
	}
	
	public static void test01(char p) {
		System.out.println("g1 --> " + g1);
		System.out.println("g2 --> " + g2);
		char a2 = 'B';
		System.out.printf("a2(%s)", a2);
		System.out.printf("a1(%s)", p);
	}
	
	public static void test02() {
		char a3 = 'C';
		System.out.printf("a3(%s)", a3);
	}
}
