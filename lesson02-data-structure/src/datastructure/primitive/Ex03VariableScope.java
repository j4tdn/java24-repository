package datastructure.primitive;

public class Ex03VariableScope {
	
	private static int g1 = 1_000_000;
	public static int g2 = 200_000;

	public static void main(String[] args) {
		
		System.out.println("g1 -->" + g1);
		System.out.println("g2 -->" + g2);
		
		char a1 = 'A';	
		
		{
			char a11 = 'W';	 // Biến cục bộ trong Scope
			System.out.printf("a11(%s)", a11); 
		}
		
		System.out.printf("a1(%s)\n", a1);
		
		char a3 = test02();
		
		test01(a1, a3);
	}
	
	
	
	// char pA = a1; Lấy giá trị a1 ở STACK gán cho pA , 2 ô nhớ
	public static void 	test01(char pA, char pB) {
		System.out.println("\nTest01");
		System.out.println("g1 -->" + g1);
		System.out.println("g2 -->" + g2);
		char a2 = 'B';
		System.out.printf("pA(%s)\n", pA);
		System.out.printf("pB(%s)\n", pB);
		System.out.printf("a1(%s)\n", a2);
	}
	
	public static char test02() {
		char a3 = 'C';
		System.out.printf("a1(%s)\n", a3);
		return a3;
	}
	
}
