package datastructure.primitive;

public class Ex03VariableScope {

	private static int g1 = 100;
	public static int g2 =200;
	
	 public static void main(String[] args) {
		 
		 System.out.println("main g1-->"+ g1);
		 System.out.println("main g2-->"+ g2);
		 
		 char a1='A';
		 System.out.printf("a1(%s)\n", a1);
	test01(a1); 
	
	 }
	 // char pA=a1; 'A'
	 public static void test01(char pA) {
		 System.out.println("\nTest01");
		 char a2='B';
		 System.out.printf("a2(%s)\n", a2);
	     System.out.printf("pA(%s)\n", pA);
	 }
	 
	 
	 public static void test02() {
		 char a3='C';
		 System.out.printf("a3(%s)\n", a3);
	 }
	
}
