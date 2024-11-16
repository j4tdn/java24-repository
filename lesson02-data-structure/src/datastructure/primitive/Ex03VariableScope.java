package datastructure.primitive;

public class Ex03VariableScope {
	private static int g1= 1_000_000;
	public static int g2= 200_000;
	
	public static void main(String[] args) {
		System.out.println("main g1 --> " + g1);
		System.out.println("main g2--> " + g2);
		char a1 = 'A';
		{
			char a11 = 'W';
			System.out.printf("a11(%s)\n", a11);
		}
		System.out.printf("a1(%s)\n", a1);
		//System.out.printf("a11(%s)\n", a11);
		
		char a3 = test02();
		test01(a1, a3);
	}
	// char pA = a1; 'A'
	public static void test01(char pA, char pB) {
		System.out.println("test 01 g1 --> " + g1);
		System.out.println("test 01 g2--> " + g2);
		char a2 = 'B';
		//System.out.println("a1(%s)\n", a1);
		System.out.printf("a2(%s)\n", a2);
		System.out.printf("pA(%s)\n", pA);
		System.out.printf("pB(%s)\n", pB);
	}

	public static char test02() {
		char a3 = 'C';	
		//System.out.println("a1(%s)\n", a1);
		//System.out.printf("a3(%s)\n", a3);
		return a3;
	}
}
